package applicantion;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import entities.Dapartment;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkerLevel;

public class Program {

	public static void main(String[] args) {
/*Ler os dados de um trabalhador com N contratos (N fornecido pelo usuário). Depois, solicitar 
do usuário um mês e mostrar qual foi o salário do funcionário nesse mês, conforme exemplo 
(próxima página).
*/
		Locale.setDefault(Locale.US);
		Scanner sc =new Scanner(System.in);
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		
		System.out.print("Enter department's name: ");
		String nameDapartment=sc.nextLine();
		System.out.println("Enter worker data:");
		System.out.print("Name: ");
		String name=sc.nextLine();
		System.out.print("Level: ");
		String lv=sc.nextLine();
		System.out.print("Base salary: ");
		double BsSalary=sc.nextDouble();
		
		Worker worker=new Worker(name,BsSalary, WorkerLevel.valueOf(lv),new Dapartment(nameDapartment));
		System.out.println();
		System.out.print("How many contracts to this worker? ");//Quantos contratos para este trabalhador?
		int n=sc.nextInt();
		for (int i = 0; i < n; i++) {
			System.out.printf("Enter contract #%d data:%n", i + 1);
			System.out.print("Date (DD/MM/YYYY): ");
			String date=sc.next();
			LocalDate dateContract= LocalDate.parse(date,fmt1);
			System.out.print("Value per hour: ");
			double value=sc.nextDouble();
			System.out.print("Duration (hours): ");
			int durantion=sc.nextInt();
			HourContract contract= new HourContract(dateContract,value,durantion);
			worker.addContract(contract);
		}
		System.out.println();
		System.out.print("Enter month and year to calculate income (MM/YYYY): ");//Insira o mês e o ano para calcular a renda (MM/AAAA):
		String dateIncome=sc.next();
		int month=Integer.parseInt(dateIncome.substring(0, 2));
		int year=Integer.parseInt(dateIncome.substring(3));
		System.out.println("Name: "+worker.getName());
		System.out.println("Department: "+worker.getDapartment().getName());
		System.out.println("Income for "+dateIncome+" : " + String.format("%.2f",worker.income(month, year)));
		sc.close();
	}

}
