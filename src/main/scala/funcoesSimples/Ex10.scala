package funcoesSimples

object Ex10 {
    def menor(x: Int, y: Int): Int = if(x < y) x else y
    
    def main(args: Array[String]): Unit = {
        val x = 1
        val y = 13
        val z = 4
        val w = 2
        
        println(s"O menor entre $x, $y, $z, $w é: ${menor(menor(menor(x, y), z), w)}")
    }
}
