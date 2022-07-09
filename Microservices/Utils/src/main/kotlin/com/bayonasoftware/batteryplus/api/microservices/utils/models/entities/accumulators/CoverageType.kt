package com.bayonasoftware.batteryplus.api.microservices.utils.models.entities.accumulators

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import javax.persistence.*

@JsonIgnoreProperties("hibernateLazyInitializer")
@Entity
@Table(schema = "dbo", name = "Coverage_Type")
class CoverageType : java.io.Serializable {

  val serialVersionUID = 1L

  @Id
  @get:GeneratedValue(strategy = GenerationType.IDENTITY)
  @get:Column(name = "ID", unique = true, nullable = false)
  var id: Int? = null

  @get:Column(name = "Name", nullable = false)
  var name: String? = null

  @JsonIgnore
  @OneToMany(fetch = FetchType.LAZY, mappedBy = "coverageType")
  var coverageBciBases: MutableSet<CoverageBciBase>? = null

  @JsonIgnore
  @OneToMany(fetch = FetchType.LAZY, mappedBy = "coverageType")
  var coverageBrands: MutableSet<CoverageBrand>? = null

  @JsonIgnore
  @OneToMany(fetch = FetchType.LAZY, mappedBy = "coverageType")
  var coverageSubBrands: MutableSet<CoverageSubBrand>? = null

}