class Person {
    private int age;   
    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        } else {
            System.out.println("Age cannot be negative!");
        }
    }
    public int getAge() {
        return age;
    }
}

public class Personclass {
    public static void main(String[] args) {

        Person p1 = new Person();

        p1.setAge(25);      
        System.out.println("Age: " + p1.getAge());

        p1.setAge(-5);      
        System.out.println("Age: " + p1.getAge());
    }
}
