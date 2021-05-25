package com.example.demo.services;

import com.example.demo.repositories.UsuarioRepository;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsaurioService {
    @Autowired
    UsuarioRepository usuarioRepository;

    public ArrayList<String> obtenerUSuarios(){
       return (ArrayList<String>) usuarioRepository.findAll();
    }

    }