package com.example.andreaejercicio.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun RectangleAreaScreen(navController: NavController) {
    var baseText by remember { mutableStateOf("") }
    var heightText by remember { mutableStateOf("") }
    var areaResult by remember { mutableStateOf("") }

    Scaffold(
        topBar = { TopAppBar(title = { Text("Área del Rectángulo") }) }
    ) { padding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(padding)
                .padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            OutlinedTextField(
                value = baseText,
                onValueChange = { baseText = it },
                label = { Text("Base") },
                modifier = Modifier.fillMaxWidth()
            )
            Spacer(modifier = Modifier.height(8.dp))
            OutlinedTextField(
                value = heightText,
                onValueChange = { heightText = it },
                label = { Text("Altura") },
                modifier = Modifier.fillMaxWidth()
            )
            Spacer(modifier = Modifier.height(8.dp))
            Button(onClick = {
                val b = baseText.toDoubleOrNull()
                val h = heightText.toDoubleOrNull()
                if (b != null && h != null) {
                    areaResult = "El área es: ${b * h}"
                } else {
                    areaResult = "Ingrese valores válidos"
                }
            }) {
                Text("Calcular Área")
            }
            Spacer(modifier = Modifier.height(16.dp))
            Text(text = areaResult)
        }
    }
}