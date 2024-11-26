package funcoesArmazenadasEmVariavel

object Ex01 extends App{
    val soma = (a: Int, b: Int) => a + b
    val subtracao = (a: Int, b: Int) => a - b
    val multiplicacao = (a: Int, b: Int) => a * b
    val divisao = (a: Int, b: Int) => if (b != 0) a / b else "Divisão por zero"
    
    val n1 = 8
    val n2 = 6
    
    println(soma(n1, n2))
    println(subtracao(n1, n2))
    println(multiplicacao(n1, n2))
    println(divisao(n1, n2))
}
