package com.example.tmnt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.tmnt.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState) //Creada manual
        binding =
            ActivityMainBinding.inflate(layoutInflater) //creada manual - Creaando e bindin de la actividad
        setContentView(binding.root) //Usar el layout contenido en el binding


        //val btn = findViewById<Button>(R.id.btnHello) -- no se necesita con el bindin
        binding.btnDonee.setOnClickListener {
            showTurtle("Donne")
        }

        binding.btnLeo.setOnClickListener {
            showTurtle("Leo")
        }

        binding.btnMikey.setOnClickListener {
            showTurtle("Mikey")
        }

        binding.btnRaph.setOnClickListener {
            showTurtle("Raph")
        }
    }

    fun showTurtle(name: String) {
        when (name) {
            "Donne" -> {
                binding.imgTurtle.setImageResource(R.drawable.donne)
                binding.txDescription.text = resources.getText(R.string.turtle_Donne).toString()
            }
            "Leo" -> {
                binding.imgTurtle.setImageResource(R.drawable.leo)
                binding.txDescription.text = resources.getText(R.string.turtle_Leo).toString()
            }
            "Mikey" -> {
                binding.imgTurtle.setImageResource(R.drawable.mikey)
                binding.txDescription.text = resources.getText(R.string.turtle_Mikey).toString()
            }
            else -> {
                binding.imgTurtle.setImageResource(R.drawable.raph)
                binding.txDescription.text = resources.getText(R.string.turtle_Raph).toString()
            }
        }
    }
}
