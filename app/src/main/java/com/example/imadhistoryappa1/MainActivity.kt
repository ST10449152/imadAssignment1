package com.example.imadhistoryappa1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private var etPersonAge: EditText?= null
    private var tvDisplayAnswer : TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        etPersonAge = findViewById(R.id.etAge)
        tvDisplayAnswer = findViewById(R.id.tvDisplay)

        val btnGenerateHistory = findViewById<Button>(R.id.btnGenerate)
        btnGenerateHistory.setOnClickListener {
            generateHistory()
        }
        val btnClearScreen = findViewById<Button>(R.id.btnClear)
        btnClearScreen.setOnClickListener {
            clearTheScreen()
    }
}

    private fun generateHistory() {
        // read in the age
        // validate the age (error?)

        //find the age in the data set
        //display answer or display no answer

        var intAge: Int = 0
        var strOutput = ""

        val strEnteredValue = etPersonAge?.text.toString().trim()

        if (strEnteredValue.isEmpty()){
            etPersonAge?.error = "Enter an age"
            return
        }

        try {
            intAge = strEnteredValue.toInt()
            if (intAge < 20 || intAge > 100) {
                //tvDisplayAnswer?.text = "Error - Invalid Age"
                etPersonAge?.error = "Invalid age"
            } else {
                    when (intAge) {
                        20 -> strOutput = "You are 20 years old, the same age as Cameron Boyce and he was a popular American actor."
                        21 -> strOutput = "You are 21 years old, the same age as Lil Peep, he's full name was 'Gustav Elijah Ȧhr' and he was a popular American rapper, singer and songwriter." //enter famous person name, find 5 people per decade
                    22 -> strOutput = "You are 22 years old, the same age as Jalen Hill, he was a former popular UCLA Basketball player."
                    23 -> strOutput = "You are 23 years old, the same age as Technoblade, he's full name was 'Alexander' or 'Alex' for short and he was a popular Youtube streamer."
                    24 -> strOutput = "You are 24 years old, the same age as The Notorious B.I.G, he's full name is 'Christopher George Latore Wallace' and he was a popular American rapper."
                    25 -> strOutput = "You are 25 years old, the same age as Tupac Shakur, he's full name is 'Tupac Amaru Shakur' and he was a popular rapper "
                    30 -> strOutput = "You are 30 years old, the same age as Sylvia Plath and she was a famous poet."
                    31 -> strOutput = "You are 31 years old, the same age as Nat Turner and he was famous Civil Rights Leader."
                    32 -> strOutput = "You are 32 years old, the same age as Brittany Murphy and she was a famous actress."
                    33 -> strOutput = "You are 33 years old, the same age as Chris Farley and he was a famous popular actor."
                    34 -> strOutput = "You are 34 years old, the same age as Ayrton Senna and he was a famous race car driver."
                    35 -> strOutput = "You are 35 years old, the same age as Andy Kaufman and he was a famous actor"
                    40 -> strOutput = "You are 40 years old, the same age as Stephen Boss and he was a famous dancer."
                    41 -> strOutput = "You are 41 years old, the same age as Nate Dogg. He's real name is 'Nathaniel Dwayne Hale' and he was a famous rapper."
                    42 -> strOutput = "You are 42 years old, the same age as Elvis Presley, he's real name is, 'Elvis Aaron Presley' and he was a famous rock singer."
                    43 -> strOutput = "You are 43 years old, the same age as John Candy, he was a famous movie actor."
                    44 -> strOutput = "You are 44 years old, the same age as Mary Queen of Scots, she was the Queen of Scotland."
                    45 -> strOutput = "You are 45 years old, the same age as Wilbur Wright, he was a prominent inventor who created the Orville planes with his brother, which were employed in World War II."
                    50 -> strOutput = "You are 50 years old, the same age as Bernie Mac, he was a famous television actor."
                    51 -> strOutput = "You are 51 years old, the same age as Napoleon Bonaparte, he was a popular Emperor in 1769."
                    52 -> strOutput = "You are 52 years old, the same age as Bob Ross, he was a famous painter."
                    53 -> strOutput = "You are 53 years old, the same age as Ivan The Terrible, he was the Grand Prince of Moscow when he was three years old and Tsar of all Russians when he became sixteen."
                    54 -> strOutput = "You are 54 years old, the same age as Luther Vandross was a well known R&B singer."
                    55 -> strOutput = "You are 55 years old, the same age as Henry VIII of England, he was the second ruler of the Tudor dynasty, reigning from 1509 until 1547."
                    60 -> strOutput = "You are 60 years old, the same age as Diego Maradona, he was a famous soccer(football) player who played for Argentinos Juniors and Barcelona."
                    61 -> strOutput = "You are 61 years old, the same age as Sally Ride, she was a famous astronaut and physicist."
                    62 -> strOutput = "You are 62 years old, the same age as Tommy Lister, he was a famous movie actor."
                    63 -> strOutput = "You are 63 years old, the same age as Robin Williams, he was a famous movie actor."
                    64 -> strOutput = "You are 64 years old, the same age as Franklin Pierce, he was the 14th president of the United States."
                    65 -> strOutput = "You are 65 years old, the same age as Genghis Khan, who founded the Mongol Empire and served as its first khagan."
                    70 -> strOutput = "You are 70 years old, the same age as Kim Jong-Il, he was the Supreme Leader of North Korea from 1994 to 2011."
                    71 -> strOutput = "You are 71 years old, the same age as Luciano Pavarotti, he was a famous opera singer."
                    72 -> strOutput = "You are 72 years old, the same age as Walt Whitman, he was a famous poet."
                    73 -> strOutput = "You are 73 years old, the same age as Abigail Adams, she was the first lady and the wife of the second President of the United States."
                    74 -> strOutput = "You are 74 years old, the same age as Muhammad Ali, he was a famous boxer as well as peace activist and philanthropist."
                    75 -> strOutput = "You are 75 years old, the same age as Rocky Johnson, he was a famous wrestler and father to the famous actor 'The Rock'."
                    80 -> strOutput = "You are 80 years old, the same age as Aaron Burr, from 1801 to 1805, he served as the United States' third Vice President and was one of New York's first Senators."
                    81 -> strOutput = "You are 81 years old, the same age as Queen Victoria, she was the Queen of the United Kingdom from 1837 to 1901."
                    82 -> strOutput = "You are 82 years old, the same age as Frank sinatra, he was a famous pop singer."
                    83 -> strOutput = "You are 83 years old, the same age as Tina Turner, she was a famous Rock singer."
                    84 -> strOutput = "You are 84 years old, the same age as Thomas Edison, he was a famous inventor who invented the early versions of the light bulb, the phonograph, and the motion picture camera and other things."
                    85 -> strOutput = "You are 85 years old, the same age as Shirley Temple, she was a famous movie actor."
                    90 -> strOutput = "You are 90 years old, the same age as Winston Churchill, he was the British Prime Minister during World War II."
                    91 -> strOutput = "You are 91 years old, the same age as Jerry Lewis, he was a famous movie actor."
                    92 -> strOutput = "You are 92 years old, the same age as Rosa Parks, she was a famous Civil Rights Leader."
                    93 -> strOutput = "You are 93 years old, the same age as Barbara Walters, she was a famous journalist."
                    94 -> strOutput = "You are 94 years old, the same age as Astrid Lindgren, she was a famous Swedish children's author."
                    95 -> strOutput = "You are 95 years old, the same age as Stan Lee, he was a famous comic book author."
                    //The above code from age's 20-95 are the age ranges of different celebrities that will be outputted if their corresponding age is inputted.
                    else -> {
                        strOutput = "Nothing in age range"      //This code is to give an error message if the age entered isn't in the data range
                    }
                }
            }

            tvDisplayAnswer?.text = strOutput
        } catch (e: NumberFormatException) {
            etPersonAge?.error = "Enter a valid age number"     //This code is to give an error message if the user is to enter letter values instead of numbers.
        }

        /*
    if (intAge < 20 || intAge > 100){
        //tvDisplayAnswer?.text = "Error - Invalid Age"
        etPersonAge?.error = "Invalid Age"
    } else {
        when (intAge) {
            21 -> strOutput = "s21"
            23 -> strOutput = "s23"
        else -> {
            strOutput = "Nothing in data set"
            }
        }
    }
    tvDisplayAnswer?.text = strOutput
        */

    }

    private fun clearTheScreen(){           //This code is to enable clear button to restore everything the way it was at the beginning
        // clear the etPersonAge box
        // clear tvDisplay box

        etPersonAge?.text = null
        tvDisplayAnswer?.text = ""
    }
}