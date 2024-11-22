package funcoesRecursivas

object Ex07 {
    def contarDigitos(n: Int): Int = {
        if (n < 0) contarDigitos(-n)
        else if (n < 10) 1
        else 1 + contarDigitos(n / 10)
    }
    
    
    def main(args: Array[String]): Unit = {
        println(contarDigitos(50))
    }
}
