package mx.utng.mnml.memorymatchwear.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.wear.compose.material.MaterialTheme
import mx.utng.mnml.memorymatchwear.presentation.board.BoardScreen
import mx.utng.mnml.memorymatchwear.presentation.board.MemoryViewModel

class GameActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val vm: MemoryViewModel = viewModel(
                factory = MemoryViewModelFactory(applicationContext)
            )
            MaterialTheme { BoardScreen(viewModel = vm) }
        }
    }
}
