class Cliente (private val nome: String) {

    private var endereco = ""
    private var telefone = ""
    private val listaDeCompras = mutableListOf<String>()


    fun addCompra(compra: String){
        if (compra.isEmpty()){
            println("\nProduto inválido.")
        }else{
            listaDeCompras.add(compra)
            println("\n$compra adicionado.")
        }

    }

    fun delCompra(exclui: String){
        if(exclui.isEmpty()){
            println("\nProduto não encontrado/inexistente.")
        }else if(listaDeCompras.contains(exclui)){
            listaDeCompras.remove(exclui)
            println("\n$exclui removido.")
        }else{
            println("\nProduto não encontrado/inexistente.")
        }
    }

    fun mostrarLista(){
        println("\n---Lista de Compras: $nome---")
        listaDeCompras.forEach{
            println(it)
        }
    }

    constructor(
        nome: String, endereco: String): this(nome){
            this.endereco = endereco
        }


    constructor(
        nome: String,
        endereco: String,
        telefone: String): this(nome,endereco){
            this.telefone = telefone
        }

    init{
        if(nome.isEmpty()){
            throw Exception("Classe iniciada de maneira inapropriada")
        }else{
        }

    }


}