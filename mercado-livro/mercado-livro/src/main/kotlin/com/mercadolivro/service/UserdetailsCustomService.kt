package com.mercadolivro.service

import com.mercadolivro.repository.CustomerRepository
import com.mercadolivro.security.UserCustomDetails
import org.springframework.security.core.userdetails.UserDetails
import org.springframework.security.core.userdetails.UserDetailsService
import org.springframework.stereotype.Service

@Service
class UserdetailsCustomService(
    private val customerRepository: CustomerRepository
):UserDetailsService {
    override fun loadUserByUsername(id: String): UserDetails {
      val customer = customerRepository.findById(id.toInt())
           .orElseThrow{( com.mercadolivro.exception.AuthenticationException("usuario não encontrado", "999")) }
        return UserCustomDetails(customer)
    }
}