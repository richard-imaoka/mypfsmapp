package com.mypkg

import akka.actor.{ActorSystem, Props}
import com.typesafe.config.ConfigFactory

object MyPFSMApp {

  def main(args: Array[String]): Unit = {
    val config = ConfigFactory.load()
    implicit val system = ActorSystem("MyPFSMApp", config)

    val actor = system.actorOf(Props(new MyPFSM()))
  }
}
