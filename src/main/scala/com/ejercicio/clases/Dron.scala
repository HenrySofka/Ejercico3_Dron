package com.ejercicio.clases

import com.ejercicio.traits.MovimientoDron
import com.ejercicio.typealias.TypeAlias.{Comando, Posicion}

case class Dron(
                 var arriba: Posicion = 0,
                 var abajo: Posicion = 0,
                 var izquierda: Posicion = 0,
                 var derecha: Posicion = 0,
                 var atras: Posicion = 0,
                 var adelante: Posicion = 0
               ) {
  def comandoArriba(comando: Comando): Unit = {
    Dron.comandoArriba(this, comando)

  }

  def comandoAbajo(comando: Comando): Unit = {
    Dron.comandoAbajo(this, comando)
  }

  def comandoDerecha(comando: Comando): Unit = {
    Dron.comandoDerecha(this, comando)
  }

  def comandoIzquierda(comando: Comando): Unit = {
    Dron.comandoIzquierda(this, comando)
  }

  def comandoAtras(comando: Comando): Unit = {
    Dron.comandoAtras(this, comando)
  }

  def comandoAdelante(comando: Comando): Unit = {
    Dron.comandoAdelante(this, comando)
  }
}

object Dron extends MovimientoDron {

  def apply(arriba: Posicion, abajo: Posicion, izquierda: Posicion, derecha: Posicion,
            atras: Posicion, adelante: Posicion
           ): Dron = new Dron(arriba, abajo, izquierda, derecha, atras, adelante)


  override def comandoArriba(dron: Dron, comando: Comando): Unit = {
    val arriba: Posicion = dron.arriba
    val abajo: Posicion = dron.abajo
    val izquierda: Posicion = dron.izquierda
    val derecha: Posicion = dron.derecha
    val atras: Posicion = dron.atras
    val adelante: Posicion = dron.adelante

    if ((arriba + 5) > 100) {
      println("El Dron no puede subir mas")
    } else if (comando.equals("Arriba")) {
      dron.arriba = arriba + 5
      println(s"Posición del Dron: [$arriba,$abajo,$izquierda,$derecha,$atras,$adelante]")
    } else {
      println("Comando no valido")
    }
  }

  override def comandoAbajo(dron: Dron, comando: Comando): Unit = {
    val arriba: Posicion = dron.arriba
    val abajo: Posicion = dron.abajo
    val izquierda: Posicion = dron.izquierda
    val derecha: Posicion = dron.derecha
    val atras: Posicion = dron.atras
    val adelante: Posicion = dron.adelante
    if ((abajo - 5) < -50) {
      println("El Dron no puede bajar mas")
    } else if (comando.equals("Abajo")) {
      dron.abajo = abajo - 5
      println(s"Posición del Dron: [$arriba,$abajo,$izquierda,$derecha,$atras,$adelante]")
    } else {
      println("Comando no valido")
    }
  }

  override def comandoDerecha(dron: Dron, comando: Comando): Unit = {
    val arriba: Posicion = dron.arriba
    val abajo: Posicion = dron.abajo
    val izquierda: Posicion = dron.izquierda
    val derecha: Posicion = dron.derecha
    val atras: Posicion = dron.atras
    val adelante: Posicion = dron.adelante
    if (comando.equals("Derecha")) {
      dron.derecha = derecha + 5
      println(s"Posición del Dron: [$arriba,$abajo,$izquierda,$derecha,$atras,$adelante]")
    } else {
      println("Comando no valido")
    }
  }

  override def comandoIzquierda(dron: Dron, comando: Comando): Unit = {
    val arriba: Posicion = dron.arriba
    val abajo: Posicion = dron.abajo
    val izquierda: Posicion = dron.izquierda
    val derecha: Posicion = dron.derecha
    val atras: Posicion = dron.atras
    val adelante: Posicion = dron.adelante
    if (comando.equals("Izquierda")) {
      dron.izquierda = izquierda - 5
      println(s"Posición del Dron: [$arriba,$abajo,$izquierda,$derecha,$atras,$adelante]")
    } else {
      println("Comando no valido")
    }
  }

  override def comandoAtras(dron: Dron, comando: Comando): Unit = {
    val arriba: Posicion = dron.arriba
    val abajo: Posicion = dron.abajo
    val izquierda: Posicion = dron.izquierda
    val derecha: Posicion = dron.derecha
    val atras: Posicion = dron.atras
    val adelante: Posicion = dron.adelante
    if (comando.equals("Atras")) {
      dron.atras = atras - 5
      println(s"Posición del Dron: [$arriba,$abajo,$izquierda,$derecha,$atras,$adelante]")
    } else {
      println("Comando no valido")
    }
  }

  override def comandoAdelante(dron: Dron, comando: Comando): Unit = {
    val arriba: Posicion = dron.arriba
    val abajo: Posicion = dron.abajo
    val izquierda: Posicion = dron.izquierda
    val derecha: Posicion = dron.derecha
    val atras: Posicion = dron.atras
    val adelante: Posicion = dron.adelante
    if (comando.equals("Adelante")) {
      dron.adelante = adelante + 5
      println(s"Posición del Dron: [$arriba,$abajo,$izquierda,$derecha,$atras,$adelante]")
    } else {
      println("Comando no valido")
    }
  }

}
