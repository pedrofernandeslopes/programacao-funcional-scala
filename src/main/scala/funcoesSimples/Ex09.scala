package funcoesSimples

object Ex09 {
    def retornaMenor(n1: Int, n2: Int): Int = if (n1 < n2) n1 else n2
    
    def main(args: Array[String]): Unit = {
        val n1 = 28
        val n2 = 26
        println(retornaMenor(n1, n2))
    }
}
