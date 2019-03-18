import java.util.Objects;

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
        murzik.feed(10.0);
        System.out.println("murzik new weight = " + murzik.getWeight());
        System.out.println(murzik.getEatenFood());

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

        System.out.println(murka.getWeight());
        murka.pipi();
//        далее должны быть прописаны два метода через точку, как в уроке, но не вышло!
        System.out.println(murka.getWeight());
    }
}