package labjava;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;


public class TestClass {	
	public static void main(String[] args) {
		DataManager dataManager = new DataManager();
		
		dataManager.gradeStudents();
		dataManager.manager.reportAllCourses();
		dataManager.manager.reportAllStudentsGrades();
		dataManager.manager.reportAllCourses();
		try {
			dataManager.manager.RemoveCurs(new Curs("PCLP 1"));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		System.out.println("Dupa stergere:");
		dataManager.manager.reportAllCourses();
		dataManager.manager.reportAllStudentsGrades();

		try {
			dataManager.manager.EditCurs(new Curs("Limba engleza"), new Curs("Limba engleza II", "descriere",
					new Profesor("Ana", "Maria"), dataManager.createRandomSetOfStudents()));
			dataManager.manager.reportAllCourses();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		System.out.println("//////////////////////////////////////////");
		
		HashMap<Integer, ArrayList<Student>> grupareStudentiDupaGrupa = new HashMap<Integer, ArrayList<Student>>();

		for (Curs c : dataManager.manager.cursuri) {

			for (Student s : c.studenti) {

				ArrayList<Student> stud = grupareStudentiDupaGrupa.get(s.grupa);
				if (stud != null) {
					stud.add(s);
					grupareStudentiDupaGrupa.replace(s.grupa, stud);
				} else {
					stud = new ArrayList<Student>();
					stud.add(s);
					grupareStudentiDupaGrupa.put(s.grupa, stud);

				}

			}
		}

		for (Integer g : grupareStudentiDupaGrupa.keySet()) {
			System.out.println(grupareStudentiDupaGrupa.get(g) + " " + g);
		}
		
		/*for (Map.Entry<Integer, ArrayList<Student>> entry : grupareStudentiDupaGrupa.entrySet()) {

			Integer key = entry.getKey();
			ArrayList<Student> value = entry.getValue();
			System.out.println(value + " " + key);

		}*/
		ArrayList<Student> studenti = new ArrayList<>(dataManager.manager.cursuri.get(0).studenti);

		System.out.println("Inainte de Sortare:");

		for (int i = 0; i < studenti.size(); i++) {
			System.out.print(studenti.get(i));
		}


		Collections.sort(studenti);

		System.out.println();
		System.out.println("Dupa de Sortare:");

		for (int i = 0; i < studenti.size(); i++) {
			System.out.print(studenti.get(i));
		}
		
		
		System.out.println("/////////////////// SORTARE DUPA NUME ///////////////////////");
		Collections.sort(dataManager.manager.cursuri, new SortareDupaNume());
		dataManager.manager.reportAllCourses();
		
		
		System.out.println("///////////////////// SORTARE DUPA PROFESOR /////////////////////");
		Collections.sort(dataManager.manager.cursuri, new SortareDupaProfesor());
		dataManager.manager.reportAllCourses();
		
		
		System.out.println("///////////////////// SORTARE DUPA NR STUDENTI/////////////////////");
		Collections.sort(dataManager.manager.cursuri, new SortareDupaNrStud());
		dataManager.manager.reportAllCourses();
		
		
		
		
		
		

		
		
	}
}
