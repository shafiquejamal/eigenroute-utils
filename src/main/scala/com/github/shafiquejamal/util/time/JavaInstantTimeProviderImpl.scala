package com.github.shafiquejamal.util.time

import java.time.Instant

import com.google.inject.Singleton

@Singleton
class JavaInstantTimeProviderImpl extends  JavaInstantTimeProvider {
  
  override def now(): Instant = Instant.now()
  
}
