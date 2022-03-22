package dev.stoiclionroars

class AVLNode[A,B](
    var key: A,
    var value: B,
    var height: Int = 0,
    var factor: Int = 0,
    var parent: Option[AVLNode[A,B]],
    var leftChild: Option[AVLNode[A,B]],
    var rightChild: Option[AVLNode[A,B]]):
  override def toString: String = s"+++\ndata(${key} -> $value), balancing=$factor,"