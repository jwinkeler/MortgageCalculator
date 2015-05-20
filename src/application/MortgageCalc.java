package application;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;

import org.apache.poi.ss.formula.functions.FinanceLib;

public class MortgageCalc {
	private static IntegerProperty totalGrossIncome;
	private static IntegerProperty totalMonthlyDebt;
	private static IntegerProperty mortgageInterestRate;
	private static IntegerProperty term;
	private static int downPayment=0;
	

	public MortgageCalc(int totalGrossIncome, int totalMonthlyDebt, int mortgageInterestRate, int term, int downPayment){
		this.totalGrossIncome = new SimpleIntegerProperty(totalGrossIncome);
		this.totalMonthlyDebt = new SimpleIntegerProperty(totalMonthlyDebt);
		this.mortgageInterestRate = new SimpleIntegerProperty(mortgageInterestRate);
		this.term = new SimpleIntegerProperty(term);
		
	}

	public static IntegerProperty getTotalGrossIncome() {
		return totalGrossIncome;
	}

	public static IntegerProperty getTotalMonthlyDebt() {
		return totalMonthlyDebt;
	}

	public static IntegerProperty getMortgageInterestRate() {
		return mortgageInterestRate;
	}

	public static IntegerProperty getTerm() {
		return term;
	}

	public static int getDownPayment() {
		return downPayment;
	}
	public void setTotalGrossIncome(int totalGrossIncome){
		this.totalGrossIncome.set(totalGrossIncome);
	}
	public void setTotalMonthlyDebt(int totalMonthlyDebt) {
		this.totalMonthlyDebt.set(totalMonthlyDebt);
	}

	public void setMortgageInterestRate(int mortgageInterestRate) {
		this.mortgageInterestRate.set(mortgageInterestRate);
	}

	public void setTerm(int term) {
		this.term.set(12*term);
	}

	public void setDownPayment(int downPayment) {
		this.downPayment = downPayment;
	}


	public static String calculateMortgage() {
		return("Error");
		// I can't get the following code to work, but I wanted to show you that I could figure out how to load all of the information
		//into the app
		//return FinanceLib.pv(mortgageInterestRate, term, totalGrossIncome, downPayment, false);

	}
}
