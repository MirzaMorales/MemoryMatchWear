package mx.utng.mnml.memorymatchwear.domain.usecase

import mx.utng.mnml.memorymatchwear.domain.repository.BestTimeRepository

class SaveBestTimeUseCase(private val repository: BestTimeRepository) {
    suspend operator fun invoke(seconds: Long) = repository.saveBestTime(seconds)
}
