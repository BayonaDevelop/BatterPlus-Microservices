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

  @JsonIgnore
  @OneToMany(fetch = FetchType.LAZY, mappedBy = "address")
  val commercialBranches: MutableSet<CommercialBranch>? = null

  @JsonIgnore
  @OneToMany(fetch = FetchType.LAZY, mappedBy = "address")
  val warehouses: MutableSet<Warehouse>? = null

  @JsonIgnore
  @OneToMany(fetch = FetchType.LAZY, mappedBy = "address")
  val persons: MutableSet<Person>? = null
}