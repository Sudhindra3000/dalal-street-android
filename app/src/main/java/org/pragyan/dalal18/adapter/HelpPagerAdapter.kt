package org.pragyan.dalal18.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import org.pragyan.dalal18.fragment.help.FaqFragment
import org.pragyan.dalal18.fragment.help.GettingStartedFragment

class HelpPagerAdapter(fm : FragmentManager) : FragmentPagerAdapter(fm){
    override fun getItem(position: Int): Fragment {
        return when (position) {
            0 -> GettingStartedFragment()
            else -> FaqFragment()
        }
    }

    override fun getCount() = NUMBER_OF_FRAGMENTS

    override fun getPageTitle(position: Int): CharSequence? {
        return when (position) {
            0 -> "Getting Started"
            else -> "FAQ"
        }
    }

    companion object {
        private const val NUMBER_OF_FRAGMENTS = 2
    }
}