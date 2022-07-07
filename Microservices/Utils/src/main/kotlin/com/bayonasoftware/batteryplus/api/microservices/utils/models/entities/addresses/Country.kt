package com.bayonasoftware.batteryplus.api.microservices.utils.models.entities.addresses

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import javax.persistence.*

@JsonIgnoreProperties("hibernateLazyInitializer")
@Entity
@Table(schema = "dbo", name = "Country")
class Country : java.io.Serializable {

  private val serialVersionUID = 1L

  @Id
  @get:GeneratedValue(strategy = GenerationType.IDENTITY)
  @get:Column(name = "ID", nullable = false)
  var id: Int? = null

  @get:Column(name = "Code", length = 10)
  var code: String? = null

  @get:Column(name = "Code_ISO2", length = 10)
  var codeISO2: String? = null

  @get:Column(name = "Name", nullable = false)
  var name: String? = null

  @get:Column(name = "Postal_Code_Regex")
  var postalCodeRegex: String? = null

  @get:Column(name = "Sat_Registry_Regex")
  var satRegistryRegex: String? = null

  @get:Column(name = "Region", length = 60)
  var region: String? = null

  @get:Column(name = "Coat_Of_Arms")
  var coatOfArms: String? = null

  @get:Column(name = "Flag")
  var flag: String? = null

  @JsonIgnore
  @OneToMany(fetch = FetchType.LAZY, mappedBy = "country")
  var cities: MutableSet<City>? = null

}