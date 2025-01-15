## Operators in Scala

An operator is a symbol that represents an operation to be performed with one or more operand. Operators allow us to
perform different kinds of operations on operands. There are different types of operators used in Scala as follows:

### Arithmetic Operators

These are used to perform arithmetic/mathematical operations on operands.

- **Addition(+)** operator adds two operands. For example, **x+y**.
- **Subtraction(-)** operator subtracts two operands. For example, **x-y**.
- **Multiplication(*)** operator multiplies two operands. For example, **x*y**.
- **Division(/)** operator divides the first operand by the second. For example, **x/y**.
- **Modulus(%)** operator returns the remainder when the first operand is divided by the second. For example, **x%y**.
- **Exponent(**)** operator returns exponential(power) of the operands. For example, **x*y**.

### Relational Operators

Relational operators or Comparison operators are used for comparison of two values. Let’s see them one by one:

- **Equal To(==)** operator checks whether the two given operands are equal or not. If so, it returns true. Otherwise it
  returns false. For example, **5==5** will return true.
- **Not Equal To(!=)** operator checks whether the two given operands are equal or not. If not, it returns true.
  Otherwise it returns false. It is the exact boolean complement of the **‘==’** operator. For example, **5!=5** will
  return false.
- **Greater Than(>)** operator checks whether the first operand is greater than the second operand. If so, it returns
  true. Otherwise it returns false. For example, **6>5** will return true.
- **Less than(<)** operator checks whether the first operand is lesser than the second operand. If so, it returns true.
  Otherwise it returns false. For example, **6<5** will return false.
- **Greater Than Equal To(>=)** operator checks whether the first operand is greater than or equal to the second
  operand. If so, it returns true. Otherwise it returns false. For example, **5>=5** will return true.
- **Less Than Equal To(<=)** operator checks whether the first operand is lesser than or equal to the second operand. If
  so, it returns true. Otherwise it returns false. For example, **5<=5** will also return true.

### Logical Operators

They are used to combine two or more conditions/constraints or to complement the evaluation of the original condition
in consideration. They are described below:

- **Logical AND(&&)** operator returns true when both the conditions in consideration are satisfied. Otherwise it
  returns false. Using “and” is an alternate for && operator. For example, **a && b** returns true when both a and b are
  true (i.e. non-zero).
- **Logical OR(||)** operator returns true when one (or both) of the conditions in consideration is satisfied. Otherwise
  it returns false. Using “or” is an alternate for || operator. For example, **a || b** returns true if one of a or b is
  true (i.e. non-zero). Of course, it returns true when both a and b are true.
- **Logical NOT(!)** operator returns true the condition in consideration is not satisfied. Otherwise it returns false.
  Using _“not”_ is an alternate for ! operator. For example, **!true** returns false.

### Assignment Operators

Assignment operators are used to assigning a value to a variable. The left side operand of the assignment operator is
a variable and right side operand of the assignment operator is a value. The value on the right side must be of the
same data-type of the variable on the left side otherwise the compiler will raise an error.
Different types of assignment operators are shown below:

- **Simple Assignment (=)** operator is the simplest assignment operator. This operator is used to assign the value on
  the right to the variable on the left.
- **Add AND Assignment (+=)** operator is used for adding left operand with right operand and then assigning it to
  variable on the left.
- **Subtract AND Assignment (-=)** operator is used for subtracting left operand with right operand and then assigning
  it to variable on the left.
- **Multiply AND Assignment (*=)** operator is used for multiplying the left operand with right operand and then
  assigning it to the variable on the left.
- **Divide AND Assignment (/=)** operator is used for dividing left operand with right operand and then assigning it to
  variable on the left.
- **Modulus AND Assignment (%=)** operator is used for assigning modulo of left operand with right operand and then
  assigning it to the variable on the left.
- **Exponent AND Assignment (**=)** operator is used for raising power of the left operand to the right operand and
  assigning it to the variable on the left.
- **Left shift AND Assignment(<<=)** operator is used to perform binary left shift of the left operand with the right
  operand and assigning it to the variable on the left.
- **Right shift AND Assignment(>>=)** operator is used to perform binary right shift of the left operand with the right
  operand and assigning it to the variable on the left.
- **Bitwise AND Assignment(&=)** operator is used to perform Bitwise And of the left operand with the right operand and
  assigning it to the variable on the left.
- **Bitwise exclusive OR and Assignment(^=)** operator is used to perform Bitwise exclusive OR of the left operand with
  the right operand and assigning it to the variable on the left.
- **Bitwise inclusive OR and Assignment(|=)** operator is used to perform Bitwise inclusive OR of the left operand with
  the right operand and assigning it to the variable on the left.

### Bitwise Operators

In Scala, there are 7 bitwise operators which work at bit level or used to perform bit by bit operations. Following are
the bitwise operators :

- **Bitwise AND (&)**: Takes two numbers as operands and does AND on every bit of two numbers. The result of AND is 1
  only if both bits are 1.
- **Bitwise OR (|)**: Takes two numbers as operands and does OR on every bit of two numbers. The result of OR is 1 any
  of the two bits is 1.
- **Bitwise XOR (^)**: Takes two numbers as operands and does XOR on every bit of two numbers. The result of XOR is 1 if
  the two bits are different.
- **Bitwise left Shift (<<)**: Takes two numbers, left shifts the bits of the first operand, the second operand decides
  the number of places to shift.
- **Bitwise right Shift (>>)**: Takes two numbers, right shifts the bits of the first operand, the second operand
  decides the number of places to shift.
- **Bitwise ones Complement (~)**: This operator takes a single number and used to perform the complement operation of
  8-bit.
- **Bitwise shift right zero fill(>>>)**: In shift right zero fill operator, left operand is shifted right by the number
  of bits specified by the right operand, and the shifted values are filled up with zeros.

### Technologies

- Java 17
- Sbt 1.10.17
- Scala 3.3.4

