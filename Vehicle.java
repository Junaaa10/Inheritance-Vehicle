public class Vehicle{
    private int numWheels;
    private double price;

    public Vehicle () {
        int numWheels;
        double price;
    }
    public Vehicle (int numWheels, double price) {
        this.numWheels = numWheels;
        this.price = price;
    }

	public int getnumWheels() {
		return this.numWheels;
	}

	public void setNumVehicle(int numWheels) {
		this.numWheels = numWheels;
	}

	public double getPrice() {
		return this.price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
    public void print () {
        System.out.println("Number of Wheels: " + numWheels);
        System.out.println("Price: " + price);
    }
}