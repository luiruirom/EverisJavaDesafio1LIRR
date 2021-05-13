package fpdualeveris;

import variables.Developer;

public class FPDual {

	public static void main(String[] args) {
		variablesChallenge();
	}

	private static void variablesChallenge() {
		// Se crean 4 nuevos empleados
		Developer d1 = new Developer("Juan");
		Developer d2 = new Developer("Alberto");
		Developer d3 = new Developer("Antonio");
		Developer d4 = new Developer("Iván");

		// Se comprueba que el número de la variable estática que contabiliza el número total de empleados es el mismo para el desarrollador 1 y el desarrollador 4: 4
		System.out.println("Numero total empleados: " + d1.numCurrentEmployee);
		System.out.println("Numero total empleados: " + d4.numCurrentEmployee);

		// Se obtienen los id de los empleados, al tener que ser el id: numero de empleados + 1, no tenemos nunca el id 1
		System.out.println("ID empleado 1: " + d1.getIdEmployee());
		System.out.println("ID empleado 2: " + d2.getIdEmployee());
		System.out.println("ID empleado 3: " + d3.getIdEmployee());
		System.out.println("ID empleado 4: " + d4.getIdEmployee());

		// Se restan 2 días de las vacaciones del empleado 2
		d2.goOnVacations(2);

		// Se consultan los días de vacaciones de los que dispone cada empleado
		System.out.println("Numero de dias de vacaciones del empleado con ID " + d1.getIdEmployee() + ": " + d1.getVacationDays());
		System.out.println("Numero de dias de vacaciones del empleado con ID " + d2.getIdEmployee() + ": " + d2.getVacationDays());
		System.out.println("Numero de dias de vacaciones del empleado con ID " + d3.getIdEmployee() + ": " + d3.getVacationDays());
		System.out.println("Numero de dias de vacaciones del empleado con ID " + d4.getIdEmployee() + ": " + d4.getVacationDays());
	}
}
