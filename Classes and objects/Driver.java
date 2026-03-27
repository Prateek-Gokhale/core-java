  class Car {
    static int noofCarSold = 0;
    int noOfwheels;
    String color;
    float maxSpeed;
    float currPrice;
    float currentFuelinLtr ;
    int noOfSeats;

    static{
        System.out.println(noofCarSold);
        System.out.println("In static block");
    }

    {
        System.out.println(noofCarSold++);
        System.out.println("initializer block");
    }

//constructor
    Car(String color, float currPrice){
        this.color= color;
        noOfwheels=4;
        maxSpeed=150;
        currentFuelinLtr=2;
        noOfSeats=5;
        this.currPrice=currPrice;
    }

        Car() {
        this("black",10000.3f);
        currentFuelinLtr=5;
    }


    public Car start(){
             currentFuelinLtr--;
             System.out.println("Car is started..");
             return this;

        }

    public void drive(){
        if(currentFuelinLtr==0){
            System.out.println("Car is out of fuel");
        } else if(currentFuelinLtr<5){
          System.out.println("Car ia in reserved mode");
          currentFuelinLtr--;
        }
        else{
             System.out.println("Car is driving");
          currentFuelinLtr--;
        }
        
    }

    public void addFuel(float currentFuelinLtr){
       this.currentFuelinLtr += currentFuelinLtr;
    }

    public float getCurrentFuelLevel(){
        return currentFuelinLtr;
    }
}


public class Driver {

    static int minAge= 18;

    String name;
    int age;
    String dateOfLicense;

    public boolean isAllowedDrive(){
        return this.age >= minAge;

    }

    public static void main(String[] args) {
        // Car myCar = new Car();
        // myCar.addFuel(6);
        // myCar.drive();
        // myCar.drive();
        // myCar.drive();
        // myCar.addFuel(3);
        // myCar.drive();
        // System.out.println(myCar.getCurrentFuelLevel());

        Car swift = new Car("Red",1222.99f);
        Car thar  = new Car();

        swift.addFuel(6);
        // swift.start();
        // swift.drive();
        swift.start().drive();
        System.out.println(swift.color);
        System.out.println(swift.currPrice);
        
        // Driver myDriver = new Driver();
        // myDriver.dateOfLicense="1/3/2024";
        // System.out.println(minAge);



    }
}