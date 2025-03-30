package br.edu.ifsp.prw3.api20251c.medico;

import br.edu.ifsp.prw3.api20251c.endereco.DadosEndereco;
import jakarta.validation.constraints.NotNull;

public record DadosAtualizacaoMedico(

        @NotNull
        Long id,

        String nome,

        String telefone,

        DadosEndereco endereco) { }
