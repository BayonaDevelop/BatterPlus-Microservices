package com.bayonasoftware.batteryplus.api.microservices.utils.models.entities.addresses

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import javax.persistence.*

@JsonIgnoreProperties("hibernateLazyInitializer")
@Entity
@Table(schema = "dbo", name = "City")
class City : java.io.Serializable {

  private val serialVersionUID = 1L

  @get:ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "country_ID")
  var country: Country? = null

  @get:Id
  @get:GeneratedValue(strategy = GenerationType.IDENTITY)
  @get:Column(name = "ID", nullable = false)
  var id:Int? = null

  @get:Column(name = "Code", length = 10)
  var code: String? = null

  @get:Column(name = "Name", nullable = false)
  var name: String? = null

  @get:Column(name = "Coat_Of_Arms")
  var coatOfArms: String? = null

  @get:JsonIgnore
  @get:OneToMany(fetch = FetchType.LAZY, mappedBy = "city")
  var municipalities: MutableSet<Municipality>? = null

}
