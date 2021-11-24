package CRUD

import java.io._
import scala.io.Source
import akka.actor.ActorSystem
import akka.actor

object fileManager extends App{
  def createDir(name:String) = {
    val dir = new File(name)
    if(dir.exists()) println("Directory already exists")
    else { dir.mkdir()
      println("Directory created") }
}

def createFile(name:String) = {
  val newFile = new File(name)
  if(newFile.exists()) println("File already exists")
  else {
    val printWriter = new PrintWriter(newFile)
    printWriter.write("Hello this is rendom text for testing")
    printWriter.close() }
  }


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