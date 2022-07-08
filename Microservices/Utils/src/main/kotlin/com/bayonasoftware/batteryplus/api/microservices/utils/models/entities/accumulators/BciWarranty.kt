package com.bayonasoftware.batteryplus.api.microservices.utils.models.entities.accumulators

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import javax.persistence.*

@JsonIgnoreProperties("hibernateLazyInitializer")
@Entity
@Table(schema = "dbo", name = "Bci_Warranty")
class BciWarranty : java.io.Serializable {

  val serialVersionUID = 1L

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "Bci_Base_ID", nullable = false)
  val bciBase: BciBase? = null

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "Line_ID", nullable = false)
  val line: Line? = null

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "Brand_ID", nullable = false)
  val brand: Brand? = null

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "Sub_Brand_ID", nullable = false)
  val subBrand: SubBrand? = null

  @Id
  @get:GeneratedValue(strategy = GenerationType.IDENTITY)
  @get:Column(name = "ID", unique = true, nullable = false)
  val id: Int? = null

  @get:Column(name = "Amperage", nullable = false)
  val amperage: String? = null

  @get:Column(name = "Active")
  val active = false

  @JsonIgnore
  @OneToMany(fetch = FetchType.LAZY, mappedBy = "bciWarranty")
  val accumulators: MutableSet<Accumulator>? = null
}