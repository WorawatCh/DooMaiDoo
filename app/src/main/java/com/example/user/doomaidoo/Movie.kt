package com.example.user.doomaidoo

/**
 * Created by User on 3/5/2561.
 */

class Movie {
    var name: String? = null

    var catagories: String? = null

    var thumbnail: Int? = null

    constructor()

    constructor(name: String, catagories: String, thumbnail : Int) {
        this.name = name
        this.catagories = catagories
        this.thumbnail = thumbnail
    }
}
