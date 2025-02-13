```groovy
def myMethod(List<String> list) {
  list.eachWithIndex { element, index ->
    println "Element at index $index: $element"
  }
}

myMethod(null)
```