package br.com.ada.Livraria.model.mapper;

import br.com.ada.Livraria.model.dto.LivroDTO;
import br.com.ada.Livraria.model.entity.LivroEntity;

public class LivroMapper {

    public LivroDTO livroDTO (LivroEntity livro) {
        LivroDTO livroDTO = new LivroDTO();
        livroDTO.setTitulo(livro.getTitulo());
        livroDTO.setGenero(livro.getGenero());

    }

}
