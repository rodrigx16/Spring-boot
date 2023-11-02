package br.edu.fatecrl.mvcdemo.controllers;

import br.edu.fatecrl.mvcdemo.models.Carro;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/carros")
public class DadosController {
    private static final List<Carro> carros = new ArrayList<>();

    public DadosController() {
        carros.add(new Carro("Audi A3", "Audi", 2022, 25000.0f));
        carros.add(new Carro("Argo", "Fiat", 2021, 80000.0f));
        carros.add(new Carro("Stepway", "Renault", 2023, 64900.0f));
    }

    @GetMapping
    public List<Carro> getCarros() {
        return carros;
    }
}
