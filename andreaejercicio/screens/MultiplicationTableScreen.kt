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
fun MultiplicationTableScreen(navController: NavController) {
    var numberText by remember { mutableStateOf("") }
    var resultList by remember { mutableStateOf(listOf<String>()) }

    Scaffold(
        topBar = { TopAppBar(title = { Text("Tabla de Multiplicar") }) }
    ) { padding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(padding)
                .padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            OutlinedTextField(
                value = numberText,
                onValueChange = { numberText = it },
                label = { Text("Ingrese un número") },
                modifier = Modifier.fillMaxWidth()
            )
            Spacer(modifier = Modifier.height(8.dp))
            Button(onClick = {
                val num = numberText.toIntOrNull()
                if (num != null) {
                    resultList = (1..10).map { "$num x $it = ${num * it}" }
                }
            }) {
                Text("Generar Tabla")
            }
            Spacer(modifier = Modifier.height(16.dp))
            resultList.forEach { item ->
                Text(text = item)
            }
        }
    }
}