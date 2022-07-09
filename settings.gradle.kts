rootProject.name = "API"
include("Infrastructure", "Infrastructure:Server-Config", "Infrastructure:Server-Eureka", "Infrastructure:Server-Gateway")
include("Microservices", "Microservices:Utils", "Microservices:Services")