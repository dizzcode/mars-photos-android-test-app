package dizzcode.com.marsphotos.ui.screens

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProvider.AndroidViewModelFactory.Companion.APPLICATION_KEY
import androidx.lifecycle.viewModelScope
import androidx.lifecycle.viewmodel.initializer
import androidx.lifecycle.viewmodel.viewModelFactory
import dizzcode.com.marsphotos.MarsPhotosApplication
import dizzcode.com.marsphotos.data.MarsPhotosRepository
import dizzcode.com.marsphotos.model.MarsPhoto
import kotlinx.coroutines.launch
import java.io.IOException

/**
 * To represent these three states in your application, you use a sealed interface.
 * A sealed interface makes it easy to manage state by limiting the possible values.
 */
sealed interface MarsUiState {
    data class Success(val photos: List<MarsPhoto>) : MarsUiState
    object Error : MarsUiState
    object Loading : MarsUiState
}

class MarsViewModel(
    private val marsPhotosRepository: MarsPhotosRepository
) : ViewModel() {
    /**
     * NOTE :
     * Android framework does not allow a ViewModel to be passed values in the constructor when created,
     * we implement a ViewModelProvider.Factory object, which lets us get around this limitation.
     */

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
                val result  = marsPhotosRepository.getMarsPhotos()
                marsUiState = MarsUiState.Success(
                    result
                )
            }
            catch (e: IOException){
                marsUiState = MarsUiState.Error
            }

        }
    }

    /**
     * A companion object helps us by having a single instance of an object that is used by everyone
     * without needing to create a new instance of an expensive object. This is an implementation detail,
     * and separating it lets us make changes without impacting other parts of the app's code.
     *
     * The APPLICATION_KEY is part of the
     * ViewModelProvider.AndroidViewModelFactory.Companion
     * object and is used to find the app's MarsPhotosApplication object,
     * which has the container property used to retrieve the repository used for dependency injection.
     */

    companion object{
        val Factory: ViewModelProvider.Factory = viewModelFactory {
            initializer {
                val application = (this[APPLICATION_KEY] as MarsPhotosApplication)
                val marsPhotosRepository = application.container.marsPhotosRepository
                MarsViewModel(marsPhotosRepository = marsPhotosRepository)
            }
        }
    }
}
