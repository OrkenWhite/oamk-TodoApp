package fi.oamk.todoapp.model
import retrofit2.http.GET
data class Todo(
    var userId: Int,
    var id: Int,
    var title: String,
    var completed: Boolean

)
