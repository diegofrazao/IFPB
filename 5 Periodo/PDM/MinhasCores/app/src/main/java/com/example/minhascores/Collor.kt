package com.example.minhascores

import java.io.Serializable

class Collor: Serializable {
    var id: Int
    var name: String
    var code: Int

    constructor(name: String, code: Int){
        this.id = -1
        this.name = name
        this.code = code
    }

    constructor(id:Int, name: String, code: Int){
        this.id = id
        this.name = name
        this.code = code
    }

    fun toHex(): String{
        return String.format("#%06X", (0xFFFFFF and code))
    }

    override fun toString(): String {
        return "${id} - ${name} - ${code} - ${toHex()}"
    }
}