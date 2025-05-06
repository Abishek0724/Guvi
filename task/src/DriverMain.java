import java.util.*;
interface Taxable{
    double salesTax=7.0;
    double incomeTax=10.5;
    double calcTax();
}
class Employee implements Taxable{
    int empId;
    String name;
    double salary;
     Employee (int empId,String name,double salary){
        this.empId=empId;
        this.name=name;
        this.salary=salary;
    }

    @Override
 public double calcTax(){
    return salary*incomeTax;
 }
 public void display(){
    System.out.println("Employee Id"+empId+"Employee Name"+name+"Salary"+salary);
 }
}

class Product implements Taxable{
    int pid;
    double price;
    int quantity;

    public Product(int pid, double price, int quantity) {
        this.pid = pid;
        this.price = price;
        this.quantity = quantity;
    }
    @Override
    public double calcTax(){
        return price*salesTax;
    }
    public void display(){
        System.out.println("Product ID:"+pid+" Price:"+price+" Quantity: "+quantity);
    }
}
public class DriverMain {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Employee input
        System.out.print("Enter Employee ID: ");
        int empId = sc.nextInt();
        sc.nextLine(); 
        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Salary: ");
        double salary = sc.nextDouble();
        Employee emp = new Employee(empId, name, salary);

        // Product input
        System.out.print("Enter Product ID: ");
        int pid = sc.nextInt();
        System.out.print("Enter Price: ");
        double price = sc.nextDouble();
        System.out.print("Enter Quantity: ");
        int quantity = sc.nextInt();
        Product prod = new Product(pid, price, quantity);

        // Display and calculate tax
        System.out.println("\n--- Employee Details ---");
        emp.display();
        System.out.println("Income Tax: ₹" + emp.calcTax());

        System.out.println("\n--- Product Details ---");
        prod.display();
        System.out.println("Sales Tax per unit: ₹" + prod.calcTax());

        sc.close();
    }

}
