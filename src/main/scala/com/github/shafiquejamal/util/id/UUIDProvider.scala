package com.github.shafiquejamal.util.id

import java.util.UUID

trait UUIDProvider {

  def randomUUID(): UUID

}
