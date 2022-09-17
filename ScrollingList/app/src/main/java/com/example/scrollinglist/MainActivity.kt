package com.example.scrollinglist

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.scrollinglist.data.DataSource
import com.example.scrollinglist.model.College
import com.example.scrollinglist.ui.theme.ScrollingListTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ScrollingListTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    CollegeApp()
                }
            }
        }
    }
}

@Composable
fun CollegeApp() {
    ScrollingListTheme() {
        CollegeList(collegeList = DataSource().loadCollegeNames())
    }
}

@Composable
fun collegeCard(college: College, modifier: Modifier=Modifier) {
    //https://developer.android.com/codelabs/basic-android-kotlin-compose-training-add-scrollable-list?continue=https%3A%2F%2Fdeveloper.android.com%2Fcourses%2Fpathways%2Fandroid-basics-compose-unit-3-pathway-2%23codelab-https%3A%2F%2Fdeveloper.android.com%2Fcodelabs%2Fbasic-android-kotlin-compose-training-add-scrollable-list#1
    Card(modifier = Modifier.padding(12.dp), elevation = 8.dp) {
        Column() {
            Image(
                painter = painterResource(id = college.imageRes), contentDescription = stringResource(
                    id = college.stringRes
                ),
                modifier = Modifier
                    .fillMaxWidth()
                    .height(194.dp),
                contentScale = ContentScale.Crop
            )

            Text(
                text = stringResource(college.stringRes),
                modifier = Modifier.padding(16.dp),
                style = MaterialTheme.typography.h6
            )

        }
    }

}
//to Show the list of College we use List
@Composable
private fun CollegeList(collegeList: List<College>,modifier: Modifier=Modifier)
{
//    Column {
//        collegeList.forEach{college->
//            collegeCard(college = college)
//        }
//
//    }
    LazyColumn{
        items(collegeList){college->
            collegeCard(college = college)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun collegeCardPreview() {
    ScrollingListTheme {
        collegeCard(college = College(R.string.cspit,R.drawable.cspit))
    }
}