const express = require("express");

const app = express();

function home(req, res){
    res.send("Home Page");
}

function principal(req, res){
    res.status(301);
    res.header("Location", "/");
    res.send();
}

app.get("/", home)

app.get("/principal", principal)

app.listen(3001, () => console.log("Rodando na porta 3001"));

// 100 - info
// 200 - sucesso
// 300 - redirect
// 400 - erro (client)
// 500 - erro (server)