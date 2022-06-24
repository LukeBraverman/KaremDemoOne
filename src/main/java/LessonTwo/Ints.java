package LessonTwo;

public class Ints {

    public int number = 10; // An example of an int

//    public int numberThatWillGiveError = 10.5; // An example of an int

    public int addOne() {
        return number + 1;
    }

    public int addOneRemix() {
        return number ++;
    }

    public int addOneRemix2() {
        return number += 1;
    }

    public int minusOne() {
        return number - 1;
    }

    public int minusOneRemix() {
        return number -= 1;
    }

    public int divideFive() {
        return number / 5;
    }

    public int divideFiveRemix() {
        return number /= 5 ;
    }

    public int multiplyFive(){
        return number * 5;
    }

    public int multiplyFiveRemix(){
        return number *= 5;
    }

    public int moduloThree(){
        return number % 3;
    }

    public int quirkOne(){
        return 10 / 3;
    }

    public int quirkTw0(){
        return 10 / 4  ; // Int does not care about rounding up or down
    }

    //

    Integer numberAsInterger = number; //Turning int into Integer (boxed primitive)

//    public void showingBoxedPrimitives(){
//        int aNumber = 5;
//        Integer aNumberBoxed = aNumber;
//
//        char aChar = '5';
//        Character aCharacter = aChar;
//
//        boolean falseBoolean = false;
//        Boolean falseBooleanObject = falseBoolean;
//
//
//
//    }


    public Integer printOutnumberAsInterger() {
        return numberAsInterger;
    }
    public Integer compareTo() {
        return numberAsInterger.compareTo(0);
    }

    public Double convertToDouble() {
        return numberAsInterger.doubleValue();
    }

    public Double convertToDoubleTwo() {
        double doubleValue = numberAsInterger.doubleValue();
        doubleValue += 0.5;
        return doubleValue;
    }

    public String integerToString() {

        String integerToString = String.valueOf(numberAsInterger);
        return integerToString;
    }

    public int stingToInteger() {

       String intergetAsString = "100";

       Integer integerResult = Integer.parseInt(intergetAsString);
        return integerResult;
    }




}


/*
  notes:

   ints are immutable
   ints have to be WHOLE NUMBERS

 */
