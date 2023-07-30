package arhive;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class LoadBase {
    /**
     * @return
     * @throws NumberFormatException
     * @throws IOException
     */
    public ArrayList<Person> LoadBase() throws NumberFormatException, IOException {

        ArrayList<Person> arhive = new ArrayList<>();                                       

        File file = new File("C:\\New\\dz\\oop_sem\\src\\arhive\\Base.txt");
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            int a, b, c;    
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                a = Integer.parseInt(parts[0]);
                b = Integer.parseInt(parts[1]);
                c = Integer.parseInt(parts[2]);
                    
                if (parts.length==6){
                    arhive.add(new Person(a,b,c,parts[3],parts[4],parts[5]));                    
                }
                else {
                    arhive.add(new Person(a,b,c,parts[3],parts[4],parts[5],parts[6]));
                }
            }
        }
        
        return arhive;
    }    
}
