public class Loader
{
    public static void main(String[] args)
    {
        Integer milkAmount = 11; // ml
        Integer powderAmount = 400; // g
        Integer eggsCount = 10; // items
        Integer sugarAmount = 10; // g
        Integer oilAmount = 30; // ml
        Integer appleCount = 8;


//        //powder - 400 g, sugar - 10 g, milk - 1 l, oil - 30 ml
        if(powderAmount >= 400 && sugarAmount >= 10 && milkAmount >= 11 && oilAmount >= 30)
        {
            System.out.println("Pancakes");
        }
//        //milk - 300 ml, powder - 5 g, eggs - 5
        if(powderAmount >= 5 && milkAmount >= 300 && eggsCount >= 5)
        {
            System.out.println("Omelette");
        }
//        //apples - 3, milk - 100 ml, powder - 300 g, eggs - 4
        if(appleCount >= 3 && powderAmount >= 300 && milkAmount >= 100 && eggsCount >= 4)
        {
            System.out.println("Apple pie");
        }

    }
}