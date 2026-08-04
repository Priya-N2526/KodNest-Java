public class simple {
    public static void main(String[] args) {
        double Principal = 10000.0;
        double rate = 6.5;
        double time = 2.0;
        double weight = 72.0;
        double height = 1.8;

        int s1 = 78;
        int s2 = 84;
        int s3 = 69;
        int s4 = 91;
        int s5 = 88;

        int totalMarks = s1 + s2 + s3 + s4 + s5;

        double simpleInterest = Principal * rate * time / 100.0;
        double totalAmount = Principal + simpleInterest;
        double bmi = weight / (height * height);
        double percentage = totalMarks * 100.0 / 500;

        System.out.println("Simple Interest: " + simpleInterest);
        System.out.println("Total Amount: " + totalAmount);
        System.out.println("BMI: " + bmi);
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Percentage: " + percentage);
    }
}