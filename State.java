interface State{
    void insertCoin(VendingMachine vm, Coin coin);
    void selectProduct(VendingMachine vm, int productId);
    int getChange(VendingMachine vm, int productId, int insertedAmount);
    void getFullRefund(VendingMachine vm);
    void dispenseProduct(VendingMachine vm, int productId);
}