package com.bayonasoftware.batteryplus.api.microservices.utils.models.entities.catalogs

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

@JsonIgnoreProperties("hibernateLazyInitializer")
@Entity
@Table(schema = "dbo", name = "Warehouse_Section")
class WarehouseSection : java.io.Serializable {

  private val serialVersionUID = 1L

  @Id
  @get:Column(name = "ID", unique = true, nullable = false)
  val id: Int? = null

  @get:Column(name = "Name", nullable = false)
  val name: String? = null
}