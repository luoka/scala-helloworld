package cn.news.test

class Calculator(b: String) {
  
  //��Ĺ��캯������������������������д��붼�ǹ��췽��
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