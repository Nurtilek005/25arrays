import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
  /*      //------------------------------------------------------------------------------1
        int[] massiv = {6, 7, 2, 9, -3};
        int array = -1;
        for (int i = 0; i < massiv.length; i++) {
            if (massiv[i] < 0) {
                array = i;
                break;
            }
        }
        if (array >= 0) {
            System.out.println(" Oтрицательный элемент: " + massiv[array] + ", порядковый номер: " + array);
        } else {
            System.out.println("В массиве нет отрицательных элементов.");
        }

*/
      /*  //-----------------------------------------------------------------------------------------------2
        int [] Arr = {1,2,33,66,8,90};

        for (int i = 0; i < Arr.length; i++) {
            if (Arr[i]>10){
                System.out.println("Индекс - " + i + " удовлетворяет условиe a[i] > 10: " + Arr[i]);
            }        }

*///---------------------------------------------------------------------------------------3
        /*       int[] array = {7,-3,6,-18,5,-11,9};
        int a = 0;
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
            if (array[i] < 0) {
                a++;
            }
        }
        int b = sum / array.length;
        System.out.println("Средняя температура : " + a);
        System.out.println(" Ниже  нуля :" + b);

*/
//////// ----------------------------------------------------- 4
   /*     int[] arr = {5,2,3,6,5,3,7,8,6};
        int a = 1;
        for (int i = 1; i < arr.length; i++) {
            if(i % 2 ==0 && arr[i] % 2 != 0){
                a++;
            }
        }
        System.out.println("Кол -: " + a);
*/
////// ---------------------------------------------------------------------------------------------------5
     /*   int[] massa = {17, 7, 1, 3, -2};
        boolean arr = true;
        for (int i = 1; i < massa.length; i++) {
            if (massa[i] >= massa[i - 1]) {                arr = false;
                break;            }
        }
        if (arr) {            System.out.println("Последовательность является убывающей.");
        } else {            System.out.println("Последовательность не является убывающей.");
        }
        */

/////--------------------------------------------------------------------------------------------- 6
/*
        int[] massa = {4, 2, 7, 9, 1, 3, 5, 6};
        int kolpar = 0;
        for (int i = 1; i < massa.length; i++) {
            if (massa[i] == massa[i - 1]) {
                kolpar++;
                i++;
            }
        }
        System.out.println("Кол пар: " + kolpar);
*/
///------------------------------------------------------------------------------------------------------------------7

/*
        int[] arr1 = {8, 4, 5, 81, 54, 3, 1, 8, 82};
        int arr2 = arr1[0];
        int arr3 = 0;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] > arr2) {
                arr2 = arr1[i];
                arr3 = i;
            }
        }
        int arr4 = arr1[0];
        arr1[0] = arr2;
        arr1[arr3] = arr4;
        for (int d : arr1) {
            System.out.print(d + " ");
        }

*/
//////------------------------------------------------------------------------------------------8
/*

        int[][] arr = {
                {23, 9, 7, 21},
                {32, 12, 9, 5},
                {23, 17, 5, 12}};
        int arr1 = arr[0][0];
        int strok = 0;
        int ctolb = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > arr1) {
                    arr1 = arr[i][j];
                    strok = i;
                    ctolb = j;
                }
            }
        }
        System.out.println("Наибольший элемент: " + arr1);
        System.out.println("Номер строки: " + strok);
        System.out.println("Номер столбца: " + ctolb);

*/
/*
////-------------------------------------------------------------------------------------------------9
        int [][] massa = {
                {8,2,-5,-8,-1,-3},
                {-1,-12,-3,-9,-6,-2},
                {5,-7,-3,-9,2,-9 }
        };
        int a = 0;
        int sum = 0;
        for (int i = 0; i < massa.length; i++) {
            for (int j = 0; j < massa[i].length; j++) {
                if (massa[i][j]>0){
                    sum += massa[i][j];
                }
                if (massa[i][j] > 0) {
                    a++;
                }
            }
        }

        int b = sum/a;
        System.out.println(a);
        System.out.println(b);
        System.out.println(sum);


*/

        ////-------------------------------------------------------10


        ////------------------------------------------------------------------------------------------------------11
/*        int[][] massa = {
                {1,2,3,4,5},
                {1,2,3,4,5},
                {1,2,3,4,5},
                {1,2,3,4,5},
                {1,2,3,4,5}
        };
        for (int i = 0; i < massa.length; i++) {
            for (int j = 0; j < massa[i].length; j++) {
                if (i<=j){
                    massa[i][j]= 0;
                }
            }
        }
       for (int i = 0; i < massa.length; i++) {
            for (int j = 0; j < massa[i].length; j++) {
                System.out.print(massa[i][j] +" ");
            }
            System.out.println();
        }

    */
        //--------------------------------------------------------------12
/*
        int [] massa = {11,22,33,44,55,66,77,88};
        for (int i = 0; i < massa.length; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print("x"+massa[j]+ " ");
            }
            System.out.println();
        }
    }
}*/
/*//------------------------------------------------13
        int[][] massa = {
                {234,52,2,52,25},
                {32,735,36,856,3,6},
                {52,59,825,84,34},
        };
        for (int i = 0; i < massa.length - 1; i++) {
            for (int j = 0; j < massa.length - i - 1; j++) {
                if (massa[j][2] > massa[j + 1][2]) {
                    int[] arr = massa[j];
                    massa[j] = massa[j + 1];
                    massa[j + 1] = arr;
                }
            }
        }
        for (int[] trv : massa) {
            System.out.print(trv[2] + " ");
        }
        //----------------------------------------14
      */ /* int[][] massa= {
                {56,-8},
                {32,8},
                {12,4},
                {2,32},
                {83,82}
        };
        for (int i = 0; i < massa.length - 1; i++) {
            for (int j = 0; j < massa.length - i - 1; j++) {
                if (massa[j][1] > massa[j + 1][1]) {
                    int[] temp = massa[j];
                    massa[j] = massa[j + 1];
                    massa[j + 1] = temp;
                }
            }
        }
        for (int[] row : massa) {
            System.out.print(row[1] + " ");
        }/*
        //------------------------------------------15
        int[] arr = {1, 2, 3};


        int[][] arr2 = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arr2[i][j] = arr[i] + arr[j];
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println();
        }
*/
/*
        //----------------------------------------17
        int[][] massa = {
                {6,4,2,7},
                {9,2,9,5},
                {8,38,75,67},
                {1, 2, 3, 4}
        };
        int Elem = massa[0][0];
        int Row = 0;
        for (int i = 0; i < massa.length; i++) {
            if (massa[i][i] > Elem) {
                Elem = massa[i][i];
                Row = i;
            }
        }
        System.out.println("Наибольший элемент на главной диагонали: " + Elem);
        System.out.print("Строка с наибольшим элементом: ");
        for (int j = 0; j < massa[Row].length; j++) {
            System.out.print(massa[Row][j] + " ");
        }
//---------------------------------------------------------18









//-----------------------------------------19
        Random ran = new Random();
        int[] massa = new int[20];
        for (int i = 0; i < 20; i++) {
            massa[i] = ran.nextInt(0,99);
        }
        int arr = ran.nextInt(0,99);
        System.out.println("рандомное число");
        for (int arr2:massa) {
            if (arr2%arr == 0) {
                System.out.println(arr2);
            }
        }
        System.out.println(Arrays.toString(massa));


        }
    }*/
    //-------------------------------------------------------------------20
/*   int min = 50;
        int max = -50;
        Random ran = new Random();
        for (int i = 0; i < 20; i++) {
            int Value = ran.nextInt(101) - 50;
            if (Value < min) {
                min = Value;
            }
            if (Value > max) {
                max = Value;
            }
            System.out.println("Случайное число: " + Value);
        }
        System.out.println("Наименьшее число: " + min);
        System.out.println("Наибольшее число: " + max);
*/

//----------------------------------------21
  /*      Scanner scan = new Scanner(System.in);
        System.out.print("Введите целое положительное число a: ");
        int cons = scan.nextInt();
        while (cons >= 0) {
            System.out.print("Введите число для вычитания: ");
            int num = scan.nextInt();
            cons -= num;
            if (cons >= 0) {
                System.out.println("Текущее значение a: " + cons);
            } else {
                System.out.println("a стало отрицательным. Программа завершена.");
            }
         }*/
       // --------------------------------22
     /*   int [] massa = {2,21,3,78,0,3,24,3,2};
        int m = massa[0];
        for (int i = 0; i < massa.length-1; i++) {
            if (massa[i] > m){
            m = massa[i];            }}
        System.out.println("Наибольшой Элемент:"+m);*/
        //-------------------------------------23
     /*   int [] mas1 = {2,6,6,9,5,2,4,6,7};
        int [] mas2 = {8,5,3,6,8,7,4,4,7};
        int [] mas3 = new int[mas1.length+mas2.length];
        int counter=0;
        for (int i = 0; i < mas1.length; i++) {
            mas3[i]=mas1[i];
            counter++;
        }
        for (int i = 0; i <mas2.length ; i++) {
            mas3[counter++]=mas2[i];
        }
        System.out.println(Arrays.toString(mas3));

*/
        //--------------------------------------24
       /* Scanner scan = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int can = scan.nextInt();
        int[] array = new int[can];
        for (int i = 0; i < can; i++) {
            array[i] = (int) (Math.random() * 90) + 10;
        }
        int min = array[0];
        for (int i = 1; i < can; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("Минимальное значение в массиве: " + min);
        int san = can / 2;
        System.out.println("Первая половина массива:");
        for (int i = 0; i < san; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("\nВторая половина массива:");
        for (int i = san; i < can; i++) {
            System.out.print(array[i] + " ");
        }*/
       // -----------------------------------25
     /*   int[] massa = {1, 2, 3, 4, 5};
        int newelementu = 6;
        int[] itog = Arrays.copyOf(massa, massa.length + 1);
        itog[itog.length - 1] = newelementu;
        System.out.println("Исходный массив: " + Arrays.toString(massa));
        System.out.println("Новый массив: " + Arrays.toString(itog));*/
    }
}