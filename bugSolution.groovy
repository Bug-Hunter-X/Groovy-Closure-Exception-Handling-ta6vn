```groovy
def methodWithClosure(closure) {
  println "Before closure execution"
  try {
    closure()
  } catch (ArithmeticException e) {
    println "Exception caught: ${e.message}"
  }
  println "After closure execution"
}

methodWithClosure { 
  println "Inside closure"
  // Simulate an error: this will cause an exception, but it's handled now
  def result = 1/0 
}
```