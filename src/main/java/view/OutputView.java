package view;

import static constants.ChickenShopConstants.*;

import domain.Menu;
import domain.Table;

import java.sql.SQLOutput;
import java.util.List;

public class OutputView {
	private static final String TOP_LINE = "┌ ─ ┐";
	private static final String TABLE_FORMAT = "| %s |";
	private static final String BOTTOM_LINE = "└ ─ ┘";

	public static void printMainScreen() {
		System.out.println(MAIN_SCREEN_HEADING);
		System.out.println(MAIN_SCREEN_REGISTER_ORDER);
		System.out.println(MAIN_SCREEN_PAYMENT);
		System.out.println(MAIN_SCREEN_EXIT);
		System.out.println();
	}

	public static void printTables(final List<Table> tables) {
		System.out.println(TABLE_LIST_HEADING);
		final int size = tables.size();
		printLine(TOP_LINE, size);
		printTableNumbers(tables);
		printLine(BOTTOM_LINE, size);
		System.out.println();
	}

	public static void printMenus(final List<Menu> menus) {
		for (final Menu menu : menus) {
			System.out.println(menu);
		}
		System.out.println();
	}

	private static void printLine(final String line, final int count) {
		for (int index = 0; index < count; index++) {
			System.out.print(line);
		}
		System.out.println();
	}

	private static void printTableNumbers(final List<Table> tables) {
		for (final Table table : tables) {
			System.out.printf(TABLE_FORMAT, table);
		}
		System.out.println();
	}

	public static void printError(String errorMessage) {
		System.out.println(ERROR_PREFIX + errorMessage);
	}

	public static void printOrderList(Table table) {
		System.out.println(ORDER_LIST_HEADING);
		System.out.println(ORDER_LIST_INFO);
		System.out.println(table.getOrderString());
	}
}
