/**
 * Created by Ana Lourenco on 15/01/17 -  Revisions project.
 */
public class Calculator {

    private String brand;
    private String color;


    // Constructor

    public Calculator(String brand, String color) {
        this.brand = brand;
        this.color = color;
    }

    // Getters and setters

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    // Calculator operations methods

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        if (b == 0) {
            System.out.println("You can't divide by zero!");
            return -1;  // is there a better way to create an error message?
        } else {
            return a / b;
        }
    }
}
