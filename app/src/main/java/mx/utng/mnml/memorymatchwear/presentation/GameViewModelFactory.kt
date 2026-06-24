package mx.utng.mnml.memorymatchwear.presentation

import android.content.Context
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import mx.utng.mnml.memorymatchwear.data.datasource.BestTimeDataSource
import mx.utng.mnml.memorymatchwear.data.repository.BestTimeRepositoryImpl
import mx.utng.mnml.memorymatchwear.domain.usecase.CheckMatchUseCase
import mx.utng.mnml.memorymatchwear.domain.usecase.FlipCardUseCase
import mx.utng.mnml.memorymatchwear.domain.usecase.GetBestTimeUseCase
import mx.utng.mnml.memorymatchwear.domain.usecase.SaveBestTimeUseCase
import mx.utng.mnml.memorymatchwear.domain.usecase.ShuffleBoardUseCase
import mx.utng.mnml.memorymatchwear.presentation.board.MemoryViewModel

class MemoryViewModelFactory(private val context: Context) : ViewModelProvider.Factory {
    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        val dataSource  = BestTimeDataSource(context)
        val repository  = BestTimeRepositoryImpl(dataSource)
        return MemoryViewModel(
            shuffleBoard = ShuffleBoardUseCase(),
            flipCard     = FlipCardUseCase(),
            checkMatch   = CheckMatchUseCase(),
            saveBestTime = SaveBestTimeUseCase(repository),
            getBestTime  = GetBestTimeUseCase(repository),
        ) as T
    }
}
