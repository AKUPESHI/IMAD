package com.example.Epoc

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val edAge1 = findViewById<EditText>(R.id.edAge1).text
        val btnHistory = findViewById<Button>(R.id.btnHistory)
        val btnClear = findViewById<Button>(R.id.btnClear)
        var tvResult = findViewById<TextView>(R.id.tvResult)

        btnHistory.setOnClickListener {
            val ageInput = edAge1.toString().toIntOrNull()
            if (ageInput in 20..100) {
                val matchAge = matchAgeOfFamousPerson(ageInput)
                if (matchAge != null) {
                    val matchedPersonName = getMatchedPersonName(matchAge)
                    val message = "A famous person, $matchedPersonName, passed away at the age of $matchAge"
                    tvResult.text = message
                    Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
                } else {
                    tvResult.text= "No famous person found with the entered age"
                }
            } else {
                tvResult.text = "Please enter a valid age between 20 and 100"

            }
        }

        btnClear.setOnClickListener {
            edAge1.clear()
            tvResult.text = getString(R.string.result_will_be_displayed_here)
        }
    }

    private fun matchAgeOfFamousPerson(age: Int?): Int? {
        val famousPeopleAges = mapOf(
            "Nelson Mandela" to 95,
            "Albert Einstein" to 76,
            "Mother Teresa" to 87,
            "Edgar Allan Poe" to 40,
            "Wangari Maathai" to 71,
            "Martin Luther King" to 39,
            "Anne Frank" to 20,
            "Princess Diana" to 36,
            "Leonardo da Vinci" to 67,
            "Fela Kuti" to 58,
            "Vincent van Gogh" to 37,
            "Amelia Earhart" to 39,
            "Kurt Cobain" to 27,
            "Jimi Hendrix" to 27,
            "Marilyn Monroeto"  to 36,
            "Bruce Lee" to 32,
            "John Lenon" to 40,
            "Wolfgang Amadeus Mozart " to 35,
            "Heath Ledger " to 28,
            "Freddie Mercury" to 45,
            "Tupac Shakur" to 25,
            "John F. Kennedy" to 46,
            "Elvis Presley" to 42,
            "Michael Jackson " to 50,
            "Martin Luther King " to 39,
            "Isaac Newton" to 84,
            "Alexander the Great " to 32,
            "Leonardo Da Vinci" to 67,
            "Juluis Caesar" to 56,
            "William Shakespeare " to 52,
            "Galileo Galilei" to 77,
            "Charles Darwin"  to 73,
            "Nikola Tesla " to 86,
            "Mahatma Maghandi " to 78,
            "Winston ChurchHill" to 90,
            "Pablo Picasso" to 91,
            "Johann Sebastian Bach " to 65,
            "Ludwig van Beethoven " to 56,
            " Wolfgang Amadeus Mozart " to 35,
            "Christopher Columbus " to 54,
            " Michelangelo " to 88,
            "Michael Jackson " to 83,
            "Benjamin Franklin " to 84,

            "Isaac Newton " to 67,


            )
        return famousPeopleAges.values.find { it == age }
    }

    private fun getMatchedPersonName(age: Int): String {
        val famousPeopleAges = mapOf(
            "Nelson Mandela" to 95,
            "Albert Einstein" to 76,
            "Mother Teresa" to 87,
            "Edgar Allan Poe" to 40,
            "Wangari Maathai" to 71,
            "Martin Luther King" to 39,
            "Anne Frank" to 20,
            "Princess Diana" to 36,
            "Leonardo da Vinci" to 67,
            "Fela Kuti" to 58,
            "Vincent van Gogh" to 37,
            "Amelia Earhart" to 39,
            "Kurt Cobain" to 27,
            "Jimi Hendrix" to 27,
            "Marilyn Monroeto"  to 36,
            "Bruce Lee" to 32,
            "John Lenon" to 40,
            "Wolfgang Amadeus Mozart " to 35,
            "Heath Ledger " to 28,
            "Freddie Mercury" to 45,
            "Tupac Shakur" to 25,
            "John F. Kennedy" to 46,
            "Elvis Presley" to 42,
            "Michael Jackson " to 50,
            "Martin Luther King " to 39,
            "Isaac Newton" to 84,
            "Alexander the Great " to 32,
            "Leonardo Da Vinci" to 67,
            "Juluis Caesar" to 56,
            "William Shakespeare " to 52,
            "Galileo Galilei" to 77,
            "Charles Darwin"  to 73,
            "Nikola Tesla " to 86,
            "Mahatma Maghandi " to 78,
            "Winston ChurchHill" to 90,
            "Pablo Picasso" to 91,
            "Johann Sebastian Bach " to 65,
            "Ludwig van Beethoven " to 56,
            " Wolfgang Amadeus Mozart " to 35,
            "Christopher Columbus " to 54,
            " Michelangelo " to 88,
            "Michael Jackson " to 83,
            "Benjamin Franklin " to 84,

            "Isaac Newton " to 67,


            )
        return famousPeopleAges.filterValues { it == age }.keys.firstOrNull() ?: "Unknown Person"
    }
}




