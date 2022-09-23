package com.calendarbook.server.controller

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import javax.servlet.ServletException
import javax.servlet.http.HttpServletRequest


@RestController
@RequestMapping("/users")
class UserController {
    @Autowired
    private val request: HttpServletRequest? = null

    @GetMapping
    fun get(): String {
        return "users!"
    }

    @GetMapping("/logout")
    @Throws(ServletException::class)
    fun logout(): String? {
        request!!.logout()
        return "redirect:/"
    }
}