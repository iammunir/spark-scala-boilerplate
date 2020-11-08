import org.apache.log4j.{Level, Logger}
import org.apache.spark.{SparkConf, SparkContext}

object Main {
  def main(args: Array[String]): Unit = {

    // set logger level
    Logger.getLogger("org").setLevel(Level.ERROR)

    // create context
    val conf = new SparkConf().setAppName("Main").setMaster("local[*]")
    val sc = new SparkContext(conf)


    // get the data
    val data = Array(24, 53, 13, 23, 95, 56, 76)
    val dataRdd = sc.parallelize(data)

    // add index
    val dataWithIndex = dataRdd.zipWithIndex()
    dataWithIndex.collect().foreach(v => println(v._1, v._2))

  }
}