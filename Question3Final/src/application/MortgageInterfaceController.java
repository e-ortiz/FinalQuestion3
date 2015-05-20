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
	
	protected ObservableList<String> termOptions = FXCollections.observableArrayList(
			"10", "15", "30");
	@FXML
	final ComboBox termBox = new ComboBox(termOptions);
		
	@FXML
	private TextField downPayment;
	
	@FXML
	protected Label housingPayment;
	
	@FXML
	protected Label otherObligations;
	
	@FXML
	protected Label maximumPayment;
	
	@FXML
	protected Label financedMortgage;
	
	// Inputed Numbers
	
	
	// Calculated Setters	
	public void setHousingPayment() {
	housingPayment.setText("hi");
	}

}
