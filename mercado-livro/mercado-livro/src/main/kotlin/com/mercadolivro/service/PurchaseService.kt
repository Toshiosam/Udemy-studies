package com.mercadolivro.service

import com.mercadolivro.events.PurchaseEvent
import com.mercadolivro.model.PurchaseModel
import com.mercadolivro.repository.PurchaseRepository
import org.springframework.context.ApplicationEventPublisher
import org.springframework.stereotype.Service

@Service
class PurchaseService(
    private val purchaserepository: PurchaseRepository,
    private val applicationEventPublisher: ApplicationEventPublisher
) {
    fun create(purchaseModel: PurchaseModel){
    purchaserepository.save(purchaseModel)

        println("disparando evento de compra")
        applicationEventPublisher.publishEvent(PurchaseEvent(this, purchaseModel))
        println("finalização do processamento")
    }

    fun update(purchaseModel: PurchaseModel) {
        purchaserepository.save(purchaseModel)
    }
}
