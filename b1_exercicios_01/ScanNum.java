package b1_exercicios_01;

import java.util.Scanner;

public class ScanNum {

    public static int scanear(){
        int n;
        Scanner ler = new Scanner(System.in);

        System.out.println("informe o numero");
        n = ler.nextInt();
        
        ler.close();

        return n;
    }
}