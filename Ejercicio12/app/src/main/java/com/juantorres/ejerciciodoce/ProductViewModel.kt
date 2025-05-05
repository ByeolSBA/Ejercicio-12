package com.juantorres.ejerciciodoce

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ProductViewModel : ViewModel() {

    // Lista inmutable con productos precargados; simula una fuente de datos
    private val products = listOf(
        Product("Laptop", 1200.0),
        Product("Smartphone", 800.0),
        Product("Headphones", 150.0),
        Product("Monitor", 300.0),
        Product("Mouse", 50.0)
    )

    // LiveData mutable interna: solo el ViewModel puede modificarla
    private val _randomProduct = MutableLiveData<Product>()

    // LiveData pública para que la vista observe, pero sin posibilidad de modificar
    val randomProduct: LiveData<Product> get() = _randomProduct

    // Selecciona un producto aleatorio y lo publica al LiveData
    fun generateRandomProduct() {
        _randomProduct.value = products.random()
    }
}
