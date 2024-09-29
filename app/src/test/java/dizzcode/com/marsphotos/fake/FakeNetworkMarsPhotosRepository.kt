package dizzcode.com.marsphotos.fake

import dizzcode.com.marsphotos.data.MarsPhotosRepository
import dizzcode.com.marsphotos.model.MarsPhoto

/**
 * Note:
 * You do not need to directly call MarsViewlModel.getMarsPhotos() to trigger a call to
 * MarsPhotosRepository.getMarsPhotos(). MarsViewModel.getMarsPhotos()
 * is called when the ViewModel is initialized.
 */

class FakeNetworkMarsPhotosRepository : MarsPhotosRepository {

    override suspend fun getMarsPhotos(): List<MarsPhoto> {
        return FakeDataSource.photosList
    }

}
