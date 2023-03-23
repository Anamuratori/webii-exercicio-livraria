package br.com.ada.Livraria.model.dto;

import jakarta.persistence.Column;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class LivroDTO {
    private Integer id;
    @Size(max = 100, message = "Tamanho acima do permitido. Máximo de 100 caracteres.")
    @NotBlank(message = "O titulo não pode ser nulo ou vazio.")
    private String titulo;
    @Size(max = 60, message = "Tamanho acima do permitido. Máximo de 60 caracteres.")
    @NotBlank(message = "O gênero não pode ser nulo ou vazio.")
    private String genero;

}
