package com.bayonasoftware.batteryplus.api.microservices.utils.models.entities.catalogs

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import javax.persistence.*

@JsonIgnoreProperties("hibernateLazyInitializer")
@Entity
@Table(schema = "dbo", name = "Telephone")
class Telephone : java.io.Serializable {

  private val serialVersionUID = 1L

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "Person_ID", nullable = false)
  val person: Person? = null

  @Id
  @get:GeneratedValue(strategy = GenerationType.IDENTITY)
  @get:Column(name = "ID", unique = true, nullable = false)
  val id: Int? = null

  @get:Column(name = "Number")
  val number: String? = null

  @get:Column(name = "Extensions")
  val extensions: String? = null

}