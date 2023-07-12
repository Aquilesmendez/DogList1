package com.example.doglist1

import com.google.gson.annotations.SerializedName

data class DogsResponse (

    @SerializedName("status") var status: String,
    @SerializedName("message") var images: List<String>

    )

//{
//  "response": "success",
//  "id": "70",
//  "name": "Batman",
//  "url": "https://www.superherodb.com/pictures2/portraits/10/100/639.jpg"
//}