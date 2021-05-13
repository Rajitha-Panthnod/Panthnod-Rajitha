import java.util.Scanner;
class Emp
{
  String name;
  String designation;
  int salary;
  int age;
        Scanner sc=new Scanner(System.in);
          void create()
          {
           System.out.println("\nEnter name:");
           name=sc.next();
           System.out.println("Enter age:");
           age=sc.nextInt();
           System.out.println("Enter salary:");
           salary=sc.nextInt();
           System.out.println("Enter designation:");
           designation=sc.next();
          }
          void diplay()
            {
             System.out.println("\nName:"+name);
             System.out.println("Age:"+age);
             System.out.println("salary:"+sal);
             System.out.println("designation:"+designation);
             }
   
        void salaryraise()
                    {
                      sal=sal+1000;
                      System.out.println("salary: +raisedsalary");
                     }
  }
public Rjitha
{
   public static void main(String args[])
   {
     Emp e=new Emp();
     int k;
         while(true)
            {
            
          Scanner sc=new Scanner(System.in);
           System.out.println("\n1.Create:");
           System.out.println("2.Display:");
           System.out.println("3.Salary raised:");
           System.out.println("4.exit:");
           System.out.println("Enter your choice:");
           int k=sc.nextInt();
           if(k==4)
           break;
           switch(k)
           {
            case 1:e.read();
                   break;
            case 2:e.display();
                   break;
            case 3:e.salaryraise();
                   break;
            }
       }
    
    }
}
    
           
           