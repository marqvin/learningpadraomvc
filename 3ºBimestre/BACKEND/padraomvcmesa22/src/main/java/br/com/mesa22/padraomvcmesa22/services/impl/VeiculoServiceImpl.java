package br.com.mesa22.padraomvcmesa22.services.impl;

import br.com.mesa22.padraomvcmesa22.entities.Veiculo;
import br.com.mesa22.padraomvcmesa22.services.VeiculoService;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class VeiculoServiceImpl implements VeiculoService {

    @Override
    public List<Veiculo> listVeiculo(){
        return Arrays.asList(
                new Veiculo("Tesla", "azulão"),
                new Veiculo("Monster Truck da Samsung", "emcapado roze"),
                new Veiculo("Fusca de 6 rodas", "rosinha")
        );
    }

}
