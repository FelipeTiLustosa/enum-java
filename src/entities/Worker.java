package entities;
import java.util.ArrayList;
import java.util.List;

import entities.enums.WorkerLevel;

public class Worker {// Trabalhador 
	
private String name;
private Double baseSalary;
private WorkerLevel workerLevel;

private Dapartment dapartment;
private  List<HourContract> contract= new ArrayList<>();

public Worker() {
}

public Worker(String name, Double baseSalary, WorkerLevel workerLevel, Dapartment dapartment) {
	this.name = name;
	this.baseSalary = baseSalary;
	this.workerLevel = workerLevel;
	this.dapartment = dapartment;
}

public void addContract(HourContract contract) {
	this.contract.add(contract);
}

public void removeCpmtract(HourContract contract) {
	this.contract.remove(contract);
}

public Double income(int month, int year) {
	double sum =baseSalary;
	for (HourContract hourContract : contract) {
		int monthContract= hourContract.getDate().getMonthValue();
		int yearContract=hourContract.getDate().getYear();
		if (month== monthContract && year==yearContract) {
			sum+=hourContract.totalValue();
		}
	}
	return sum;
	
}


public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public Double getBaseSalary() {
	return baseSalary;
}

public void setBaseSalary(Double baseSalary) {
	this.baseSalary = baseSalary;
}

public WorkerLevel getWorkerLevel() {
	return workerLevel;
}

public void setWorkerLevel(WorkerLevel workerLevel) {
	this.workerLevel = workerLevel;
}

public Dapartment getDapartment() {
	return dapartment;
}

public void setDapartment(Dapartment dapartment) {
	this.dapartment = dapartment;
}

public List<HourContract> getContract() {
	return contract;
}






}
