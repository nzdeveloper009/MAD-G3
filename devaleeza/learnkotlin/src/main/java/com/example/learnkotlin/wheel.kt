package com.example.learnkotlin// ============================================================================
// BUILDER DESIGN PATTERN CODE (Fresh Unique Names)
// ============================================================================

class UniqueUserProfile private constructor(
    val firstName: String,
    val lastName: String,
    val email: String,
    val isVerified: Boolean
) {
    // Companion object ya nested class builder ke liye
    class TaskBuilder {
        private var firstName: String = ""
        private var lastName: String = ""
        private var email: String = ""
        private var isVerified: Boolean = false

        fun setFirstName(name: String) = apply { this.firstName = name }
        fun setLastName(name: String) = apply { this.lastName = name }
        fun setEmail(emailAddress: String) = apply { this.email = emailAddress }
        fun setVerification(status: Boolean) = apply { this.isVerified = status }

        fun build(): UniqueUserProfile {
            return UniqueUserProfile(firstName, lastName, email, isVerified)
        }
    }

    fun showProfileData() {
        println("User Profile: $firstName $lastName")
        println("Email: $email")
        println("Verification Status: $isVerified")
    }
}

// ============================================================================
// ONLY ONE MAIN FUNCTION (Direct Learn Kotlin Run Ke Liye)
// ============================================================================
fun main() {
    println("--- TESTING BUILDER PATTERN ---")

    // Creating object using Builder Pattern steps smoothly
    val accountProfile = UniqueUserProfile.TaskBuilder()
        .setFirstName("Aleeza")
        .setLastName("Naveed")
        .setEmail("aleeza@uog.edu.pk")
        .setVerification(true)
        .build()

    // Printing output
    accountProfile.showProfileData()
    println("==========================================")
}