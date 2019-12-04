package com.haiph.tab

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.haiph.tab.fragment.*

class DemoPagerAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm) {

    override fun getItem(position: Int): Fragment {
        return when (position) {
            0 -> {
                OneFragment()
            }

            1 -> {
                TwoFragment()
            }

            2 -> {
                ThreeFragment()
            }

            else -> {
                OneFragment()
            }
        }
    }

    override fun getCount(): Int {
        return 3
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return when (position) {
            0 -> {
                "One"
            }

            1 -> {
                "Two"
            }

            2 -> {
                "Three"
            }

            else -> {
                "One"
            }
        }
    }
}