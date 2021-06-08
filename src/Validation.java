import java.util.Scanner;
public class Validation {

    Validation()
    {

    }

    public static int Get_number_check()
    {
        Scanner Read= new Scanner(System.in);

        Boolean data=true;
        Integer selection;
        do {
            data=false;
            System.out.print("Select- ");
            while (!Read.hasNextInt())
            {

                String input=  Read.next();
                System.out.printf("\"%s\" is not a valid number.\n", input);
                System.out.print("Select- ");
            }



            selection=Read.nextInt();
            if(selection<=0|| selection>3)
            {
                System.out.println("Invalid Number");
                data=true;
            }

        }while (data);

        return selection;
    }




    public static int Get_number_check1()
    {
        Scanner Read= new Scanner(System.in);

        Boolean data=true;
        Integer selection;
        do {
            data=false;

            while (!Read.hasNextInt())
            {
                String input=  Read.next();
                System.out.printf("\"%s\" is not a valid number.\n", input);
                System.out.print("Select- ");
            }



            selection=Read.nextInt();
            if(selection<0 || selection>4)
            {
                System.out.println("Invalid Number");
                System.out.print("Select- ");
                data=true;
            }

        }while (data);

        return selection;
    }
}
