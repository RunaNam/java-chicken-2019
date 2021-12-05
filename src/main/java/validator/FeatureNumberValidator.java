package validator;

import static constants.ChickenShopConstants.*;

public class FeatureNumberValidator {
	public static void FeatureNumberCheck(String featureNumber) {
		isDigit(featureNumber);
		isRightNumber(featureNumber);
	}

	private static void isDigit(String featureNumber) {
		for (int idx = 0; idx < featureNumber.length(); idx++) {
			if (!Character.isDigit(featureNumber.charAt(idx))) {
				throw new IllegalArgumentException(ERROR_FEATURE_NUM_NOT_NUMBER);
			}
		}
	}

	private static void isRightNumber(String featureNumber) {
		int tmpFeatureNumber = Integer.parseInt(featureNumber);
		if (tmpFeatureNumber != 1 && tmpFeatureNumber != 2 && tmpFeatureNumber != 3) {
			throw new IllegalArgumentException(ERROR_FEATURE_NUM_WRONG_NUM);
		}
	}

}
