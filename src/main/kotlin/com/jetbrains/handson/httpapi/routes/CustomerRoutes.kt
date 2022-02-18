package com.jetbrains.handson.httpapi.routes

import io.ktor.routing.*

fun Route.customerRouting() {
    route("/customer") {
        get {

        }
        get("{id}") {
            val id = call.parameters["id"] ?: return@get call.respondText(
                "Missing or malformed id",
                status = HttpStatusCode.BadRequest
            )
            val customer =
                customerStorage.find { it.id == id } ?: return@get call.respondText(
                    "No customer with id $id",
                    status = HttpStatusCode.NotFound
                )
            call.respond(customer)
        }

        post {

        }
        delete("{id}") {

        }
    }
}
