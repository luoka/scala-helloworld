package cn.news.test

import scala.collection.mutable.StringBuilder

object app extends App {
	Console.println("Hello World: " + (args mkString ", "))
	
	//�������壺val ������		var����
	//�������� 
	def timesTwo(i: Int): Int = {
	  println("hello world")
	  i * 2
	}
	
	//ʹ���»��ߡ�_������Ӧ��һ��������������õ���һ������
	def adder(m: Int, n: Int) = m + n
	val add2 = adder(2, _:Int)
	Console.println(add2(4))
	
	//���ﻯ����:�������һ������ĺ�����Ӧ��һЩ������Ȼ����Ӧ�������һЩ����
	def multiply(m: Int)(n: Int): Int = m * n
	Console.println(multiply(2)(4))
	val otherFunction = multiply(10)_
	Console.println(otherFunction(3))
	
	//�ɱ䳤�Ȳ���
	def capitalizeAll(args : String*) = {
	  args.map({ arg =>
	    arg.capitalize
	  })
	}
	Console.println(capitalizeAll("rarity", "applejack"))
	
	//��
	val calc = new Calculator("HP")
	println(calc.brand + "  " + calc.color + ":  " + calc.add(3, 5));
	
	
	//���������������
	//1������ʹ�����ʡ�һ������չ��������Ǻܷ���ģ���ȴֻ����չһ�������ࡣ
	//2���������Ҫ���캯��������ʹ�ó����ࡣ��Ϊ��������Զ���������Ĺ��캯���������ʲ��С����磬�㲻��˵trait t(i: Int) {}������i�ǷǷ��ġ�
	
	
	//��������,Timer.currentCount()
	/*object Timer{
	  var count = 0;
	  def currentCount(): Long = {
	    count +=1
	    count
	  }
	}
	println(Timer.currentCount());*/
	
	
	//����
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
	
	//Tuple Ԫ��
	val aTuple = 1 -> 2
	val bTuple = ("localhost" -> 8080)
	println(aTuple)
	println(bTuple._1 + ":" + bTuple._2)
	//Ԫ���ģʽƥ��
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