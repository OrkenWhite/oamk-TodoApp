package fi.oamk.todoapp.viewmodel

import android.util.Log
import androidx.compose.runtime.mutableStateListOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import fi.oamk.todoapp.model.Todo
import fi.oamk.todoapp.model.TodosApi
import kotlinx.coroutines.launch

class TodoViewModel : ViewModel() {
    var todos = mutableListOf<Todo>()
        private set
    init{
        getTodosList()
        /*val t:Todo = Todo(
            userId = 0,
            title = "Test",
            id = 0,
            completed = false
        )
        todos.add(t)*/
    }
    private fun getTodosList(){
        viewModelScope.launch {
            val todosApi: TodosApi?
            try{
                todosApi = TodosApi.getInstance()
                todos.addAll(todosApi.getTodos())
                Log.d("TODOVIEWMODEL",todos.toString())
            }catch (e: Exception){
                Log.d("TODOVIEWMODEL",e.message.toString())
            }

        }
    }

}