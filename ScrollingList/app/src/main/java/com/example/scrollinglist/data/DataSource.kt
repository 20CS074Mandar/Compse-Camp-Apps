package com.example.scrollinglist.data

import com.example.scrollinglist.R
import com.example.scrollinglist.model.College

class DataSource {
    fun loadCollegeNames(): List<College> {
        return listOf<College>(
            College(R.string.depstar, R.drawable.depstar),
            College(R.string.cspit, R.drawable.cspit),
            College(R.string.cmpcia,R.drawable.cmpcia),
            College(R.string.iiim,R.drawable.iiim),
            College(R.string.rpcp,R.drawable.rpcp),
            College(R.string.pdpias,R.drawable.pdpias)
        )


    }
}