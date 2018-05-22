package com.example.user.doomaidoo

/**
 * Created by User on 3/5/2561.
 */

class Movie {
    var name: String? = null
        get()=field
      set(value) {
          field=value
      }

    var catagories: String? = null
        get() = field
        set(value) {
            field = value
        }

    var thumbnail: Int? = null
        get() = field
    set(value){
        field=value
    }
    constructor() {}

    constructor(name: String, catagories: String, thumbnail : Int) {
        this.name = name
        this.catagories = catagories
        this.thumbnail = thumbnail
    }
}
