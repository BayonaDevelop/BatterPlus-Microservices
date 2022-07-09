package com.bayonasoftware.batteryplus.api.infrastructure.serverconfig

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.config.server.EnableConfigServer

@EnableConfigServer
@SpringBootApplication
class ServerConfigApplication

fun main(args: Array<String>) {
	runApplication<ServerConfigApplication>(*args)
}
