import java.util.Scanner;
class Emp
{
  String name;
  String designation;
  double salary;
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
             System.out.println("salary:"+salary);
             System.out.println("designation:"+designation);
             }
   
        void salaryraise()
                    {
                      salary=salary+1000;
                      System.out.println("salary raised by 1000");
                     }
  }
public class Emp1
{
   public static void main(String args[])
   {
     Emp e=new Emp();
     boolean b=false;
     int k;
           do
            {
           Scanner sc=new Scanner(System.in);
           System.out.println("\n1.Create:");
           System.out.println("2.Display:");
           System.out.println("3.Salary raised:");
           System.out.println("4.exit:");
           System.out.println("Enter your choice:");
           k=sc.nextInt();
           switch(k)
           {
            case 1:e.create();
                   b=true;
                   break;
            case 2:if(b)
                   e.display();
                   else System.out.println("No Records..!");
                   break;
            case 3:if(b)
                   e.salaryraise();
                   else System.out.println("No Records...!");
                   break;
             case 4:System.out.print("Exit...!!");
                    break;
            default:System.out.println("No Action...!");
            }
       }while(k>0 && k<4);
    
    }
}
    
           
           
