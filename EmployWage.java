public class EmployWage {
    public static final int part_time=1;
    public static final int full_time=2;
    public static final int emp_rate=20;

    public static void main(String[] args) {
        int emp_hrs, emp_wage;
        int  check= (int) Math.floor(Math.random() *10)%3;
        System.out.println("Employ Attendance Status="+check);
        switch (check) {
            case part_time:
                emp_hrs = 4;
                break;
            case full_time:
                emp_hrs = 8;
                break;
            default:
                emp_hrs = 0;
        }
        emp_wage=emp_hrs*emp_rate;
        System.out.println("Employ Wage: " + emp_wage);
    }
}
