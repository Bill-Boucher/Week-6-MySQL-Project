package application;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;
import dao.classDao;
import entity.classes;

public class Menu {

	public static Scanner scanner = new Scanner(System.in);
	private static classDao classDao = new classDao();
	
	public void start() throws SQLException {
		MainMenu();
	}
	
	public void MainMenu() throws SQLException {
		Boolean run = true;
		while(run) {
			menuInstructions();
			
			String choice = scanner.nextLine();
			System.out.println("Enter a selection: ");
			
			if (choice.isEmpty());{
		}
		switch (choice) {
		case "1":
			
			break;
		case "2":
			printInstructionsClass();
			classSelection();
			break;
		 case "3":
            
             
             break;
         case "4":
             run = false;
             break;
         default:
             System.out.println("Invalid selection, Try again.");
             break;	
		}

	}

//private void createRace() {


//private void createName() {
    
}


public void menuInstructions(){



    System.out.println("*************************");
    System.out.println("*******MAIN MENU*********");
    System.out.println("*************************");
    System.out.println("Here are the options");
    System.out.println("1) Create Character Name.");
    System.out.println("2) Create Character Class.");
    System.out.println("3) Create Character Race.");
    System.out.println("4) Exit.");




}
private void createClass() throws SQLException {
    String name = null;
    System.out.println("Chose from a list of classes");
    System.out.println("1) Archer");
    System.out.println("2) Swordsman");
    System.out.println("3) Mage");
    String choice = scanner.nextLine();

    if (choice.isEmpty()){
    }
    switch (choice){
        case "1":
            name = "Archer";
            break;
        case "2":
          name = "Swordsman";
            break;
        case "3":
           name = "Mage";
            break;
        default:
            System.out.println("Invalid selection, Try again.");
            break;
    }



    classDao.createClass(name);
}

private void updateClass() throws SQLException {
    System.out.println("Enter the Class ID: ");
    showClass();
    long id = Long.parseLong(scanner.nextLine());

    System.out.println("Enter the new Class name");
    String name = scanner.nextLine();
    showClass();

}
private void showClass() throws SQLException {
    List<classes> classes = classDao.getClasses();
    classes.stream().forEach(System.out::println);



}

private void deleteClass() throws SQLException {

    showClass();
    System.out.println("Enter class id to delete");
    long id = Long.parseLong(scanner.nextLine());
    classDao.deleteClass(id);

}

private void printInstructionsClass() throws SQLException {

    System.out.println("**************************");
    System.out.println("*****Class Selection******");
    System.out.println("**************************");
    System.out.println("Here are the options");
    System.out.println("1) Create a Class");
    System.out.println("2) Update a Class");
    System.out.println("3) List all Classes");
    System.out.println("4) Delete a Class");
    System.out.println("5) Return to Selection");





}

private void classSelection() throws SQLException{
    Boolean run = true;
    while (run) {
        printInstructionsClass();
        String choice = scanner.nextLine();
        System.out.println("Enter a selection: ");

        if (choice.isEmpty()) {

        }
        switch (choice) {
            case "1":
                createClass();
                break;
            case "2":
                updateClass();
                break;
            case "3":
                showClass();
                break;
            case "4":
                deleteClass();
                break;
            case "5":
                run = false;
                MainMenu();
            default:
                System.out.println("Invalid selection, Try again.");
                break;
        }
    }
    }

}




