import java.io.*;
import java.util.LinkedList;
import java.util.List;

public class FileHandler {
   public List<Customer> readFile() {
       LinkedList<Customer> list = new LinkedList<>();
       String lineRead;
       String[] splitLine;
       Customer customer;

       try (BufferedReader reader = new BufferedReader(new FileReader("file.csv"))) {
           lineRead = reader.readLine();
           while (lineRead != null) {
               splitLine = lineRead.split(", ");
               customer = new Customer(Integer.parseInt(splitLine[0]),splitLine[1],splitLine[2]);
               list.add(customer);
               lineRead = reader.readLine();
           }

       }catch (IOException e){
            e.printStackTrace();
       }
       return list;
   }

   public void appendFile(String customer){
       try(BufferedWriter writer = new BufferedWriter(new FileWriter("file.csv",true))){
           writer.write(customer + "\n");
       }catch (IOException e){
           e.printStackTrace();
       }
   }
}
