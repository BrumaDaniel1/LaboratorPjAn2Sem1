package labjava;

import java.util.Scanner;

enum LOAD_TYPE{
	HARDCODAT, KEYBORD, FILE
};

enum DISPLAY_TYPE{
	CONSOLA, FISIER, GUI
};



public class TestClass{
	public static void main(String[] args) {

		/*IDisplayManager displayManager= new FileDisplay();
		HardcodatDataManager dataManager= new HardcodatDataManager();
		dataManager.createStudentsData();
		displayManager.displayStudents(dataManager.dataSetOfStudent);

		IDisplayManager displayManager=Settings.displayHaspMap.get(Settings.displayType);
		IDataLoader dataManager= Settings.dataLoaderHaspMap.get(Settings.loadType);
		displayManager.displayStudents(dataManager.createStudentsData());

		IDisplayManager displayManager= Settings.displayHaspMap.get(DISPLAY_TYPE.CONSOLA);
		IDataLoader dataLoader = Settings.dataLoaderHaspMap.get(LOAD_TYPE.FILE);
		displayManager.dispalyTeachers(dataLoader.createProfesorData());
		*/
		Scanner sc= new Scanner(System.in);
		System.out.println("Username=");
		var username = sc.next();
		System.out.println("Password=");
		var password = sc.next();

		try {
			Application.getInstance().login(new User(username, password));
		}catch (Exception e){
			System.out.println(e.getMessage());
		}
	}
}
