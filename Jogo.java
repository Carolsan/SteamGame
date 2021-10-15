package exercicio5;

import java.util.List;
import java.util.Objects;

public class Jogo {
	
	 private String nome;
	 private double preco;
	 private List<CategoriaDeJogo> categorias;

	 public Jogo() {
		 
	 }
	 
	 public Jogo(String nome) {}

	  public Jogo(String nome, double preco, List<CategoriaDeJogo> categorias) {
	    	this.nome = nome;
	        this.preco = preco;
	        this.categorias = categorias;
	    }

	   public boolean adicionaCategoria(CategoriaDeJogo categoria) {
		   if (!this.categorias.contains(categoria)) {
	            this.categorias.add(categoria);
	            return true;
	        } else {
	            return false;
	        }
		   
	 public void setCategorias(List<CategoriaDeJogo> categorias) {
		 
	 }
	 

	public List<CategoriaDeJogo> getCategorias() {
		return categorias;
	}
	
	public boolean ehDaCategoria(CategoriaDeJogo categorias) {
	}
	
	public boolean adicionarCategoria(CategoriaDeJogo categoria) {
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	@Override
	public int hashCode() {
		return Objects.hash(categorias, nome, preco);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Jogo other = (Jogo) obj;
		return Objects.equals(categorias, other.categorias) && Objects.equals(nome, other.nome)
				&& Double.doubleToLongBits(preco) == Double.doubleToLongBits(other.preco);
	}

	@Override
	public String toString() {
		return "Jogo [nome=" + nome + ", preco=" + preco + ", categorias=" + categorias + "]";
	}
	
	
	 
}
