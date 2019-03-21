
public class Cat {

    //========Создание конструктора=====================================================================

    public static Cat getKitten(){
        Double gramm = (100.0 + 200.0);
        Cat cat = new Cat();
        return cat;
    }

    //=============================================================================

    private Double originWeight;
    private Double weight;
    private Double weightFood;
    private Double food;
    private Double minWeight;
    private Double maxWeight;
    private static int count;

    //=======Подсчет кошек======================================================================

    public static int getCount() {
        count++;
        return count;
    }

    //=======Конструктор======================================================================

    public Cat() {

        weight = 1500.0 + 3000.0 * Math.random();
        originWeight = weight;
        minWeight = 1000.0;
        maxWeight = 9000.0;
        food = 0.0;
    }

    //=======Клон======================================================================

    public void cloneСreation(Double weight){
        this.weight = weight;
        originWeight = weight;
    }

    //=======Методы======================================================================

    public void pipi() {
        weight = weight - 10;
    }

    public void meow() {
        weight = weight - 1;
        System.out.println("Meow");
    }

    public void feed(Double food) {
        weight = weight + food;
        weightFood = food;
    }

    public void drink(Double amount) {
        weight = weight + amount;
    }

    public Double getWeight() {
        return weight;
    }

    public String getStatus() {
        if (weight < minWeight) {
           count = count - 1;
            return "Dead";
        } else if (weight > maxWeight) {
            count = count - 1;
            return "Exploded";
        } else if (weight > originWeight) {
            return "Sleeping";
        } else {
            return "Playing";
        }
    }

    public Double getEatenFood() {

        return weightFood;
    }
}
