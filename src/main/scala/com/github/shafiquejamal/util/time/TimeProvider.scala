package com.github.shafiquejamal.util.time

import org.joda.time.DateTime

trait TimeProvider {

  def now(): DateTime

}
