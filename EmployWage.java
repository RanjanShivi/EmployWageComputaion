public class EmployWage {
    public static final int part_time=1;
    public static final int full_time=2;
    public static final int emp_rate=20;
    public static final int work_day=2;
    public static final int max_hrs=10;

    public static void main(String[] args) {
        int emp_hrs=0,tot_hrs=0,tot_day=0;
        while(tot_hrs<=max_hrs && tot_day<work_day)
        {
            tot_day++;
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
            tot_hrs+=emp_hrs;
            System.out.println("Day= " + tot_day + "Emp_hrs: " + emp_hrs);
        }
        int tot_empwage=tot_hrs*emp_rate;
        System.out.println("Total Emp Wage: " + tot_empwage);

    }
}