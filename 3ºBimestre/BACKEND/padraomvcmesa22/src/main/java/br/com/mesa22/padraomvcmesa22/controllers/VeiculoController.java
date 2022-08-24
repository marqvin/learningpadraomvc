package br.com.mesa22.padraomvcmesa22.controllers;

import br.com.mesa22.padraomvcmesa22.entities.Veiculo;
import br.com.mesa22.padraomvcmesa22.services.VeiculoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/listaVeiculos") // rota principal com o backend
public class VeiculoController {

    // Injeção de dependência
    @Autowired
    private VeiculoService service;

    public VeiculoController(VeiculoService service) {
        this.service = service;
    }

    @GetMapping // faz aparecer no frontend
    public List<Veiculo> buscaVeiculos(){
        return service.listVeiculo();
    }
}
