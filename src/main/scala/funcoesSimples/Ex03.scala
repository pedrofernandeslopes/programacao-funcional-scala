package funcoesSimples

object Ex03 {
    
    def mult35(x: Int): Boolean = (x % 3 == 0) && (x % 5 == 0)
    
    def main(arg: Array[String]): Unit = {
        println(mult35(34))
    }
}
