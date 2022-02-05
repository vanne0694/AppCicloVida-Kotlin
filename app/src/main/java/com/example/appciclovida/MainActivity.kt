package com.example.appciclovida

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val toast = Toast.makeText(applicationContext, " se inicio método onCreate()", Toast.LENGTH_SHORT)
        toast.show()
    }

    //onStart() del ciclo de vida de una app móvil
    override fun onStart() {
        super.onStart()
        val toast = Toast.makeText(applicationContext, "Se inició el método onStart()", Toast.LENGTH_LONG)
        toast.show()
    }

    override fun onResume() {
        super.onResume()
        val aviso = Toast.makeText(applicationContext, "Se inició el método onResume()", Toast.LENGTH_SHORT)
        aviso.show()
    }
    
    // mandar notificación de que la aplicación se encuentra en segundo plano

    override fun onPause() {
        super.onPause()
        val avisoPausa = Toast.makeText(applicationContext,"La app ha sido pausada onPause", Toast.LENGTH_LONG)
        avisoPausa.show()
    }

    override fun onStop() {
        super.onStop()
        val avisoStop = Toast.makeText(applicationContext, "La aplicación se ha detenido", Toast.LENGTH_LONG)
        avisoStop.show()
    }

    override fun onDestroy() {
        super.onDestroy()
        val avisoDestroy = Toast.makeText(applicationContext, "La aplicación ah sido destruida onDestroy", Toast.LENGTH_SHORT)
        avisoDestroy.show()
    }

    override fun onRestart() {
        super.onRestart()
        val avisoRestart = Toast.makeText(applicationContext, "La aplicación se reinicio onRestart", Toast.LENGTH_SHORT)
        avisoRestart.show()
    }
}