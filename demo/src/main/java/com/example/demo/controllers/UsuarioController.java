package com.example.demo.controllers;

import java.util.ArrayList;

import com.example.demo.services.UsaurioService;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {
    

UsaurioService usuarioService;

public ArrayList<String> obtenerUsuarios(){
    return usuarioService.obtenerUSuarios();
}

}
