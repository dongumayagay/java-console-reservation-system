import java.util.Scanner;  
public class Main {
    public static void main(String[] args) {   
            mainMenu();
    }

    public static void mainMenu(){
        Scanner scan = new Scanner(System.in);
        while (true){
            clearScreen();
            System.out.print("System Menu\n"+
            "\n"+
            "a. View All Reservation\n"+
            "b. Make Reservation\n"+
            "c. Delete Reservation\n"+
            "d. Generate Report\n"+
            "e. Exit\n"+
            "\n"+
            "Choose:");
            try{
                String choice = scan.next().toLowerCase();
                switch(choice){
                    case "e": return;
                    default: continue;
                }
            }catch(Exception e){
                scan.close();
                continue;
            }
        }
    }
    public static void clearScreen(){
        try{
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        }catch(Exception e){}
    }

}
