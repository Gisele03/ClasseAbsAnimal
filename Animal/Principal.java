package Animal;

public class Principal {

	public static void main(String[] args) {
		
		Lobo lobo = new Lobo("Lobo", "F", "Silvestre");
		lobo.dormir();
		lobo.caminhar();
		lobo.correr();
		lobo.emitirSom();
		
		System.out.println("------------------------");
		
		Leao leao = new Leao("Leao", "M", "Leao");
		leao.dormir();
		leao.caminhar();
		leao.correr();
		leao.emitirSom();
		
		System.out.println("------------------------");
		
		Tigre tigre = new Tigre("Tigre", "M", "Bengala");
		tigre.dormir();
		tigre.caminhar();
		tigre.correr();
		tigre.emitirSom();
		
		System.out.println("------------------------");
		
		Cachorro cachorro = new Cachorro("Cachorro", "M", "Vira-lata");
		cachorro.dormir();
		cachorro.caminhar();
		cachorro.correr();
		cachorro.emitirSom();
		
		System.out.println("------------------------");
		
		Gato gato = new Gato("Gato", "F", "Siames");
		gato.dormir();
		gato.caminhar();
		gato.correr();
		gato.emitirSom();
		

	}

}
