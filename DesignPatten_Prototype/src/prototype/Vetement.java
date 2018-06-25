package prototype;

public abstract class Vetement implements Cloneable {

	public String model;
	protected String taille = "M-16";
	
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getTaille() {
		return taille;
	}
	public void setTaille(String taille) {
		this.taille = taille;
	}
	
	public abstract void nouveauTypeVetment();
	
	@Override
	protected Object clone(){
		Object clone = null;
		try {
			clone = super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		return clone;
	}
	
}
