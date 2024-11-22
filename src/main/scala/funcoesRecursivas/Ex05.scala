package funcoesRecursivas

object Ex05 {
    def inverter(str: String): String = {
        if (str.isEmpty) ""
        else str.last + inverter(str.dropRight(1))
    }
    
    def main(args: Array[String]): Unit = {
        println(inverter("pedro"))
    }
}
