let alfabeto = ["a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m",
                "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "y", "x", "z"];

let palavra = ["l", "i", "v", "r", "o"];
var tentativa = [];

//Divide Todas as Letras do Alfabeto
const resposta = palavra.filter(element => alfabeto.includes(element));

const teste = function() {

    var um = document.getElementById("um").value;
    var dois = document.getElementById("dois").value;
    var tres = document.getElementById("tres").value;
    var quatro = document.getElementById("quatro").value;
    var cinco = document.getElementById("cinco").value;
    
    tentativa.push(um, dois, tres, quatro, cinco);
    const digitado = tentativa.filter(element => palavra.includes(element));
    const respostaQuase = palavra.filter(element => tentativa.includes(element));
    console.log(respostaQuase)
    console.log(resposta)
    console.log(digitado)
    //A Palavra Está Correta
    if (JSON.stringify(resposta) == JSON.stringify(digitado)) {
        document.getElementById("um").className = "certo";
        document.getElementById("dois").className = "certo";
        document.getElementById("tres").className = "certo";
        document.getElementById("quatro").className = "certo";
        document.getElementById("cinco").className = "certo";
    } else {
        //Um Repetidor Para Verificar Cada Quadrado do Termo
        for (i = 0; i < 5; i++) {
            //A Palavra Tem a Certa
            if (JSON.stringify(resposta[i]) == JSON.stringify(tentativa[i])) {
                switch (i) {
                    case 0:
                        document.getElementById("um").className = "certo";
                        break;
                    case 1:
                        document.getElementById("dois").className = "certo";
                        break;
                    case 2:
                        document.getElementById("tres").className = "certo";
                        break;
                    case 3:
                        document.getElementById("quatro").className = "certo";
                        break;
                    case 4:
                        document.getElementById("cinco").className = "certo"; 
                        break; 
                }
            //A Palavra Não Tem a Letra
            } else if (JSON.stringify(resposta[i]) != JSON.stringify(respostaQuase[i])) {
                switch (i) {
                    case 0:
                        document.getElementById("um").className = "naoTem";
                        break;
                    case 1:
                        document.getElementById("dois").className = "naoTem";
                        break;
                    case 2:
                        document.getElementById("tres").className = "naoTem";
                        break;
                    case 3:
                        document.getElementById("quatro").className = "naoTem";
                        break;
                    case 4:
                        document.getElementById("cinco").className = "naoTem"; 
                        break; 
                }
            //A Letra Está Fora do Lugar
            } else if (JSON.stringify(resposta[i]) != JSON.stringify(tentativa[i])) {
                switch (i) {
                    case 0:
                        document.getElementById("um").className = "outroLugar";
                        break;
                    case 1:
                        document.getElementById("dois").className = "outroLugar";
                        break;
                    case 2:
                        document.getElementById("tres").className = "outroLugar";
                        break;
                    case 3:
                        document.getElementById("quatro").className = "outroLugar";
                        break;
                    case 4:
                        document.getElementById("cinco").className = "outroLugar"; 
                        break;
                }
            }
        }      
    }
}