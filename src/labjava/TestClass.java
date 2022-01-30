package labjava;

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
*/
		IDisplayManager displayManager= Settings.displayHaspMap.get(DISPLAY_TYPE.CONSOLA);
		IDataLoader dataLoader = Settings.dataLoaderHaspMap.get(LOAD_TYPE.FILE);
		displayManager.dispalyTeachers(dataLoader.createProfesorData());
	}
}
