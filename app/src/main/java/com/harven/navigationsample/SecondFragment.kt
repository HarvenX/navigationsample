package com.harven.navigationsample

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.harven.navigationsample.databinding.SecondFragmentBinding

class SecondFragment : Fragment(R.layout.second_fragment) {

    private val instanceHashCode = System.identityHashCode(this)
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.e("NavigationSample", "SecondFragment onViewCreated() - HashCode: $instanceHashCode")
        val binding = SecondFragmentBinding.bind(view)
        binding.btn.setOnClickListener {
            findNavController().navigate(SecondFragmentDirections.actionSecondFragmentToThirdFragment())
        }

    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.e("NavigationSample", "SecondFragment onCreate() - HashCode: $instanceHashCode")
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.e("NavigationSample", "SecondFragment onCreateView() - HashCode: $instanceHashCode")
        return super.onCreateView(inflater, container, savedInstanceState)
    }

    override fun onStart() {
        Log.e("NavigationSample", "SecondFragment onStart() - HashCode: $instanceHashCode"); super.onStart()
    }

    override fun onResume() {
        Log.e("NavigationSample", "SecondFragment onResume() - HashCode: $instanceHashCode"); super.onResume()
    }

    override fun onPause() {
        Log.e("NavigationSample", "SecondFragment onPause() - HashCode: $instanceHashCode"); super.onPause()
    }

    override fun onStop() {
        Log.e("NavigationSample", "SecondFragment onStop() - HashCode: $instanceHashCode"); super.onStop()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.e("NavigationSample", "SecondFragment onDestroyView() - HashCode: $instanceHashCode")
        // 注意：如果你使用了 View Binding，在这里解绑是最佳实践
        // _binding = null // 如果 binding 是可空类型的话
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e("NavigationSample", "SecondFragment onDestroy() - HashCode: $instanceHashCode")
    }


}