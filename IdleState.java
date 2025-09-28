class IdleState implements State{

    public IdleState() {
        System.out.println("Machine is in Idle State ... ");
    }
    @Override
    public void insertCoin(VendingMachine machine, Coin coin)
    {
        machine.getInsertedCoins().add(coin);
        machine.setCurrentState(new HasMoneyState());
        System.out.println("Inserted Coin: " + coin);
    }

    @Override
    public void selectProduct(VendingMachine vm, int productId) {
        throw new UnsupportedOperationException("No Money Inserted.");
    }

    @Override
    public int getChange(VendingMachine vm, int productId, int insertedAmount) {
        throw new UnsupportedOperationException("No Money Inserted.");
    }

    @Override
    public void getFullRefund(VendingMachine vm) {
        throw new UnsupportedOperationException("No Money Inserted.");
    }

    @Override
    public void dispenseProduct(VendingMachine vm, int productId) {
        throw new UnsupportedOperationException("No Money Inserted.");
    }
    
}