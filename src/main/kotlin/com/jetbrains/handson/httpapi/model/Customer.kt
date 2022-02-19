package com.jetbrains.handson.httpapi.model

import kotlinx.serialization.Serializable
import io.ktor.application.*
import io.ktor.http.*
import io.ktor.request.*
import io.ktor.response.*




val customerStorage = mutableListOf<Customer>()


@Serializable
data class Customer(val id: String, val firstName: String, val lastName: String, val email: String)
