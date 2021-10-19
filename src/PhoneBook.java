import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class PhoneBook
{
    String name;
    String phone;

    HashMap<String, String> book = new HashMap<>();

    public void Add(String phone, String name)
    {
        book.put(phone, name);
    }

    public void Get( String value) {
        for (Map.Entry<String, String> entry : book.entrySet())
        {
            if (Objects.equals(value, entry.getValue()))
            {
                System.out.println("Name: " + value + "\r\nPhone: " + entry.getKey());
            }
        }
    }
}
