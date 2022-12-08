package b2_prova_pratica_01;

public class Prefeito extends Pessoa{
	private String Email;
	private String ViceEmail;
	private String ViceNome;
	private int ViceDia;
	private int ViceMes;
	private int ViceAno;
	private int Codigo;
	private int votos = 0;
	
	public Prefeito(String nome, int dia, int mes, int ano) {
		super(nome, dia, mes, ano);
	}
	
	public String getEmail() {
		return Email;
	}
	
	public void setEmail(String email) {
		Email = email;
	}
	
	public String getViceEmail() {
		return ViceEmail;
	}
	
	public void setViceEmail(String viceEmail) {
		ViceEmail = viceEmail;
	}
	
	public String getViceNome() {
		return ViceNome;
	}
	
	public void setViceNome(String viceNome) {
		ViceNome = viceNome;
	}
	
	public int getViceDia() {
		return ViceDia;
	}
	
	public void setViceDia(int viceDia) {
		ViceDia = viceDia;
	}
	
	public int getViceMes() {
		return ViceMes;
	}
	
	public void setViceMes(int viceMes) {
		ViceMes = viceMes;
	}
	
	public int getViceAno() {
		return ViceAno;
	}
	
	public void setViceAno(int viceAno) {
		ViceAno = viceAno;
	}
	
	public int getCodigo() {
		return Codigo;
	}
	
	public void setCodigo(int codigo) {
		Codigo = codigo;
	}

	public int getVotos() {
		return votos;
	}

	public void setVotos(int votos) {
		this.votos = votos;
	}
	
}
