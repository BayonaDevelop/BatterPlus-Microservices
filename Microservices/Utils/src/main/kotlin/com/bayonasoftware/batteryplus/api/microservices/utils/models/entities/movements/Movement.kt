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
  var origin: WarehouseSection? = null

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "Warehouse_Section_Destination_ID")
  var destination: WarehouseSection? = null

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "User_ID", nullable = false)
  var user: User? = null

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "Serving_User_ID", nullable = false)
  var servingUser: User? = null

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "Client_ID")
  var client: Client? = null

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "Person_ID")
  var person: Person? = null

  @Id
  @get:GeneratedValue(strategy = GenerationType.IDENTITY)
  @get:Column(name = "ID", unique = true, nullable = false)
  var id: Int? = null

  @Column(name = "Type", nullable = false)
  var type: Short = 0

  @Column(name = "Status")
  var status: Short? = null

  @Temporal(TemporalType.TIMESTAMP)
  @Column(name = "Reception_Date", length = 23)
  var receptionDate: Date? = null

  @Column(name = "Comments")
  var comments: String? = null
}