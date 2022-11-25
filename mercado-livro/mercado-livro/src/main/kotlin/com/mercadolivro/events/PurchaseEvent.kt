package com.mercadolivro.events

import com.mercadolivro.model.PurchaseModel
import org.springframework.context.ApplicationEvent
import org.springframework.context.ApplicationEventPublisher

class PurchaseEvent (
    source: Any,
    val purchaseModel: PurchaseModel
    ): ApplicationEvent(source)

{
}