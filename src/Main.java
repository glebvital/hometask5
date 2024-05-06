public class Main {
    public static void main(String[] args) {
        int[] ar = {21, 5, -4, 9};
//        print(ar);
//        bubble(ar);
//        print(ar);
//        print(ar);
//        insert(ar);
//        print(ar);
//        print(ar);
//        select(ar);
//        print(ar);
//        triangle1();
//        triangle2();
//        triangle3();
//        triangle4();

    }
    public static void bubble(int [] ar){
        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < ar.length-1; j++) {
                if (ar[j]>ar[j+1]){
                    int tmp = ar[j];
                    ar[j] = ar[j+1];
                    ar[j+1]=tmp;
                }
            }
        }
    }
    public static void insert(int [] ar) {
        for (int i = 0; i < ar.length; i++) {
            for (int j = i+1; j < ar.length; j++) {
                if (ar[i]>ar[j]) {
                    int tmp = ar[i];
                    ar[i] = ar[j];
                    ar[j] = tmp;
                }
            }
        }
    }
    public static void select(int[] ar){
        for (int i = 0; i < ar.length; i++) {
            int min=i;
            for (int j = 0; j < ar.length; j++) {
                if(ar[j]<ar[min]){
                    min = j;
                    int tmp = ar[i];
                    ar[i] = ar[min];
                    ar[min] = tmp;
                }
            }

        }
    }
    public static void print(int[] ar) {
        for (int i = 0; i < ar.length; i++) {
            System.out.print(ar[i] + " ");
        }
        System.out.println();
    }
    public static void triangle1(){
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if(i==j&&i<5||i+j==9&&i<5||i==0){
                    System.out.print(" * ");
                }else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
    public static void triangle2(){
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if(i==j&&i<5||i+j==9&&i>4||j==0){
                    System.out.print(" * ");
                }else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
    public static void triangle3(){
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if(i==j&&i>4||i+j==9&&i<5||j==9){
                    System.out.print(" * ");
                }else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }

    }
    public static void triangle4(){
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if(i==j&&i>4||i+j==9&&i>4||i==9){
                    System.out.print(" * ");
                }else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
}
