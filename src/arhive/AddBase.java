package arhive;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;
import java.util.Scanner;

public class  AddBase {

    public void AddBase() throws IOException{

    if ( ! Files.isRegularFile(Path.of("C:\\New\\dz\\oop_sem\\src\\arhive\\Base.txt"))){
        Files.createFile(Path.of("C:\\New\\dz\\oop_sem\\src\\arhive\\Base.txt"));
    }

    List<String> file = Files.readAllLines(Paths.get("C:\\New\\dz\\oop_sem\\src\\arhive\\Base.txt"));
    int end_id = file.size()+10;
    Scanner scan_add = new Scanner(System.in);
    int idCommand;
    int id_parent;
    int id_consort;
    String name;
    String sex = "indefined";
    String date_birthday;
    String date_death; 

    System.out.println();
    System.out.println("Введите имя");
    name = scan_add.nextLine();
    System.out.println("Выберите пол человека: [1] Man, [2] Womam ");
    idCommand = scan_add.nextInt();
    scan_add.nextLine();
        if (idCommand == 1)   {sex = "Man";}
        if (idCommand == 2)   {sex = "Woman";}
    System.out.println("Дату рождения: ");
    date_birthday = scan_add.nextLine();
    System.out.println("Введите ID родителя ");
    idCommand = scan_add.nextInt();
    scan_add.nextLine();
        if (idCommand > 10) {id_parent=idCommand;}
        else {id_parent=1;}
    System.out.println("Введите ID супруга");
    idCommand = scan_add.nextInt();
    scan_add.nextLine();
        if (idCommand > 10) {id_consort=idCommand;}
        else {id_consort=0;}
    System.out.println("Если человек мертв введите [1], если жив или не известно [2] ");
    idCommand = scan_add.nextInt();
    scan_add.nextLine();
        if (idCommand == 1){
            System.out.println("Введите дату смерти");
            date_death = scan_add.nextLine();
        }
        else {date_death = "";}

    System.out.printf(end_id+", id родителя: "+id_parent+", id супруга: "+id_consort+
                    ", Имя: "+name+", Пол: "+sex+ ", Дата роджения: "+date_birthday+", Дата смерти: "+date_death);
    System.out.println();
    
    System.out.println("Хотите внести этого человека в базу нажмите [1], если нет введите любое число");
    idCommand = scan_add.nextInt();
    scan_add.nextLine();
    if (idCommand == 1){
        System.out.println("Вносим в базу");
        Path path = Paths.get("C:\\New\\dz\\oop_sem\\src\\arhive\\Base.txt");
        String text = end_id+","+id_parent+","+id_consort+","+sex+","+name+","+date_birthday+","+date_death+"\n";
        Files.write(path, text.getBytes(), StandardOpenOption.APPEND);
        }
    scan_add.close();
    }
}
