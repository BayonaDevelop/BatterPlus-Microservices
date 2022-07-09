package com.bayonasoftware.batteryplus.api.microservices.utils.models.entities.movements

import com.bayonasoftware.batteryplus.api.microservices.utils.models.entities.accumulators.Accumulator
import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import javax.persistence.*

@JsonIgnoreProperties("hibernateLazyInitializer")
@Entity
@Table(schema = "dbo", name = "Movement_Detail", uniqueConstraints = [UniqueConstraint(columnNames = ["Movement_ID", "Accumulator_ID"])])
class MovementDetail : java.io.Serializable {

  val serialVersionUID = 1L

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "Movement_ID")
  var movement: Movement? = null

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "Accumulator_ID")
  var accumulator: Accumulator? = null

  @Id
  @get:GeneratedValue(strategy = GenerationType.IDENTITY)
  @get:Column(name = "ID", unique = true, nullable = false)
  var id: Int? = null
}