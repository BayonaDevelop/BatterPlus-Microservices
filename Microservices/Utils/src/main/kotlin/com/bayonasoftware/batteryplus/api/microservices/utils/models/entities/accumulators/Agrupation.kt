package com.bayonasoftware.batteryplus.api.microservices.utils.models.entities.accumulators

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import javax.persistence.*

@JsonIgnoreProperties("hibernateLazyInitializer")
@Entity
@Table(schema = "dbo", name = "Agrupation")
class Agrupation : java.io.Serializable {

  val serialVersionUID = 1L

  @Id
  @get:GeneratedValue(strategy = GenerationType.IDENTITY)
  @get:Column(name = "ID", unique = true, nullable = false)
  var id: Int? = null

  @get:Column(name = "Name", nullable = false)
  var name: String? = null

  @get:Column(name = "Letter", length = 10)
  var letter: String? = null

  @get:Column(name = "Color", length = 80)
  var color: String? = null

  @get:Column(name = "Active")
  var active = false

  @JsonIgnore
  @OneToMany(fetch = FetchType.LAZY, mappedBy = "agrupation")
  var bciBases: MutableSet<BciBase>? = null
}