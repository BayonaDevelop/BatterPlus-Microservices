package com.bayonasoftware.batteryplus.api.microservices.utils.models.entities.catalogs

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import javax.persistence.*

@JsonIgnoreProperties("hibernateLazyInitializer")
@Entity
@Table(schema = "dbo", name = "Client")
class Client : java.io.Serializable {

  private val serialVersionUID = 1L

  @Id
  @get:GeneratedValue(strategy = GenerationType.IDENTITY)
  @get:Column(name = "ID", unique = true, nullable = false)
  val id: Int? = null

  @get:Column(name = "Code")
  var code: Int? = null

  @get:Column(name = "Name", nullable = false)
  var name: String? = null

  @get:Column(name = "Clasification")
  var clasification: String? = null

  @get:Column(name = "Seller")
  var seller: String? = null

  @get:Column(name = "Has_Veicle_Flet")
  var vehicleFlet: Boolean? = null

  @get:Column(name = "Active")
  val active = false

}