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
fun UserFormScreen(navController: NavController) {
    var nameText by remember { mutableStateOf("") }
    var emailText by remember { mutableStateOf("") }
    var submittedText by remember { mutableStateOf("") }

    Scaffold(
        topBar = { TopAppBar(title = { Text("Formulario de Usuario") }) }
    ) { padding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(padding)
                .padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            OutlinedTextField(
                value = nameText,
                onValueChange = { nameText = it },
                label = { Text("Nombre completo") },
                modifier = Modifier.fillMaxWidth()
            )
            Spacer(modifier = Modifier.height(8.dp))
            OutlinedTextField(
                value = emailText,
                onValueChange = { emailText = it },
                label = { Text("Correo electrónico") },
                modifier = Modifier.fillMaxWidth()
            )
            Spacer(modifier = Modifier.height(8.dp))
            Button(onClick = {
                submittedText = "Registrado: $nameText ($emailText)"
            }) {
                Text("Guardar Datos")
            }
            Spacer(modifier = Modifier.height(16.dp))
            Text(text = submittedText)
        }
    }
}