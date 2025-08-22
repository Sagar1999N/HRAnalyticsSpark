package com.sagar.hranalytics;

import org.apache.spark.sql.Dataset;
import org.apache.spark.sql.Row;
import org.apache.spark.sql.SparkSession;

public class HRAnalytics {

	public static void main(String[] args) {
		System.out.println("Started");
		SparkSession sp = SparkSession.builder().appName("HRAnalytics").master("local[*]").getOrCreate();
		Dataset<Row> employees = sp.read().option("header", true).csv("./data/input/employees.csv");
		employees.show(100, false);
		System.out.println("Ended");
	}

}
