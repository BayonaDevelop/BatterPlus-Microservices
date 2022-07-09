package com.bayonasoftware.batteryplus.api.microservices.utils.models.entities.accumulators

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import javax.persistence.*

@JsonIgnoreProperties("hibernateLazyInitializer")
@Entity
@Table(schema = "dbo", name = "Sub_Brand")
class SubBrand : java.io.Serializable {

  val serialVersionUID = 1L

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "Brand_ID", nullable = false)
  var brand: Brand? = null

  @Id
  @get:GeneratedValue(strategy = GenerationType.IDENTITY)
  @get:Column(name = "ID", unique = true, nullable = false)
  var id: Int? = null

  @get:Column(name = "Name", nullable = false)
  var name: String? = null

  @get:Column(name = "Initials", length = 10)
  var initials: String? = null

  @get:Column(name = "Suffix", length = 10)
  var suffix: String? = null

  @get:Column(name = "Active")
  var active = false

  @JsonIgnore
  @OneToMany(fetch = FetchType.LAZY, mappedBy = "subBrand")
  var bciWarranties: MutableSet<BciWarranty>? = null

  @JsonIgnore
  @OneToMany(fetch = FetchType.LAZY, mappedBy = "subBrand")
  var coverageSubBrands: MutableSet<CoverageSubBrand>? = null

}