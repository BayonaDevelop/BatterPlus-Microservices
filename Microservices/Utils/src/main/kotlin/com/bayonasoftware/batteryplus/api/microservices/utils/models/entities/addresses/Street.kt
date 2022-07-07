package com.bayonasoftware.batteryplus.api.microservices.utils.models.entities.addresses

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import javax.persistence.*

@JsonIgnoreProperties("hibernateLazyInitializer")
@Entity
@Table(schema = "dbo", name = "Street")
class Street : java.io.Serializable {

  private val serialVersionUID = 1L

  @get:ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "Colony_ID")
  var colony: Colony? = null

  @get:Id
  @get:GeneratedValue(strategy = GenerationType.IDENTITY)
  @get:Column(name = "ID", nullable = false)
  var id:Int? = null

  @get:Column(name = "Name", nullable = false)
  var name: String? = null

  @get:JsonIgnore
  @get:OneToMany(fetch = FetchType.LAZY, mappedBy = "street")
  var addresses: MutableSet<Address>? = null

  @get:JsonIgnore
  @get:OneToMany(fetch = FetchType.LAZY, mappedBy = "streetA")
  var addressesA: MutableSet<Address>? = null

  @get:JsonIgnore
  @get:OneToMany(fetch = FetchType.LAZY, mappedBy = "streetB")
  var addressesB: MutableSet<Address>? = null
}