package application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
public class MortgageOverviewController {
	@FXML
	private TextField totalGrossIncome;
	@FXML
	private TextField totalMonthlyDebt;
	@FXML
	private TextField mortgageInterestRate;
	@FXML
	private ComboBox<String> term;
	@FXML
	private TextField downPayment;
	@FXML
	private Button submit;
	@FXML
	private Label label;
	public MortgageOverviewController(){
	}
	@FXML
	
	private void buttonAction(ActionEvent event){
		System.out.println(MortgageCalc.calculateMortgage());
		System.out.println(term.getValue());
		//label.setText("Error");		
	}
	
	ObservableList<String> list = FXCollections.observableArrayList("10", "15","20");
	@FXML
	private void initialize() {	
		term.setItems(list);
		label.setText("Mortgage is:");
	}
	//public void getMortgageCalc(){
	//having trouble converting strings to ints or creating numeric Fields
	//new MortgageCalc(totalGrossIncome.getText(),totalMonthlyDebt.getText(),mortgageInterestRate.getText(),term.getValue(),downPayment.getText());
	//}
}
