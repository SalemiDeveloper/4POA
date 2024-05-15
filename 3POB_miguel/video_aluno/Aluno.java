package exemplo;

public class Aluno {

	public String nome;
	public String mat; //matrícula
	
	public Aluno (String nome, String mat){
		this.nome = nome;
		this.mat = mat;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMat() {
		return mat;
	}

	public void setMat(String mat) {
		this.mat = mat;
	}

	@Override
	public String toString() {
		return "Aluno [nome=" + nome + ", mat=" + mat + "]";
	}
}
