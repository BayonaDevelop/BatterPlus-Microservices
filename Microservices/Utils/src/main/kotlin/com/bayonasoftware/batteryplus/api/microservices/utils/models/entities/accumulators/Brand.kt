package com.bayonasoftware.batteryplus.api.microservices.utils.models.entities.accumulators

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import javax.persistence.*

@JsonIgnoreProperties("hibernateLazyInitializer")
@Entity
@Table(schema = "dbo", name = "Brand")
class Brand : java.io.Serializable {

  val serialVersionUID = 1L

  @Id
  @get:GeneratedValue(strategy = GenerationType.IDENTITY)
  @get:Column(name = "ID", unique = true, nullable = false)
  val id: Int? = null

  @get:Column(name = "Name", nullable = false)
  val name: String? = null

  @get:Column(name = "Initials", length = 10)
  val initials: String? = null

  @get:Column(name = "Own")
  val own = false

  @get:Column(name = "Active")
  val active = false

  @JsonIgnore
  @OneToMany(fetch = FetchType.LAZY, mappedBy = "brand")
  val subBrands: MutableSet<SubBrand>? = null

  @JsonIgnore
  @OneToMany(fetch = FetchType.LAZY, mappedBy = "brand")
  val bciUseds: MutableSet<BciUsed>? = null

  @OneToMany(fetch = FetchType.LAZY, mappedBy = "brand")
  val bciWarranties: MutableSet<BciWarranty>? = null

  @OneToMany(fetch = FetchType.LAZY, mappedBy = "brand")
  val coverages: MutableSet<CoverageBrand>? = null

}