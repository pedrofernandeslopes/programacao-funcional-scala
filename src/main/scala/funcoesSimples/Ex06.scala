package funcoesSimples

object Ex06 {
    def dividePor2(n: Int): Double = {
        n / 2.0
    }
    
    def main(args: Array[String]): Unit = {
        println(dividePor2(8))
        println(dividePor2(20))
        println(dividePor2(21))
    }
}
