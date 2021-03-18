package com.nik.ant38

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity

class ContactDetailsFragment : Fragment(R.layout.fragment_contact_details) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        (activity as AppCompatActivity).supportActionBar?.title = getString(R.string.contact_details_title)
    }

    companion object {
        private const val CONTACT_ID = "CONTACT_ID"
        fun newInstance(id: String): ContactDetailsFragment {
            val args = Bundle()
            args.putString(CONTACT_ID, id)
            val fragment = ContactDetailsFragment()
            fragment.arguments = args
            return fragment
        }
    }
}