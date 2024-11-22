package funcoesRecursivas

object Ex06 {
    def somaDigitos(n: Int): Int = {
        if (n < 0) somaDigitos(-n)
        else if (n == 0) 0
        else (n % 10) + somaDigitos(n / 10)
    }
    
    
    def main(args: Array[String]): Unit = {
        println(somaDigitos(40))
    }
}