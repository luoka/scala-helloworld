package cn.news.test

import scala.collection.mutable.StringBuilder

object app extends App {
	Console.println("Hello World: " + (args mkString ", "))
	
	//变量定义：val 不变量		var变量
	//函数定义 
	def timesTwo(i: Int): Int = {
	  println("hello world")
	  i * 2
	}
	
	//使用下划线“_”部分应用一个函数，结果将得到另一个函数
	def adder(m: Int, n: Int) = m + n
	val add2 = adder(2, _:Int)
	Console.println(add2(4))
	
	//柯里化函数:允许别人一会在你的函数上应用一些参数，然后又应用另外的一些参数
	def multiply(m: Int)(n: Int): Int = m * n
	Console.println(multiply(2)(4))
	val otherFunction = multiply(10)_
	Console.println(otherFunction(3))
	
	//可变长度参数
	def capitalizeAll(args : String*) = {
	  args.map({ arg =>
	    arg.capitalize
	  })
	}
	Console.println(capitalizeAll("rarity", "applejack"))
	
	//类
	val calc = new Calculator("HP")
	println(calc.brand + "  " + calc.color + ":  " + calc.add(3, 5));
	
	
	//关于特质与抽象类
	//1、优先使用特质。一个类扩展多个特质是很方便的，但却只能扩展一个抽象类。
	//2、如果你需要构造函数参数，使用抽象类。因为抽象类可以定义带参数的构造函数，而特质不行。例如，你不能说trait t(i: Int) {}，参数i是非法的。
	
	
	//单例对象,Timer.currentCount()
	/*object Timer{
	  var count = 0;
	  def currentCount(): Long = {
	    count +=1
	    count
	  }
	}
	println(Timer.currentCount());*/
	
	
	//集合
	//List
	val numbers = List(1,2,3,4)
	numbers.foreach(arg => println(arg))
	val added = numbers.::(1)
	val badded = numbers.+:(5)
	println(added)
	println(badded)
	println(numbers)
	
	//Set
	val sets = Set("first");
	println(sets);
	
	//Tuple 元组
	val aTuple = 1 -> 2
	val bTuple = ("localhost" -> 8080)
	println(aTuple)
	println(bTuple._1 + ":" + bTuple._2)
	//元组的模式匹配
	bTuple match {
	  case ("localhost", port) => println("match1==" + bTuple._1 + ":" + bTuple._2)
	  case (host, port) => println("match2==" + bTuple._1 + ":" + bTuple._2)
	}
	
	//Map
	val aMap = Map(1 -> 2, 3 -> 4)
	val bMap = Map("add" -> {timesTwo(_)})
	println(aMap.get(1))
	println(bMap.get("add"))
	
	
	
}