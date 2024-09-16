package org.api.controller

import io.ktor.http.HttpMethod
import io.ktor.server.application.Application
import io.ktor.server.application.call
import io.ktor.server.response.respondText
import io.ktor.server.routing.route
import io.ktor.server.routing.routing

fun Application.configureRouting(){

    routing {

        route("/alive", HttpMethod.Get){
            handle{
                call.respondText("I'm alive")
            }
        }
    }
}
