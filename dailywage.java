public class dailywage
{
    public static void main(String[] args)
    {

        int  is_full=1;
        int is_part=2;
        int wage_per_hr=20;


                double emp = Math.floor(Math.random() * 10) % 3;
                if (is_full == emp )
                 {
                                System.out.println("employee is present for full day");
                                int  cal=(8*wage_per_hr);
                                System.out.println("employee wage for full day is " +cal);

                 }
                else if (is_part == emp)
                        {
                                System.out.println("employee is present for half day");
                                int  cal=(4*wage_per_hr);
                                System.out.println("employee wage for half day is " +cal);

                        }

                else
                        {
                                System.out.println("employee is absent");
                        }
    }
}



