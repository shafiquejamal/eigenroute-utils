package com.eigenroute.util.time

import java.time._

import com.google.inject.Singleton

@Singleton
class JavaTimeProviderImpl extends JavaTimeProvider {
  
  override def now() = OffsetDateTime.now()
  
}

object JavaTimeProviderImpl {
  
  def apply: JavaTimeProviderImpl = new JavaTimeProviderImpl()
  
}