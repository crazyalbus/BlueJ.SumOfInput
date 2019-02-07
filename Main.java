import java.util.Scanner;

/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {
    private int number;
    
    public void main(){
        number = getNumber();
        System.out.println(addNumbers(number));
        
    }
    
    public int getNumber() {
        Scanner in = new Scanner(System.in);
            
        System.out.println("Pick a number.");
     
        number = in.nextInt(); 
        return number;
    }

    public int addNumbers(int number) 
    {
        int sum = 0;
            for(int i = 0; i <= number; i++) {
            sum = sum + i;
           }   
	return sum;
    }

    
}
