import java.util.Scanner;

public class range {
    private int year1;
    private int year2;
    private int range;
    private int FirstDivisor;
    private int SecondDivisor;

    public range(int a, int b) {
        this.year1 = a;
        this.year2 = b;
    }


    public int getFirstYear() {
        return this.year1;
    }

    public int getSecondYear() {
        return this.year2;
    }

    public void setRangeType(int a) {
        this.range = a;
    }

    public void setFirstDivisor(int a) {
        this.FirstDivisor = a;
    }

    public void setSecondDivisor(int b) {
        this.SecondDivisor = b;
    }

    public int getFirstDivisor() {
        return this.FirstDivisor;
    }
    public int getSecondDivisor() {
        return this.SecondDivisor;
    }
    public void printYears(){
        while(year1<=year2){
            year1++;
            if(year1%FirstDivisor==0&&year1%SecondDivisor==0)
                System.out.println(year1);
        }
    }

    public void printLeap(){
        while(year1<=year2){
            year1++;
            if(year1%FirstDivisor==0){
                System.out.println(year1);
            }
        }
    }
    public void printOlympic(){
        while(year1<=year2){
            year1++;
            if(year1%FirstDivisor==0){
                System.out.println(year1);
            }
        }
    }
}











