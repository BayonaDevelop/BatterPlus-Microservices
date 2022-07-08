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
  val id: Int? = null

  @get:Column(name = "Name", nullable = false)
  val name: String? = null

  @JsonIgnore
  @OneToMany(fetch = FetchType.LAZY, mappedBy = "coverageType")
  val coverageBciBases: MutableSet<CoverageBciBase>? = null

  @JsonIgnore
  @OneToMany(fetch = FetchType.LAZY, mappedBy = "coverageType")
  val coverageBrands: MutableSet<CoverageBrand>? = null

  @JsonIgnore
  @OneToMany(fetch = FetchType.LAZY, mappedBy = "coverageType")
  val coverageSubBrands: MutableSet<CoverageSubBrand>? = null

}