package LessonThree;

public class Characters {

    char aChar = 'a';
    char aCharTwo = '1';
    char aCharThree = '?';

//    char aInvalidChar = 'a?';

    Character exampleToOperateOn = 'L';
    // Exploring the char

    public Character boxingACharPrimitive() {

        char charToBeBoxed = 'K';

        Character boxedChar = charToBeBoxed;

        return boxedChar;
    }


    public int compareTo() {
        Character karem = 'k';

        int result = exampleToOperateOn.compareTo(karem);



        return result;
    }

    public boolean isNotWhitespace() {
        Character filled = 'F';
        return Character.isWhitespace(filled);
    }


    public boolean isWhitespace() {
        char filled = ' ';
        return Character.isWhitespace(filled);
    }



}

/*
    primitive - char
    Boxed primitive - Character

    char = Character

    1) start and end with '' whereas a String is ""
    2) the can only hold one letter/number/punctuation
 */