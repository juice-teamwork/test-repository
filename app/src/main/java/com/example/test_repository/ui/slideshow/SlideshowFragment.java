package com.example.test_repository.ui.slideshow;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.test_repository.R;
import com.example.test_repository.databinding.FragmentSlideshowBinding;

public class SlideshowFragment extends Fragment {

    private SlideshowViewModel slideshowViewModel;
    private FragmentSlideshowBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        slideshowViewModel = new ViewModelProvider(requireActivity()).get(SlideshowViewModel.class);
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_slideshow, container, false);
        binding.setData(slideshowViewModel);
        binding.setLifecycleOwner(this);
        return binding.getRoot();
    }
}
