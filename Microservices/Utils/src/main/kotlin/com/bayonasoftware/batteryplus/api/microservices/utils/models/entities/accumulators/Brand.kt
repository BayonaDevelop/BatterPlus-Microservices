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
  var id: Int? = null

  @get:Column(name = "Name", nullable = false)
  var name: String? = null

  @get:Column(name = "Initials", length = 10)
  var initials: String? = null

  @get:Column(name = "Own")
  var own = false

  @get:Column(name = "Active")
  var active = false

  @JsonIgnore
  @OneToMany(fetch = FetchType.LAZY, mappedBy = "brand")
  var subBrands: MutableSet<SubBrand>? = null

  @JsonIgnore
  @OneToMany(fetch = FetchType.LAZY, mappedBy = "brand")
  var bciUseds: MutableSet<BciUsed>? = null

  @OneToMany(fetch = FetchType.LAZY, mappedBy = "brand")
  var bciWarranties: MutableSet<BciWarranty>? = null

  @OneToMany(fetch = FetchType.LAZY, mappedBy = "brand")
  var coverages: MutableSet<CoverageBrand>? = null

}