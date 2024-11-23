package funcoesSimples

object Ex05 {
    
    def condicao(n: Int): Boolean = {
        (n < -1) || (n > 1 && n % 2 == 0)
    }
    
    def main(args: Array[String]): Unit = {
        println(condicao(-3))
        println(condicao(7))
        println(condicao(0))
    }
}
