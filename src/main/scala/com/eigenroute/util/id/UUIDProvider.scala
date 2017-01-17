package com.eigenroute.util.id

import java.util.UUID

trait UUIDProvider {

  def randomUUID(): UUID

}
