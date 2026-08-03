public class learningprogress{
    public static void main(String[] args) {

        int Completedtopics = 17;
        int Totaltopics = 20;
        int Dailylearninghours = 3;
        int Learningdays = 5;

        double progressPercentage =
                (double) Completedtopics / Totaltopics * 100;

        System.out.println("Completed Topics: " + Completedtopics);
        System.out.println("Remaining Topics: " + (Totaltopics - Completedtopics));
        System.out.println("Weekly Learning Hours: " + (Dailylearninghours * Learningdays));
        System.out.println("Progress Percentage: " + progressPercentage);
    }
}