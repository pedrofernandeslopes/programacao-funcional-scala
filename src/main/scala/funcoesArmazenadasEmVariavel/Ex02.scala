package funcoesArmazenadasEmVariavel

object Ex02 extends App{
    val celsiusParaFahrenheit = (c:Double) => c * 9 / 5 + 32
    val fahrenheitParaCelsius = (f: Double) => (f - 32) * 5
    val celsiusParaKelvin = (c: Double) => c + 273.0
    
    val temperatura = 30.0
    val conversaoEscolhida = 3
    
    var resultado = conversaoEscolhida match {
        case 1 => celsiusParaFahrenheit(temperatura)
        case 2 => fahrenheitParaCelsius(temperatura)
        case 3 => celsiusParaKelvin(temperatura)
    }
    print(s"Temperatura convertida: $resultado")
}
