


import java.util.Scanner;
import java.util.ArrayList;

public class User {


    private Integer id;
    ArrayList<Bill>Set_Bill= new ArrayList<Bill>();


    public Integer getSelection()
    {
        //        Calling A file From Validation//
        int id=Validation.Get_number_check();

        return id;
    }

public int menu_select(int id)
{
   return this.id= id;

}

    public User()
    {

    }



    public  void display()
    {

        Burger_Display();

        int data=Validation.Get_number_check();



        switch (data)
        {

            case 1:
            {
                User_Asking();


                double topping_value=0;
                System.out.println("\n");
                System.out.println("Reciept");
                System.out.println("-------------");
                System.out.println("1 Basic- 3.56");

                System.out.println("Extras :");
                System.out.println("-------------");
                System.out.print("\n");
                for(int i =0; i<Set_Bill.size(); i++)
                {
                    System.out.println(Set_Bill.get(i));
                    topping_value+=Set_Bill.get(i).getTopping_price();
//
                }
                double final_price=3.56+topping_value;
                double final_tax=final_price *15/100;
                double Tax_price=final_price+ final_tax;
                System.out.println("-------------");

                System.out.println(String.format("Amount : %.2f$ + (Tax : %.2f$ )",final_price, final_tax ));
                System.out.println("-------------");
                System.out.println(String.format("Total : %.2f$", Tax_price));
                System.out.println("-------------");

                break;
            }

            case 2:
            {
                User_Asking();
                double topping_value=0;
                System.out.println("\n");
                System.out.println("Reciept");
                System.out.println("-------------");
                System.out.println("1 Healthy- 5.67");

                System.out.println("Extras :");
                System.out.println("-------------");
                System.out.print("\n");
                for(int i =0; i<Set_Bill.size(); i++)
                {
                    System.out.println(Set_Bill.get(i));
                    topping_value+=Set_Bill.get(i).getTopping_price();

                }
                double final_price=5.67+topping_value;
                double final_tax=final_price *15/100;
                double Tax_price=final_price+ final_tax;
                System.out.println("-------------");

                System.out.println(String.format("Amount : %.2f$ + (Tax : %.2f$ )",final_price, final_tax ));
                System.out.println("-------------");
                System.out.println(String.format("Total : %.2f$", Tax_price));
                System.out.println("-------------");
                break;
            }


            case 3:
            {
                User_Asking();
                double topping_value=0;
                System.out.println("\n");
                System.out.println("Reciept");
                System.out.println("-------------");
                System.out.println("1 Deluxe- 14.54");

                System.out.println("Extras :");
                System.out.println("-------------");
                System.out.print("\n");
                for(int i =0; i<Set_Bill.size(); i++)
                {
                    System.out.println(Set_Bill.get(i));
                    topping_value+=Set_Bill.get(i).getTopping_price();

                }
                double final_price=14.54+topping_value;
                double final_tax=final_price *15/100;
                double Tax_price=final_price+ final_tax;
                System.out.println("-------------");

                System.out.println(String.format("Amount : %.2f$ + (Tax : %.2f$ )",final_price, final_tax ));
                System.out.println("-------------");
                System.out.println(String.format("Total : %.2f$", Tax_price));
                System.out.println("-------------");

                break;
            }




        }




    }

        // Displaying For Topping
        public  void Topping_Display()
        {



            // Adding Topping in Menu
            ArrayList<Topping> Toppings = new ArrayList<Topping>();

            Topping tops1= new Topping("Tomato", 0.27);
            Topping tops2= new Topping("Lettuce", 0.72);
            Topping tops3= new Topping("Cheese", 1.13);
            Topping tops4= new Topping("Carrot", 2.75);


            // Adding All The Menu to Array list
            Toppings.add(tops1);
            Toppings.add(tops2);
            Toppings.add(tops3);
            Toppings.add(tops4);



            System.out.println("Please Add Toppings");
            for(Topping num: Toppings)
            {
                System.out.println(num);
            }
            System.out.println("0. That's All\n");






//                for(int i=0; i<Toppings.size(); i++)
//                {
//                    System.out.println(Toppings.get(i));
//                }


        }


       public void Burger_Display()
       {
// Displaying All Menu To user
           System.out.println("\n\t Brampton Burgers\t");
           Burger basic= (Burger) new Basic();
           Burger Healthy= (Burger) new Healthy();
           Burger Deluxe=(Burger) new Deluxe();

           System.out.println(basic);
           System.out.println("\n");
           System.out.println(Healthy);
           System.out.println("\n");
           System.out.println(Deluxe);
           Scanner Read= new Scanner(System.in);
           System.out.println("\n");
       }



    // Ask User For Topping
    public void User_Asking()
    {


        int user;
        Topping_Display();
        for(int i=0; i<4; i++)
        {
            System.out.print("Choose Any 4 Toppings :  ");
            user=Validation.Get_number_check1();

            if(user==1)
            {
                Bill B1= new Bill("Tomato",0.27 );
                Set_Bill.add(i, B1);
            }

            else if(user==2)
            {
                Bill B1= new Bill("Lettuce",0.72 );
                Set_Bill.add(i, B1);
            }

            else if(user==3)
            {
                Bill B1= new Bill("Cheese",1.13 );
                Set_Bill.add(i, B1);
            }

            else if(user==4)
            {
                Bill B1= new Bill("Carrot",2.75 );
                Set_Bill.add(i, B1);
            }

            if(user==0)
            {
                break;
            }
        }



    }

}
