/* Scala program to demonstrate the Operators */
@main
def main(): Unit =
  println("-----------------------------------------------------------------")
  println("Hello world! This is a Scala program to demonstrate the Operators")

  // Operands
  var a = 10
  var b = 4
  var c = true
  var d = false
  var result = 0

  // using arithmetic operators
  println("- Addition is: " + (a + b))
  println("- Subtraction is: " + (a - b))

  // using Relational Operators
  if (a == b) {
    println("- Equal To Operator is True");
  }
  else {
    println("- Equal To Operator is False");
  }

  // using Logical Operator 'OR'
  println("- Logical Or of a || b = " + (c || d));

  // using Bitwise AND Operator
  result = a & b;
  println("- Bitwise AND: " + result);

  // using Assignment Operators
  println("- Addition Assignment Operator: " + (a += b));

  println("-----------------------------------------------------------------")
  val arithmeticEx = new ArithmeticExample()
  arithmeticEx.arithmeticTest()

  println("-----------------------------------------------------------------")
  val relationalEx = new RelationalExample()
  relationalEx.relationalTest()

  println("-----------------------------------------------------------------")
  val logicalEx = new LogicalExample()
  logicalEx.logicalTest()

  println("-----------------------------------------------------------------")
  val assignmentEx = new AssignmentExample()
  assignmentEx.assignmentTest()

  println("-----------------------------------------------------------------")
  val bitwiseEx = new BitwiseExample()
  bitwiseEx.bitwiseTest()


