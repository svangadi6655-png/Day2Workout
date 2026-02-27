class Laptop {
    String brand;
    int ram;          
    double price;

    
    Laptop(String b, int r, double p) {
        brand = b;
        ram = r;
        price = p;
    }

    void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("RAM: " + ram + " GB");
        System.out.println("Price: " + price);
    }
}

public class Laptopclass{
    public static void main(String[] args) {

        Laptop laptop1 = new Laptop("Dell", 16, 65000.0);

        laptop1.displayDetails();
    }
}