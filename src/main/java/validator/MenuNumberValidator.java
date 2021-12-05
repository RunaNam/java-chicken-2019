package validator;

import static constants.ChickenShopConstants.*;

import java.util.List;

import domain.Menu;
import domain.Table;

public class MenuNumberValidator {
	public static void MenuNumberCheck(String menuNumber, List<Menu> menus) {
		isDigit(menuNumber);
		isRightNumber(menuNumber, menus);
	}

	private static void isDigit(String menuNumber) {
		for (int idx = 0; idx < menuNumber.length(); idx++) {
			if (!Character.isDigit(menuNumber.charAt(idx))) {
				throw new IllegalArgumentException(ERROR_MENU_NOT_NUMBER);
			}
		}
	}

	private static void isRightNumber(String menuNumber, List<Menu> menus) {
		int tmpMenuNumber = Integer.parseInt(menuNumber);
		for (Menu menu : menus) {
			if (menu.hasCheckNumber(tmpMenuNumber)) {
				return;
			}
		}
		throw new IllegalArgumentException(ERROR_MENU_WRONG_RANGE);
	}
}
