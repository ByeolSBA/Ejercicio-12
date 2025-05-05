package com.juantorres.ejerciciodoce
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.activity.viewModels
import androidx.lifecycle.Observer
import com.juantorres.ejerciciodoce.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding  // Enlace a las vistas de XML
    private val productViewModel: ProductViewModel by viewModels()  // Vista del modelo de productos

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)  // Inicializa el binding
        setContentView(binding.root)  // Establece la vista raíz

        // Observa cambios en el producto aleatorio y actualiza la vista
        productViewModel.randomProduct.observe(this, Observer { product ->
            binding.tvProduct.text = "Producto: ${product.name} - $${product.price}"  // Muestra el nombre y precio
        })

        // Al hacer clic en el layout, genera un nuevo producto aleatorio
        binding.rootLayout.setOnClickListener {
            productViewModel.generateRandomProduct()  // Llama a la función del ViewModel para generar un producto
        }
    }
}
