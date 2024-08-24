package br.com.alura.loja.modelo;

import java.math.BigDecimal;
import java.time.LocalDate;
<<<<<<< HEAD
=======
import org.hibernate.annotations.NamedQuery;
>>>>>>> 759d5d522b91f9fd880b6ec2e4bbbadf2bbc053b

import javax.persistence.*;

@Entity
@Table(name = "produtos")
@NamedQuery(name = "Produto.produtosPorCategoria", query = "SELECT p FROM Produto p WHERE p.categoria.nome = :nome")
public class Produto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	private String descricao;
	private BigDecimal preco;
	private LocalDate dataCadastro = LocalDate.now();

<<<<<<< HEAD
	@ManyToOne
	private Categoria categoria;

	public Produto(){}

=======
	@ManyToOne(fetch = FetchType.LAZY)
	private Categoria categoria;
	
	public Produto() {
	}
	
>>>>>>> 759d5d522b91f9fd880b6ec2e4bbbadf2bbc053b
	public Produto(String nome, String descricao, BigDecimal preco, Categoria categoria) {
		this.nome = nome;
		this.descricao = descricao;
		this.preco = preco;
		this.categoria = categoria;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public BigDecimal getPreco() {
		return preco;
	}

	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}

<<<<<<< HEAD
=======
	public LocalDate getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(LocalDate dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

>>>>>>> 759d5d522b91f9fd880b6ec2e4bbbadf2bbc053b
	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

<<<<<<< HEAD
	public LocalDate getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(LocalDate dataCadastro) {
		this.dataCadastro = dataCadastro;
	}
=======
>>>>>>> 759d5d522b91f9fd880b6ec2e4bbbadf2bbc053b
}
