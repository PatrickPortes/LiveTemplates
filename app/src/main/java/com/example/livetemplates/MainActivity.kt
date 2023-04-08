package com.example.livetemplates


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /*
         Create Live Template:
            File -> Settings -> Editor -> LiveTemplate -> PlusSignal(+) -> 2.NewTemplateGroup ->
            Enter Name (MyLiveTemplates) -> Now you can come back to + and choose 1.NewLiveTemplate ->
            Put your code there (name and algorithm/structure) and Configure the applicable context.
         */

        //Shortcuts displayed as code-completion options that, when selected, insert a code snippet.

        val sharedPref = getSharedPreferences("MainActivity", MODE_PRIVATE)
                val editor = sharedPref.edit()
                editor.putString("Key", "Value")
                editor.apply()


    }
}