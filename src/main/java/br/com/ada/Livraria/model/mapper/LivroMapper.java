package br.com.ada.Livraria.model.mapper;

import br.com.ada.Livraria.model.dto.LivroDTO;
import br.com.ada.Livraria.model.entity.LivroEntity;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class LivroMapper {

    public LivroDTO update (LivroEntity livro) {
        LivroDTO livroDTO = new LivroDTO();
        livroDTO.setId(livro.getId());
        livroDTO.setTitulo(livro.getTitulo());
        livroDTO.setGenero(livro.getGenero());
        return livroDTO;
    }
    public LivroEntity update (LivroDTO livro) {
        LivroEntity livroEntity = new LivroEntity();
        livroEntity.setTitulo(livro.getTitulo());
        livroEntity.setGenero(livro.getGenero());
        return livroEntity;
    }
    public List<LivroDTO> updateListaLivroDTO (List<LivroEntity> listaLivroEntity) {
        return listaLivroEntity.stream().map(categoriaEntity -> this.update(categoriaEntity)).toList();
    }
    public List<LivroEntity> updateListaLivroEntity (List<LivroDTO> listaLivroDTO) {
        return listaLivroDTO.stream().map(categoriaDTO -> this.update(categoriaDTO)).toList();
    }

}
