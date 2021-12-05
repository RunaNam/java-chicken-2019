package controller;

import java.util.List;

import domain.Table;
import domain.TableRepository;
import view.OutputView;

public class ChickenShopController {
	final List<Table> tables = TableRepository.tables();

	public void run() {
		printMainScreen();
	}

	private void printMainScreen() {
		OutputView.printMainScreen();
	}

}
