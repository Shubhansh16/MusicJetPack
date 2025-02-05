package com.example.jetpagerfull

import android.graphics.drawable.Icon
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
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Face
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.KeyboardArrowRight
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.ThumbUp
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.AbsoluteAlignment
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewParameter
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jetpagerfull.utils.dataText
import org.w3c.dom.Text

@Preview
@Composable
fun ExplorePage() {
   Column(
      modifier = Modifier
         .fillMaxSize()
         .verticalScroll(rememberScrollState())
         .background(color = Color.Black)
         .padding(top = 40.dp, start = 25.dp, end = 25.dp, bottom = 100.dp)
   ) {
      Row(
         modifier = Modifier.fillMaxWidth(),
         horizontalArrangement = Arrangement.SpaceBetween
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

      Spacer(modifier = Modifier.height(20.dp))

      RowBox(icon = Icons.Filled.ThumbUp, text = "New releases")
      RowBox(icon = Icons.Filled.Face, text = "Podcast")

      Spacer(modifier = Modifier.height(20.dp))

      Row(
         modifier = Modifier.fillMaxWidth(),
         horizontalArrangement = Arrangement.SpaceBetween
      ) {

         Text(
            text = "New albums and singles",
            color = Color.White,
            fontWeight = FontWeight.Bold,
            fontSize = 18.sp
         )

         Icon(
            imageVector = Icons.Filled.KeyboardArrowRight,
            contentDescription = null
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

      LazyRow(
         modifier = Modifier.fillMaxWidth(),
         horizontalArrangement = Arrangement.spacedBy(10.dp),
         contentPadding = PaddingValues(10.dp)
      ) {
         itemsIndexed(dataText){index, item ->
            Spacer(modifier = Modifier.height(15.dp))
            RowItem33(dataText = item)
            Spacer(modifier = Modifier.height(15.dp))
         }
      }
   }
}



@Composable
private fun RowBox(icon: ImageVector, text:String) {
   Row(
      modifier = Modifier
         .fillMaxWidth()
         .padding(10.dp)
         .height(80.dp)
   ) {
       Box(
         modifier = Modifier
            .fillMaxHeight()
            .width(160.dp)
            .clip(RoundedCornerShape(10.dp))
            .background(Color.DarkGray)
       ) {
           Icon(imageVector = icon,
              modifier = Modifier.padding(10.dp),
              contentDescription = null
           )

          Text(
             text=text,
             modifier = Modifier
                .padding(10.dp)
                .align(Alignment.BottomStart),
             fontSize = 18.sp,
             fontWeight = FontWeight.Bold
          )
       }

      Spacer(modifier = Modifier.width(10.dp))

      Box(
         modifier = Modifier
            .fillMaxHeight()
            .width(150.dp)
            .clip(RoundedCornerShape(10.dp))
            .background(Color.DarkGray)
      ) {
         Icon(imageVector = icon,
            modifier = Modifier.padding(10.dp),
            contentDescription = null
         )

         Text(
            text="Charts",
            modifier = Modifier
               .padding(10.dp)
               .align(Alignment.BottomStart),
            fontSize = 18.sp,
            fontWeight = FontWeight.Bold
         )
      }
   }
}


@Composable
private fun RowItem33(dataText: DataText) {
   Column{
      Row(
         modifier = Modifier
            .padding(8.dp)
            .fillMaxWidth()
      ){
         Box (
            modifier = Modifier.height(50.dp)
               .width(120.dp)
               .background(Color.Yellow)
         ){
            Box(
               modifier = Modifier.fillMaxHeight()
                  .fillMaxWidth()
                  .padding(start = 10.dp)
                  .background(Color.DarkGray)
                  .clip(RoundedCornerShape(20.dp))
            ){
                 Text(text = dataText.title,
                    modifier = Modifier.align(Alignment.CenterStart).padding(10.dp),
                    color = Color.White
                 )
            }
         }
      }
      Row(
         modifier = Modifier
            .padding(8.dp)
            .fillMaxWidth()
      ){
         Box (
            modifier = Modifier.height(50.dp)
               .width(120.dp)
               .background(Color.Green)
         ){
            Box(
               modifier = Modifier.fillMaxHeight()
                  .fillMaxWidth()
                  .padding(start = 10.dp)
                  .background(Color.DarkGray)
                  .clip(RoundedCornerShape(20.dp))
            ){
               Text(text = dataText.title,
                  modifier = Modifier.align(Alignment.CenterStart).padding(10.dp),
                  color = Color.White
               )
            }
         }
      }
      Row(
         modifier = Modifier
            .padding(8.dp)
            .fillMaxWidth()
      ){
         Box (
            modifier = Modifier.height(50.dp)
               .width(120.dp)
               .background(Color.Red)
         ){
            Box(
               modifier = Modifier.fillMaxHeight()
                  .fillMaxWidth()
                  .padding(start = 10.dp)
                  .background(Color.DarkGray)
                  .clip(RoundedCornerShape(20.dp))
            ){
               Text(text = dataText.title,
                  modifier = Modifier.align(Alignment.CenterStart).padding(10.dp),
                  color = Color.White
               )
            }
         }
      }
   }
}
