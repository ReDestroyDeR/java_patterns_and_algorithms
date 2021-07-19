package red.patterns.structural.adapter;

import java.util.Scanner;

/**
 * @author Daniil Shreyder
 * Date: 19.07.2021
 */
public class HumanService {
    AlienService alienService = new AlienService();

    public static void main(String[] args) {
        System.out.println("Enter data what to delegate to the alien service: ");
        String data = new Scanner(System.in).nextLine();

        System.out.println("We access Alien service through adapter and get output: ");
        HumanService humanService = new HumanService();
        humanService.alienEnhancedHumanMethod(data);
    }

    public void alienEnhancedHumanMethod(String string) {
        AlienServiceAdapter adapter = new AlienServiceAdapter(alienService);
        adapter.alienEnhancedMethod(string);
    }
}
