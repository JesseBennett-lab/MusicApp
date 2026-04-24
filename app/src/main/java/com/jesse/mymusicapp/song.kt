package com.jesse.mymusicapp

import android.util.Log

class song(songName: String, songArtist: String, songYear: Int, songDuration: String) {

    var name :String =""
    var artist : String =""
    var year : Int = 0
    var duration : String =""

    constructor(songName:String,songArtist:String) : this(songName, songArtist,0 ,"") {
    }
    constructor(songName:String) : this(songName, songArtist="Unknown Artist",songYear=0, songDuration="") {
    }



    //initializing the variables/ attributes for the song objects-----------------------------------
    init{
         name = songName
         artist = songArtist
         year = songYear
         duration = songDuration


    }

    //Function to play a song-----------------------------------------------------------------------
    fun Play(){
        Log.v("Song", "$name is playing now")


    }
    //Function to pause a song-----------------------------------------------------------------------
    fun Pause(){
        Log.v("Song", "$name is paused now")

    }
    //Function to stop a song-----------------------------------------------------------------------
    fun Stop(){
        Log.v("Song", "$name is stopped now")

    }
    //Function  to favorite a song------------------------------------------------------------------
    fun Favorite():Boolean{
        return true
        Log.v("Song", "$name is favorited now")


    }
    fun DisplaySongs(): String{

        return "$name, $artist, $year, $duration"


    }
}