package org.recursiveActivity

import scala.io.StdIn.readInt

object question_04{

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

    if(Odd(n))
      println(" Odd Number\n");
    else
      println(" Even Number\n");
  }
}

