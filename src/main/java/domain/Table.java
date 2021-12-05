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

	public StringBuilder getOrderString() {
		StringBuilder orderString = new StringBuilder();
		for (Menu menu : orderedMenu.keySet()) {
			orderString.append(menu.getName()).append(SPACE);
			orderString.append(orderedMenu.get(menu)).append(SPACE);
			orderString.append(menu.getPrice() * orderedMenu.get(menu));
			orderString.append('\n');
		}
		return orderString;
	}

	public Integer getPrice() {
		int price = 0;
		int chickenCount = 0;
		for (Menu menu : orderedMenu.keySet()) {
			price += menu.getPrice() * orderedMenu.get(menu);
			if (menu.isChicken()) {
				chickenCount += orderedMenu.get(menu);
			}
		}
		return price - (chickenCount / 10) * CHICKEN_DISCOUNT_PRICE;
	}

}
