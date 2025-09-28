public enum Coin{
    BRONZE(1), 
    SILVER(5), 
    GOLD(10);

    private int value;

    Coin(int value){
        this.value = value;
    }
    
    public int getValue(){
        return value;
    }
}