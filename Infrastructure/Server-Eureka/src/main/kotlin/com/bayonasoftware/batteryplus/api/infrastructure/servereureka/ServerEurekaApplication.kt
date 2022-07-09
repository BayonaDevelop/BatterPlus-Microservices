package com.bayonasoftware.batteryplus.api.infrastructure.servereureka

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer

@EnableEurekaServer
@SpringBootApplication
class ServerEurekaApplication

fun main(args: Array<String>) {
  runApplication<ServerEurekaApplication>(*args)
}
