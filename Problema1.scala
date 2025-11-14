def myMethod(datos: List[Double]): Double = {
  val logs = datos.map(math.log)
  val promLog = logs.sum / logs.size
  val sumCuadrados = logs.map(l => math.pow(l - promLog, 2)).sum
  math.sqrt(sumCuadrados / logs.size)
}
