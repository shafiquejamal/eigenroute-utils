package com.eigenroute.util.time

import org.joda.time.DateTime

trait TimeProvider {

  def now(): DateTime

}
