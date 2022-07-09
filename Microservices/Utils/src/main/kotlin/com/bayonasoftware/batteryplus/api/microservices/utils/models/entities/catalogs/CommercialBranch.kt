package com.bayonasoftware.batteryplus.api.microservices.utils.models.entities.catalogs

import com.bayonasoftware.batteryplus.api.microservices.utils.models.entities.addresses.Address
import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import java.math.BigDecimal
import javax.persistence.*

@JsonIgnoreProperties("hibernateLazyInitializer")
@Entity
@Table(schema = "dbo", name = "Commercial_Branch")
class CommercialBranch : java.io.Serializable {

  private val serialVersionUID = 1L

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "Address_ID", nullable = false)
  var address: Address? = null

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "Matrix_ID")
  var matrix: CommercialBranch? = null

  @Id
  @get:GeneratedValue(strategy = GenerationType.IDENTITY)
  @get:Column(name = "ID", unique = true, nullable = false)
  var id: Int? = null

  @get:Column(name = "Name", nullable = false)
  var name: String? = null

  @get:Column(name = "Active")
  var active = false

  @get:Column(name = "Matrix")
  var _isMatrix = false

  @get:Column(name = "Latitude", precision = 16, scale = 10)
  var latitude: BigDecimal? = null

  @get:Column(name = "Longitude", precision = 16, scale = 10)
  var longitude: BigDecimal? = null

  @JsonIgnore
  @OneToMany(fetch = FetchType.LAZY, mappedBy = "matrix")
  var commercialBranches: MutableSet<CommercialBranch>? = null

  @JsonIgnore
  @OneToMany(fetch = FetchType.LAZY, mappedBy = "commercialBranch")
  var warehouses: MutableSet<Warehouse>? = null

  /*@JsonIgnore
  @OneToMany(fetch = FetchType.LAZY, mappedBy = "commercialBranch")
  var users: MutableSet<User>? = null*/
}