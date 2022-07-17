package com.endryun.theater.services

import com.endryun.theater.domain.Seat
import org.springframework.stereotype.Service

@Service
class BookingService() {
    fun isSeatFree(seat: Seat) : Boolean{
        return true
    }
}