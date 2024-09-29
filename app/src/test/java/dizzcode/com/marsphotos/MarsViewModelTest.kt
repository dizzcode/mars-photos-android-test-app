package dizzcode.com.marsphotos

import dizzcode.com.marsphotos.fake.FakeDataSource
import dizzcode.com.marsphotos.fake.FakeNetworkMarsPhotosRepository
import dizzcode.com.marsphotos.rules.TestDispatcherRule
import dizzcode.com.marsphotos.ui.screens.MarsUiState
import dizzcode.com.marsphotos.ui.screens.MarsViewModel
import kotlinx.coroutines.test.runTest
import org.junit.Assert.assertEquals
import org.junit.Rule
import org.junit.Test

class MarsViewModelTest {

    @get:Rule
    val testDispatcher = TestDispatcherRule()

    @Test
    fun marsViewModel_getMarsPhotos_verifyMarsUiStateSuccess() =
        runTest {
            val marsViewModel = MarsViewModel(
                marsPhotosRepository = FakeNetworkMarsPhotosRepository()
            )

            assertEquals(
                MarsUiState.Success("Success: ${FakeDataSource.photosList.size} Mars " +
                        "photos retrieved"),
                marsViewModel.marsUiState
            )
        }
}
