public class parttime_wage
{
    public static void main(String[] args)
    {


        int is_part=1;
        int wage_per_hr=20;


                double emp = Math.floor(Math.random() * 10) % 2;
                 if (is_part == emp)
                        {
                                System.out.println("part time employee is added");
                                int  cal=(4*wage_per_hr);
                                System.out.println("employee wage for part time is " +cal);

                        }

                else
                        {
                                System.out.println("employee is not added");
                        }
    }
}












