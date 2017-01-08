package com.eigenroute.id

import java.util.UUID

@Singleton
class UUIDProviderImpl extends UUIDProvider {

  override def randomUUID(): UUID = UUID.randomUUID()
  
}

object UUIDProviderImpl {
  def apply() = new UUIDProviderImpl()
}
