package androidsamples.java.popl

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidsamples.java.popl.databinding.DiceBinding
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController

class ScreenThreeFragment: Fragment() {
    private var _binding: DiceBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = DiceBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.btn.setOnClickListener { v: View? ->
            this.nextScreen(
                v
            )
        }
    }

    private fun nextScreen(view: View?) {
        val action = ScreenThreeFragmentDirections.actionScreenThreeFragmentToScreenFourFragment()
        view?.findNavController()?.navigate(action)
    }
}