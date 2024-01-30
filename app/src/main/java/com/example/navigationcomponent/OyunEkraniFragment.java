package com.example.navigationcomponent;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.navigationcomponent.databinding.FragmentOyunEkraniBinding;


public class OyunEkraniFragment extends Fragment {

    private FragmentOyunEkraniBinding binding;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        binding=FragmentOyunEkraniBinding.inflate(inflater,container,false);

        binding.buttonBitir.setOnClickListener(v -> {

        });

        return binding.getRoot();
    }
}