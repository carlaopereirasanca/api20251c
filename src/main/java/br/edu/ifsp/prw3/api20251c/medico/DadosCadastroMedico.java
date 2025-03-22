package br.edu.ifsp.prw3.api20251c.medico;

import br.edu.ifsp.prw3.api20251c.endereco.DadosEndereco;

public record DadosCadastroMedico(String nome, String email, String crm,
                                  Especialidade especialidade,
                                  DadosEndereco endereco) {

}
