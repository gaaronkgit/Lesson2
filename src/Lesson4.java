import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Lesson4
{
    public static void main(String[] args)
    {
        System.out.println("Задача 1");
        Words();

        System.out.println("\r\nЗадача 2");
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.Add("796112365758","Петров");
        phoneBook.Add("796112365750","Смирнов");
        phoneBook.Add("796112365780","Петров");
        phoneBook.Add("+79611236570","Иванов");
        phoneBook.Add("123658","Иванов");
        phoneBook.Add("123300","Иванов");
        phoneBook.Add("123659","Сидоров");


        phoneBook.Get("Иванов");
    }

    static void  Words()
    {
        ArrayList<String> words = new ArrayList<String>();
        ArrayList<String> uniqueWords = new ArrayList<String>();
        words.add("Яблоко");
        words.add("Слива");
        words.add("Вишня");
        words.add("Яблоко");
        words.add("Малина");
        words.add("Малина");
        words.add("Слива");
        words.add("Клубника");
        words.add("Яблоко");
        words.add("Малина");
        words.add("Слива");
        words.add("Малина");
        words.add("Смородина");

        //Посчитать, сколько раз встречается каждое слово.
        System.out.println("Посчитать, сколько раз встречается каждое слово.");
        Set<String> set = new HashSet<String>(words);
        for (String r : set) {
            System.out.println(r + ": " + Collections.frequency(words, r));
        }

        //Найти и вывести список уникальных слов, из которых состоит массив
        for(String s : words)
        {
            if(!uniqueWords.contains(s))
            {
                uniqueWords.add(s);
            }
        }
        System.out.println("Найти и вывести список слов, из которых состоит массив");
        for (String s: uniqueWords)
        {
            System.out.println(s);
        }
    }
}
