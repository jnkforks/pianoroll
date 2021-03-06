package com.citizenwarwick.pianoroll.example

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.state
import androidx.ui.core.Text
import androidx.ui.core.setContent
import androidx.ui.layout.Column
import androidx.ui.layout.Container
import androidx.ui.material.MaterialTheme
import com.citizenwarwick.pianoroll.PianoChord
import com.citizenwarwick.music.chord

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Container {
                    var selectedNote by state { "" }
                    Column {
                        Text(
                            "You selected $selectedNote",
                            style = MaterialTheme.typography().h4
                        )
                        PianoChord("F0 A0 C1".chord) {
                            selectedNote = it.toString()
                        }
                    }
                }
            }
        }
    }
}
