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
  val bciUsed: BciUsed? = null

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "Bci_Warranty_ID", nullable = false)
  val bciWarranty: BciWarranty? = null

  @Id
  @get:GeneratedValue(strategy = GenerationType.IDENTITY)
  @get:Column(name = "ID", unique = true, nullable = false)
  val id: Int? = null

  @get:Column(name = "Status_ID", nullable = false)
  val statusId: Int? = null

  @get:Column(name = "Previous_Status_ID")
  val previousStatusId: Int? = null

  @get:Column(name = "Policy", nullable = false)
  val policy: String? = null

  @get:Column(name = "Bill")
  val bill: String? = null

  @get:Column(name = "Purchase_Note")
  val purchaseNote: String? = null

  @get:Column(name = "Voltage", precision = 16)
  val voltage: BigDecimal? = null

  @get:Column(name = "Price", precision = 16)
  val price: BigDecimal? = null

  @get:Column(name = "From_Taxist")
  val fromTaxist: Boolean? = null

  @get:Column(name = "Pressable")
  val pressable: Boolean? = null

  @get:Column(name = "Borrowed")
  val borrowed: Boolean? = null

  @get:Temporal(TemporalType.TIMESTAMP)
  @get:Column(name = "Admission_Date", length = 23)
  val admissionDate: Date? = null

  @get:Temporal(TemporalType.TIMESTAMP)
  @get:Column(name = "Policy_Date", length = 23)
  val policyDate: Date? = null

  @get:Temporal(TemporalType.TIMESTAMP)
  @get:Column(name = "Sale_Date", length = 23)
  val saleDate: Date? = null

}