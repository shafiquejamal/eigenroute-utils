package com.github.shafiquejamal.util.time

import com.google.inject.Singleton
import org.joda.time.DateTime

@Singleton
class TimeProviderImpl extends TimeProvider {

  override def now(): DateTime = DateTime.now()

}

object TimeProviderImpl {
  def apply() = new TimeProviderImpl()
}
