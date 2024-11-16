package com.glide.demo.ui.main

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.bumptech.glide.Glide
import com.glide.demo.databinding.FragmentGlideImageBinding
import com.glide.demo.ui.DetailActivity

class GlideImageFragment : Fragment() {

    private lateinit var mBinding: FragmentGlideImageBinding

    private val url1 =
        "https://gd-hbimg.huaban.com/c7561be502af9d2058f3e4854967c25cca8bbef511e97-iYvjs3_fw1200webp"
    private val url2 =
        "https://gd-hbimg.huaban.com/d4ba218f205bd0fcb07b92122bce2c144e11d6a234906-sxoccL_fw1200"

    companion object {
        fun newInstance(): GlideImageFragment {
            return GlideImageFragment()
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        mBinding = FragmentGlideImageBinding.inflate(inflater, container, true)
        val root = mBinding.root
        return root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        mBinding.glideFragmentTitle.setOnClickListener {
            val intent = Intent(context, DetailActivity::class.java)
            startActivity(intent)
        }
        Glide.with(this).load(url1).into(mBinding.glideFragmentImg1)
        Glide.with(this)
            .asGif()
            .load(url2)
            .into(mBinding.glideFragmentImg2)
    }
}