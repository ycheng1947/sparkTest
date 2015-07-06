package me.shu.exercise.spark.basic

import org.apache.spark.{SparkContext, SparkConf}

/**
 * Created by YC on 2015/7/2.
 */
object WordCount {

  def  main (args: Array[String]) {

    val host = "local"

    val sparkConf = new SparkConf().setAppName("WordCount")setMaster(host)
    val sc = new SparkContext(sparkConf)

    val file = sc.textFile("README.md")
    val count = file.count()

    println(count)
  }


}
