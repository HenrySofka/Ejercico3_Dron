package com.ejercicio.traits

import com.ejercicio.typealias.TypeAlias.Comando
import com.ejercicio.clases.Dron

trait MovimientoDron {
  def comandoArriba(dron: Dron, comando: Comando): Unit

  def comandoAbajo(dron: Dron, comando: Comando): Unit

  def comandoIzquierda(dron: Dron, comando: Comando): Unit

  def comandoDerecha(dron: Dron, comando: Comando): Unit

  def comandoAtras(dron: Dron, comando: Comando): Unit

  def comandoAdelante(dron: Dron, comando: Comando): Unit
}
