class Product{
    private String productname;
    private double price;
    public Product(String productname,double price){
        this.productname=productname;
        this.price=price;
    }
    public String getproductname(){
        return productname;
    }
    public void setproductname(String productname){
        this.productname=productname;
    }
    public double getprice(){
        return price;
    }
    public void setprice(double price){
        this.price=price;
    }
}
public class Productclass {
    public static void main(String[] args) {
        Product p=new Product("laptop", 34000);
        System.out.println("product name: "+p.getproductname());
        System.out.println("price: "+p.getprice());
    }
}
