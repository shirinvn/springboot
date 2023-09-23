package ir.vatannet.spring

import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository


@Repository
interface BookRepository :CrudRepository<Book , String>  {

}