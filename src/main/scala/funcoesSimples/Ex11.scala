package funcoesSimples

object Ex11 {
    def ehTriangulo(a: Int, b: Int, c: Int): Boolean = {
        (a + b > c) && (a + c > b) && (b + c > a)
    }
    
    def main(args: Array[String]): Unit = {
        println(ehTriangulo(4, 5, 6))
        println(ehTriangulo(3, 4, 5))
        println(ehTriangulo(1, 2, 3))
    }
}
