package de.openfiresource.openpager.models.api

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class User(

        @SerializedName("pk")
        @Expose
        val pk: Int,

        @SerializedName("username")
        @Expose
        val username: String,

        @SerializedName("email")
        @Expose
        val email: String,

        @SerializedName("first_name")
        @Expose
        val firstName: String,

        @SerializedName("last_name")
        @Expose
        val lastName: String
)