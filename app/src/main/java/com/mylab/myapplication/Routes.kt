package com.mylab.myapplication

import kotlinx.serialization.Serializable

@Serializable
data object Home

@Serializable
data class Color(val name: String, val value: Long)

