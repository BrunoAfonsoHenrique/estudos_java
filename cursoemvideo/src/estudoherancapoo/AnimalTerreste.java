package estudoherancapoo;

public class AnimalTerreste extends Animal{
	
	private String andar;
	private float saltar;
	
	public String getAndar() {
		return andar;
	}
	public void setAndar(String andar) {
		this.andar = andar;
	}
	public float getSaltar() {
		return saltar;
	}
	public void setSaltar(float saltar) {
		this.saltar = saltar;
	}
	
	@Override
	public void fazerMovimento() {
		System.out.println(this.getNomeAnimal() + " é um animal terreste: pode andar, saltar e etc...");
	}
}
