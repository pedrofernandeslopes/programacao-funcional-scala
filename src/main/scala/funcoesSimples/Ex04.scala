package funcoesSimples

object Ex04 {
    def celsiusToFahrenheit (n: Double): Double = n * 1.8 + 32
    
    def main(args: Array[String]): Unit = {
        println(celsiusToFahrenheit(0))
    }
}
