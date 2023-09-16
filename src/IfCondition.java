public class IfCondition {
    public static void main(String[] args) {
        int maths = 80;
        int science = 65;
        int islam = 58;

        int total = maths+science+islam;
        int average = total/3;

        char grade;

        if (average>=75){
            grade = 'D';
        } else if (average>=65) {
            grade = 'M';
        } else if (average>=50) {
            grade = 'P';
        }
        else {
            grade = 'F';
        }

        System.out.println(total);
        System.out.println(average);
        System.out.println(grade);

    }
}
