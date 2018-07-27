package basics

fun main(args: Array<String>) {
    val me = PhoneContact("Kshyk", "Surname", 412413, "Poland")
    val nullable = PhoneContact("Francesco", "Nullo", 1231515251)
    val third = PhoneContact("Three", "Third")
    val contacts = listOf(me, nullable, third)
    println("*** listed ***")
    contacts
            .forEach { println("${it.firstName} ${it.lastName}") }
    println("*** filtered ***")
    contacts
            .filter { "Poland".equals(it.country, ignoreCase = true) }
            .forEach { println("${it.firstName} ${it.lastName}") }
    println("*** grouped ***")
    val groupedList = contacts.groupBy { it.country }
    groupedList
            .forEach { country, contact -> println("Country: $country -> $contact") }

}