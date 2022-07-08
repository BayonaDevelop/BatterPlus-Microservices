package com.bayonasoftware.batteryplus.api.microservices.utils.models.entities.oauth

import com.bayonasoftware.batteryplus.api.microservices.utils.models.entities.catalogs.CommercialBranch
import com.bayonasoftware.batteryplus.api.microservices.utils.models.entities.catalogs.Person
import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import javax.persistence.*

@JsonIgnoreProperties("hibernateLazyInitializer")
@Entity
@Table(schema = "dbo", name = "User")
class User : java.io.Serializable {

  private val serialVersionUID = 1L

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "Commercial_Branch_ID")
  val commercialBranch: CommercialBranch? = null

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "Person_ID", nullable = false)
  val person: Person? = null

  @Id
  @get:GeneratedValue(strategy = GenerationType.IDENTITY)
  @get:Column(name = "ID", unique = true, nullable = false)
  val id: Int? = null

  @get:Column(name = "Name", nullable = false)
  val name: String? = null

  @get:Column(name = "Password", nullable = false)
  val password: String? = null

  @get:Column(name = "Attempts", nullable = false)
  val attempts: Int? = null

  @get:Column(name = "Enabled", nullable = false)
  val enabled = false

  @ManyToMany(fetch = FetchType.EAGER, cascade = [CascadeType.ALL])
  @JoinTable(
    schema = "dbo",
    name = "Users_Roles",
    joinColumns = [JoinColumn(name = "User_ID", referencedColumnName = "ID")],
    inverseJoinColumns = [JoinColumn(name = "Rol_ID", referencedColumnName = "ID")]
  )
  val roles: Set<Rol>? = null
  
}