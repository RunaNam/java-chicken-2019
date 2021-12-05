package validator;

import static constants.ChickenShopConstants.*;

public class PaymentMethodValidator {

	public static void isRightNumber(Integer featureNumber) {
		if (featureNumber != 1 && featureNumber != 2) {
			throw new IllegalArgumentException(ERROR_FEATURE_NUM_WRONG_NUM);
		}
	}

}
