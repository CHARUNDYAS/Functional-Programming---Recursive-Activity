package org.recursiveActivity

import scala.io.StdIn.readInt

object question_05{

  def Even(i:Int): Boolean=i match{
    case 0 => true
    case _ => Odd(i -1)
  }

  def Odd(i:Int): Boolean={
    ! (Even(i))
  }

  def main(args:Array[String]){

    print("\n Enter the value : ")
    val n = readInt()

    var sum : Int = 0;

    for(i:Int <- 1 to n){
      if(Even(i)) {
        sum = sum + i
      }
    }
    print(" The sum of even numbers : " + sum +"\n")
  }
}

