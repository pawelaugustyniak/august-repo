import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.NoSuchFileException;
import java.util.*;

public class FileReader {

   List<String> holidaysDates(String inputFile) {
        Scanner scanner = null;
       try {
           scanner = new Scanner(new File(inputFile));
       } catch (FileNotFoundException e) {
           e.printStackTrace();
       }
       List<String> lines = new ArrayList<>();
       while (scanner.hasNextLine()) {
           lines.add(scanner.nextLine());
       }
       return lines;
    }
}
