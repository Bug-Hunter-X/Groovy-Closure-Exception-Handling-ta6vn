```groovy
def methodWithClosure(closure) {
  println "Before closure execution"
  closure()
  println "After closure execution"
}

methodWithClosure { 
  println "Inside closure"
  // Simulate an error: this will cause an exception
  def result = 1/0 
}
```