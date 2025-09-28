
import java.util.*;

class Inventory {
    // Inventory related methods and attributes
    Map<Integer,Rack> racks;
    public Inventory(int capacity) {
        racks = new HashMap<>();
        defaultRackSetup(capacity);
    }
    void defaultRackSetup(int capacity){
        int st = 1;
        for(int i=0;i<capacity;i++){
            Rack rack = new Rack(st, null, true);
            racks.put(st, rack);
            st++;
        }
    }
    void addProduct(int rackId, Product product){
        if(racks.containsKey(rackId)){
            Rack rack = racks.get(rackId);
            if(rack.isEmpty()){
                rack.setProduct(product);
                rack.setEmpty(false);
                System.out.println("Product " + product + " added successfully");
            }else{
                System.out.println("Rack is already occupied");
            }
        }else{
            Rack rack = new Rack(rackId, product, false);
            racks.put(rackId, rack);
            System.out.println("A new rack with id: " +  rackId + " created and added product successfully");
        }
    }
    void dispenseProduct(int rackId){
        if(racks.containsKey(rackId)){
            Rack rack = racks.get(rackId);
            if(!rack.isEmpty()){
                rack.setProduct(null);
                rack.setEmpty(true);
                System.out.println("Product dispensed successfully");
            }else{
                System.out.println("Rack is empty");
            }
        }else{
            System.out.println("Rack does not exist");
        }
    }

    void displayInventory(){
        for(Map.Entry<Integer, Rack> entry : racks.entrySet()){
            System.out.println(entry.getValue());
        }
    }
}
