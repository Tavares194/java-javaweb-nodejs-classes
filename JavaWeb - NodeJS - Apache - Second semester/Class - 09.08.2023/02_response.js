const { response } = require("express");
const express = require("express");
const path = require("path");

const app = express();

app.use(express.urlencoded());

function register(req, res){
    const caminho = path.join(__dirname, "pages", "register.html");
    res.sendFile(caminho) //or res.sendFile(path.join(__dirname, "pages", "register.html");
}

function createRegister(req, res){
    const name = req.body.name;
    const email = req.body.email;
    const password = req.body.password;
    const errors = [];

    if(name == ""){
        errors.push("Invalid name");
    }

    if(email == ""){
        errors.push("Invalid Email");
    }

    if(password == ""){
        errors.push("Invalid password");
    }

    if(errors.length != 0){
        res.send(errors);
        return;
    }

    //SELECT * FROM usuario WHERE email=email;

    //INSERT INTO usuario Values ()

    console.log(req.body);

    res.status(301);
    res.header("Location", "/login");
    res.send();
}

function login(req, res){
    const caminho = path.join(__dirname, "pages", "login.html");
    res.sendFile(caminho) //or res.sendFile(path.join(__dirname, "pages", "login.html");
}

function createLogin(req, res){
    const email = req.body.email;
    const password = req.body.password;
    const errors = [];

    if(email == ""){
        errors.push("Invalid Email");
    }

    if(password == ""){
        errors.push("Invalid password");
    }

    if(errors.length != 0){
        res.send(errors);
        return;
    }

    console.log(req.body);
    res.send("Login was completed.")
}

app.get("/register", register)
app.post("/register", createRegister)
app.get("/login", login)
app.post("/login", createLogin)

app.listen(3001, () => console.log("Using port 3001"));

// 100 - info
// 200 - sucesso
// 300 - redirect
// 400 - erro (client)
// 500 - erro (server)