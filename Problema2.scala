class Problema2 {
  def ajustedePrecios(precios: List[Double], politica: Double => Double): List[Double] = {
    precios.map(politica)
  }
  val ImpuestoIva: Double =  precio * 1.12
  val Descuento: Double => Double = precio => precio * 0.80
  val Aumento: Double => Double = precio => precio + 5
}
