package com.eigenroute.util.time

import java.time.{Instant, OffsetDateTime}

trait JavaTimeProvider {
  
  def now(): OffsetDateTime
  
}
