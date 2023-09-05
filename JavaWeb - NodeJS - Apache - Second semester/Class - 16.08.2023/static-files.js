//importar express
const express = require('express');
const path = require('path');

// criar app ou server chamando a fn express()
const app = express();

function home(req, res){
    const caminho = path.join(__dirname, 'pages', 'home.html')
    res.sendFile(caminho);
}

//localhost:3000/contato?type=form
//localhost:3000/contato?type=text
//localhost:3000/contato?type -> text

function contato(req, res){
    const type = req.query.type;

    if(type === 'form'){
        res.sendFile(path.join(__dirname, 'pages', 'contact-form.html'))
    } else{
        res.sendFile(path.join(__dirname, 'pages', 'contact-text.html'))
    }
}

const products = ['Walter White', 'The Profesor', 'Michael Corleone', 'Thomas Shelby'];

//localhost:3000/produto?id=3

function produto(req, res){
    const id = req.query.id;

    if(id < 0 || id >=products.length){
        res.status(404);
        res.send('Product not found.')
    } else{
        res.send(products[id])
    }
    
}

//middleware
app.use(express.static('public'));

//configurar rotas
app.get('/', home);
app.get('/contato', contato);
app.get('/produto', produto);

//subir o server chamando fn listen()
app.listen(3000, () => console.log('Rodando porta 3000'));