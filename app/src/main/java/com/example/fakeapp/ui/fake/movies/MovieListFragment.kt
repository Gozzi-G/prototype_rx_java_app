package com.example.fakeapp.ui.fake.movies

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.fakeapp.databinding.FragmentMovieListBinding
import org.koin.androidx.viewmodel.ext.android.viewModel
import java.lang.RuntimeException

class MovieListFragment : Fragment() {

    private val viewModel: FakeViewModel by viewModel()

    private var _binding: FragmentMovieListBinding? = null
    private val binding: FragmentMovieListBinding
        get() = _binding ?: throw RuntimeException("FragmentMovieListBinding == null")

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentMovieListBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}