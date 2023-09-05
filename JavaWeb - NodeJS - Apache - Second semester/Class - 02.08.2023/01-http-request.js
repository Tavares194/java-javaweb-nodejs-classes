const express = require("express")
//request do pacote express

const server = express() //criação do objeto express

function home(request, response){
    console.log(request.method)
    console.log(request.url)

    response.send("Home Page")
} //homepage

function contato(request, response){
    response.send("<h1>Contato</h1>")
} //contato

function contact(req, res){
    res.status(301)
    res.header("Location", "/contato")
    res.send()
} //redirect

server.get("/", home)
server.get("/contato", contato)
server.get("/contact", contact)

server.listen(3001, () => console.log("Rodando porta 3001")) //arrow function

//Estudar arrow function (JS)

//localhost:3001