package com.harven.navigationsample

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.harven.navigationsample.databinding.FifthFragmentBinding

class FifthFragment : Fragment(R.layout.fifth_fragment) {

    private val instanceHashCode = System.identityHashCode(this)
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.e("NavigationSample", "FifthFragment onViewCreated() - HashCode: $instanceHashCode")
        val binding = FifthFragmentBinding.bind(view)
        binding.btn.setOnClickListener {
            val resultBundle = Bundle().apply {
                putString("result", "Hello from FifthFragment!") // 放入你要传递的参数
                // putInt("some_int", 123)
            }

            // 设置结果。第一个参数是 requestKey，必须与 Fragment B 中监听的 key 相同
            parentFragmentManager.setFragmentResult("toFirst", resultBundle)

            findNavController().popBackStack(R.id.firstFragment,true)
        }

        binding.btn2.setOnClickListener {
            findNavController().popBackStack(R.id.thirdFragment, false)//false thirdFragment ，true 表示thirdFragment也一并退回
        }

    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.e("NavigationSample", "FifthFragment onCreate() - HashCode: $instanceHashCode")
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.e("NavigationSample", "FifthFragment onCreateView() - HashCode: $instanceHashCode")
        return super.onCreateView(inflater, container, savedInstanceState)
    }

    override fun onStart() {
        Log.e("NavigationSample", "FifthFragment onStart() - HashCode: $instanceHashCode"); super.onStart()
    }

    override fun onResume() {
        Log.e("NavigationSample", "FifthFragment onResume() - HashCode: $instanceHashCode"); super.onResume()
    }

    override fun onPause() {
        Log.e("NavigationSample", "FifthFragment onPause() - HashCode: $instanceHashCode"); super.onPause()
    }

    override fun onStop() {
        Log.e("NavigationSample", "FifthFragment onStop() - HashCode: $instanceHashCode"); super.onStop()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.e("NavigationSample", "FifthFragment onDestroyView() - HashCode: $instanceHashCode")
        // 注意：如果你使用了 View Binding，在这里解绑是最佳实践
        // _binding = null // 如果 binding 是可空类型的话
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e("NavigationSample", "FifthFragment onDestroy() - HashCode: $instanceHashCode")
    }


}