package br.edu.ifsp.prw3.api20251c.controller;

import br.edu.ifsp.prw3.api20251c.usuario.Usuario;
import br.edu.ifsp.prw3.api20251c.usuario.dadosAutenticacao;
import br.edu.ifsp.prw3.api20251c.util.security.DadosTokenJWT;
import br.edu.ifsp.prw3.api20251c.util.security.PW3TokenService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/login")
public class AutenticacaoController {

    @Autowired
    private AuthenticationManager manager;  // Objeto AuthenticationManager,
                                            // que será injetado aqui.
                                            // LEMBRAR COMENTÁRIOS UMA AULA PASSADA!!!

    @Autowired
    private PW3TokenService tokenService;

    @PostMapping
    public ResponseEntity efetuarLogin(@RequestBody @Valid dadosAutenticacao dados) {

        var token = new UsernamePasswordAuthenticationToken( dados.login(),
                dados.senha() );

        var authentication = manager.authenticate(token);

        // Criando o token JWT:
        var tokenJWT = tokenService.gerarToken( (Usuario) authentication.getPrincipal() );

        // Criando o DTO DadosTokenJWT a partir do token criado acima,
        // e devolvendo no corpo da respostas da requisição:
        return ResponseEntity.ok( new DadosTokenJWT(tokenJWT) );
    }
}
