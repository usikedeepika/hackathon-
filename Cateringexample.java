import java.util.*;
public class Cateringexample {
    private String name;
    private Double CostPerDay;
    private Double deposit;
    void getName(Scanner sc)
    {
        System.out.println("enter the type name");
        name=sc.nextLine();
//        return name;
    }
    void getCostPerDay(Scanner sc)
    {
        System.out.println("Enter the Cost Per day");
        CostPerDay=sc.nextDouble();
//        return CostPerDay;
    }
    void getDeposit(Scanner sc)
    {
        System.out.println("Enter the deposit");
        deposit=sc.nextDouble();
//        return deposit;
    }
    public  void Display()
    {
        System.out.println( "item type details\nName:"+name+"\nCostPerDay:"+CostPerDay+"\nDeposit:"+deposit);
    }

}
