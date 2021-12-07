public class EmployWage{
    public static void main(String[] args) {
        int part_time = 1;
        int full_time = 2;
        int emp_rate = 20;
        int emp_hrs, emp_wage;
        double check = Math.floor(Math.random() * 10) % 3;
        System.out.println("Employ Attendance Status=" + check);
        if (check == part_time)
            emp_hrs = 4;
        else if (check == full_time)
            emp_hrs = 8;
        else
            emp_hrs = 0;
        emp_wage = emp_hrs * emp_rate;
        System.out.println("Employ Wage: " + emp_wage);
    }
}
