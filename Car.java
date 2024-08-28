public class Car {
  //value
  private String make, model, color;
  private int year, mpg, topSpeed;

  //constructor, default
  public Car(){
    this.make = "Unknown";
    this.model = "Unknown";
    this.color = "Unknown";
    this.year = 0;
    this.mpg = 0;
    this.topSpeed = 0;
  }

  //constructor, full
  public Car(make, model, color, year, mpg, topSpeed){
    this.make = make;
    this.model = model;
    this.color = color;
    this.year = year;
    this.mpg = mpg;
    this.topSpeed = topSpeed;
  }

  //getters
    public String GetMake() {
      return make;
  }

    public String GetModel() {
      return model;
  }

    public String GetColor() {
      return color;
  }

    public int GetYear() {
      return year;
  }

    public int GetMPG() {
      return mpg;
  }

    public int GetTopSpeed() {
      return topSpeed;
  }

  
  //setters

    public void SetMake(String make) {
      this.make = make;
  }
  
    public void SetModel(String model) {
      this.model = model;
  }

    public void SetColor(String color) {
      this.color = color;
  }

    public void SetYear(int year) {
      this.year = year;
  }

    public void SetMPG(int mpg) {
      this.mpg = mpg;
  }

    public void SetTopSpeed(int topSpeed) {
      this.topSpeed = topSpeed;
  }

  //toString
  public String toString() {
     return "Car: " + make + ", " + model + ", " + color + ", " + 
        year + ", " + mpg + ", " + topSpeed;
  }

  //equals
  //used chatGPT for this and am a little lost on exactly what it is doing . 
  public boolean equals(Object obj){
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    
    Car otherCar = (Car) obj;
    return make.equals(otherCar.make) && model.equals(otherCar.model) && 
           color.equals(otherCar.color) && year == otherCar.year && 
           mpg == otherCar.mpg && topSpeed == otherCar.topSpeed;
  }
}
