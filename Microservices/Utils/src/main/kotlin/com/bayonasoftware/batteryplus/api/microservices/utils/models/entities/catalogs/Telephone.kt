package com.bayonasoftware.batteryplus.api.microservices.utils.models.entities.catalogs

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import javax.persistence.*

@JsonIgnoreProperties("hibernateLazyInitializer")
@Entity
@Table(schema = "dbo", name = "Person")
class Telephone : java.io.Serializable {

  private val serialVersionUID = 1L

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "Person_ID", nullable = false)
  private val person: Person? = null

  @Id
  @get:GeneratedValue(strategy = GenerationType.IDENTITY)
  @get:Column(name = "ID", unique = true, nullable = false)
  private val id: Int? = null

  @get:Column(name = "Number")
  private val number: String? = null

  @get:Column(name = "Extensions")
  private val extensions: String? = null

}