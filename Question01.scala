package org.recursiveActivity

import scala.io.StdIn.readInt
import scala.util.control.Breaks.break

object Question011 {

  def isPrime(n: Int, i: Int): Unit ={
    if(n<2){
      print(" False\n")
      return 0
    }
    if(i==1) {
      print(" True\n")
    } else
        if(n%i == 0)
          print(" False\n")
        else
          isPrime(n,i-1)
  }

  def main(args: Array[String]): Unit = {
    print("\n Enter the value : ")
    val n = readInt()
    var i : Int = n/2
    isPrime(n: Int, i: Int )
  }
}
