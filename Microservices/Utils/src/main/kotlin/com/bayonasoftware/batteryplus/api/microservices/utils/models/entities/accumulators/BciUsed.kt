package com.bayonasoftware.batteryplus.api.microservices.utils.models.entities.accumulators

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import javax.persistence.*

@JsonIgnoreProperties("hibernateLazyInitializer")
@Entity
@Table(schema = "dbo", name = "Bci_Used")
class BciUsed : java.io.Serializable {

  val serialVersionUID = 1L

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "Bci_Base_ID", nullable = false)
  var bciBase: BciBase? = null

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "Brand_ID", nullable = false)
  var brand: Brand? = null

  @Id
  @get:GeneratedValue(strategy = GenerationType.IDENTITY)
  @get:Column(name = "ID", unique = true, nullable = false)
  var id: Int? = null

  @get:Column(name = "Amperage", nullable = false)
  var amperage: String? = null

  @get:Column(name = "Active")
  var active = false

  @JsonIgnore
  @OneToMany(fetch = FetchType.LAZY, mappedBy = "bciUsed")
  var accumulators: MutableSet<Accumulator>? = null
}