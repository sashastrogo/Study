
public class Loader
{
    public static void main(String[] args)
    {
        Cat murzik = new Cat();

        Cat vaska = new Cat();

        Cat tapok = new Cat();

        Cat barsik = new Cat();

        Cat murka = new Cat();


        System.out.println("murzik weight = " + murzik.getWeight());
        System.out.println("murzik say:");
        murzik.meow();
        System.out.println("murzik weight = " + murzik.getWeight());

        System.out.println("vaska - " + vaska.getStatus());

        System.out.println(tapok.getWeight());
        System.out.println("Now tapok is " + tapok.getStatus());
        tapok.feed(1000.0);
        System.out.println(tapok.getWeight());
        System.out.println("Now tapok is " + tapok.getStatus());

        System.out.println(barsik.getWeight());
        barsik.feed(10000.0);
        System.out.println(barsik.getWeight());
        System.out.println("Sorry, your's barsik is " + barsik.getStatus());

        System.out.println(murka.getWeight());
        murka.drink(1.0);
        System.out.println(murka.getWeight());
    }
}