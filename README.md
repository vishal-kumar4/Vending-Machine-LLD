# VendingMachine

A simple Java implementation of a vending machine using the State design pattern and Singleton Design Pattern

![Uploading Screenshot 2025-09-28 at 7.14.11 PM.png…]()


## Folder Structure

- `Main.java` - Entry point for running the vending machine simulation.
- `VendingMachine.java` - Singleton class representing the vending machine.
- `State.java` - Interface for machine states.
- `IdleState.java`, `HasMoneyState.java`, `DispenseState.java` - Concrete state classes.
- `Inventory.java` - Manages racks and products.
- `Rack.java` - Represents a rack holding a product.
- `Product.java` - Represents a product.
- `ProductType.java` - Enum for product categories.
- `Coin.java` - Enum for coin denominations.

## How to Use

1. **Compile all Java files:**
   ```sh
   javac *.java
   ```

2. **Run the main class:**
   ```sh
   java Main
   ```

3. **What happens:**
   - The vending machine is initialized with 10 racks.
   - Products are added to various racks.
   - Coins are inserted (`GOLD`, `BRONZE`).
   - A product is selected and dispensed from rack 5.
   - Inventory is displayed after dispensing.

## Example Usage

See [`Main.java`](Main.java) for a sample workflow:
- Initialize machine and inventory.
- Add products.
- Insert coins.
- Select and dispense a product.
- Display inventory.

## Extending

- Add more states by implementing [`State`](State.java).
- Add more products or racks via [`Inventory`](Inventory.java).
- Customize coin denominations in [`Coin`](Coin.java).

## Notes

- The vending machine uses a singleton pattern (`getInstance()`).
- State transitions are handled automatically after each action.
- Error handling is done via exceptions and console messages.
