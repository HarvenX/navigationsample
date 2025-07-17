package com.harven.navigationsample

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.harven.navigationsample.databinding.ThirdFragmentBinding

class ThirdFragment : Fragment(R.layout.third_fragment) {

    private val instanceHashCode = System.identityHashCode(this)
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.e("NavigationSample", "ThirdFragment onViewCreated() - HashCode: $instanceHashCode")
        val binding = ThirdFragmentBinding.bind(view)
        binding.btn.setOnClickListener {
            findNavController().navigate(ThirdFragmentDirections.actionThirdFragmentToFourthFragment())
        }

    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.e("NavigationSample", "ThirdFragment onCreate() - HashCode: $instanceHashCode")
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.e("NavigationSample", "ThirdFragment onCreateView() - HashCode: $instanceHashCode")
        return super.onCreateView(inflater, container, savedInstanceState)
    }

    override fun onStart() {
        Log.e("NavigationSample", "ThirdFragment onStart() - HashCode: $instanceHashCode"); super.onStart()
    }

    override fun onResume() {
        Log.e("NavigationSample", "ThirdFragment onResume() - HashCode: $instanceHashCode"); super.onResume()
    }

    override fun onPause() {
        Log.e("NavigationSample", "ThirdFragment onPause() - HashCode: $instanceHashCode"); super.onPause()
    }

    override fun onStop() {
        Log.e("NavigationSample", "ThirdFragment onStop() - HashCode: $instanceHashCode"); super.onStop()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.e("NavigationSample", "ThirdFragment onDestroyView() - HashCode: $instanceHashCode")
        // 注意：如果你使用了 View Binding，在这里解绑是最佳实践
        // _binding = null // 如果 binding 是可空类型的话
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e("NavigationSample", "ThirdFragment onDestroy() - HashCode: $instanceHashCode")
    }


}