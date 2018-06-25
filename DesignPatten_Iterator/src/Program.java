import menu.DetailMenu;

public class Program {

	public static void main(String[] args) {
		DetailMenu[] detailMenu = new DetailMenu[8];

		detailMenu[0] = new DetailMenu("Menu Un");
		detailMenu[1] = new DetailMenu("Menu Deux");
		detailMenu[2] = new DetailMenu("Menu Trois");
		detailMenu[3] = new DetailMenu("Menu Quatre");
		detailMenu[4] = new DetailMenu("Menu Cinq");
		detailMenu[5] = new DetailMenu("Menu Six");
		detailMenu[6] = new DetailMenu("Menu Sept");
		detailMenu[7] = new DetailMenu("Menu Huit");

		for (int i = 0; i < detailMenu.length; i++) {
			System.out.println(detailMenu[i].getDescription());
		}
	}

}
