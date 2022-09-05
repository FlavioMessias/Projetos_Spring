package com.generation.farmacia.repository;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.generation.farmacia.model.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long>{
	
	public List <Produto> findByNomeContainingIgnoreCase(@Param("nome") String nome); // Buscar por nome.

	public List <Produto> findByNomeAndLaboratorio(String nome, String laboratorio); // Buscar por Laboratorio.
	
	public List <Produto> findByNomeOrLaboratorio(String nome, String laboratorio); // Buscar por nome ou laboratorio.

	public List<Produto> findByPrecoIn(List<BigDecimal> preco); // Buscar por preço.
	
	@Query(value = "select * from tb_produtos where preco between :inicio and :fim", nativeQuery = true) // o Query permite a pesquisa no Spring utilizando o codigo do SQL nativo 
	public List <Produto> buscarProdutosEntre(@Param("inicio") BigDecimal inicio, @Param("fim") BigDecimal fim); // Busca produtos com preço minimo e maximo.

}
