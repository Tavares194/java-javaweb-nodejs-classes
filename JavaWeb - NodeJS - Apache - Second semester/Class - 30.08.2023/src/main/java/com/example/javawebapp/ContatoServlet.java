package com.example.javawebapp;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.annotation.ServletSecurity.EmptyRoleSemantic;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

// 1 - Criar uma conta em java
// 2 - Essa classe deve extender HttpServlet
// 3 - Roteamento (Anotar a classe com @WebServlet definir
// name e value)

@WebServlet(name = "contato", value = "/contato")
public class ContatoServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
            String nome = req.getParameter("name");
            String email = req.getParameter("email");
            String tel = req.getParameter("tel");
            String mensagem = req.getParameter("message");

            //salvar no bdd

            //enviar um email para o admin com mensagem
            
            System.out.println(nome);
            System.out.println(email);
            System.out.println(tel);
            System.out.println(mensagem);
    }
    
}
