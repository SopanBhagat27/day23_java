public class using_switch
{
        public static void main(String args[])
        {

                int check = 1;
                int emp_per_hr=20;
        switch (check) {
        case 1:
                System.out.println("Employee is full time");
                int cal=(8*emp_per_hr);
                System.out.println("employere wage for full time "+cal);

        break;
        case 2:
                System.out.println("Employee is part time");
                int cal1=(4*emp_per_hr);
                System.out.println("employee wage for part time "+cal1);
        break;

        default:
                System.out.println("Employee is absend");
                }
        }


}
