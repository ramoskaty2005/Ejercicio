package com.example.andreaejercicio.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.andreaejercicio.navigation.Screen

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ExercisesListScreen(navController: NavController) {
    Scaffold(
        topBar = {
            CenterAlignedTopAppBar(
                title = { Text("Lista de ejercicios", fontWeight = FontWeight.SemiBold) }
            )
        }
    ) { paddingValues ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
                .padding(24.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp, Alignment.CenterVertically),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            FilledTonalButton(
                onClick = { navController.navigate(Screen.Table.route) },
                modifier = Modifier.fillMaxWidth().height(52.dp)
            ) {
                Text("Tabla de multiplicar", fontSize = 16.sp)
            }

            FilledTonalButton(
                onClick = { navController.navigate(Screen.Rectangle.route) },
                modifier = Modifier.fillMaxWidth().height(52.dp)
            ) {
                Text("Área rectangular", fontSize = 16.sp)
            }

            FilledTonalButton(
                onClick = { navController.navigate(Screen.Form.route) },
                modifier = Modifier.fillMaxWidth().height(52.dp)
            ) {
                Text("Formulario de prueba", fontSize = 16.sp)
            }
        }
    }
}