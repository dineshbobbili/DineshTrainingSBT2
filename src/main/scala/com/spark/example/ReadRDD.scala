package com.spark.example

import org.apache.spark.{SparkConf, SparkContext}

object ReadRDD {
  def main(args: Array[String]): Unit = {
    val conf = new SparkConf().setAppName("RDD Example").setMaster("local")
    val sc = new SparkContext(conf)
    val vrdd = sc.textFile("SampleFiles/demoinput")
    //val vrdd = sc.textFile("/home/orienit/spark/input/demoinput")

    vrdd.collect()
  }
}
