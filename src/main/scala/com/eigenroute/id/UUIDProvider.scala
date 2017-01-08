package com.eigenroute.id

import java.util.UUID

trait UUIDProvider {

  def randomUUID(): UUID

}
