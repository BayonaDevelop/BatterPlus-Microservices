package com.bayonasoftware.batteryplus.api.microservices.utils.models.entities.addresses

import com.bayonasoftware.batteryplus.api.microservices.utils.models.entities.catalogs.CommercialBranch
import com.bayonasoftware.batteryplus.api.microservices.utils.models.entities.catalogs.Person
import com.bayonasoftware.batteryplus.api.microservices.utils.models.entities.catalogs.Warehouse
import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import javax.persistence.*

@JsonIgnoreProperties("hibernateLazyInitializer")
@Entity
@Table(schema = "dbo", name = "Address")
class Address : java.io.Serializable {

  private val serialVersionUID = 1L

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "Street_ID")
  var street: Street? = null

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "Street_ID_A")
  var streetA: Street? = null

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "Street_ID_B")
  var streetB: Street? = null

  @Id
  @get:GeneratedValue(strategy = GenerationType.IDENTITY)
  @get:Column(name = "ID", nullable = false)
  var id:Int? = null

  @get:Column(name = "Internal_Number", length = 60)
  var internalNumber: String? = null

  @get:Column(name = "External_Number", length = 60)
  var externalNumber: String? = null

  @get:Column(name = "Reference")
  var reference: String? = null

  @JsonIgnore
  @OneToMany(fetch = FetchType.LAZY, mappedBy = "address")
  var persons: MutableSet<Person>? = null

  @JsonIgnore
  @OneToMany(fetch = FetchType.LAZY, mappedBy = "address")
  var commercialBranches: MutableSet<CommercialBranch>? = null

  @JsonIgnore
  @OneToMany(fetch = FetchType.LAZY, mappedBy = "address")
  var warehouses: MutableSet<Warehouse>? = null

}