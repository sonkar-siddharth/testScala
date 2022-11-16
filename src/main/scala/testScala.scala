import func.candidate_func
import org.apache.log4j.Logger
import org.apache.spark.sql.SparkSession

object testScala {
  def main(args: Array[String]): Unit = {

    //val logger = Logger.getLogger("Testing Scala")

    //logger.info("*************************Starting Spark Session***************************")
    //val spark = SparkSession.builder().appName("JsonUploaderJob").master("local[1]").enableHiveSupport().getOrCreate()

    //val df = spark.read.format("csv").option("header",true).load("src/main/resources/test.csv")
    //df.createOrReplaceTempView("temp")
    //spark.sql("select * from temp").show()

    candidate_func(10)


  }
}
