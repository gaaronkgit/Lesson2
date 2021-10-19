public class Lesson5
{
    public static void main(String[] args)
    {
        String header = "1;2;";
        int[][] arrData = new int[3][2];
        arrData[0][0] = 100;
        arrData[0][1] = 200;
        arrData[1][0] = 1000;
        arrData[1][1] = 2000;
        arrData[2][0] = 10000;
        arrData[2][1] = 20000;
        AppData appData = new AppData(header, arrData);
    }
}
