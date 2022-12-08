package b2_exercicios_05;

public class Relogio {
    private int hora, min, sec;

    public Relogio(int h, int m, int s) {
        acertarHora(h,m,s);
    }

    public Relogio(int h, int m) {
        acertarHora(h,m);
    }

    public Relogio(int h) {
        acertarHora(h);
    }

    
    public void acertarHora(int h, int m, int s)
    {
        this.hora = h;
        this.min = m;
        this.sec = s;
    }
    
    public void acertarHora(int h, int m)
    {
        this.hora = h;
        this.min = m;
        this.sec = 0;
    }
    
    public void acertarHora(int h)
    {
        this.hora = h;
        this.min = 0;
        this.sec = 0;
    }
    
    
    
    public int getH() {
        return hora;
    }

    public void setH(int h) {
        this.hora = h;
    }

    public int getM() {
        return min;
    }

    public void setM(int m) {
        this.min = m;
    }

    public int getS() {
        return sec;
    }

    public void setS(int s) {
        this.sec = s;
    }

    @Override
    public String toString() {
        return "Relogio esta marcando " + hora + ":" + min + ":" + sec + "";
    }
    
    }