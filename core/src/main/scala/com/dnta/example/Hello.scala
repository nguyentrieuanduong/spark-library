package com.dnta.example

import org.apache.spark.internal.Logging

object Hello extends Greeting with App with Logging {
  logInfo(greeting)
}

trait Greeting {
  lazy val greeting: String = "hello"
}
