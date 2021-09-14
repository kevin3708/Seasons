public class Main {

    public static void main(String[] args) {

        range myFirstRange = new range(1314,2014);
        myFirstRange.setRangeType(1);
        myFirstRange.setFirstDivisor(14);
        myFirstRange.setSecondDivisor(20);

        range mySecondRange = new range(1100,3150);
        mySecondRange.setRangeType(2);
        mySecondRange.setFirstDivisor(4);

        range myThirdRange = new range(1500,1890);
        myThirdRange.setRangeType(3);
        myThirdRange.setFirstDivisor(3);

        System.out.println("List of all years divisible by:" +myFirstRange.getFirstDivisor()+ "and" +myFirstRange.getSecondDivisor());
        myFirstRange.printYears();

        System.out.println("List of all leap years between" +mySecondRange.getFirstYear()+ "and" +mySecondRange.getSecondYear());
        mySecondRange.printLeap();

        System.out.println("List of all olympic years between" +myThirdRange.getFirstYear()+ "and" +myThirdRange.getSecondYear()+"that are divisible by"+myThirdRange.getFirstDivisor());
        myThirdRange.printOlympic();


    }
}

