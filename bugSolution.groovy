```groovy
def myMethod(List<String> list) {
  if (list != null) {
    list.eachWithIndex { element, index ->
      println "Element at index $index: $element"
    }
  } else {
    println "List is null"
  }
}

myMethod(null)
myMethod(['a', 'b', 'c'])
```