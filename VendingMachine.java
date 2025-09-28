
import java.util.*;

class VendingMachine {
    private static VendingMachine instance = null;
    private State currentState;
    private Inventory inventory;
    private List<Coin> insertedCoins;

    public static synchronized VendingMachine getInstance() {
        if (instance == null) {
            // Default states
            instance = new VendingMachine();
        }
        return instance;
    }

    public void instantiateMachine(int capacity) {
        this.currentState = new IdleState();
        this.inventory = new Inventory(capacity);
        this.insertedCoins = new ArrayList<>();
    }

    public void insertCoin(Coin coin) {
        insertedCoins.add(coin);
    }

    public State getCurrentState() {
        return currentState;
    }

    public void setCurrentState(State currentState) {
        this.currentState = currentState;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public List<Coin> getInsertedCoins() {
        return insertedCoins;
    }

    public void setInsertedCoins(List<Coin> insertedCoins) {
        this.insertedCoins = insertedCoins;
    }

}
