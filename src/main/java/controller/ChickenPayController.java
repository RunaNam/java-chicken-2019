package controller;

import static constants.ChickenShopConstants.*;

import java.util.List;

import camp.nextstep.edu.missionutils.Console;
import domain.Table;
import validator.PaymentMethodValidator;
import validator.TableNumberValidator;
import view.InputView;
import view.OutputView;

public class ChickenPayController {
	final List<Table> tables;
	private Integer tableNumber;
	private Integer price;
	private Integer paymentMethod;

	public ChickenPayController(List<Table> tables) {
		this.tables = tables;
	}

	public void paymentProgress() {
		OutputView.printTables(tables);
		selectTableNumber();
		adjustValue();
		OutputView.printOrderList(tables.get(tableNumber - 1));
		selectPaymentMethod();
		System.out.println(paymentMethod);
		countPrice();
		OutputView.printPrice(price);
	}

	private void selectPaymentMethod() {
		paymentMethod = InputView.inputPaymentMethod(tableNumber);
		try {
			PaymentMethodValidator.isRightNumber(paymentMethod);
		} catch (IllegalArgumentException e) {
			OutputView.printError(e.getMessage());
			selectPaymentMethod();
		}
	}

	private void countPrice() {
		price = tables.get(tableNumber - 1).getPrice();
		if (paymentMethod == 2) {
			price -= price * CASH_DISCOUNT_NUMERATOR / CASH_DISCOUNT_DENOMINATOR;
		}
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
