package basics

data class PhoneContact(
        val firstName: String,
        val lastName: String,
        var phone: Int? = null,
        var country: String? = null
)