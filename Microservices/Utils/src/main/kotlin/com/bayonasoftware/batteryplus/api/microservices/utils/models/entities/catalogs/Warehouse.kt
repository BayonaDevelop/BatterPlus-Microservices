package com.bayonasoftware.batteryplus.api.microservices.utils.models.entities.catalogs

import com.bayonasoftware.batteryplus.api.microservices.utils.models.entities.addresses.Address
import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import java.math.BigDecimal
import javax.persistence.*

@JsonIgnoreProperties("hibernateLazyInitializer")
@Entity
@Table(schema = "dbo", name = "Warehouse")
class Warehouse : java.io.Serializable {

  val serialVersionUID = 1L

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "Address_ID", nullable = false)
  val address: Address? = null

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "Commercial_Branch_ID", nullable = false)
  val commercialBranch: CommercialBranch? = null

  @Id
  @get:Column(name = "ID", unique = true, nullable = false)
  val id: Int? = null

  @get:Column(name = "Name", nullable = false)
  val name: String? = null

  @get:Column(name = "Active")
  val active = false

  @get:Column(name = "Latitude", precision = 16, scale = 10)
  val latitude: BigDecimal? = null

  @get:Column(name = "Longitude", precision = 16, scale = 10)
  val longitude: BigDecimal? = null

  @JsonIgnore
  @OneToMany(fetch = FetchType.LAZY, mappedBy = "warehouse")
  val warehouses: MutableSet<WarehouseSection>? = null
}