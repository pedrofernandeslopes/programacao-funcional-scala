package funcoesRecursivas

object Ex03 {
    def isPar(n: Int): Boolean = {
        if (n == 0) true
        else if (n == 1) false
        else isPar(n - 2)
    }
    
    def main(args: Array[String]): Unit = {
        println(isPar(10))
    }
}
