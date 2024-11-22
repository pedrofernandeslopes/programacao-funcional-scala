package funcoesRecursivas

object Ex01 {
    def fatorial(n: Int): Int = {
        if (n == 0) 1
        else n * fatorial(n - 1)
    }
    
    def main(args: Array[String]): Unit = {
        print(fatorial(5))
    }
}
