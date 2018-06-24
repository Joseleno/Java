import menu.DetailMenu;

public class Program {

	public static void main(String[] args) {
		DetailMenu[] detailMenu = new DetailMenu[4];

		detailMenu[0] = new DetailMenu("Menu 1");
		detailMenu[1] = new DetailMenu("Menu 2");
		detailMenu[2] = new DetailMenu("Menu 3");
		detailMenu[3] = new DetailMenu("Menu 4");

		for (int i = 0; i < detailMenu.length; i++) {
			System.out.println(detailMenu[i].getDescription());
		}
	}

}
