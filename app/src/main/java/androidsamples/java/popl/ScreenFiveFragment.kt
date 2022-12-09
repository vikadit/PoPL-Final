package androidsamples.java.popl

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidsamples.java.popl.databinding.TictactoeBinding
import androidx.fragment.app.Fragment

class ScreenFiveFragment : Fragment() {
    private var _binding: TictactoeBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = TictactoeBinding.inflate(inflater, container, false)
        return binding.root
    }
}