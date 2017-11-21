package com.github.shafiquejamal.util.time

import java.time.Instant

trait JavaInstantTimeProvider {
  
  def now(): Instant
  
}
