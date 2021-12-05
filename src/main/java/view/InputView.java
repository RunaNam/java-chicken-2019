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
}
