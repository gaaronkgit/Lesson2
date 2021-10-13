
public class Lesson3
{
    public static void main(String[] args)
    {
        Box<Orange> orangeBox = new Box<>();
        orangeBox.PutFruit(new Orange());
        orangeBox.PutFruit(new Orange());
        orangeBox.PutFruit(new Orange());
        orangeBox.PutFruit(new Orange());
        orangeBox.PutFruit(new Orange());

        Box<Apple> appleBox = new Box<>();
        appleBox.PutFruit(new Apple());
        appleBox.PutFruit(new Apple());
        appleBox.PutFruit(new Apple());
        appleBox.PutFruit(new Apple());
        Box<Apple> appleBox2 = new Box<>();

        System.out.println("orangeBox = " + orangeBox.getWeightBox());
        System.out.println("appleBox = " + appleBox.getWeightBox());

        appleBox.compare(orangeBox);

        appleBox2.moveFruitFromBoxToBox(appleBox);

        System.out.println("appleBox2 weight = " + appleBox2.getWeightBox());
    }
}
