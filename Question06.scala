package org.recursiveActivity

import scala.io.StdIn.readInt

object Question06 {

  def Fibonacci(i:Int): Int={
    if(i==1 || i==2)
      return i-1;
    else
      return Fibonacci(i-1) + Fibonacci(i-2)
  }

  def main(args: Array[String]): Unit = {
    print("\n Enter the value : ")
    val n = readInt()

    for(i:Int <-1 to n){
      print( " " + Fibonacci(i) + " \n" )
    }
  }
}
