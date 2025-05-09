package br.edu.ifsp.prw3.api20251c.medico;

public record DadosListagemMedico(Long id, String nome, String email,
                                  String crm, Especialidade especialidade) {

    // Construtor que recebe um objeto Medico, pega só os dados necessários,
    // para criar este objeto DadosListagemMedico.

    // OBS: Você pode criar diversos construtores específicos,
    //      porém eles TEM QUE chamar o construtor padrão (this).

    public DadosListagemMedico(Medico medico) {

        this(medico.getId(), medico.getNome(), medico.getEmail(),
                medico.getCrm(), medico.getEspecialidade() );
    }

}
