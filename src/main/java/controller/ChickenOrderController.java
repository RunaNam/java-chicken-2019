package controller;

import java.util.List;

import camp.nextstep.edu.missionutils.Console;
import domain.Menu;
import domain.Table;
import validator.MenuValidator;
import validator.TableNumberValidator;
import view.InputView;
import view.OutputView;

public class ChickenOrderController {
	final List<Table> tables;
	final List<Menu> menus;
	private Integer tableNumber;
	private Integer menuNumber;

	public ChickenOrderController(List<Table> tables, List<Menu> menus) {
		this.tables = tables;
		this.menus = menus;
	}

	public void registerOrder() {
		OutputView.printTables(tables);
		selectTableNumber();
		OutputView.printMenus(menus);
		selectMenu();
		adjustValues();
		Integer menuAmount = selectMenuAmount();
		addMenuAmount(menuAmount);
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

	private void selectMenu() {
		InputView.inputMenu();
		String tmpMenuNumber = Console.readLine();
		try {
			MenuValidator.MenuNumberCheck(tmpMenuNumber, menus);
			menuNumber = Integer.parseInt(tmpMenuNumber);
		} catch (IllegalArgumentException e) {
			OutputView.printError(e.getMessage());
			selectMenu();
		}
	}

	private void adjustValues() {
		if (tableNumber > 5) {
			tableNumber -= 1;
		}
		if (tableNumber >= 7) {
			tableNumber -= 1;
		}
		if (menuNumber >= 21) {
			menuNumber -= 14;
		}
	}

	private Integer selectMenuAmount() {
		Integer menuAmount = 0;
		while (true) {
			menuAmount = InputView.inputMenuAmount();
			try {
				MenuValidator.MenuAmountCheck(menuAmount, tables.get(tableNumber - 1), menus.get(menuNumber - 1));
				break;
			} catch (IllegalArgumentException e) {
				OutputView.printError(e.getMessage());
			}
		}
		return menuAmount;
	}

	private void addMenuAmount(Integer menuAmount) {
		tables.get(tableNumber - 1).addOrderedMenu(menus.get(menuNumber - 1), menuAmount);
	}
}
