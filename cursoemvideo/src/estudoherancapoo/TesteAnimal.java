package estudoherancapoo;

public class TesteAnimal {

	public static void main(String[] args) {
		
		AnimalInseto i1 = new AnimalInseto();
		
		i1.setNomeAnimal("Gafanhoto");
		i1.setGeneroAnimal("Femea");
		i1.setIdadeAnimal(2);
		i1.setSomAnimal("hihihihi");
		System.out.println(i1.toString());
		i1.fazerMovimento();
		
		AnimalTerreste t1 = new AnimalTerreste();
		
		t1.setNomeAnimal("Cachorro Caramelo");
		t1.setGeneroAnimal("Macho");
		t1.setIdadeAnimal(6);
		t1.setSomAnimal("Au Au Au");
		System.out.println(i1.toString());
		t1.fazerMovimento();
		
		AnimalAquatico aq1 = new AnimalAquatico();
		
		aq1.setNomeAnimal("Cachorro Caramelo");
		aq1.setGeneroAnimal("Macho");
		aq1.setIdadeAnimal(6);
		aq1.setSomAnimal("Au Au Au");
		System.out.println(i1.toString());
		aq1.fazerMovimento();

	}

}
