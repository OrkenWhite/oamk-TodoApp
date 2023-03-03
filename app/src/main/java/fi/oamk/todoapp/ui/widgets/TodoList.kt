package fi.oamk.todoapp.ui.widgets

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Divider
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import fi.oamk.todoapp.model.Todo

@Composable
fun TodoList(list: List<Todo>) {
    LazyColumn(
        modifier = Modifier.padding(8.dp)
    ) {
        items(list) { item ->
            Text(
                text = item.title,
                modifier = Modifier.padding(top = 4.dp, bottom = 4.dp)
            )
            Divider(color = Color.LightGray, thickness = 1.dp)
        }
    }
}