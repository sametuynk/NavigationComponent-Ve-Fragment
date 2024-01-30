package com.example.navigationcomponent;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.navigationcomponent.databinding.FragmentAnasayfaBinding;


public class AnasayfaFragment extends Fragment {


    private FragmentAnasayfaBinding binding;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        binding=FragmentAnasayfaBinding.inflate(inflater,container,false);

        binding.buttonBasla.setOnClickListener(v -> {
            Navigation.findNavController(v).navigate(R.id.oyunEkraninaGecis);

        });


        return binding.getRoot();
    }
}