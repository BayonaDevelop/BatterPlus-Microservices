package com.bayonasoftware.batteryplus.api.microservices.utils.models.entities.accumulators

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import javax.persistence.*

@JsonIgnoreProperties("hibernateLazyInitializer")
@Entity
@Table(schema = "dbo", name = "Bci_Base")
class BciBase : java.io.Serializable {

  val serialVersionUID = 1L

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "Agrupation_ID", nullable = false)
  val agrupation: Agrupation? = null

  @Id
  @get:GeneratedValue(strategy = GenerationType.IDENTITY)
  @get:Column(name = "ID", unique = true, nullable = false)
  val id: Int? = null

  @get:Column(name = "Name", nullable = false)
  val name: String? = null

  @get:Column(name = "Active")
  val active = false

  @JsonIgnore
  @OneToMany(fetch = FetchType.LAZY, mappedBy = "bciBase")
  val bciUseds: MutableSet<BciUsed>? = null

  @JsonIgnore
  @OneToMany(fetch = FetchType.LAZY, mappedBy = "bciBase")
  val bciWarranties: MutableSet<BciWarranty>? = null

  @JsonIgnore
  @OneToMany(fetch = FetchType.LAZY, mappedBy = "bciBase")
  val coverages: MutableSet<CoverageBciBase>? = null
}