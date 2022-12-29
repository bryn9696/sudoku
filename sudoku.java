import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * sudoku
 */
public class sudoku {

    public static void main(String[] args) {
        int x = 9;
        int y = 1;
        Integer[] intArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9};

		List<Integer> intList = Arrays.asList(intArray);

		Collections.shuffle(intList);
	    // Integer[] shuffledArray = intList.toArray(intArray);


        System.out.println(intList);
		
        
                for (int z = 0; z < x; z++)
            
                {
                    for (int place = 0; place <3; place++)
                        {
                            System.out.print(intList.get(place));      
                        }       
                        System.out.print("||"); 
                    for (int line = 0; line < 3; line++)
                        {
                            System.out.print(intList.get(line+3));      
                                    
                        }
                        System.out.print("||"); 
                    for (int line = 0; line < 3; line++)
                        {
                            System.out.print(intList.get(line+6));      
                                    
                        }
                        System.out.print("\n");
                        if (z == 2 || z == 5 || z == 8) {
                            System.out.println("--------------");
                        }
                        
                        Collections.shuffle(intList);
                     
                }
                
                y += 1;
            }
    
}