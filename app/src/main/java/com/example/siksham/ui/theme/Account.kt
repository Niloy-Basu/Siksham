
import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Create
import androidx.compose.material.icons.outlined.Person
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign


@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Topbar() {


    Scaffold(
        topBar = {


            TopAppBar(
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = MaterialTheme.colorScheme.primaryContainer,
                    titleContentColor = MaterialTheme.colorScheme.primary,
                ),


                title = {
                    Text("Your Profile")
                },

                navigationIcon = {
                    IconButton(onClick = { /* do something */ }) {
                        Icon(
                            Icons.Outlined.Person,
                            contentDescription = "Localized description"
                        )
                    }
                },
                actions = {
                    IconButton(onClick = { /*Do Something*/ }) {
                        Icon(
                            Icons.Outlined.Create,
                            contentDescription = "Localized description"
                        )
                    }
                      }
            )
        },

                bottomBar = {
                    BottomAppBar(
                    ) {
                        Text(
                            modifier = Modifier.fillMaxWidth(),
                            textAlign = TextAlign.Center,
                            text = "Bottom app bar",
                        )
                    }

        }) {innerPadding ->
        Column() {
            Text(
                text = "Niloy basu"
            )

        }
    }

}


@Composable
fun Profile(){

    Text(
        text="Niloy basu"
    )

    Box(){
        Text(
            text="Niloy"
        )
    }

}



