import java.sql.SQLIntegrityConstraintViolationException;

public class Calculator {
    public static int add(final String numbers){
        int returnValue = 0;
        String[] numbersArray = numbers.split(",|\n");
//        if(numbersArray.length > 2){
//            throw new RuntimeException("Up to two numbers seperated by comma (,) are allowed");
//        } else {
            for(String number : numbersArray){  //each number character in string
                if (!number.trim().isEmpty()) {  //if string is not empty (also removes any whitesapces)
                    returnValue += Integer.parseInt(number);  //parse strings to numbers and store to returnValue
                }
            }
            return returnValue;
        }
    }


