package sindcon.controller.controle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import sindcon.model.persistencia.entidade.Acesso;
import sindcon.model.servico.AcessoServico;

@RestController
@RequestMapping("/acesso")
public class AcessoControle {
    @Autowired
    AcessoServico acessoServico;

    //GET
    @RequestMapping(method = RequestMethod.GET)
    public Iterable<Acesso> get() {
        return acessoServico.consultarAcessos();
    }

    //Post
    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<?> post(@RequestBody Acesso acesso) {
        acessoServico.inserirAcesso(acesso);
        HttpHeaders httpHeaders = new HttpHeaders();
        return new ResponseEntity<>(null, httpHeaders, HttpStatus.CREATED);
    }

    //PUT
    @RequestMapping(method = RequestMethod.PUT)
    public ResponseEntity<?> put(@RequestBody Acesso acesso) {
        HttpHeaders httpHeaders = new HttpHeaders();
        try {
            acessoServico.atualizarAcesso(acesso);
        } catch (Exception e) {
            return new ResponseEntity<>(null, httpHeaders, HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<>(null, httpHeaders, HttpStatus.CREATED);
    }

    //DELETE
    @RequestMapping(method = RequestMethod.DELETE)
    public ResponseEntity<?> delete(@RequestParam Integer id) {
        acessoServico.apagarAcesso(id);
        HttpHeaders httpHeaders = new HttpHeaders();
        return new ResponseEntity<>(null, httpHeaders, HttpStatus.OK);
    }
}