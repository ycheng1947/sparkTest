package me.shu.exercise.spark.basic

/**
 * Created by YC on 2015/7/11.
 */
//class CoordinatorView {

  class CoordinatorView(ax:Int ,ay:Int){

    var x :Int = ax;
    var y :Int= ay;

    def move(bx:Int ,by:Int): Unit ={
      x = ax+bx;
      y = ay+by;
 
    }

    override def  toString(): String =  "("+x+","+y+")";

  }

  object PointPrint{

    def main(args: Array[String]) {

      val pt = new CoordinatorView(10,20)
      println("The coodinator of the point is "+pt)

      val ptString = pt.toString()
      println(ptString)
    }
  }

//}
