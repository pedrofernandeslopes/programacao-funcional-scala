package funcoesRecursivas

object Ex02 {
    def soma(n: Int): Int = {
        if (n == 0) 0
        else n + soma(n - 1)
    }
    
    def main(args: Array[String]): Unit = {
        println(soma(5))
    }
}
