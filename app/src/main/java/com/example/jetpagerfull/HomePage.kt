package com.example.jetpagerfull

import android.graphics.drawable.Icon
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyHorizontalGrid
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.itemsIndexed
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.MailOutline
import androidx.compose.material.icons.materialIcon
import androidx.compose.material3.AlertDialogDefaults.shape
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.pointer.motionEventSpy
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jetpagerfull.utils.dataText


public object utils{
    val dataText= listOf(
        DataText("Soothing"),
        DataText("Podcasts"),
        DataText("Relaxing"),
        DataText("Party"),
        DataText("Workout"),
        DataText("Energise"),
        DataText("Sad"),
        DataText("Heartbreak"),
        DataText("Dance"),
        DataText("Sounds"),
    )
}


@Preview
@Composable
fun HomePage() {

    Column(
        modifier = Modifier.fillMaxSize()
            .verticalScroll(rememberScrollState())
            .background(Color.LightGray)
            .padding(top = 40.dp, start = 25.dp, end=25.dp, bottom = 20.dp)
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(20.dp)
        ){
            Text(
                modifier = Modifier.padding(start = 10.dp,top = 5.dp),
                text = "Music",
                color = Color.Black,
                fontWeight = FontWeight.Bold,
                fontFamily = FontFamily.Monospace,
                fontSize = 20.sp
            )

            Spacer(modifier = Modifier.width(100.dp))

            Icon(
                modifier = Modifier.size(30.dp),
                painter = painterResource(id = R.drawable.noti),
                contentDescription = "Notification"
            )

            Icon(
                modifier = Modifier.size(30.dp),
                painter = painterResource(id = R.drawable.search),
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

        Spacer(modifier = Modifier.height(30.dp))

        LazyRow(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(10.dp),
            contentPadding = PaddingValues(10.dp)
        ) {
              itemsIndexed(dataText){index, item ->
                  Spacer(modifier = Modifier.height(15.dp))
                  RowItem(dataText = item)
                  Spacer(modifier = Modifier.height(15.dp))
              }
        }

        Spacer(modifier = Modifier.height(20.dp))

        Text(
            modifier = Modifier.padding(start = 10.dp),
            text = "Quick Picks",
            color = Color.Black,
            fontWeight = FontWeight.Bold,
            fontFamily = FontFamily.Serif,
            fontSize = 16.sp
        )

        LazyRow(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(10.dp),
            contentPadding = PaddingValues(10.dp)
        ) {
            itemsIndexed(MainActivity.dataImage){index, item ->
                Spacer(modifier = Modifier.height(15.dp))
                RowItem(dataImage = item)
                Spacer(modifier = Modifier.height(15.dp))
            }
        }

        Spacer(modifier = Modifier.height(20.dp))

        Row (
            modifier = Modifier.fillMaxWidth().padding(10.dp)
        ){
            Box(
                modifier = Modifier
                    .size(50.dp)
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

            Column(
                modifier = Modifier.padding(top = 8.dp, start = 10.dp)
            ) {
                Text(
                    text ="SHUBHANSH MISHRA",
                    fontWeight = FontWeight.Light,
                    style = MaterialTheme.typography.bodySmall
                )
                Text(
                    text = "Speed Dial",
                    fontWeight = FontWeight.Bold,
                    style = MaterialTheme.typography.titleMedium
                )
            }

            Spacer(modifier = Modifier.width(110.dp))

            Icon(
                modifier = Modifier.size(30.dp).align(Alignment.CenterVertically),
                painter = painterResource(id = R.drawable.arrow),
                contentDescription = "Arrow",
            )
        }

        LazyHorizontalGrid(
            modifier = Modifier.fillMaxWidth().height(400.dp),
            contentPadding = PaddingValues(horizontal = 5.dp),
            rows = GridCells.Fixed(2)
        ) {
            itemsIndexed(MainActivity.dataImage){index, item ->
                Spacer(modifier = Modifier.height(20.dp))
                GridItem(dataImage = item)
                Spacer(modifier = Modifier.height(20.dp))
            }
        }
    }
}

@Composable
fun RowItem(dataText: DataText) {
    Row(
        modifier = Modifier.fillMaxWidth().clip(RoundedCornerShape(20.dp)),
    ) {

        Box(
           modifier = Modifier.background(Color.DarkGray).padding(top = 10.dp, bottom = 10.dp, end = 10.dp).clip(
               RoundedCornerShape(36.dp)
           ),
        ) {
            Text(text = dataText.title,
                fontWeight = FontWeight.Medium,
                color = Color.Yellow,
                modifier = Modifier.padding(start = 15.dp, end = 5.dp),
                style = MaterialTheme.typography.labelMedium
            )
        }
    }
}


@Composable
fun RowItem(dataImage: DataImage) {
    Column{
        Row(
            modifier = Modifier.padding(8.dp)
                .fillMaxWidth(),
        ) {
            Image(
                modifier = Modifier.width(50.dp).height(50.dp),
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
                    style = MaterialTheme.typography.labelMedium
                )
                Text(
                    text = dataImage.title,
                    fontWeight = FontWeight.Light,
                    style = MaterialTheme.typography.bodySmall
                )

            }
        }

        Row(
            modifier = Modifier.padding(8.dp)
                .fillMaxWidth(),
        ) {
            Image(
                modifier = Modifier.width(50.dp).height(50.dp),
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
                    style = MaterialTheme.typography.labelMedium
                )
                Text(
                    text = dataImage.title,
                    fontWeight = FontWeight.Light,
                    style = MaterialTheme.typography.bodySmall
                )

            }
        }
        Row(
            modifier = Modifier.padding(8.dp)
                .fillMaxWidth(),
        ) {
            Image(
                modifier = Modifier.width(50.dp).height(50.dp),
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
                    style = MaterialTheme.typography.labelMedium
                )
                Text(
                    text = dataImage.title,
                    fontWeight = FontWeight.Light,
                    style = MaterialTheme.typography.bodySmall
                )

            }
        }
        Row(
            modifier = Modifier.padding(8.dp)
                .fillMaxWidth(),
        ) {
            Image(
                modifier = Modifier.width(50.dp).height(50.dp),
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
                    style = MaterialTheme.typography.labelMedium
                )
                Text(
                    text = dataImage.title,
                    fontWeight = FontWeight.Light,
                    style = MaterialTheme.typography.bodySmall
                )

            }
        }
    }
}

@Composable
fun GridItem(dataImage: DataImage) {
    Column(
        modifier = Modifier.padding(8.dp).height(150.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Image(modifier = Modifier.size(150.dp).clip(RoundedCornerShape(30.dp)),
            painter = painterResource(id = dataImage.image), contentDescription = dataImage.title, contentScale = ContentScale.Crop)

        Spacer(modifier = Modifier.height(10.dp))

        Text(text = dataImage.title,
            fontWeight = FontWeight.Medium,
            style = MaterialTheme.typography.labelMedium
        )
    }
}
