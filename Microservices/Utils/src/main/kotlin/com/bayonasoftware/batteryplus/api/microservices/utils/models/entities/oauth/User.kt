package com.bayonasoftware.batteryplus.api.microservices.utils.models.entities.oauth

import com.bayonasoftware.batteryplus.api.microservices.utils.models.entities.catalogs.CommercialBranch
import com.bayonasoftware.batteryplus.api.microservices.utils.models.entities.catalogs.Person
import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import javax.persistence.*

@JsonIgnoreProperties("hibernateLazyInitializer")
@Entity
@Table(schema = "dbo", name = "Users")
class User : java.io.Serializable {

  private val serialVersionUID = 1L

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "Commercial_Branch_ID")
  var commercialBranch: CommercialBranch? = null

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "Person_ID", nullable = false)
  var person: Person? = null

  @Id
  @get:GeneratedValue(strategy = GenerationType.IDENTITY)
  @get:Column(name = "ID", unique = true, nullable = false)
  var id: Int? = null

  @get:Column(name = "Name", nullable = false)
  var name: String? = null

  @get:Column(name = "Password", nullable = false)
  var password: String? = null

  @get:Column(name = "Attempts", nullable = false)
  var attempts: Int? = null

  @get:Column(name = "Enabled", nullable = false)
  var enabled = false

  @ManyToMany(fetch = FetchType.EAGER, cascade = [CascadeType.ALL])
  @JoinTable(
    schema = "dbo",
    name = "Users_Roles",
    joinColumns = [JoinColumn(name = "User_ID", referencedColumnName = "ID")],
    inverseJoinColumns = [JoinColumn(name = "Rol_ID", referencedColumnName = "ID")]
  )
  var roles: Set<Rol>? = null
  
}