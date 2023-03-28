package com.example.unipi_storyteller;

import android.content.Context;
import android.speech.tts.TextToSpeech;

import java.util.Locale;

public class MyTTS {
    private TextToSpeech tts;
    private TextToSpeech.OnInitListener initListener = new TextToSpeech.OnInitListener() {
        @Override
        public void onInit(int i) {
            if (i ==TextToSpeech.SUCCESS)
                tts.setLanguage(Locale.ENGLISH);
        }
    };



    public  MyTTS(Context context){
        tts = new TextToSpeech(context, initListener);
    }


    public void speak(String story){
        tts.speak(story,TextToSpeech.QUEUE_ADD, null,null);
    }
}

