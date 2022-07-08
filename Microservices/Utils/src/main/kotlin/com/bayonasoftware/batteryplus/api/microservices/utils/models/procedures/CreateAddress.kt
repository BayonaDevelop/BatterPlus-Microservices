package com.bayonasoftware.batteryplus.api.microservices.utils.models.procedures

import javax.persistence.*

@Entity
@NamedStoredProcedureQueries(
  NamedStoredProcedureQuery(
    name = "CreateAddress",
    procedureName = "CreateAddress",
    parameters = [StoredProcedureParameter(
      mode = ParameterMode.IN,
      name = "MunicipalityID",
      type = Int::class
    ), StoredProcedureParameter(
      mode = ParameterMode.IN,
      name = "Location",
      type = String::class
    ), StoredProcedureParameter(
      mode = ParameterMode.IN,
      name = "ZipCode",
      type = String::class
    ), StoredProcedureParameter(
      mode = ParameterMode.IN,
      name = "Colony",
      type = String::class
    ), StoredProcedureParameter(
      mode = ParameterMode.IN,
      name = "Street",
      type = String::class
    ), StoredProcedureParameter(
      mode = ParameterMode.IN,
      name = "StreetA",
      type = String::class
    ), StoredProcedureParameter(
      mode = ParameterMode.IN,
      name = "StreetB",
      type = String::class
    ), StoredProcedureParameter(
      mode = ParameterMode.IN,
      name = "InternalNumber",
      type = String::class
    ), StoredProcedureParameter(
      mode = ParameterMode.IN,
      name = "ExternalNumber",
      type = String::class
    ), StoredProcedureParameter(
      mode = ParameterMode.IN,
      name = "Reference",
      type = String::class
    ), StoredProcedureParameter(
      mode = ParameterMode.OUT,
      name = "ID",
      type = Int::class
    )]
  )
)
class CreateAddress : java.io.Serializable {

  val serialVersionUID = 1L

  @Id
  val id: Int? = null
  val municipalityId: Int? = null
  val location: String? = null
  val zipCode: String? = null
  val colony: String? = null
  val street: String? = null
  val streetA: String? = null
  val streetB: String? = null
  val internalNumber: String? = null
  val externalNumber: String? = null
  val reference: String? = null
  
}