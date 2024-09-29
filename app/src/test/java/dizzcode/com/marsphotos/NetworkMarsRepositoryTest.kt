package dizzcode.com.marsphotos

import dizzcode.com.marsphotos.data.NetworkMarsPhotosRepository
import dizzcode.com.marsphotos.fake.FakeDataSource
import dizzcode.com.marsphotos.fake.FakeMarsApiService
import kotlinx.coroutines.test.runTest
import org.junit.Assert.assertEquals
import org.junit.Test

class NetworkMarsRepositoryTest {

    @Test
    fun networkMarsPhotosRepository_getMarsPhotos_verifyPhotoList() =
        runTest {
            val repository = NetworkMarsPhotosRepository(
                marsApiService = FakeMarsApiService()
            )
            assertEquals(FakeDataSource.photosList, repository.getMarsPhotos())
        }
}
