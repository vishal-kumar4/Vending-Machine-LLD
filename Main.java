class Main{
    public static void main(String[] args) {
        VendingMachine vm = VendingMachine.getInstance();
        vm.instantiateMachine(10);

        vm.getInventory().addProduct(1, new Product("Coke", 11, ProductType.BEVERAGE));
        vm.getInventory().addProduct(2, new Product("Dairy Milk", 15, ProductType.CHOCOLATE));
        vm.getInventory().addProduct(3, new Product("Kurkure", 12, ProductType.SNACKS));
        vm.getInventory().addProduct(4, new Product("Fatafat", 10, ProductType.OTHERS));
        vm.getInventory().addProduct(5, new Product("Horlicks", 1, ProductType.OTHERS));
        vm.getInventory().addProduct(100, new Product("Lolipop", 5, ProductType.OTHERS));

        State curState = vm.getCurrentState();

        curState.insertCoin(vm, Coin.GOLD);
        curState.insertCoin(vm, Coin.BRONZE);

        curState = vm.getCurrentState();

        curState.selectProduct(vm, 5);

        curState = vm.getCurrentState();

        curState.dispenseProduct(vm, 5);

        vm.getInventory().displayInventory();




    }
}