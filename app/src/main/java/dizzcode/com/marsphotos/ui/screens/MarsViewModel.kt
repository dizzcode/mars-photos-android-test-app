package dizzcode.com.marsphotos.ui.screens

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dizzcode.com.marsphotos.data.NetworkMarsPhotosRepository
import dizzcode.com.marsphotos.network.MarsApi
import dizzcode.com.marsphotos.network.MarsApiService
import kotlinx.coroutines.launch
import java.io.IOException

/**
 * To represent these three states in your application, you use a sealed interface.
 * A sealed interface makes it easy to manage state by limiting the possible values.
 */
sealed interface MarsUiState {
    data class Success(val photos: String) : MarsUiState
    object Error : MarsUiState
    object Loading : MarsUiState
}

class MarsViewModel : ViewModel() {
    /** The mutable State that stores the status of the most recent request */
    var marsUiState: MarsUiState by mutableStateOf(MarsUiState.Loading)
        private set

    /**
     * Call getMarsPhotos() on init so we can display status immediately.
     */
    init {
        getMarsPhotos()
    }

    /**
     * Gets Mars photos information from the Mars API Retrofit service and updates the
     * [MarsPhoto] [List] [MutableList].
     */
    fun getMarsPhotos() {
        viewModelScope.launch {
            try{
                val marsPhotosRepository = NetworkMarsPhotosRepository()
                val listResult = marsPhotosRepository.getMarsPhotos()
                marsUiState = MarsUiState.Success(
                    "Success: ${listResult.size} Mars photos retrieved"
                )
            }
            catch (e: IOException){
                marsUiState = MarsUiState.Error
            }

        }
    }
}
