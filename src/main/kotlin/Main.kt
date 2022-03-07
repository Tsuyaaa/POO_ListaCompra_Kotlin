fun main() {
    //Lista de Compras de cliente:

    print("Digite seu nome: ")
    val nome = readLine()!!

    print("\nDigite seu endereço: ")
    val endereco = readLine()!!

    print("\nDigite seu telefone: ")
    val numero = readLine()!!

    try{
        val cliente1 = Cliente(nome, endereco, numero)

        while(true){
            println("\n---Opções---")
            println("\n1. Adicionar produto")
            println("2. Remover produto")
            println("3. Visualizar lista")
            println("Digite qualquer valor para finalizar")
            print("\nDigite a opção a ser realizada: ")

            try{
                var option = readLine()!!.toInt()

                when(option){

                    1->{
                        print("\nDigite o produto à ser adicionado: ")
                        val produto = readLine()!!
                        cliente1.addCompra(produto)
                    }

                    2 ->{
                        print("\nDigite o produto a ser removido: ")
                        val produto = readLine()!!
                        cliente1.delCompra(produto)
                    }

                    3 ->{
                        cliente1.mostrarLista()
                    }

                    else -> break


                }

            }catch(e: Exception){
                println(e.message)
            }
        }
    }catch(e: Exception){
        println(e.message)
    }



}