package devalbi.udemy.Section_5.challenges.challnege_2;

/*//
 
Modify the while code above
Make it also record the total number of even numbers it has found
and break once 5 are found
and at the end, display the total number of even numbers found


Create a method called isEvenNumber that takes a parameter of type int
Its purpose is to determine if the argument passed to the method is
an even number or not.
return true if an even number, otherwise return false;
*/

public class WhileChallenge2 {

    public static void main(String[] args) {

        int count = 6;

/*        while (count != 6 || evenCount != 5) {
            System.out.println("Count value is " + count);
            count++;
        }

        for (int i = 6; i != 6; i++) {
            System.out.println("Count value is " + count);
        }

        count = 6;
        do {
            System.out.println("Count value was " + count);
            count++;

            if (count > 100) {
                break;
            }

        } while (count != 6)*/;

        int number = 5;
        int finishNumber = 20;
        int evenCount =0;

        while (number <= finishNumber) {
            if (!isEvenNumber(number)) {
                number++;
                continue;
            }
            System.out.println("Even number " + number);
            number++;
            evenCount++;
            if (evenCount >= 5) {
                break;
            }
            }
        }
    public static boolean isEvenNumber(int num) {
        if (num % 2 == 0) {
            return true;
        } else return false;
    }
}

