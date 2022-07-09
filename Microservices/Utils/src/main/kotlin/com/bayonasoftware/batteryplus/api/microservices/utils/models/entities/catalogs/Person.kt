package com.bayonasoftware.batteryplus.api.microservices.utils.models.entities.catalogs

import com.bayonasoftware.batteryplus.api.microservices.utils.models.entities.addresses.Address
import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import javax.persistence.*

@JsonIgnoreProperties("hibernateLazyInitializer")
@Entity
@Table(schema = "dbo", name = "Person")
class Person : java.io.Serializable {

  private val serialVersionUID = 1L

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "Address_ID", nullable = false)
  val address: Address? = null

  @Id
  @get:GeneratedValue(strategy = GenerationType.IDENTITY)
  @get:Column(name = "ID", unique = true, nullable = false)
  val id: Int? = null

  @get:Column(name = "Name", nullable = false)
  val name: String? = null

  @get:Column(name = "Last_Name", nullable = false)
  val lastName: String? = null

  @get:Column(name = "Second_Last_Name")
  val secondLastName: String? = null

  @get:Column(name = "INE")
  val ine: String? = null

  @get:Column(name = "Driver_License")
  val driverLicense: String? = null

  @get:Column(name = "Email")
  val email: String? = null

  @get:JsonIgnore
  @OneToMany(fetch = FetchType.LAZY, mappedBy = "person")
  val telephones: MutableSet<Telephone>? = null
  
}