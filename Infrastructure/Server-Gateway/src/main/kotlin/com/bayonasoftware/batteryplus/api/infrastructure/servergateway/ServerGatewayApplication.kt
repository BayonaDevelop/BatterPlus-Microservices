package com.bayonasoftware.batteryplus.api.infrastructure.servergateway

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.netflix.eureka.EnableEurekaClient

@EnableEurekaClient
@SpringBootApplication
class ServerGatewayApplication

fun main(args: Array<String>) {
  runApplication<ServerGatewayApplication>(*args)
}
