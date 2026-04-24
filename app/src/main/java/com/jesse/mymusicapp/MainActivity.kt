package com.jesse.mymusicapp

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        var songDisplayText = findViewById<TextView>(R.id.songDisplayText)
        var songDisplay = ""

        //calling the song class for a song object
        var song1 = song("Risk it all", "Bruno Mars", 2026, "3:32")
        var song2 = song("Get you", "Daniel Caesar,2026, 3:35")
        var song3 = song("Last Communication", "Teddy Swims", 2026, "3:53")
        var song4 = song(songName = "Thriller")
        var song5 = song(songName = "You and I")
        var songs = arrayOf<song>(song1, song2, song3, song4, song5)

        for (song in songs) {
            songDisplay += "${song.DisplaySongs()}\n\n"
        }

        songDisplayText.text = songDisplay




        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}
