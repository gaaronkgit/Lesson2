import java.io.*;

public class AppData
{
    String header;
    int [][] data;

    public AppData(String header, int[][] data)
    {
        this.header = header;
        this.data = data;

        CreateFile();
        saveArrayToFile(data,"data.csv");
        ReadFile("data.csv");
    }

    void CreateFile()
    {
        //Проверяем наличие файла, если нет - создаем
        File file = new File("data.csv");
        if(!file.exists())
        {
            System.out.println("Файл data.csv не найден! Создаем");
            try
            {
                file.createNewFile();
                if(file.exists())
                {
                    System.out.println("Файл создан");
                }
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
        }
        else
        {
            System.out.println("Файл data.csv найден! Очищаем!");
            FileWriter fstream1 = null;
            try {
                fstream1 = new FileWriter("data.csv");
            } catch (IOException e) {
                e.printStackTrace();
            }
            try (BufferedWriter out = new BufferedWriter(fstream1)) {
                try {
                    out.write("");
                } catch (IOException e) {
                    e.printStackTrace();
                }
                try {
                    out.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    void saveArrayToFile(int[][] arr, String path)
    {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(path));
            bw.write(header);
            bw.newLine();
            for (int i = 0; i < arr.length; i++)
            {
                for (int j = 0; j < arr[0].length; j++)
                {
                    if(j == arr[0].length-1) {
                        bw.write(String.valueOf(arr[i][j]) );
                    }
                    else
                    {
                        bw.write(String.valueOf(arr[i][j]) + ";");
                    }
                }
                bw.newLine();
            }
            bw.flush();
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    void ReadFile(String path)
    {
        try {
            File file = new File(path);
            FileReader fr = new FileReader(file);
            BufferedReader reader = new BufferedReader(fr);
            String line = reader.readLine();
            while (line != null)
            {
                System.out.println(line);
                line = reader.readLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
