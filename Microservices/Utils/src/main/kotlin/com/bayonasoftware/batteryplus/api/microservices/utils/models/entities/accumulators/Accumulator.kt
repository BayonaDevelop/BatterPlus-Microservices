package com.bayonasoftware.batteryplus.api.microservices.utils.models.entities.accumulators

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import java.math.BigDecimal
import java.util.Date
import javax.persistence.*


@JsonIgnoreProperties("hibernateLazyInitializer")
@Entity
@Table(schema = "dbo", name = "Accumulator")
class Accumulator : java.io.Serializable {

  val serialVersionUID = 1L

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "Bci_Used_ID", nullable = false)
  var bciUsed: BciUsed? = null

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "Bci_Warranty_ID", nullable = false)
  var bciWarranty: BciWarranty? = null

  @Id
  @get:GeneratedValue(strategy = GenerationType.IDENTITY)
  @get:Column(name = "ID", unique = true, nullable = false)
  var id: Int? = null

  @get:Column(name = "Status_ID", nullable = false)
  var statusId: Int? = null

  @get:Column(name = "Previous_Status_ID")
  var previousStatusId: Int? = null

  @get:Column(name = "Policy", nullable = false)
  var policy: String? = null

  @get:Column(name = "Bill")
  var bill: String? = null

  @get:Column(name = "Purchase_Note")
  var purchaseNote: String? = null

  @get:Column(name = "Voltage", precision = 16)
  var voltage: BigDecimal? = null

  @get:Column(name = "Price", precision = 16)
  var price: BigDecimal? = null

  @get:Column(name = "From_Taxist")
  var fromTaxist: Boolean? = null

  @get:Column(name = "Pressable")
  var pressable: Boolean? = null

  @get:Column(name = "Borrowed")
  var borrowed: Boolean? = null

  @get:Temporal(TemporalType.TIMESTAMP)
  @get:Column(name = "Admission_Date", length = 23)
  var admissionDate: Date? = null

  @get:Temporal(TemporalType.TIMESTAMP)
  @get:Column(name = "Policy_Date", length = 23)
  var policyDate: Date? = null

  @get:Temporal(TemporalType.TIMESTAMP)
  @get:Column(name = "Sale_Date", length = 23)
  var saleDate: Date? = null

}