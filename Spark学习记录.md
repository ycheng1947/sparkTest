
# Spark Learning
## Scala
- Assert
	 - `result should == (b)`:大小相等，类型不强制。
	 - `result shoule === (b)`:相等，类型也要一直。
	 - `result should be (b)`
	 - `result shouldbe b`

- val & var
	- val : 不可变变量
	- var ： 可变变量，var变量在class中定义了getter()和setter()方法

- class
	- 在Scala中表示静态代码块，可以实例化成多个object
- Options:类似Java中对NullPointError的处理
	- Options[A],若A存在，则Options[A]就是Some[A]的一个实例;如果不存在，则是None。
	- getOrElse:·value1 getOrElse `No value" should be("xxx")`
	- `value2.isEmpty should be(true)`
	- Option可以用来pattern matching
	>` val someValue: Option[Double] = Some(20.0)`
`val value = someValue match {`
 ` case Some(v) => v`
 ` case None => 0.0`
`}`
`value should be(20.0)`
`val noValue: Option[Double] = None`
`val value1 = noValue match {`
  `case Some(v) => v`
 ` case None => 0.0`
`}`
`value1 should be()`

- Objects
	- 

## RDD操作


## 开发环境搭建
### git
- ssh-genkey
- 一直enter，将生成的ssh秘钥,/.ssh/下面拷贝到git的setting的ssh中
- [免密码push](http://yongqing.is-programmer.com/posts/80371.html)