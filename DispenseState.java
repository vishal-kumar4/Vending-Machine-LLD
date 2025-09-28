class DispenseState implements State{
    
    public DispenseState() {
        System.out.println("Machine is in Dispensing State and Dispensing your Product ... ");
    }

    @Override
    public void insertCoin(VendingMachine vm, Coin coin) {
        throw new UnsupportedOperationException("Cannot insert coin .");
    }

    @Override
    public void selectProduct(VendingMachine vm, int productId) {
        throw new UnsupportedOperationException("Cannot select product .");
    }

    @Override
    public int getChange(VendingMachine vm, int productId, int insertedAmount) {
        throw new UnsupportedOperationException("Cannot get change .");
    }

    @Override
    public void getFullRefund(VendingMachine vm) {
        throw new UnsupportedOperationException("Cannot get refund .");
    }

    @Override
    public void dispenseProduct(VendingMachine vm, int productId) {
        vm.getInventory().dispenseProduct(productId);
        System.out.println("Successfully Dispensed Product with ID " + productId);
    }



}