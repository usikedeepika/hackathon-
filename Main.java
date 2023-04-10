import java.util.*;
public class Main {
    public static void main(String[] args)
    {
       Scanner sc =new Scanner(System.in);
       Cateringexample ct=new Cateringexample();

       ct.getName(sc);
        ct.getCostPerDay(sc);
       ct.getDeposit(sc);
       ct.Display();

    }
}