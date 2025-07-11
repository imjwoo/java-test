public class Car {
    private String brand ;

    private String model;

    private int year;

    public void move() {
        System.out.println("자동차가 움직입니다.");
    }

    public void stop() {
        System.out.println("자동차가 멈춥니다.");
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return this.brand;
    }

    public static void main(String[] args) {

        Car myCar = new Car();
        myCar.setBrand("kia");

        System.out.println("브랜드: " + myCar.getBrand());

        myCar.move();
        myCar.stop();
    }

}
