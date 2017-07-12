package edu.knoldus

class Calci {

  def add(a:Int, b:Int): Int = a + b

  def sub(a:Int, b:Int): Int = a - b

  def div(a:Int, b:Int): Int ={

    require(b!=0)

    a/b

  }

  def mul(a:Int, b:Int): Int = a * b

  def pow(c: Int, d:Int): Int = {

    require(d >= 0)

    def calc(a :Int, b :Int, x:Int): Int ={

      if(b == 0) {
        x
      }

      else {
        calc(a, b-1, x*a)
      }

    }

    calc(c,d,1)

  }

  def mod(a:Int, b:Int):Int ={

    require(b!=0)
    a%b

  }

  def abs(a:Int):Int = {

    if(a<0){

      a*(-1)

    }

    else {
      a
    }

  }

  def max(a:Int, b:Int):Int ={

    if(a>b) {
      a
    }
    else {
      b
    }

  }

  def min(a:Int, b:Int):Int ={

    if(a>b) {
      b
    }
    else {
      a
    }

  }

}
