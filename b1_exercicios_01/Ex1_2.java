package b1_exercicios_01;

public class Ex1_2 {
    public static void main(String[] args) {
        int f = ScanNum.scanear();
        int aux = f;

        for(int i = f - 1; i > 0;i--){
            f = f * i;
        }
        System.out.println("O fatorial de " + aux + " eh igual a " + f);
    }
}
