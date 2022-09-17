package com.example.scrollinglist.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

//The model package will contain the data model that will be represented by a data class.
//Imagine data model as your food prepared by your mom and currently
//one roti at a time

data class College(@StringRes val stringRes: Int,@DrawableRes val imageRes: Int)