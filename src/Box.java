import java.util.ArrayList;

public class Box <T extends Fruit>
{
    ArrayList<T> fruits = new ArrayList<T>();

    public ArrayList<T> getFruits() {
        return fruits;
    }

    public void setFruits(ArrayList<T> fruits)
    {
        this.fruits = fruits;
    }

    public void PutFruit(T fruit)
    {
        fruits.add(fruit);
    }

    float getWeightBox()
    {
        float w = 0;
        for (int i =0; i < fruits.size(); i++)
        {
            w += fruits.get(i).getWeight();
        }
        return w;
    }

    void compare(Box <?> b)
    {
        if(this.getWeightBox() == b.getWeightBox())
        {
            System.out.println("Масса коробок равна");
        }
        else
        {
            System.out.println("Масса коробок не равна");
        }
    }

    void moveFruitFromBoxToBox(Box<T> box)
    {
        for (T fr:box.fruits)
        {
            this.fruits.add(fr);
        }
        box.fruits.clear();
    }
}
