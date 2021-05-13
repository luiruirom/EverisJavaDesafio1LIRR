package variables;

public class Developer {
	private final byte MAX_EMPLOYEES = 127;
	public static final String ENTERPRISE = "EVERIS";
	public static int numCurrentEmployee = 0;
	private String name;
	private int idEmployee;
	private int vacationDays = 21;

	public Developer(String name) {
		Developer.numCurrentEmployee++;
		this.idEmployee = numCurrentEmployee + 1;
		this.name = name;
	}

	public void goOnVacations(int numDays) {
		if (numDays > vacationDays) {
			System.out.println("No se puede ir de vacaciones tanto tiempo.");
		} else {
			vacationDays -= numDays;
		}
	}

	public static int getNumCurrentEmployee() {
		return numCurrentEmployee;
	}

	public static void setNumCurrentEmployee(int numCurrentEmployee) {
		Developer.numCurrentEmployee = numCurrentEmployee;
	}

	public int getIdEmployee() {
		return idEmployee;
	}

	public void setIdEmployee(int idEmployee) {
		this.idEmployee = idEmployee;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getVacationDays() {
		return vacationDays;
	}

	public void setVacationDays(int vacationDays) {
		this.vacationDays = vacationDays;
	}

	public static String getEnterprise() {
		return ENTERPRISE;
	}

	public byte getMAX_EMPLOYEES() {
		return MAX_EMPLOYEES;
	}

}
