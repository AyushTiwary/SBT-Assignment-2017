package edu.knoldus

import org.scalatest.FunSuite

/**
  * Created by knoldus on 12/7/17.
  */
class CalciTest extends FunSuite {

  val cal = new Calci()

  test("Addition of two Integers")
  {
    assert(cal.add(1,2) === 3)
  }

  test("Subtraction of two Integers")
  {
    assert(cal.sub(6,2) === 4)
  }

  test("Division of two Integers")
  {
    assert(cal.div(9,4) === 2)
  }

  test("Power of any number")
  {
    assert(cal.pow(2,3) === 8)
  }

  test("Power with Negative number")
  {
    intercept[IllegalArgumentException]
    {
      cal.pow(2,-3)
    }
  }

  test("Mod of the numbers")
  {
    assert(cal.mod(7,3) === 1)
  }

  test("Mod with negative denominator")
  {
    intercept[IllegalArgumentException]
    {
      cal.mod(34,0)
    }
  }

  test("Absolute of the Number with positive number")
  {
    assert(cal.abs(5) === 5)
  }

  test("Absolute of the Number with negative number")
  {
    assert(cal.abs(-5) === 5)
  }

  test("Maximum of two integers")
  {
    assert(cal.max(67,4) === 67)
  }

  test("Minimum of two integers")
  {
    assert(cal.min(44,9) === 9)
  }

  test("Division with zero")
  {
    intercept[IllegalArgumentException]{
      cal.div(3,0)
    }
  }

  test("Second test for Maximum of two integers")
  {
    assert(cal.max(4,67) === 67)
  }

  test("Second Test for Minimum of two integers")
  {
    assert(cal.min(9,44) === 9)
  }

  test("Multiplication of two numbers")
  {
    assert(cal.mul(2,3) === 6)
  }

}


