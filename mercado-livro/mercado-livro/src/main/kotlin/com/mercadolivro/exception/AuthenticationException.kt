package com.mercadolivro.exception

class AuthenticationException(override val message:String, val errorcode: String): Exception() {
}