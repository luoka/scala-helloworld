package cn.news.test

class Calculator(b: String) {
  
  //类的构造函数：除开方法定义以外的所有代码都是构造方法
  /**
   * Constructor
   */
  var brand:String = b;
  var color:String = if(b=="IT"){
    "it color"
  }else if(b == "HP"){
    "hp blue"
  }else{
    "null black"
  }
  
  
  def add(m:Int, n:Int) : Int = m+n
  
}