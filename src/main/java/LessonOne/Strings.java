package LessonOne;

public class Strings {


    public String collecitonOfCaracters() {

        //Creating a String variable
        String name = "Karem";

        // demonstrating the limitations of the String object class
        for (int i=0; i <10 ; i ++) {
            name += "m";
        }


        return name;
    }

    public String gettingOverStringLimitation() {

        StringBuilder name = new StringBuilder();
        name.append("Karem");

        for (int i=0; i <10 ; i ++) {
            name.append( "m");
        }

        String finalStringName = name.toString();

        return finalStringName;

    }

    // EXPLORING STRING OPERATIONS

    String exampleString = "ExloringStringMethods";

    public String uppercase() {

        return exampleString.toUpperCase();
    }

    public String lowercase() {

        return exampleString.toLowerCase();
    }

    public String subString() {

        return exampleString.substring(0,8);
    }

    public char[] toArray() {
        return exampleString.toCharArray();
    }

    public int length() {

        return exampleString.length();
    }

    public String replace() {

        return exampleString.replace("E","z");
    }



}

/*
    Notes:

    String is a collection of characters.

    Strings are immutable.

    Strings are objects

    Strings come with their own methods





 */
