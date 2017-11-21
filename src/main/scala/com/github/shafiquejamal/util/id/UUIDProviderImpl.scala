package com.github.shafiquejamal.util.id

import java.util.UUID

import com.google.inject.Singleton

@Singleton
class UUIDProviderImpl extends UUIDProvider {

  override def randomUUID(): UUID = UUID.randomUUID()
  
}

object UUIDProviderImpl {
  def apply() = new UUIDProviderImpl()
}
