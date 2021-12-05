package controller;

import java.util.List;

import camp.nextstep.edu.missionutils.Console;

import domain.Table;
import domain.TableRepository;
import validator.FeatureNumberValidator;
import view.InputView;
import view.OutputView;

public class ChickenShopController {
	final List<Table> tables = TableRepository.tables();
	Integer featureNumber;

	public void run() {
		do {
			printMainScreen();
			getFeatureNumber();
			executeFeature();
		} while (featureNumber != 3);
	}

	private void printMainScreen() {
		OutputView.printMainScreen();
	}

	private void getFeatureNumber() {
		InputView.inputFeatureNumber();
		String tmpFeatureNumber = Console.readLine();
		try {
			FeatureNumberValidator.FeatureNumberCheck(tmpFeatureNumber);
			featureNumber = Integer.parseInt(tmpFeatureNumber);
		} catch (IllegalArgumentException e) {
			OutputView.printError(e.getMessage());
			getFeatureNumber();
		}
	}

	private void executeFeature() {
		if (featureNumber == 1) {
			registerOrder();
		}
		if (featureNumber == 2) {
			payPrice();
		}
	}

	private void registerOrder() {
	}

	private void payPrice() {
	}
}
