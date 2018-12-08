package lucky;

import org.junit.jupiter.api.Test;
import utils.FileUtils;
import static org.junit.jupiter.api.Assertions.*;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Random;


public class Winner {

    @Test
    public void test_array_vs_varargs() {
        int[] numbers = new int[4];
        numbers[0] = 0;
        numbers[1] = 1;
        numbers[2] = 2;
        numbers[3] = 3;


        System.out.print("\n1.Array argument");
        printNumbersVarargs(numbers);

        System.out.print("\n\n2.Varargs-array param");
        printNumbersVarargs(numbers);


        System.out.print("\n\n3.Varargs-no params");
        printNumbersVarargs();


        System.out.print("\n\nVarargs-multiple params");
        printNumbersVarargs(0, 1, 2, 3);


    }


    public void printNumbers(int[] numbers) {

        for (int i = 0; i < numbers.length; i++) {

            System.out.println(numbers[i] + ",");
        }


    }

    public void printNumbersVarargs(int... numbers) {

        for (int i = 0; i < numbers.length; i++)

            System.out.println(numbers[i] + " ,");
    }


    private List<String> getParticipants() throws IOException {

        return FileUtils.fileLinesToList( "Resource" , "lucky" , "participants.txt");
    }








    @Test

    public void test_get_participants() throws IOException {

        System.out.println(getParticipants());
    }

    private List<String> getAbsents() throws IOException {

        return FileUtils.fileLinesToList( "Resource" , "lucky" , "absents.txt");
    }

    @Test
    public void test_get_participants_and_participants() throws IOException {

        System.out.println("Participants " +getParticipants());
        System.out.println("Absents " +getAbsents());
    }
    @Test
    public void main_flow () throws IOException {


        List<String> participants = getParticipants();
        int allCount = participants.size();
        List<String> absents = getAbsents();
        int absentsCount =  absents.size();

        boolean succededRemovingAbsents = participants.removeAll(absents);

        System.out.println("succededRemovingAbsents: "+ succededRemovingAbsents);
        int countAfterRemovingAbsents = participants.size();

        assertEquals(allCount - absentsCount , countAfterRemovingAbsents);
        System.out.println("Random seed: "+ System.currentTimeMillis());
        Collections.shuffle(participants);
        new Random(System.currentTimeMillis());
        
        String winner1 = participants.remove(0);  Collections.shuffle(participants);
        new Random(System.currentTimeMillis());
        
        String winner2 = participants.remove(0);  Collections.shuffle(participants);
        new Random(System.currentTimeMillis());
        
        String winner3 = participants.remove(0);
        
        String winner1 = getWinner(participants);

        System.out.println(participants);
    }

    private String getWinner(List<String> participants) {
    }


}

