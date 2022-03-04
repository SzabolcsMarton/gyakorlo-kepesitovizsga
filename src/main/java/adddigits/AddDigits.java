package adddigits;

public class AddDigits {

    public int addDigits(String input) {
        if (ensureInputIsInValid(input)){
            return -1;
        }
        char[]charactersInInput = input.toCharArray();
        return sumAllDigitsInString(charactersInInput);
    }

    private int sumAllDigitsInString(char[] charsToSum){
        int sum = 0;
        for(Character actual : charsToSum){
            if (Character.isDigit(actual)) {
                sum += convertCharToInt(actual);
            }
        }
        return sum;
    }

    private boolean ensureCharIsDigit(char charToCheck){
        return Character.isDigit(charToCheck);
    }

    private boolean ensureInputIsInValid(String stringToValidat){
        if(stringToValidat == "" || stringToValidat == null){
            return true;
        }
        return false;
    }

    private int convertCharToInt(char charToConvert){
        return Character.getNumericValue(charToConvert);
    }




}
