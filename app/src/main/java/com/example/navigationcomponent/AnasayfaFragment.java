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

            Kisiler kisi=new Kisiler(1,"Mehmet"); //NESNE SINIFI İLE VERİ GÖNDERME İŞLEMİ

            AnasayfaFragmentDirections.OyunEkraninaGecis gecis =AnasayfaFragmentDirections.oyunEkraninaGecis(kisi); //FRAGMENTLER İLE VERİ GÖNDERME İŞLEMİ
            gecis.setAd("Ahmet");
            gecis.setYas(24);
            gecis.setBoy(1.78f);
            gecis.setBekarMi(true);
            Navigation.findNavController(v).navigate(gecis);

        });


        return binding.getRoot();
    }
}