package com.example.ie3a_2180020naviwork06.ui.gallery

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebView
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.example.ie3a_2180020naviwork06.R

class GalleryFragment : Fragment() {

    private lateinit var galleryViewModel: GalleryViewModel

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        //galleryViewModel =
                //ViewModelProviders.of(this).get(GalleryViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_gallery, container, false)
        //val textView: TextView = root.findViewById(R.id.text_gallery)
        //galleryViewModel.text.observe(viewLifecycleOwner, Observer {
            //textView.text = it
        //})

        val myWebView: WebView = root.findViewById(R.id.text_gallery)
        myWebView.loadUrl("https://www.google.co.jp")
        return root
    }
}