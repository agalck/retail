import org.apache.spark.sql.SparkSession
import org.apache.spark.sql.functions._
object test {
  def main(args: Array[String]): Unit = {
    println("hello")
    println("hello1")

    // Create SparkSession
    val spark = SparkSession.builder()
      .appName("Spark356Test")
      .master("local[*]")   // Run locally with all cores
      .getOrCreate()

    import spark.implicits._

    val df = Seq(
      (1, "apple"),
      (2, "banana"),
      (3, "orange")
    ).toDF("id", "fruit")

    df.show()

    val upperDF = df.withColumn("fruit_upper", upper($"fruit"))
    upperDF.show()

    spark.stop()

  }

}
