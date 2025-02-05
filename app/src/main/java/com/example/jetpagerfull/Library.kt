package com.example.jetpagerfull

import android.text.Layout
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jetpagerfull.utils.dataText

@Preview
@Composable
fun LibraryPage() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
            .background(color = Color.Black)
            .padding(top = 40.dp, start = 25.dp, end = 25.dp, bottom = 100.dp)
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(20.dp)
        ){
            Text(
                modifier = Modifier.padding(start = 10.dp,top = 5.dp),
                text = "Library",
                color = Color.White,
                fontWeight = FontWeight.Bold,
                fontFamily = FontFamily.Monospace,
                fontSize = 20.sp
            )

            Spacer(modifier = Modifier.width(80.dp))

            Icon(
                modifier = Modifier.size(30.dp),
                imageVector = Icons.Filled.Notifications,
                contentDescription = "Notification"
            )

            Icon(
                modifier = Modifier.size(30.dp),
                imageVector = Icons.Filled.Search,
                contentDescription = "Notification"
            )

            Box(
                modifier = Modifier
                    .size(30.dp)
                    .background(color = Color.Blue, shape = CircleShape),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = "S",
                    style = MaterialTheme.typography.headlineSmall,
                    color = Color.White,
                    fontWeight = FontWeight.Bold,
                    textAlign = TextAlign.Center
                )
            }
        }

        Spacer(modifier = Modifier.height(10.dp))

        LazyRow(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(10.dp),
            contentPadding = PaddingValues(10.dp)
        ) {
            itemsIndexed(dataText){ index, item ->
                Spacer(modifier = Modifier.height(15.dp))
                RowItem(dataText = item)
                Spacer(modifier = Modifier.height(15.dp))
            }
        }

        Spacer(modifier = Modifier.height(10.dp))

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp)
        ){
           Text(text="Recent Activity", color = Color.White)
            Icon(imageVector = Icons.Filled.KeyboardArrowDown,contentDescription = null)
        }

        Spacer(modifier = Modifier.height(10.dp))

        LazyColumn(
            modifier = Modifier
                .fillMaxWidth()
                .height(600.dp),
            contentPadding = PaddingValues(16.dp)
        ) {
            itemsIndexed(MainActivity.dataImage){index, item ->
                ColItem(dataImage = item)
                Spacer(modifier = Modifier.height(8.dp))
            }
        }
    }
}


@Composable
private fun ColItem(dataImage: DataImage) {
    Column(
        modifier = Modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Row(
            modifier = Modifier
                .padding(8.dp)
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceAround
        ) {
            Row {
                Image(
                    modifier = Modifier
                        .width(50.dp)
                        .height(50.dp),
                    painter = painterResource(id = dataImage.image),
                    contentDescription = dataImage.title,
                    contentScale = ContentScale.Crop
                )

                Spacer(modifier = Modifier.width(15.dp))

                Column(
                    modifier = Modifier.padding(top = 8.dp)
                ) {
                    Text(
                        text = dataImage.title,
                        fontWeight = FontWeight.Medium,
                        color = Color.White,
                        style = MaterialTheme.typography.labelMedium
                    )
                    Text(
                        text = dataImage.title,
                        fontWeight = FontWeight.Light,
                        color = Color.White,
                        style = MaterialTheme.typography.bodySmall
                    )

                }
            }

            Spacer(modifier = Modifier.width(160.dp))

            Icon(
                imageVector = Icons.Filled.MoreVert,
                modifier = Modifier.padding(top = 10.dp),
                contentDescription = null
            )
        }
    }
}