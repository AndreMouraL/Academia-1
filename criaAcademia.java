package academia;

public class CriaAcademia {
	
	public static void main(String[] args) {
		Contato marombaAcademyContato = new Contato("9893124234");
		RedeSocial marombaRedeSocial = new RedeSocial();
		Endereco marombaEndereco = new Endereco();
		Academia marombaAcademia = new Academia("MarombaAcademy","6500000",marombaAcademyContato,marombaEndereco); 
		marombaAcademia.setRedeSocial(marombaRedeSocial);
		marombaRedeSocial.setInstagram("MarombaAcademyInsta");
	}

}
