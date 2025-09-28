class Rack{
    private int rackId;
    private Product product;
    private boolean isEmpty;

    public Rack(int rackId, Product product, boolean isEmpty) {
        this.rackId = rackId;
        this.product = product;
        this.isEmpty = isEmpty;
    }

    public int getRackId() {
        return rackId;
    }

    public void setRackId(int rackId) {
        this.rackId = rackId;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public boolean isEmpty() {
        return isEmpty;
    }

    public void setEmpty(boolean isEmpty) {
        this.isEmpty = isEmpty;
    }

    public String toString() {
        return "Rack [rackId=" + rackId + ", product=" + product + ", isEmpty=" + isEmpty + "]";
    }

}