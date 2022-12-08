package androidsamples.java.popl

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidsamples.java.popl.databinding.FragmentScreenOneBinding
import androidx.navigation.findNavController

class ScreenOneFragment : Fragment() {
    private var _binding: FragmentScreenOneBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentScreenOneBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.button.setOnClickListener { v: View? ->
            this.nextScreen(
                v
            )
        }
    }

    private fun nextScreen(view: View?) {
        val action = ScreenOneFragmentDirections.actionScreenOneFragmentToScreenTwoFragment()
        view?.findNavController()?.navigate(action)
    }
}