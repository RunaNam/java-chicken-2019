package validator;

import static constants.ChickenShopConstants.*;

import java.util.List;

import domain.Table;

public class TableNumberValidator {
	public static void TableNumberCheck(String tableNumber, List<Table> tables) {
		isDigit(tableNumber);
		isRightNumber(tableNumber, tables);
	}

	private static void isDigit(String featureNumber) {
		for (int idx = 0; idx < featureNumber.length(); idx++) {
			if (!Character.isDigit(featureNumber.charAt(idx))) {
				throw new IllegalArgumentException(ERROR_TABLE_NUM_NOT_NUMBER);
			}
		}
	}

	private static void isRightNumber(String featureNumber, List<Table> tables) {
		int tmpFeatureNumber = Integer.parseInt(featureNumber);
		for (Table table : tables) {
			if (table.hasCheckNumber(tmpFeatureNumber)) {
				return;
			}
		}
		throw new IllegalArgumentException(ERROR_TABLE_NUM_WRONG_RANGE);
	}
}
