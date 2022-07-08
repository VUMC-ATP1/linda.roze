package homework.classHomeWork;

public class trijstūris {
    public int malaA;
    public int malaB;
    public int malaC;
    public double area;

    public void trijstūris() {
        System.out.println("Programma veido trijstūri!");
    }

    public trijstūris(int malaA, int malaB, int malaC) {
        this.malaA = malaA;
        this.malaB = malaB;
        this.malaC = malaC;
       // this.area = area;
    }

    public int getMalaA() {
        return malaA;
    }

    public int getMalaB() {
        return malaB;
    }

    public int getMalaC() {
        return malaC;
    }

    public void setMalaA(int malaA) {
        this.malaA = malaA;
    }

    public void setMalaB(int malaB) {
        this.malaB = malaB;
    }

    public void setMalaC(int malaC) {
        this.malaC = malaC;
    }

    public double calculatePerimeter(double sArea){

        return sArea=(malaA+malaB+malaC)/2;
    }

    public double calculateArea(double area, double sArea){
        return area=Math.sqrt(sArea *(sArea-malaB)*(sArea-malaB)*(sArea-malaC));
    }
//    public trijstūris(int malaA, int malaB, int malaC, double area) {
//        this.area = calculateArea(s, area);
//    }
}