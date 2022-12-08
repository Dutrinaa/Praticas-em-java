package b1_exercicios_01;

public class Ex1_1 {
    public static void main(String[] args) {
        int num = ScanNum.scanear();

        if(num % 2 == 0)
            System.out.println(num + " Eh par");
        else
            System.out.println(num + " Eh impar");
    }
}
