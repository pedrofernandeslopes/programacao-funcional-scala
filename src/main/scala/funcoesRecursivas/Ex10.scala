package funcoesRecursivas

object Ex10 {
    def fibonacci(n: Int): Int = {
        if (n == 0) 0
        else if (n == 1) 1
        else fibonacci(n - 1) + fibonacci(n - 2)
    }
    
    def main(args: Array[String]): Unit = {
        println(fibonacci(10))
    }
}
