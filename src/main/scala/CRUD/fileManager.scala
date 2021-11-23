package CRUD

import java.io._
import scala.io.Source

object fileManager extends App{
  val newFile = new File("Test1.txt")
  val printWriter = new PrintWriter(newFile)
  printWriter.write("Hello this is rendom text for testing")
  printWriter.close()

  read(newFile)
  modify(newFile)

  def read(file: File) = {
    val fileSource = Source.fromFile(file)
    for(line<-fileSource.getLines()){
      println(line)
    }
    fileSource.close()
  }

  def delete(file: File) = {
    val f1 = file
    if(f1.exists()){
      f1.delete()
      println("File " + f1 + " Deleted")
    }
  }

  def modify(file: File) = {
    Source.fromFile(file).getLines().foreach({ line => println("*** " + line + " ***")})
  }
}