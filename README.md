# Examen-Parcial
Examen Parcial Primer Bimestre - Patricio Correa

PROMPT PARA EL SEGUNDO EJERCICIO, USE GEMINI: No puedo hacer que ajustedePrecios funcione para aplicarle el ImpuestoIva a la lista precios. Cuando intento llamar al método, IntelliJ me da un error de tipo. ¿Cómo debo escribir la llamada para usar la función dentro de la definición del método? / def ajustedePrecios(precios: List[Double], politica: Double => Double): List[Double] = {
    precios.map(politica)
    val ImpuestoIva: Double = precio * 1.12
