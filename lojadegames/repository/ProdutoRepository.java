package br.com.lojadegames.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.lojadegames.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {

	public List<Produto> findByNomeContainingIgnoreCase(String nome);
	public List<Produto>findByDescricaoContainingIgnoreCase(String descricao);
}
