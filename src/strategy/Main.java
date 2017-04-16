package strategy;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author aleksandrpasharin
 */
public class Main {

   
    public static void main(String[] args) {
        
        /* generate random list with 5-10 random numbers
        
        */
        Random rand = new Random();
        
        int size = rand.nextInt(6) + 5;
        List<Integer> list = new ArrayList<>(size);
        
        for(int i = 0; i < size; i++){
            list.add(rand.nextInt());
        }
        
        ListWithListConvertorStrategy<Integer> testList = new ListWithListConvertorStrategy<>(list, new ListConverterA<>());
        
        System.out.println("Strategy A: ");
        System.out.print(testList);
        System.out.println("\n----------------------------------------------------------------------\n");
        
        testList.setConvertorStrategy(new ListConverterB<>());
        
        System.out.println("Strategy B: ");
        System.out.print(testList);
        System.out.println("\n----------------------------------------------------------------------\n");
        
        testList.setConvertorStrategy(new ListConverterC<>());
        
        System.out.println("Strategy C: ");
        System.out.print(testList);
        System.out.println("\n----------------------------------------------------------------------\n");
        
    }
    
}
