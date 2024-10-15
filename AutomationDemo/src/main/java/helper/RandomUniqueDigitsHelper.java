package helper;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;
public class RandomUniqueDigitsHelper {
	
	
	public Set<Integer> GetDigits() {
        Set<Integer> uniqueDigits = new HashSet<>();
        Random random = new Random();

        // Generate unique random digits
        while (uniqueDigits.size() < 4) {
            int randomNumber = random.nextInt(10); // Generate a random number between 0 and 9
            uniqueDigits.add(randomNumber);
        }

         //Print the unique random digits
        System.out.println("Generated unique random digits:");
        for (int digit : uniqueDigits) {
            System.out.print(digit);
        }
        
        return uniqueDigits;
        
	}
        
        
    
}
