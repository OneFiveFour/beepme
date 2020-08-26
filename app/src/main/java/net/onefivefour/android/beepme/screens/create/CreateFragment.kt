package net.onefivefour.android.beepme.screens.create

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import net.onefivefour.android.beepme.R
import org.koin.androidx.viewmodel.ext.android.viewModel

class CreateFragment : Fragment() {

    companion object {
        fun newInstance() = CreateFragment()
    }

    private val viewModel: CreateViewModel by viewModel()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        return inflater.inflate(R.layout.fragment_create, container, false)
    }


}