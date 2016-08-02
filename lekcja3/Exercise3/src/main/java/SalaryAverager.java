import java.io.*;
import java.math.BigDecimal;
import java.nio.file.Files;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

/**
 * Created by rb21776 on 2016-07-21.
 */
public class SalaryAverager {

    public static void main(String[] args) {
//        scanFile();

        BufferedReader br = null;
        StringBuilder builder = new StringBuilder();
        List<BigDecimal> listaWartosci = new ArrayList<BigDecimal>();
        NumberFormat parser = NumberFormat.getInstance();
//                DecimalFormat.getCurrencyInstance(new Locale("es", "ES"));
        ((DecimalFormat) parser).setParseBigDecimal(true);


        try {
            String sCurrentLine;
            br = new BufferedReader(new FileReader("src/report.txt"));

            while ((sCurrentLine = br. readLine()) != null) {


                builder.append(sCurrentLine);
                builder.append("\n");

                if(sCurrentLine.matches(".*\\d+.*")) {

                    String k =  sCurrentLine.substring(sCurrentLine.indexOf(';')+1,sCurrentLine.length()-1);
                    System.out.println(k);
                    Number parsed = parser.parse(k);
                    BigDecimal parsedBigDecimal = (BigDecimal) parsed;
                    listaWartosci.add(parsedBigDecimal);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        } finally {
            try {
                if (br !=null)br.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }

//        System.out.println(builder);
        System.out.println(listaWartosci);

    }

    private static void scanFile() {
        try {
            Scanner input = new Scanner(new File("src/report.txt"));
            StringBuilder builder = new StringBuilder();

            while (input.hasNextLine())
                builder.append(input.nextLine());

            System.out.println("Builder: " + builder);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
