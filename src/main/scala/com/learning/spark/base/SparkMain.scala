package com.learning.spark.base

import org.apache.spark.sql.SparkSession

trait SparkMain {

    val spark: SparkSession = SparkSession.builder()
      .appName("test_timestamp")
      .master("local")
      .getOrCreate()
}
