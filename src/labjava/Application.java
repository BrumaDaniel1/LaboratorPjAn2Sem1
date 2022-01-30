package labjava;

import java.util.ArrayList;
import java.util.List;

public class Application {
    private static Application single_instance = null;
    private List<User> userList = new ArrayList<>();
    public User currentUser = null;

    static Application getInstance(){
        if(single_instance==null){
            single_instance = new Application();
        }
        return single_instance;
    }

    private Application() {
        HardcodatDataManager dataManager = new HardcodatDataManager();
        var studenti = dataManager.dataSetOfStudent;
        var profesri = dataManager.dataSetOfProfesor;

        this.userList.add(new User("aaa", "aaa", UserAccountType.STUDENT));
    }
}
