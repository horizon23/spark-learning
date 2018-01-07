package com.learning.spark.tutorials

import com.learning.spark.base.SparkMain

object T1 extends SparkMain {

  def main(args: Array[String]): Unit = {
    spark.sql("select 1").show()
  }
}
