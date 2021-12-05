package domain;

import static constants.ChickenShopConstants.*;

import java.util.HashMap;
import java.util.Map;

public class Table {
	private final int number;
	private Map<Menu, Integer> orderedMenu = new HashMap<>();

	public Table(final int number) {
		this.number = number;
	}

	@Override
	public String toString() {
		return Integer.toString(number);
	}

	public boolean hasCheckNumber(int checkNumber) {
		return checkNumber == number;
	}

	public void addOrderedMenu(Menu menu, int amount) {
		if (!orderedMenu.containsKey(menu)) {
			orderedMenu.put(menu, 0);
		}
		orderedMenu.put(menu, orderedMenu.get(menu) + amount);
	}

	public boolean checkAvailability(Menu menu, int plusAmount) {
		if (!orderedMenu.containsKey(menu)) {
			return plusAmount <= MAX_TABLE_MENU_AMOUNT;
		}
		return orderedMenu.get(menu) + plusAmount <= MAX_TABLE_MENU_AMOUNT;
	}
}
