package org.recursiveActivity

import scala.io.StdIn.readInt
import scala.util.control.Breaks.break

object Question02{

  def isPrime(j: Int, i: Int): Unit ={
    if(i==1) {
      print(" " +  j)
    } else
      if(j%i == 0)
        return 1
      else
        isPrime(j,i-1)
  }

  def main(args: Array[String]): Unit = {
    print("\n Enter the value : ")
    val n = readInt()
    for(j:Int <- 2 to n) {
      var i: Int = j / 2
      isPrime(j: Int, i: Int)
    }
  }
}
