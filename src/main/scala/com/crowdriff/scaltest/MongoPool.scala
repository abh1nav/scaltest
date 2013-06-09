package com.crowdriff.scaltest

import com.mongodb.{DBCollection, MongoClient, DB}
import java.net.UnknownHostException


object MongoPool {

  var mongo: MongoClient = null
  var db: DB = null

  def init() {
    try {
      mongo = new MongoClient("127.0.0.1")
      db = mongo.getDB("test")
    } catch {
      case uhe: UnknownHostException =>
    }
  }

  def getCollection(name: String) : DBCollection = {
    db.getCollection(name)
  }

  def destroy() {
    mongo.close()
  }

}
