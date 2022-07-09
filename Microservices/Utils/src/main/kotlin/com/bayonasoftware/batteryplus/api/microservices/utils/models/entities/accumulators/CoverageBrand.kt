package com.bayonasoftware.batteryplus.api.microservices.utils.models.entities.accumulators

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import javax.persistence.*

@JsonIgnoreProperties("hibernateLazyInitializer")
@Entity
@Table(schema = "dbo", name = "Coverage_Brand")
class CoverageBrand : java.io.Serializable {

  val serialVersionUID = 1L

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "Coverage_Type_ID", nullable = false)
  var coverageType: CoverageType? = null

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "Brand_ID", nullable = false)
  var brand: Brand? = null

  @Id
  @get:GeneratedValue(strategy = GenerationType.IDENTITY)
  @get:Column(name = "ID", unique = true, nullable = false)
  var id: Int? = null

  @Column(name = "Monts_Start", nullable = false)
  var montsStart: Int? = null

  @Column(name = "Monts_End", nullable = false)
  var montsEnd: Int? = null

  @Column(name = "Percentaje", nullable = false)
  var percentaje: Int? = null

}