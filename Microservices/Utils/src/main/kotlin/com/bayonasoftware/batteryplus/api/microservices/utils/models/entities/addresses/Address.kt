package com.bayonasoftware.batteryplus.api.microservices.utils.models.entities.addresses

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import javax.persistence.*

@JsonIgnoreProperties("hibernateLazyInitializer")
@Entity
@Table(schema = "dbo", name = "Street")
class Address : java.io.Serializable {

  private val serialVersionUID = 1L

  @get:ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "Street_ID")
  var street: Street? = null

  @get:ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "Street_ID_A")
  var streetA: Street? = null

  @get:ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "Street_ID_B")
  var streetB: Street? = null

  @get:Id
  @get:GeneratedValue(strategy = GenerationType.IDENTITY)
  @get:Column(name = "ID", nullable = false)
  var id:Int? = null
}