package gb.J1Less2;

public class Main {

    public static void main(String[] args) throws MyArraySizeException
    {
        String [][] arr = new String[4][4];
        arr[0][0] = "g";
        arr[0][1] = "1";
        arr[0][2] = "1";
        arr[0][3] = "1";

        arr[1][0] = "2";
        arr[1][1] = "2";
        arr[1][2] = "2";
        arr[1][3] = "2";

        arr[2][0] = "3";
        arr[2][1] = "3";
        arr[2][2] = "3";
        arr[2][3] = "3";

        arr[3][0] = "4";
        arr[3][1] = "4";
        arr[3][2] = "4";
        arr[3][3] = "4";

        SumArrElements(arr);
    }



    static void SumArrElements(String [][] arr) throws MyArraySizeException {
        int res = 0;
        int sum = 0;
        for(int i =0;i<arr.length;i++)
        {
            for(int j = 0;j<arr[0].length;j++)
            {
                ++res;
            }
        }
        if(res != 16)
        {
            throw new MyArraySizeException();
        }

        for (int i = 0;i<arr.length;i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
                try
                {
                    int ii = Integer.parseInt(arr[i][j]);
                    sum += ii;
                }
                catch(NumberFormatException e)
                {
                    throw new MyArrayDataException("Не удалось преобразовать в число элемент: ",i,j );
                }

            }
        }
        System.out.println("Сумма элементов массива = " + sum);
    }

    public static class MyArraySizeException extends Exception
    {
        @Override
        public void printStackTrace()
        {
            System.out.println("Ooops... Array length is wrong");
        }
    }
    public static class MyArrayDataException extends NumberFormatException
    {
        int a = 0;
        int b = 0;

        public MyArrayDataException(String message, int a, int b) {
            super(message + "[" + a + "][" + b + "]");
            this.a = a;
            this.b = b;
        }
    }
}