package labjava;



public class Student implements Comparable <Student> {
	public String nume;
	public String prenume;
	public int grupa;

	public Student () { }

	Student(String nume, String prenume, int grupa) {
		this.nume = nume;
		this.prenume = prenume;
		this.grupa = grupa;
	}

	@Override
	public String toString() {
		return "Student [nume=" + nume + ", prenume=" + prenume + ", grupa=" + grupa + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + grupa;
		result = prime * result + ((nume == null) ? 0 : nume.hashCode());
		result = prime * result + ((prenume == null) ? 0 : prenume.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (nume == null) {
			if (other.nume != null)
				return false;
		} else if (!nume.equals(other.nume))
			return false;
		if (prenume == null) {
			if (other.prenume != null)
				return false;
		} else if (!prenume.equals(other.prenume))
			return false;
		return true;
	}

	@Override
	public int compareTo(Student o) {
		Student student= (Student) o;
		return this.nume.compareTo(student.nume);
		/*if (this.nume.compareTo(student.nume)== -1)
			return -1;
		else if (this.nume.compareTo(student.nume) == 1)
			return 1;
		else if (this.prenume.compareTo(student.prenume) == -1)
			return -1;
		else if (this.prenume.compareTo(student.prenume) == 1)
			return 1;
		else
			return 0;*/
	}

}
