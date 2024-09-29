package dizzcode.com.marsphotos.network

import com.jakewharton.retrofit2.converter.kotlinx.serialization.asConverterFactory
import dizzcode.com.marsphotos.model.MarsPhoto
import kotlinx.serialization.json.Json
import okhttp3.MediaType.Companion.toMediaType
import retrofit2.Retrofit
import retrofit2.http.GET

private const val BASE_URL =
    "https://android-kotlin-fun-mars-server.appspot.com"

private val retrofit = Retrofit.Builder()
    .addConverterFactory(Json.asConverterFactory("application/json".toMediaType()))
    .baseUrl(BASE_URL)
    .build()

object MarsApi {

    val retrofitService: MarsApiService by lazy {
        retrofit.create(MarsApiService::class.java)
    }
}

interface MarsApiService {
    @GET("photos")
    suspend fun getPhotos(): List<MarsPhoto>
}


/** NOTE
 * In Kotlin, object declarations are used to declare singleton objects.
 *
 * Warning:
 * Singleton pattern is not a recommended practice.
 * Singletons represent global states that are hard to predict, particularly in tests.
 * Objects should define which dependencies they need, instead of describing how to create them.
 *
 * Use Dependency injection over singleton pattern,
 */


