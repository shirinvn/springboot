package ir.vatannet.spring

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
class BookController {
    lateinit var bookRepository: BookRepository

    @Autowired
    fun setStudentRepository(bookRepo: BookRepository) {
        bookRepository = bookRepo
    }

    @GetMapping("/book")
    fun getAllStudents(): ResponseEntity<MutableIterable<Book>> {

        val dataFromDatabase = bookRepository.findAll()
        return ResponseEntity.ok(dataFromDatabase)

    }


    }