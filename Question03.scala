package org.recursiveActivity

import scala.io.StdIn.readInt
import scala.util.control.Breaks.break

object Question03{

  var sum : Int = 0;

  def isAdd(j: Int): Unit ={
    sum = sum + j;
    if(j==1)
      print(" The total is " + sum + "\n");
  }

  def main(args: Array[String]): Unit = {
    print("\n Enter the value : ")
    val n = readInt()
    for(j:Int <- (1 to n).reverse) {
      isAdd(j: Int)

    }
  }
}
