package com.train

import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    var tickets =  0
    while(tickets != -1) {
        print("Please enter number of tickets: ")
        tickets = scanner.nextInt()
        if(tickets == -1){
            break
        }
        print("How many round-trip tickets: ")
        var round = scanner.nextInt()
        val ticketK = TicketK(tickets, round)
        ticketK.total()
    }



}
class TicketK(var tickets :Int,var roundTrip : Int){
    fun total(){
        var amount : Float
        amount = ((tickets-roundTrip)*1000 + (roundTrip*2000)*0.9).toFloat()
        print("Total tickets : $tickets\nRound-trip:$roundTrip\nTotal:$amount")


    }

}