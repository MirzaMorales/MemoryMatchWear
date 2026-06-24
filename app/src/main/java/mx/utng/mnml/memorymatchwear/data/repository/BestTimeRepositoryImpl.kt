package mx.utng.mnml.memorymatchwear.data.repository

import mx.utng.mnml.memorymatchwear.data.datasource.BestTimeDataSource
import mx.utng.mnml.memorymatchwear.domain.repository.BestTimeRepository

class BestTimeRepositoryImpl(private val ds: BestTimeDataSource) : BestTimeRepository {
    override suspend fun getBestTime() = ds.getBestTime()
    override suspend fun saveBestTime(seconds: Long) = ds.saveBestTime(seconds)
}
