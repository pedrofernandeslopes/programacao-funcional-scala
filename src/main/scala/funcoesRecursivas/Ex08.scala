package funcoesRecursivas

object Ex08 {
    
    def somaDigitos(n: Int): Int = {
        if (n < 10) n
        else (n % 10) + somaDigitos(n / 10)
    }
    
    def persistenciaAditiva(n: Int): Int = {
        if (n < 10) 0
        else 1 + persistenciaAditiva(somaDigitos(n))
    }
    
    def main(args: Array[String]): Unit = {
        println(persistenciaAditiva(9876))
        println(persistenciaAditiva(19))
        println(persistenciaAditiva(423458723))
    }
}
