package dizzcode.com.marsphotos.fake

import dizzcode.com.marsphotos.model.MarsPhoto
import dizzcode.com.marsphotos.network.MarsApiService

class FakeMarsApiService : MarsApiService {

    override suspend fun getPhotos(): List<MarsPhoto> {
        return FakeDataSource.photosList
    }

}
