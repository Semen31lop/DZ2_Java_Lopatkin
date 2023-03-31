import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class text {
    public static void main(String[] args) throws FileNotFoundException {
        FileReader fileReader = new FileReader("log.txt");
        Scanner scanner = new Scanner(fileReader);
        String str = scanner.nextLine();
        System.out.println(str);
        System.out.println(str.replace("{", "").replace("}", ""));
        
        
    }

}
/*
Я пытался вот так вытащить файл , ибо до этоге у меня не выходило как сверху.
 Но я тут не смог понять как переделать в новую строку всё что было в файле
File file = new File("log.txt");
            
            try (BufferedReader br = new BufferedReader(new FileReader(file)))
            {
                String line;
                while ((line = br.readLine()) != null) {
                    System.out.println(line);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
*/