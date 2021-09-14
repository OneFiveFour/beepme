package net.onefivefour.android.beepme.screens.create

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import net.onefivefour.android.beepme.databinding.FragmentCreateBinding
import net.onefivefour.android.beepme.notifications.Creator

class CreateFragment : Fragment() {
    
    private lateinit var binding: FragmentCreateBinding

    companion object {
        fun newInstance() = CreateFragment()
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        binding = FragmentCreateBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.btnCreateNotification.setOnClickListener {
            Creator.send(requireContext())
        }
    }


}