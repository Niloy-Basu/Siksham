package com.example.siksham.ui.theme

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color.Companion.Black
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun PopularCoursesElements(
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


@Preview
@Composable
fun PopularCoursesRows(
    modifier: Modifier = Modifier
) {
    LazyRow(
        horizontalArrangement = Arrangement.spacedBy(15.dp),
        contentPadding = PaddingValues(horizontal = 16.dp),
        modifier = modifier
    ) {
        items(Data) { item ->
            PopularCoursesElements(item.drawables, item.text , item.texts)
        }
    }
}