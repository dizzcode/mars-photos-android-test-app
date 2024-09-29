package dizzcode.com.marsphotos.data

import dizzcode.com.marsphotos.model.MarsPhoto
import dizzcode.com.marsphotos.network.MarsApiService

interface MarsPhotosRepository {
    suspend fun getMarsPhotos(): List<MarsPhoto>
}

class NetworkMarsPhotosRepository (
    private val marsApiService: MarsApiService
) : MarsPhotosRepository{

    override suspend fun getMarsPhotos(): List<MarsPhoto> = marsApiService.getPhotos()

}
