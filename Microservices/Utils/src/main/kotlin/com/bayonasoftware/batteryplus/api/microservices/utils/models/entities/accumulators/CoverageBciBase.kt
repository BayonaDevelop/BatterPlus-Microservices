package com.bayonasoftware.batteryplus.api.microservices.utils.models.entities.accumulators

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import javax.persistence.*

@JsonIgnoreProperties("hibernateLazyInitializer")
@Entity
@Table(schema = "dbo", name = "Coverage_Bci_Base")
class CoverageBciBase : java.io.Serializable {

  val serialVersionUID = 1L

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "Coverage_Type_ID", nullable = false)
  val coverageType: CoverageType? = null

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "Bci_Base_ID", nullable = false)
  val bciBase: BciBase? = null

  @Id
  @get:GeneratedValue(strategy = GenerationType.IDENTITY)
  @get:Column(name = "ID", unique = true, nullable = false)
  val id: Int? = null

  @Column(name = "Monts_Start", nullable = false)
  val montsStart: Int? = null

  @Column(name = "Monts_End", nullable = false)
  val montsEnd: Int? = null

  @Column(name = "Percentaje", nullable = false)
  val percentaje: Int? = null

}