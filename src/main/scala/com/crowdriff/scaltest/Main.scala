package com.crowdriff.scaltest

object Main {

  def main(args: Array[String]) {
    println("Hello Scala!")

    MongoPool.init()
    val coll = MongoPool.getCollection("coll")
    val doc = coll.findOne
    println(doc.toString)
    MongoPool.destroy()
  }

}