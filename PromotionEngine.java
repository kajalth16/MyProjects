import java.util.ArrayList;
import java.util.Scanner;

public class PromotionEngine {
    public static void main(String[] args) {
        try {
            ArrayList<String> products = new ArrayList<String>();
            System.out.println("Enter the Number of Orders : ");
            Scanner sc = new Scanner(System.in);
            int noOfOrders = sc.nextInt();
            for (int i = 0; i < noOfOrders; i++) {
                System.out.println("Enter the type of Order (A,B,C or D) : ");
                Scanner sc1 = new Scanner(System.in);
                String typeOfOrder = sc1.nextLine();
                products.add(typeOfOrder.toString().toUpperCase());
            }
            System.out.println("Current orders in your cart : " + products);
            int totalPrice = GetTotalPrice(products);
            System.out.println("Total Amount : " + totalPrice);
        }
        catch (Exception e)
        {
            System.out.println("Please enter valid Order details!");
        }
    }

    private static int GetTotalPrice(ArrayList<String> products) {
        int counterA = 0;
        int priceA = 50;
        int counterB = 0;
        int priceB = 30;
        int CounterC = 0;
        int priceC = 20;
        int CounterD = 0;
        int priceD = 15;

        for(String pr : products)
        {
            if (pr.equals("A"))
            {
                counterA=counterA + 1;
            }
            else if (pr.equals("B"))
            {
                counterB = counterB + 1;
            }
           else if (pr.equals("C"))
            {
                CounterC = CounterC + 1;
            }
            else if(pr.equals("D"))
            {
                CounterD = CounterD + 1;
            }else{
                System.out.println("Please Enter a valid Order type!");
            }
        }
        int totalPriceA = (counterA / 3) * 130 + (counterA % 3 * priceA);
        int totalPriceB = (counterB / 2) * 45 + (counterB % 2 * priceB);
        int totalPriceC = (CounterC * priceC);
        int totalPriceD = (CounterD * priceD);
        return totalPriceA + totalPriceB + totalPriceC + totalPriceD;
    }
}
