package com.example.siksham.ui.theme


import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyListScope
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color.Companion.Black
import androidx.compose.ui.graphics.Color.Companion.Red
import androidx.compose.ui.graphics.Color.Companion.White
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import com.example.siksham.R


@Composable
fun NestedScrolling(navController: NavHostController) {
    LazyColumn(
        modifier = Modifier.fillMaxSize()
            .background(color=White)

    ) {
        item{
            HomeScreen(navController)
        }
        aCE()
        item{

            ViewAll(navController)

        }

    }
}

@Composable
fun HomeScreen(navController: NavHostController) {
    Row(
        modifier = Modifier
        .background(color=White)
        .fillMaxSize()

    ){
        Column{

                SearchBar()
                Greeting()
                AlignYourBodyRow()
                PC()
                PopularCoursesRow()

            AC(

                navController = navController
            )

        }
    }
}

@Composable
fun Greeting(

){
        Row(
            horizontalArrangement =Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .fillMaxWidth()
                .padding(start=15.dp,top=10.dp)
        ){
            Column(
                verticalArrangement = Arrangement.Center
            ){
                Text(
                    text="Nomosker, ",
                    color=Black,
                    style= MaterialTheme.typography.displaySmall,
                    fontSize = 45.sp,
                    fontWeight = FontWeight.Bold
                )

                Text(
                    text="Niloy Basu",
                    color=Black,
                    style= MaterialTheme.typography.displaySmall,
                    fontSize =45.sp,
                    fontWeight = FontWeight.Bold

                )
            }

        }

}



@Composable
fun SearchBar(
    modifier: Modifier = Modifier
) {
    Box(
        modifier= Modifier
            .padding(start=15.dp,top=50.dp,end=20.dp)
    ){
    TextField(
        value = "",
        onValueChange = {},
        leadingIcon = {
            Icon(
                imageVector = Icons.Default.Search,
                contentDescription = null
            )
        },
        colors = TextFieldDefaults.colors(
            unfocusedContainerColor = MaterialTheme.colorScheme.surface,
            focusedContainerColor = MaterialTheme.colorScheme.background
        ),
        placeholder = {
            Text(stringResource(R.string.placeholder_search))
        },
        modifier = modifier
            .fillMaxWidth()
            .heightIn(min = 56.dp)
    )}
}




@Composable
fun AlignYourBodyElement(
    @DrawableRes drawable: Int,

    modifier: Modifier = Modifier
) {
    Box(
        modifier= Modifier
            .fillMaxWidth()
            .padding(top=20.dp)

    ){
    Column(
        modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally

    ) {
        Image(
            painter = painterResource(drawable),
            contentDescription = null,
            contentScale = ContentScale.FillBounds,
            modifier = Modifier
                .size(height = 200.dp,width=350.dp )
                .clip(RoundedCornerShape(15.dp))
        )

    }
}}

@Composable
fun AlignYourBodyRow(
    modifier: Modifier = Modifier
) {
    LazyRow(
        horizontalArrangement = Arrangement.spacedBy(8.dp),
        contentPadding = PaddingValues(horizontal = 16.dp),
        modifier = modifier
    ) {

        items(alignYourBodyData) { item ->
            AlignYourBodyElement(
                drawable = item.drawable,
                modifier = Modifier.padding(8.dp) // Ensure proper spacing
            )
        }
    }
}

@Composable
fun PC(
    modifier: Modifier = Modifier
){
    Box (
        modifier = Modifier
            .fillMaxWidth()
            .padding(15.dp)


    ) {
        Row(
            modifier = modifier
                .fillMaxWidth()

        ){
            Text(
            text="Popular Courses ",
            color=Black,
            style= MaterialTheme.typography.bodyMedium,
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold
            )
            Spacer( modifier=modifier.padding(40.dp))

            Icon(
                painter = painterResource(id=R.drawable.right_24),
                contentDescription = null,

                modifier=Modifier
                    .size(40.dp)


            )


        }

    }

}


@Composable
fun PopularCoursesElement(
    @DrawableRes drawables: Int,
    text: String,
    texts: String,
    modifier: Modifier = Modifier
) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 20.dp)
            .size(width = 250.dp, height = 250.dp)


    ) {

            Column(
                modifier = modifier,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {

                Image(
                    painter = painterResource(drawables),
                    contentDescription = null,
                    contentScale = ContentScale.FillBounds,
                    modifier = Modifier
                        .size(height = 150.dp, width = 250.dp)
                        .clip(RoundedCornerShape(15.dp))

                )
                Text(
                    text = text,
                    modifier = Modifier.padding(start=5.dp,top = 15.dp, bottom = 8.dp),
                    style = MaterialTheme.typography.bodyMedium,
                    fontSize = 15.sp,
                    fontWeight = FontWeight.Bold,
                    color = Black,

                )
                Text(
                    text=texts,
                    modifier = Modifier.padding(start=5.dp,top = 3.dp, bottom = 8.dp),
                    style = MaterialTheme.typography.bodyMedium,
                    fontSize = 15.sp,
                    fontWeight = FontWeight.Bold,
                    color = Black,
                )
            }
        }

    }



@Composable
fun PopularCoursesRow(
    modifier: Modifier = Modifier
) {
    LazyRow(
        horizontalArrangement = Arrangement.spacedBy(15.dp),
        contentPadding = PaddingValues(horizontal = 16.dp),
        modifier = modifier
    ) {
        items(Data) { item ->
            PopularCoursesElement(item.drawables, item.text , item.texts)
        }
    }
}

@Composable
fun AC(
    modifier: Modifier = Modifier,
    navController: NavHostController

    ) {
        Button(
            onClick = {
                navController.navigate("All")
            }
        ) {
            Row(
                modifier = modifier
                    .fillMaxWidth()

            )
            {
                Text(
                    text = "All Courses ",
                    color = Black,
                    style = MaterialTheme.typography.bodyMedium,
                    fontSize = 30.sp,
                    fontWeight = FontWeight.Bold
                )
                Spacer(modifier= Modifier.padding(start = 40.dp))

                Icon(
                    painter = painterResource(id = R.drawable.right_24),
                    contentDescription = null,

                    modifier = Modifier
                        .size(40.dp)


                )


            }

        }
}





@Composable
fun AllCoursesElement(
        @DrawableRes drawable: Int,
        text: String,
        texts: String,
        modifier: Modifier = Modifier
    ) {
        Box(

            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 20.dp, start = 20.dp, end = 20.dp)
                .size(width = 250.dp, height = 350.dp)
                .clip(RoundedCornerShape(15.dp))
                .border(2.dp, color = Red)
        ) {

            Column(
                modifier = modifier,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {

                Image(
                    painter = painterResource(drawable),
                    contentDescription = null,
                    contentScale = ContentScale.FillBounds,
                    modifier = Modifier
                        .fillMaxWidth()
                        .size(height = 250.dp, width = 300.dp)
                        .clip(RoundedCornerShape(15.dp))

                )
                Text(
                    text = text,
                    modifier = Modifier
                        .padding(start = 5.dp, top = 15.dp)
                        .fillMaxWidth(),
                    style = MaterialTheme.typography.bodyMedium,
                    fontSize = 15.sp,
                    fontWeight = FontWeight.Bold,
                    color = Black,

                    )
                Text(
                    text = texts,
                    modifier = Modifier.padding(start = 5.dp, top = 3.dp, bottom = 8.dp)
                        .fillMaxWidth(),
                    style = MaterialTheme.typography.bodyMedium,
                    fontSize = 15.sp,
                    fontWeight = FontWeight.Bold,
                    color = Black,
                )
            }
        }

    }


fun LazyListScope.aCE() {
        items(D.take(3)) { item ->
            AllCoursesElement(
                drawable = item.drawable,
                text = item.text,
                texts = item.texts
            )

        }}

@Composable
fun ViewAll(navController: NavController) {

            Button(onClick = {
                navController.navigate("All")
            }, modifier = Modifier.fillMaxWidth().padding(start=20.dp, end = 20.dp)
                .height(60.dp)

            ) {

                Text(
                    text = "View All",
                    style = MaterialTheme.typography.bodyMedium,
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold,
                    color = Black,
                    textAlign = TextAlign.Center
                )
            }
    }








































