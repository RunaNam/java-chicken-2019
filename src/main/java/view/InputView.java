package view;

import static constants.ChickenShopConstants.*;

import camp.nextstep.edu.missionutils.Console;

public class InputView {

	public static void inputFeatureNumber() {
		System.out.println(INPUT_MESSAGE_FEATURE_NUM);
	}

	public static void inputTableNumber() {
		System.out.println(INPUT_MESSAGE_TABLE_NUM);
	}

	public static void inputMenu() {
		System.out.println(INPUT_MESSAGE_MENU_NUM);
	}

	public static Integer inputMenuAmount() {
		int menuAmount = 0;
		String tmpMenuAmount;
		while (true) {
			System.out.println(INPUT_MESSAGE_MENU_AMOUNT);
			tmpMenuAmount = Console.readLine();
			try {
				menuAmount = Integer.parseInt(tmpMenuAmount);
				return menuAmount;
			} catch (NumberFormatException e) {
				OutputView.printError(ERROR_MENU_AMOUNT_NOT_NUMBER);
			}
		}
	}

	public static Integer inputPaymentMethod(int tableNumber) {
		System.out.println(INFO_PREFIX + tableNumber + PAYMENT_MESSAGE);
		System.out.println(INPUT_PAYMENT_METHOD);
		int paymentMethod = 0;
		while (true) {
			System.out.println(INPUT_MESSAGE_MENU_AMOUNT);
			String tmpMenuAmount = Console.readLine();
			try {
				paymentMethod = Integer.parseInt(tmpMenuAmount);
				return paymentMethod;
			} catch (NumberFormatException e) {
				OutputView.printError(ERROR_MENU_AMOUNT_NOT_NUMBER);
			}
		}

	}
}
