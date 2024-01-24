package test3

object T1 extends App{
  val secue = "abcde"
  val invert = secue.reverse
  println(invert)

  val secue1 = "abcde"
  for (letra <- secue1) {
    println(letra)
  }
  /*val secue2 = "abcde"
  val conteoPorLetra = secue2.groupBy(identity).mapValues(_.length) ---> fix this problem
  println(conteoPorLetra)*/
  val secue2 = "abbcccde"
  val conteoPorLetra = secue2.groupBy(identity).mapValues(_.length)
  val resultadoString = conteoPorLetra.map { case (letra, cantidad) => s"$letra -> $cantidad" }.mkString(", ")

  println(resultadoString)

  val secue3 = "abcde"
  val letrasFiltradas = secue3.filter(letra => letra == 'a' || letra == 'e')
  println(letrasFiltradas)

  val sdfecue4 = "abbcccde"  //---> aqui revizamos la ubicacion dentro de una secuencia, no importa que se repita la letra
  val posicionesPorLetra = sdfecue4.zipWithIndex.groupBy(_._1).mapValues(_.map(_._2 + 1))
  val resultadoPosiciones = posicionesPorLetra.map { case (letra, posiciones) => s"$letra -> ${posiciones.mkString(", ")}" }.mkString(", ")
  println(resultadoPosiciones)

}
