package com.example.jetpagerfull

import androidx.compose.animation.AnimatedContent
import androidx.compose.animation.AnimatedVisibilityScope
import androidx.compose.animation.ExperimentalSharedTransitionApi
import androidx.compose.animation.SharedTransitionLayout
import androidx.compose.animation.SharedTransitionScope
import androidx.compose.foundation.BorderStroke
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
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyHorizontalGrid
import androidx.compose.foundation.lazy.grid.itemsIndexed
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AddCircle
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.ThumbUp
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
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


@OptIn(ExperimentalSharedTransitionApi::class)
@Preview
@Composable
fun HomePage() {

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
                text = "Music",
                color = Color.White,
                fontWeight = FontWeight.Bold,
                fontFamily = FontFamily.Monospace,
                fontSize = 20.sp
            )

            Spacer(modifier = Modifier.width(100.dp))

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
            color = Color.White,
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
            modifier = Modifier.fillMaxWidth()
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

            Spacer(modifier = Modifier.width(135.dp))

            Icon(
                modifier = Modifier
                    .size(30.dp)
                    .align(Alignment.CenterVertically),
                imageVector = Icons.Filled.AddCircle,
                contentDescription = "Arrow",
            )
        }

        Spacer(modifier = Modifier.height(20.dp))

        LazyHorizontalGrid(
            modifier = Modifier
                .fillMaxWidth()
                .height(400.dp),
            contentPadding = PaddingValues(horizontal = 0.dp),
            rows = GridCells.Fixed(3)
        ) {
            itemsIndexed(MainActivity.dataImage){index, item ->
                Spacer(modifier = Modifier.height(0.dp))
                GridItem(dataImage = item)
                Spacer(modifier = Modifier.height(0.dp))
            }
        }

        Spacer(modifier = Modifier.height(20.dp))

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp)
        ){
            Text(
                text = "Radios for you",
                fontWeight = FontWeight.Bold,
                style = MaterialTheme.typography.titleMedium
            )
        }


        LazyRow(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(10.dp),
            contentPadding = PaddingValues(10.dp)
        ) {
            itemsIndexed(MainActivity.dataImage){index, item ->
                RowItem2(dataImage = item)
            }
        }

        Spacer(modifier = Modifier.height(20.dp))

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp)
        ) {
            Box(
                modifier = Modifier
                    .size(50.dp)
                    .clip(RoundedCornerShape(10.dp))
                    .background(color = Color.Blue, shape = RectangleShape),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = "M",
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
                    text ="SIMILAR TO",
                    fontWeight = FontWeight.Light,
                    style = MaterialTheme.typography.bodySmall
                )
                Text(
                    text = "no mood",
                    fontWeight = FontWeight.Bold,
                    style = MaterialTheme.typography.titleMedium
                )
            }
        }

        LazyRow(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(10.dp),
            contentPadding = PaddingValues(10.dp)
        ) {
            itemsIndexed(MainActivity.dataImage){index, item ->
                RowItem2(dataImage = item)
            }
        }

        Spacer(modifier = Modifier.height(20.dp))

        CardHolder()
        var showDetails by remember { mutableStateOf(false) }
        SharedTransitionLayout {
            AnimatedContent(
                showDetails,
                label = "basic",
            ) { targetState ->
                if (!targetState){
                    RowList(
                        onShowDetails = {
                            showDetails=true
                        },
                        animatedVisibilityScope = this@AnimatedContent,
                        sharedTransitionScope = this@SharedTransitionLayout
                    )
                } else{
                    DetailScreen(

                    )
                }
            }
        }
        //RowList()
    }
}

@Composable
fun RowItem(dataText: DataText) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(20.dp)),
    ) {

        Box(
           modifier = Modifier
               .background(Color.DarkGray)
               .padding(top = 10.dp, bottom = 10.dp, end = 10.dp)
               .clip(
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
            modifier = Modifier
                .padding(8.dp)
                .fillMaxWidth(),
        ) {
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
            modifier = Modifier
                .padding(8.dp)
                .fillMaxWidth(),
        ) {
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
            modifier = Modifier
                .padding(8.dp)
                .fillMaxWidth(),
        ) {
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
            modifier = Modifier
                .padding(8.dp)
                .fillMaxWidth(),
        ) {
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
        modifier = Modifier
            .padding(1.dp)
            .height(150.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Box(
            modifier = Modifier.clip(RoundedCornerShape(16.dp))
        ) {
            Image(
                modifier = Modifier
                    .size(150.dp)
                    .clip(RoundedCornerShape(10.dp)),
                painter = painterResource(id = dataImage.image),
                contentDescription = dataImage.title,
                contentScale = ContentScale.Crop
            )

            Text(
                text = dataImage.title,
                fontWeight = FontWeight.Medium,
                modifier = Modifier
                    .align(Alignment.BottomStart)
                    .clip(RoundedCornerShape(25.dp))
                    .background(Color.DarkGray)
                    .padding(10.dp),
                color = Color.White,
                style = MaterialTheme.typography.labelMedium
            )
        }
    }
}


@Composable
fun RowItem2(dataImage: DataImage) {

    Column(
        modifier = Modifier
            .height(200.dp),
        horizontalAlignment = Alignment.Start,
        verticalArrangement = Arrangement.Center
    ) {

            Image(
                modifier = Modifier
                    .size(150.dp)
                    .clip(RoundedCornerShape(10.dp)),
                painter = painterResource(id = dataImage.image),
                contentDescription = dataImage.title,
                contentScale = ContentScale.Crop
            )

            Text(
                text = "Hindi Radio",
                fontWeight = FontWeight.Medium,
                color = Color.White,
                style = MaterialTheme.typography.labelMedium
            )

        Text(
            text = "KK, Vishal-Shekhar, Ash King and Shekhar Ravjiani",
            maxLines = 2,
            fontWeight = FontWeight.Medium,
            modifier = Modifier
                .width(80.dp),
            color = Color.White,
            style = MaterialTheme.typography.labelSmall
        )
    }
}


@Preview
@Composable
private fun CardHolder() {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .height(530.dp)
            .padding(8.dp)
    ) {
        Column(
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(10.dp)
            ) {
                Image(
                    modifier = Modifier
                        .height(100.dp)
                        .clip(RoundedCornerShape(5.dp)),
                    painter = painterResource(id = R.drawable.rock),
                    contentDescription = null,
                )

                Column{

                    Text(
                        modifier = Modifier.padding(top = 10.dp, start = 5.dp),
                        text = "Retro Grooves:",
                        fontWeight = FontWeight.Bold,
                        fontSize = 18.sp
                    )

                    Text(
                        modifier = Modifier.padding(start = 5.dp),
                        text = "Bollywood",
                        fontWeight = FontWeight.Bold,
                        fontSize = 18.sp
                    )

                    Text(
                        modifier = Modifier.padding(top = 5.dp,start = 5.dp),
                        text = "YouTube Music",
                        fontWeight = FontWeight.Light,
                        fontSize = 14.sp
                    )

                    Text(
                        modifier = Modifier.padding(start = 5.dp),
                        text = "50 songs",
                        fontWeight = FontWeight.Light,
                        fontSize = 14.sp
                    )
                }
            }

            Text(
                modifier = Modifier.padding(10.dp),
                text = "Listen to these classic Bollywood bangers and get ready to set the floor on fire!"
            )

            Spacer(modifier = Modifier.height(10.dp))

            Row(
               modifier = Modifier
                   .fillMaxWidth()
                   .padding(10.dp)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.rock),
                    modifier = Modifier.height(60.dp),
                    contentDescription = null
                )

                Column {

                    Text(
                        modifier = Modifier.padding(top = 10.dp, start = 5.dp),
                        text = "Om Shanti Om- Meri Umar ke Naujawano",
                        fontWeight = FontWeight.Medium,
                        fontSize = 15.sp
                    )

                    Text(
                        modifier = Modifier.padding(start = 5.dp),
                        text = "Kishore Kumar * 2.6 crore plays",
                        fontWeight = FontWeight.Light,
                        fontSize = 15.sp
                    )
                }

                Icon(
                    modifier = Modifier
                        .height(20.dp)
                        .align(Alignment.CenterVertically),
                    imageVector = Icons.Filled.MoreVert,
                    contentDescription = "Vert",
                )
            }

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(10.dp)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.rock),
                    modifier = Modifier.height(60.dp),
                    contentDescription = null
                )

                Column {

                    Text(
                        modifier = Modifier.padding(top = 10.dp, start = 5.dp),
                        text = "Rang Barse Bheegi Chunarwali",
                        fontWeight = FontWeight.Medium,
                        fontSize = 15.sp
                    )

                    Text(
                        modifier = Modifier.padding(start = 5.dp),
                        text = "Amitabh bachchan * 79 Lakh plays",
                        fontWeight = FontWeight.Light,
                        fontSize = 15.sp
                    )
                }

                Spacer(modifier = Modifier.width(40.dp))

                Icon(
                    modifier = Modifier
                        .height(15.dp)
                        .align(Alignment.CenterVertically),
                    imageVector = Icons.Filled.MoreVert,
                    contentDescription = "Vert",
                )
            }

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(10.dp),
                horizontalArrangement = Arrangement.SpaceAround
            ) {
                Image(
                    painter = painterResource(id = R.drawable.rock),
                    modifier = Modifier.height(60.dp),
                    contentDescription = null
                )

                Column(

                ) {

                    Text(
                        modifier = Modifier.padding(top = 10.dp, start = 5.dp),
                        text = "Jai Jai Shiv Shankar",
                        fontWeight = FontWeight.Medium,
                        fontSize = 15.sp
                    )

                    Text(
                        modifier = Modifier.padding(start = 5.dp, end = 15.dp),
                        maxLines = 1,
                        text = "Lata Mangeshkar,Kishore Kumar * 3.8 lakh plays",
                        fontWeight = FontWeight.Light,
                        fontSize = 15.sp
                    )
                }

                Icon(
                    modifier = Modifier
                        .height(10.dp),
                    imageVector = Icons.Filled.MoreVert,
                    contentDescription = "Vert",
                )
            }
        }

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp)
        ) {
            Box(
                modifier = Modifier
                    .size(50.dp)
                    .border(border = BorderStroke(2.dp, color = Color.Black), shape = CircleShape,)
                    .background(color = Color.Transparent, shape = CircleShape),
                contentAlignment = Alignment.Center
            ) {
                Icon(
                    modifier = Modifier
                        .height(30.dp),
                    imageVector = Icons.Filled.PlayArrow,
                    contentDescription = "Vert",
                )
            }

            Spacer(modifier = Modifier.width(20.dp))

            Box(
                modifier = Modifier
                    .size(50.dp)
                    .border(border = BorderStroke(2.dp, color = Color.Black), shape = CircleShape,)
                    .background(color = Color.Transparent, shape = CircleShape),
                contentAlignment = Alignment.Center
            ) {
                Icon(
                    modifier = Modifier
                        .height(30.dp),
                    imageVector = Icons.Filled.Favorite,
                    contentDescription = "Vert",
                )
            }

            Spacer(modifier = Modifier.width(20.dp))

            Box(
                modifier = Modifier
                    .size(50.dp)
                    .border(border = BorderStroke(2.dp, color = Color.Black), shape = CircleShape,)
                    .background(color = Color.Transparent, shape = CircleShape),
                contentAlignment = Alignment.Center
            ) {
                Icon(
                    modifier = Modifier
                        .height(30.dp),
                    imageVector = Icons.Filled.ThumbUp,
                    contentDescription = "Vert",
                )
            }
        }
    }
}


@OptIn(ExperimentalSharedTransitionApi::class)

@Composable
private fun RowList(
    onShowDetails: () -> Unit,
    sharedTransitionScope: SharedTransitionScope,
    animatedVisibilityScope: AnimatedVisibilityScope
) {
                Row(
                    modifier = Modifier
                        .padding(8.dp)
                        .fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceAround,
                ) {
                    Row {
                        with(sharedTransitionScope) {
                            Image(
                                modifier = Modifier
                                    .width(50.dp)
                                    .height(50.dp)
                                    .sharedElement(rememberSharedContentState(key = "image"),
                                        animatedVisibilityScope=animatedVisibilityScope
                                    ),
                                painter = painterResource(id = R.drawable.rock),
                                contentDescription = null,
                                contentScale = ContentScale.Crop
                            )
                        }

                        Spacer(modifier = Modifier.width(15.dp))

                        Column(
                            modifier = Modifier.padding(top = 8.dp)
                        ) {
                            Text(
                                text = "Kun Faya Kun",
                                fontWeight = FontWeight.Medium,
                                color = Color.White,
                                style = MaterialTheme.typography.labelMedium
                            )
                            Text(
                                text = "A.R. Rahman, Javed Ali & Mohit Chauhan",
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



