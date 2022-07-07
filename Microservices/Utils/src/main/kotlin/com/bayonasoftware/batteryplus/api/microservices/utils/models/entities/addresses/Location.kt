package com.bayonasoftware.batteryplus.api.microservices.utils.models.entities.addresses

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import javax.persistence.*

@JsonIgnoreProperties("hibernateLazyInitializer")
@Entity
@Table(schema = "dbo", name = "Location")
class Location : java.io.Serializable {

  private val serialVersionUID = 1L

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "Municipality_ID")
  var municipality: Municipality? = null

  @Id
  @get:GeneratedValue(strategy = GenerationType.IDENTITY)
  @get:Column(name = "ID", nullable = false)
  var id:Int? = null

  @get:Column(name = "Code", length = 10)
  var code: String? = null

  @get:Column(name = "Name", nullable = false)
  var name: String? = null

  @JsonIgnore
  @OneToMany(fetch = FetchType.LAZY, mappedBy = "location")
  var colonies: MutableSet<Colony>? = null

}