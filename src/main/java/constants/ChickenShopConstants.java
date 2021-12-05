package constants;

public class ChickenShopConstants {
	public final static String SPACE = " ";

	public final static String INFO_PREFIX = "## ";
	public final static String MAIN_SCREEN_HEADING = "## 메인화면";
	public final static String MAIN_SCREEN_REGISTER_ORDER = "1 - 주문등록";
	public final static String MAIN_SCREEN_PAYMENT = "2 - 결제하기";
	public final static String MAIN_SCREEN_EXIT = "3 - 프로그램 종료";
	public final static String TABLE_LIST_HEADING = "## 테이블 목록";
	public final static String ORDER_LIST_HEADING = "## 주문 내역";
	public final static String ORDER_LIST_INFO = "메뉴 수량 금액";
	public final static String PAYMENT_MESSAGE = "번 테이블의 결제를 진행합니다.";
	public final static String FINAL_PAYMENT_PRICE = "## 최종 결제할 금액";
	public final static String KOREA_MONETARY_UNIT = "원";

	public final static String ERROR_PREFIX = "[ERROR] ";
	public final static String ERROR_FEATURE_NUM_WRONG_NUM = "기능은 1, 2, 3중에 선택해야 한다.";
	public final static String ERROR_FEATURE_NUM_NOT_NUMBER = "기능은 숫자여야 한다.";
	public final static String ERROR_TABLE_NUM_NOT_NUMBER = "테이블 번호는 숫자여야 한다.";
	public final static String ERROR_TABLE_NUM_WRONG_RANGE = "테이블 리스트 내의 번호를 선택해야 한다.";
	public final static String ERROR_MENU_NOT_NUMBER = "메뉴 번호는 숫자여야 한다.";
	public final static String ERROR_MENU_WRONG_RANGE = "메뉴 리스트 내의 번호를 선택해야 한다.";
	public final static String ERROR_MENU_AMOUNT_NOT_NUMBER = "메뉴의 수량은 숫자여야 한다.";
	public final static String ERROR_OVER_MAX_MENU_AMOUNT = "한 테이블에서 주문 가능한 한 메뉴의 수는 최대 99개이다.";
	public final static String ERROR_WRONG_PAYMENT_METHOD = "결제 방법은 1, 2중에 선택해야 한다.";

	public final static String INPUT_MESSAGE_FEATURE_NUM = "## 원하는 기능을 선택하세요.";
	public final static String INPUT_MESSAGE_MENU_NUM = "## 등록할 메뉴를 선택하세요.";
	public final static String INPUT_MESSAGE_TABLE_NUM = "## 테이블을 선택하세요.";
	public final static String INPUT_MESSAGE_MENU_AMOUNT = "## 메뉴의 수량을 입력하세요.";
	public final static String INPUT_PAYMENT_METHOD = "## 신용 카드는 1번, 현금은 2번";

	public final static Integer MAX_TABLE_MENU_AMOUNT = 99;
	public final static Integer CHICKEN_DISCOUNT_PRICE = 10000;
	public final static Integer CASH_DISCOUNT_NUMERATOR = 5;
	public final static Integer CASH_DISCOUNT_DENOMINATOR = 100;

}
