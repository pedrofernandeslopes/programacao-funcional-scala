package funcoesSimples

object Ex08 {
    def concatena(str1: String, str2: String): String = {
        str1 + " " + str2
    }
    
    
    def main(args: Array[String]): Unit = {
        val nome = "Pedro"
        val sobreNome = "Lopes"
        println(concatena(nome, sobreNome))
    }
}
