package controller;

import java.util.List;

import camp.nextstep.edu.missionutils.Console;

import domain.Menu;
import domain.MenuRepository;
import domain.Table;
import domain.TableRepository;
import validator.FeatureNumberValidator;
import validator.MenuValidator;
import validator.TableNumberValidator;
import view.InputView;
import view.OutputView;

public class ChickenShopController {
	final List<Table> tables = TableRepository.tables();
	final List<Menu> menus = MenuRepository.menus();
	private Integer featureNumber;

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
			ChickenOrderController chickenOrderController = new ChickenOrderController(tables, menus);
			chickenOrderController.registerOrder();
		}
		if (featureNumber == 2) {
			ChickenPayController chickenPayController = new ChickenPayController(tables);
			chickenPayController.paymentProgress();
		}
	}
}
