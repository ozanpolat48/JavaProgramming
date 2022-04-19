package day30_CustomClass;

public class Car {

    public String brand;
    public String model;
    public String color;
    public int year;
    public double price;


    public void setInfo(String carBrend, String carModel, String carColor, int carYear, double carPrice){

        brand = carBrend;
        model = carModel;
        color = carColor;
        year = carYear;
        price = carPrice;
    }


    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", price=" + price +
                '}';
    }

    public void drive(){
        System.out.println("Driving"+brand+" "+model);
    }

    public void start(){
        System.out.println(brand+" "+model+" has starded");
    }

    public void stop(){
        System.out.println(brand+" "+model+" has stopped");
    }
}
