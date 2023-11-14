public class Person {
  String name;
  float weight;
  float height;
  
  Person(String name)
  {
    this.name = name;
  }

  Person (String name, float weight, float height)
  {
    this.name = name;
    this.weight = weight;
    this.height = height / 100;
  }

  public void setWeightAndHeight(float weight, float height)
  {
    this.weight = weight;
    this.height = height / 100;
  }

  public float calculateBMI()
  {
    return this.weight / (this.height * 2);
  }

  public void displayRecord()
  {
    System.out.println("Your name: " + this.name); 
    System.out.println("Your height: " + this.height);
    System.out.println("Your weight: " + this.weight);
    System.out.printf("Your BMI: %.2f\n", this.calculateBMI());

    if (this.calculateBMI() < 18.5)
    {
        System.out.println("Your BMI is too low");
    }
    else if (this.calculateBMI() > 24.9)
    {
        System.out.println("Your BMI is too high");
    }
  }
}
