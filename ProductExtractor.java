package Random;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class ProductExtractor {
    public static void main(String[] args) {
        String csvFile = "D://Programs//Java//Wiley//src//Random//products.csv";
        String line = "";
        String csvSplitBy = ",";
        ArrayList<String[]> productsList = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            while ((line = br.readLine()) != null) {
                String[] product = line.split(csvSplitBy);
                productsList.add(product);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Print out the contents of the ArrayList
        for (String[] product : productsList) {
            System.out.println("Product [id=" + product[0] + ", name=" + product[1] + ", price=" + product[2] + "]");
        }
    }
}
