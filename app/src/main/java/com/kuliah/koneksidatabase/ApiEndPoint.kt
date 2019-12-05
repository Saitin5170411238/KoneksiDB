package com.kuliah.koneksidatabase

class ApiEndPoint {
    companion object {
        private val SERVER = "http://192.168.0.115/universitaskotlin/"
        val CREATE = SERVER +"create_fakultas.php"
        val READ = SERVER +"read_fakultas.php"
        val UPDATE = SERVER +"update_fakultas.php"
        val DELETE = SERVER +"delete_fakultas.php"
    }
}