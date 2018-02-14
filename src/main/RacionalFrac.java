package main;

/**
 *
 * @author asus
 */
public class RacionalFrac {

    private int chisl;
    private int znamen;
    private int zel = 0;
    private double k = 0;

    public RacionalFrac(int chisl, int znamen) {
        this.chisl = chisl;
        this.znamen = znamen;
    }

    public RacionalFrac(int chisl, int znamen, int zel) {
        this(chisl, znamen);
        this.zel = zel;
    }

    public void properfraction() {
        if (chisl > znamen) {
            zel = (int) chisl / znamen;
            chisl = chisl - znamen * zel;
        }
        System.out.println(zel + "+" + (chisl + "/" + znamen));
    }

    public void substract(int num1, int num2) {
        int k = num1 * znamen;
        int l = chisl * num2;
        System.out.println(l + "/" + k);
    }
    public void substraction(int num1, int num2) {
        int k = num2 * znamen;
        int l = chisl * num2;
        int m = num1 * znamen;
        int f = Math.abs(l - m);
        System.out.println(f + "/" + k);
    }
    public String sd(String d){
        return d+2;
    }

}
