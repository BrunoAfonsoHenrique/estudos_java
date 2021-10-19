package estudoherancapoo;

public class AnimalAquatico extends Animal{
	
	private boolean nadar;

	public boolean getNadar() {
		return nadar;
	}

	public void setNadar(boolean nadar) {
		this.nadar = nadar;
	}
	
	@Override
	public void fazerMovimento() {
		System.out.println("Animal aquatico pode nadar, respirar na agua e etc...");
	}
	
}
