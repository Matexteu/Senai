let lista = []

const Gerar = function() {
    let nome1 = prompt('Escolha 3 nomes para gatos')
    let nome2 = prompt('Escolha 3 nomes para gatos')
    let nome3 = prompt('Escolha 3 nomes para gatos')
        
    lista.push([nome1, nome2, nome3])

    localStorage.setItem('nome', JSON.stringify(lista))
    console.log(lista)
}

const Escolher = function() {
    if (lista[0] == null) {
        lista[0] = ""
        lista[1] = ""
        lista[2] = ""
    }

    if (lista[0] == "" || lista [1] == "" || lista[2] == "") {
        alert('Preencha todos os quadrinhos.')
    } else {
        let random = parseInt(Math.random() * 3)
        lista = JSON.parse(localStorage.getItem('nome'));
        lista.forEach(lista => {
            if (random == 0) {
                alert('O nome escolhido foi: ' + lista[0])
            } else if (random == 1) {
                alert('O nome escolhido foi: ' + lista[1])
            } else {
                alert('O nome escolhido foi: ' + lista[2])
            }
        });
    }   
}

const Limpar = function() {
    lista.pop('nome')
    alert("Todos os nomes foram retirados.")
    console.log(lista)
}