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

class AVLTree[A, B]():
  var root: Option[AVLNode[A,B]] = Option.empty[AVLNode[A,B]]
  var size: Int = 0
  def isEmpty: Boolean = size == 0
  def getSize: Int = size

  /*
   void ibalance( AVLNode<T, K>* nodo );
      void dbalance( AVLNode<T, K>* nodo );
      void sub_balance(  AVLNode<T, K>* nodo  );
      void refresh( AVLNode<T, K>* nodo );
      AVLNode<T, K>* rotationSS( AVLNode<T, K>* nodo );
      AVLNode<T, K>* rotationDD( AVLNode<T, K>* nodo );
      AVLNode<T, K>* rotationSD( AVLNode<T, K>* nodo );
      AVLNode<T, K>* rotationDS( AVLNode<T, K>* nodo );
      public:

      void insert( T val, K k );
      T search( K k );
      void deleteElem( K k );

      friend class AVLVisitor<T, K>;
*/
