package com.spark.example

import org.apache.spark.sql.SQLContext
import org.apache.spark.{SparkConf, SparkContext}

object HelloWorld {
  def main(args: Array[String]): Unit = {
    val t = Seq(("Dinesh",26),("Ramesh",30))
    //print(t._1)
  val conf = new SparkConf().setAppName("sample data").setMaster("local")
    val sc = new SparkContext(conf)
    val spark = new SQLContext(sc)

    import spark.implicits._
    val df = t.toDF("name","Age").show()
  }
}
