package controller;

import java.util.List;

import camp.nextstep.edu.missionutils.Console;
import domain.Table;
import validator.TableNumberValidator;
import view.InputView;
import view.OutputView;

public class ChickenPayController {
	final List<Table> tables;
	private Integer tableNumber;
	private Integer price;

	public ChickenPayController(List<Table> tables) {
		this.tables = tables;
	}

	public void paymentProgress() {
		OutputView.printTables(tables);
		selectTableNumber();
		adjustValue();
		OutputView.printOrderList(tables.get(tableNumber - 1));
		countPrice();
	}

	private void countPrice() {
		price = tables.get(tableNumber -1).getPrice();
	}

	private void selectTableNumber() {
		InputView.inputTableNumber();
		String tmpTableNumber = Console.readLine();
		try {
			TableNumberValidator.TableNumberCheck(tmpTableNumber, tables);
			tableNumber = Integer.parseInt(tmpTableNumber);
		} catch (IllegalArgumentException e) {
			OutputView.printError(e.getMessage());
			selectTableNumber();
		}
	}

	private void adjustValue() {
		if (tableNumber > 5) {
			tableNumber -= 1;
		}
		if (tableNumber >= 7) {
			tableNumber -= 1;
		}
	}
}
