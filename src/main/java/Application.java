import controller.ChickenShopController;
import domain.Menu;
import domain.MenuRepository;
import domain.Table;
import domain.TableRepository;
import view.InputView;
import view.OutputView;

import java.util.List;

public class Application {
	// TODO 구현 진행
	public static void main(String[] args) {
		ChickenShopController chickenShopController = new ChickenShopController();
		chickenShopController.run();
	}
}
