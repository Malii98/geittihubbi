import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        Random random = new Random();

        boolean kaikkiSeitseman = true;
        for (int i = 1; i <= 3; i++) 
        {

            int randomNumber = random.nextInt(11);  
            System.out.println("Satunnainen numero 0-10 väliltä: " + randomNumber);

            
            if (randomNumber != 7) 
            {
                kaikkiSeitseman = false;
            }
        }

        
        if (kaikkiSeitseman) {
            System.out.println("Voitit!");
        } 
        else 
        {
            System.out.println("Et voittanut.");
        }
    }
}
