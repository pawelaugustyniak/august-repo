package pl.raiffeisen;

import java.math.BigDecimal;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        AverageSalaryCalculator averageSalaryCalculator = new AverageSalaryCalculator(new Locale("es", "es"));
        BigDecimal averageSalary = averageSalaryCalculator.calculate("report.csv");
        System.out.println("Average salary is " + averageSalary);

        String fileWithTooFewLines = "report_empty.csv";
        try {
            averageSalaryCalculator.calculate(fileWithTooFewLines);
        } catch (Exception e) {
            System.out.println("The file " + fileWithTooFewLines + " has too few lines");
        }
    }
}