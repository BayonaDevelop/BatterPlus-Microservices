package com.bayonasoftware.batteryplus.api.microservices.utils.models.entities.addresses

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import javax.persistence.*

@JsonIgnoreProperties("hibernateLazyInitializer")
@Entity
@Table(schema = "dbo", name = "Colony")
class Colony : java.io.Serializable {

  private val serialVersionUID = 1L

  @get:ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "Location_ID")
  var location: Location? = null

  @get:Id
  @get:GeneratedValue(strategy = GenerationType.IDENTITY)
  @get:Column(name = "ID", nullable = false)
  var id:Int? = null

  @get:Column(name = "Zip_Code", length = 20)
  var zipCode: String? = null

  @get:Column(name = "Name", nullable = false)
  var name: String? = null

  @get:JsonIgnore
  @get:OneToMany(fetch = FetchType.LAZY, mappedBy = "colony")
  var streets: MutableSet<Street>? = null

}