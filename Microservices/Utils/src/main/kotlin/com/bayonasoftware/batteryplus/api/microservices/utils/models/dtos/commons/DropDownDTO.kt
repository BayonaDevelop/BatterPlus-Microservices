package com.bayonasoftware.batteryplus.api.microservices.utils.models.dtos.commons

class DropDownDTO: java.io.Serializable {

  val serialVersionUID = 1L

  var id: Any? = null

  var label: String? = null

  var other: String? = null

  constructor() {}

  constructor(id: Any, label: String) {
    this.id = id
    this.label = label
  }

  constructor(id: Any, label: String, other: String) {
    this.id = id
    this.label = label
    this.other = other
  }
  
}