package com.model

import org.apache.spark.SparkConf
import org.apache.spark.SparkContext

object WordCount {
  
  def main(args: Array[String])={
    
    //create Spark context with Spark Configuration
  val sc = new SparkContext(new SparkConf().setAppName("SimpleApp").setMaster("local"))
  val rdd = sc.parallelize(Seq(1,2,3,4,5))
  println("word's counted " + rdd.count())
    
  }
  
}