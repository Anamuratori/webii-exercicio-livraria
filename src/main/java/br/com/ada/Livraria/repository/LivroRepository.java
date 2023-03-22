package br.com.ada.Livraria.repository;

import br.com.ada.Livraria.model.entity.LivroEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LivroRepository extends JpaRepository<LivroEntity, Integer> {

}
