class HasMoneyState implements State{

    public HasMoneyState() {
        System.out.println("Machine is in Has Money State ... ");
    }

    @Override
    public void insertCoin(VendingMachine vm, Coin coin) {
        throw new UnsupportedOperationException("Already have money inserted.");
    }

    @Override
    public void selectProduct(VendingMachine vm, int productId) {
        Rack cur = vm.getInventory().racks.getOrDefault(productId, null);
        if(cur == null)
        {
            throw new UnsupportedOperationException("No Product with ID " + productId + " Exists");
        }
        if(cur.isEmpty())
        {
            throw new UnsupportedOperationException("Product with ID " + productId + " is out of stock");
        }
        int sum = 0;
        for(Coin c : vm.getInsertedCoins())
        {
            sum += c.getValue();
        }
        Product p = cur.getProduct();

        if(sum < p.getPrice())
        {
            getFullRefund(vm);
            vm.setCurrentState(new IdleState());
            throw new UnsupportedOperationException("Insufficient Money. Please insert more coins to purchase the selected product.");
        }
        getChange(vm, productId, sum);
        vm.setCurrentState(new DispenseState());
    }

    @Override
    public int getChange(VendingMachine vm, int productId, int insertedAmount) {
        int sum = 0;
        for(Coin c : vm.getInsertedCoins())
        {
            sum += c.getValue();
        }
        Product p = vm.getInventory().racks.get(productId).getProduct();
        int change = sum - p.getPrice();
        vm.getInsertedCoins().clear();
        System.out.println("Change Returned: " + insertedAmount);
        return change;
    }

    @Override
    public void getFullRefund(VendingMachine vm) {
        vm.getInsertedCoins().clear();
        System.err.println("Refunded Entire Amount");
    }

    @Override
    public void dispenseProduct(VendingMachine vm, int productId) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}