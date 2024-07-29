package mIA_APP_2402

import kotlin.system.exitProcess

//Created by Abusaeed Shuvo

fun main() {
    val bloodGroups= listOf("a+","a-","b+","b-","o+","o-","ab+","ab-")
    //Get Donor Data
    println("Enter Blood Donor name: ")
    val donorName = readln().trim().toString().capitalize()
    println("Enter donor age: ")
    val donorAge = readln().toInt()
    //Only take blood if donor is between 18-75 years
    if (donorAge !in 18..75) {
        println("$donorName is not of appropriate age to donate blood")
        exitProcess(0)
    }
    println("Enter donor blood group(ex:AB-): ")
    val donorBloodGroup = readln().trim().toString().toLowerCase()
    if (donorBloodGroup !in bloodGroups){
        println("$donorBloodGroup is not a real blood group")
        exitProcess(0)
    }

    println("Is donor have any blood related sickness?(Answer with true or false) ")
    val isDonorSick = readln().toBoolean()
    //Don't take blood if donor is sick
    if (isDonorSick) {
        println("$donorName is sick. Blood can\'t be donated")
        exitProcess(0)
    }

    //Get receiver Data
    println("Enter receiver name: ")
    val receiverName = readln().trim().toString().capitalize()
    println("Enter receiver blood group(ex:AB-): ")
    val receiverBloodGroup = readln().trim().toString().toLowerCase()
    if (receiverBloodGroup !in bloodGroups){
        println("$donorBloodGroup is not a real blood group")
        exitProcess(0)
    }

//Show blood group of the person
    println(
        "$donorName blood group is ${donorBloodGroup.toUpperCase()} and " +
                "$receiverName blood group is ${receiverBloodGroup.toUpperCase()}"
    )
    if (checkBloodStatus(donorBloodGroup, receiverBloodGroup)) {
        println("So, $donorName can donate blood to $receiverName")
    } else {
        println("So, $donorName can NOT donate blood to $receiverName")
    }

}

//Logic for blood donation
fun checkBloodStatus(donor: String, receiver: String): Boolean {
    val bloodDonationStatus:Boolean

    when (receiver) {
        "a+" -> bloodDonationStatus = donor == "a+" || donor == "a-" || donor == "o+" || donor == "o-"

        "a-" -> bloodDonationStatus = donor == "a-" || donor == "o-"

        "b+" -> bloodDonationStatus = donor == "b+" || donor == "b-" || donor == "o+" || donor == "o-"

        "b-" -> bloodDonationStatus = donor == "b-" || donor == "o-"

        "ab+" -> bloodDonationStatus = true

        "ab-" -> bloodDonationStatus = donor == "ab-" || donor == "a-" || donor == "b-" || donor == "o-"

        "o+" -> bloodDonationStatus = donor == "o+" || donor == "o-"

        "o-" -> bloodDonationStatus = donor == "o-"


        else -> bloodDonationStatus = false

    }
    return bloodDonationStatus
}