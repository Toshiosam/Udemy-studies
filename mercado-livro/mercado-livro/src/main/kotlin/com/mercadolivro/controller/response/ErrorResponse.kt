package com.mercadolivro.controller.response

data class ErrorResponse(
    var httpcode: Int,
    var message: String,
    var internalcode: String,
    var errors: List<FieldErrorResponse>?


) {
}