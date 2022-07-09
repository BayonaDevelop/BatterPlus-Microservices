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
  var address: Address? = null

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "Commercial_Branch_ID", nullable = false)
  var commercialBranch: CommercialBranch? = null

  @Id
  @get:Column(name = "ID", unique = true, nullable = false)
  var id: Int? = null

  @get:Column(name = "Name", nullable = false)
  var name: String? = null

  @get:Column(name = "Active")
  var active = false

  @get:Column(name = "Latitude", precision = 16, scale = 10)
  var latitude: BigDecimal? = null

  @get:Column(name = "Longitude", precision = 16, scale = 10)
  var longitude: BigDecimal? = null

  @JsonIgnore
  @OneToMany(fetch = FetchType.LAZY, mappedBy = "warehouse")
  var warehouses: MutableSet<WarehouseSection>? = null
}