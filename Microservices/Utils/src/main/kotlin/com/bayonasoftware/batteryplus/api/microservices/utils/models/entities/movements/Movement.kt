package com.bayonasoftware.batteryplus.api.microservices.utils.models.entities.movements

import com.bayonasoftware.batteryplus.api.microservices.utils.models.entities.catalogs.Client
import com.bayonasoftware.batteryplus.api.microservices.utils.models.entities.catalogs.Person
import com.bayonasoftware.batteryplus.api.microservices.utils.models.entities.catalogs.WarehouseSection
import com.bayonasoftware.batteryplus.api.microservices.utils.models.entities.oauth.User
import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import java.util.Date
import javax.persistence.*


@JsonIgnoreProperties("hibernateLazyInitializer")
@Entity
@Table(schema = "dbo", name = "Movement")
class Movement : java.io.Serializable {

  val serialVersionUID = 1L

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "Warehouse_Section_Origin_ID", nullable = false)
  val origin: WarehouseSection? = null

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "Warehouse_Section_Destination_ID")
  val destination: WarehouseSection? = null

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "User_ID", nullable = false)
  val user: User? = null

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "Serving_User_ID", nullable = false)
  val servingUser: User? = null

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "Client_ID")
  val client: Client? = null

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "Person_ID")
  val person: Person? = null

  @Id
  @get:GeneratedValue(strategy = GenerationType.IDENTITY)
  @get:Column(name = "ID", unique = true, nullable = false)
  val id: Int? = null

  @Column(name = "Type", nullable = false)
  val type: Short = 0

  @Column(name = "Status")
  val status: Short? = null

  @Temporal(TemporalType.TIMESTAMP)
  @Column(name = "Reception_Date", length = 23)
  val receptionDate: Date? = null

  @Column(name = "Comments")
  val comments: String? = null
}