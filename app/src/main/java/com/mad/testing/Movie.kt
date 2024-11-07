package com.mad.testing

import java.time.LocalDate
import java.time.temporal.ChronoUnit



class Movies {
    // https://www.amctheatres.com/amc-scene/our-most-anticipated-movies-in-2024
    val upcoming = listOf(
        Movie("Mean Girls", LocalDate.of(2024, 1, 12)),
        Movie("Dune: Part Two", LocalDate.of(2024, 3, 1)),
        Movie("Deadpool 3", LocalDate.of(2024, 7, 26)),
        Movie("Gladiator", LocalDate.of(2000, 5, 5)),
        Movie("Gladiator 2", LocalDate.of(2024, 11, 22)),
        Movie("Furiosa", LocalDate.of(2024, 5, 25)),
        Movie("Bettlejuice 2", LocalDate.of(2024, 9, 6)),
        Movie("Kingdom of the Planet of the Apes", LocalDate.of(2024, 5, 24)),
        Movie("Inside out 2", LocalDate.of(2024, 6, 14)),
        Movie("A Quiet Place: Day One", LocalDate.of(2024, 11, 22)),
        Movie("Borderlands", LocalDate.of(2024, 9, 9)),
        Movie("Elf", LocalDate.of(2003, 6, 28)),
        Movie("Alien: Romulus", LocalDate.of(2024, 9, 16)),
        Movie("Kraven The Hunter", LocalDate.of(2024, 8, 30)),
        Movie("Joker: Folie à Deux", LocalDate.of(2024, 10, 4)),
        Movie("Wicked: Part One", LocalDate.of(2024, 11, 27)),
        Movie("Sonic the Hedgehog 3", LocalDate.of(2024, 12, 20))
    )

    override fun toString(): String {
        return upcoming.joinToString("\n") { it.toString() }
    }

    data class Movie(val name: String, val release: LocalDate) {
        fun daysUntilRelease() : Long {
            return LocalDate.now().until(release, ChronoUnit.DAYS)
            // return ChronoUnit.DAYS.between(LocalDate.now(), release)
        }
    }
}