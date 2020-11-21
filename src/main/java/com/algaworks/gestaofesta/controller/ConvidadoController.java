package com.algaworks.gestaofesta.controller;

import com.algaworks.gestaofesta.repository.ConvidadoRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ConvidadoController {

    private ConvidadoRepository convidadoRepository;

    public  ConvidadoController(ConvidadoRepository convidadoRepository){
        this.convidadoRepository = convidadoRepository;
    }

    @GetMapping("/convidados")
    public ModelAndView listar(){
        ModelAndView modelAndView = new ModelAndView("ListaConvidados");
        modelAndView.addObject("convidados", convidadoRepository.findAll());
        return modelAndView;
    }


}
