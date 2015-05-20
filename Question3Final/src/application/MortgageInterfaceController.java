package application;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.text.Text;

public class MortgageInterfaceController {
	
	// FXML Fields 
	@FXML
	private TextField totalGrossIncome;
	@FXML
	private TextField totalMonthlyDebt;
	@FXML
	private TextField mortgageInterestRate;	
	
	protected ObservableList<String> termOptions = FXCollections.observableArrayList("10", "15", "30");
	@FXML
	protected ComboBox<ObservableList<String>> termBox = new ComboBox(termOptions);
		
	@FXML
	private TextField downPayment = new TextField("0");
	
	@FXML
	protected Label housingPayment;
	
	@FXML
	protected Label otherObligations;
	
	@FXML
	protected Label maximumPayment;
	
	@FXML
	protected Label financedMortgage;
	
	// Getters for TextFields -> Double
	protected Double grossIncomeAmount = Double.valueOf(totalGrossIncome.getText());
	
	protected Double monthlyDebtAmount = Double.valueOf(totalMonthlyDebt.getText());

	protected Double interestAmount = Double.valueOf(mortgageInterestRate.getText());

	protected Double downPaymentAmount = Double.valueOf(downPayment.getText());

	protected Double yearTerm = Double.valueOf(termBox.getPromptText());
	
	// Setters for Label Results -> String	
	public void setHousingPayment(double amount) {
	housingPayment.setText(String.valueOf(amount));
	}
	
	public void setOtherObligations(double amount) {
	otherObligations.setText(String.valueOf(amount));
	}
	
	public void setPaymentAllowed(double amount) {
	maximumPayment.setText(String.valueOf(amount));
	}
	
	public void setFinancedMortgage(double amount) {
	financedMortgage.setText(String.valueOf(amount));
	}
	
	//Calculations
	
	
	

}
