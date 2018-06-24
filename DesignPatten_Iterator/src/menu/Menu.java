package menu;

import iterator.Iterator;

public class Menu implements Iterator {

	DetailMenu[] details;
	int position = 0;

	public Menu(DetailMenu[] details) {
		this.details = details;
	}

	@Override
	public boolean hasNext() {
		boolean revenu = false;
		if (position >= details.length || details[position] == null) {
			revenu = false;
		}
		return revenu;
	}

	@Override
	public Object next() {
		DetailMenu detailMenu = details[position];
		position++;
		return detailMenu;
	}

}
