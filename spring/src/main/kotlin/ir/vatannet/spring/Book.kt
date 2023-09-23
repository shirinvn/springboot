package ir.vatannet.spring

import jakarta.persistence.Entity
import jakarta.persistence.Id


@Entity
data class Book(
    @Id
     var title:String
    ,
     var caption:String

) {
    constructor() : this("","")
}

