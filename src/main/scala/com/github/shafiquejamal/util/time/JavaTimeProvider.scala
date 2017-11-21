package com.github.shafiquejamal.util.time

import java.time.{Instant, OffsetDateTime}

trait JavaTimeProvider {
  
  def now(): OffsetDateTime
  
}
