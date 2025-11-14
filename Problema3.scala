class Problema3 {
  
  def generadorIncrementador(incremento: Int): Int => Int = {
    def incrementar(x: Int): Int = x + incremento
    incrementar
  }
}
