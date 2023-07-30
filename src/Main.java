
import java.io.IOException;
import java.util.Scanner;

import arhive.AddBase;
import arhive.LoadBase;
import arhive.ShowWood;

import Search.*;

public class Main {

    /**
     * @param args
     * @throws NumberFormatException
     * @throws IOException
     */
    public static void main(String[] args) throws NumberFormatException, IOException {

        boolean no_exit=true;
        int idCommand;  
        Scanner scan = new Scanner(System.in);

        while (no_exit) {                                                          // Меню 
            System.out.println();
            System.out.println("Выберети команду");            
            System.out.println("[1] Показать дерево");
            System.out.println("[2] Добавить нового члена семьи в дерево");
            System.out.println("[3] Показать всех участников древа по имени");
            System.out.println("[4] Выход");
            System.out.println();
            idCommand = scan.nextInt();
            scan.nextLine();
            System.out.println();
      
            if (idCommand==1){
                LoadBase list =new LoadBase();
                ShowWood wood =new ShowWood();
                wood.ShowWood(list.LoadBase());
                no_exit=false;
            }
            if (idCommand==2){
                AddBase add_new =new AddBase();
                add_new.AddBase();
                no_exit=false;
            }
            if (idCommand==3){
                LoadBase list =new LoadBase();
                Searching name = new Searching();
                name.search(list.LoadBase());

            }
            else no_exit=false;
        }
    }
}