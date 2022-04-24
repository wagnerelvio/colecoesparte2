package domain;

public class Pessoa implements Comparable<Pessoa> {

	public String nome;
	public int sexo; // 1-M ~ 0-F

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getSexo() {
		return sexo;
	}

	public void setSexo(int sexo) {
		this.sexo = sexo;
	}

	@Override
	public String toString() {
//			return "Pessoa [nome=" + nome + ", sexo=" + sexo + "]";
		return "(nome=" + nome + ", sexo=" + sexo + ")";
	}

	/*
	 * @Override public int compareTo(Pessoa o) { // TODO Auto-generated method stub
	 * return 0; }
	 */

	@Override
	public int compareTo(Pessoa pessoa) {
		// TODO Auto-generated method stub
		// return this.nome.compareTo(pessoa.getNome());
		return this.nome.compareTo(pessoa.getNome());
	}

}
