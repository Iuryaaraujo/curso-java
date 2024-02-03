package br.com.iuryaraujo.exerciciosspringboot.model.repositories;

import br.com.iuryaraujo.exerciciosspringboot.model.entities.Produto;
import org.springframework.data.repository.CrudRepository;

public interface ProdutoRepository extends CrudRepository<Produto, Integer> {

}
