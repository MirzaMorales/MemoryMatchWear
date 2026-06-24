package mx.utng.mnml.memorymatchwear.domain.usecase

import mx.utng.mnml.memorymatchwear.domain.repository.BestTimeRepository

class GetBestTimeUseCase(private val repository: BestTimeRepository) {
    suspend operator fun invoke(): Long = repository.getBestTime()
}
