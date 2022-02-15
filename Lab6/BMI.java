package Lab6;

public class BMI {
    private final double KILO_PER_POUND = 0.45359237;
    private final double METER_PER_INCHES = 0.0254;

    private final String name;
    private final int age;
    private final double weight;
    private final int feet;
    private final int inches;
    private final double bmi;

    public BMI(String name,int age,double weight,int feet,int inches){
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.feet = feet;
        this.inches = inches;
        this.bmi = calculateBMI();
    }

    private double calculateBMI(){
        double weightKilo = this.weight * KILO_PER_POUND;
        double heightMeter = (this.inches + (this.feet * 12)) * METER_PER_INCHES;

        return weightKilo / (Math.pow(heightMeter,2));
    }

    public static String resultBMI(double bmi){
        if(bmi < 18.5)
            return "Underweight";
        else if(bmi < 25.0)
            return "Normal";
        else if(bmi < 30.0)
            return "Overweight";
        else
            return "Obese";
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }

    public int getFeet() {
        return feet;
    }

    public int getInches() {
        return inches;
    }

    public double getBmi() {
        return bmi;
    }
}
