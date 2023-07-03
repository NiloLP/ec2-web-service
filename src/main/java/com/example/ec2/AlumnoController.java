package com.example.ec2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class AlumnoController {

    @GetMapping(path = "/")
    public String mostrarCodigoNombre() {
        return "A19203288 - Junco Aldunate Nilo Emerson";
    }

    @GetMapping(path = "/idat/codigo")
    public String mostrarCodigo() {
        return "A19203288";
    }

    @GetMapping(path = "/idat/nombre-completo")
    public String mostrarNombre() {
        return "Junco Aldunate Nilo Emerson";
    }

}
