package com.bayonasoftware.batteryplus.api.microservices.utils.models.entities.oauth

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import javax.persistence.*

@JsonIgnoreProperties("hibernateLazyInitializer")
@Entity
@Table(schema = "dbo", name = "Rol")
class Rol : java.io.Serializable {

  val serialVersionUID = 1L

  @Id
  @get:GeneratedValue(strategy = GenerationType.IDENTITY)
  @get:Column(name = "ID", unique = true, nullable = false)
  val id: Int? = null

  @get:Column(name = "Name", nullable = false)
  val name: String? = null

  @get:Column(name = "Description")
  val description: String? = null
  
}