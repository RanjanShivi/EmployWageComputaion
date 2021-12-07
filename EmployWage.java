public class EmployWage
{
    public static void main(String[] args) {
        int ful_time = 1;
        double check = Math.floor(Math.random() * 10) % 2;
        System.out.println("Emply Attendance Status="+check);
        if (check == ful_time)
            System.out.println("Employ is present");
        else
            System.out.println("Employ is absent");
    }
}
