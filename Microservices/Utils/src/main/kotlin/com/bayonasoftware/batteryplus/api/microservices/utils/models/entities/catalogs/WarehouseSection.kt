package com.bayonasoftware.batteryplus.api.microservices.utils.models.entities.catalogs

import com.bayonasoftware.batteryplus.api.microservices.utils.models.entities.addresses.Address
import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import javax.persistence.*

@JsonIgnoreProperties("hibernateLazyInitializer")
@Entity
@Table(schema = "dbo", name = "Warehouse_Section")
class WarehouseSection : java.io.Serializable {

  private val serialVersionUID = 1L

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "Warehouse_ID", nullable = false)
  val warehouse: Warehouse? = null

  @Id
  @get:Column(name = "ID", unique = true, nullable = false)
  val id: Int? = null

  @get:Column(name = "Name", nullable = false)
  val name: String? = null
}