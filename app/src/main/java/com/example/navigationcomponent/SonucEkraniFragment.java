package com.example.navigationcomponent;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.navigationcomponent.databinding.FragmentSonucEkraniBinding;


public class SonucEkraniFragment extends Fragment {
    private FragmentSonucEkraniBinding binding;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        binding=FragmentSonucEkraniBinding.inflate(inflater,container,false);
        return binding.getRoot();
    }
}