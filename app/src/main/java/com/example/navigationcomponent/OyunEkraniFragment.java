package com.example.navigationcomponent;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.navigationcomponent.databinding.FragmentOyunEkraniBinding;


public class OyunEkraniFragment extends Fragment {

    private FragmentOyunEkraniBinding binding;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        binding=FragmentOyunEkraniBinding.inflate(inflater,container,false);

        OyunEkraniFragmentArgs bundle=OyunEkraniFragmentArgs.fromBundle(getArguments());//FRAGMENTLER ARASI VERİ GÖNDERMEDE GELEN VERİYİ TUTAN METOD
        String gelenAd= bundle.getAd();
        int gelenYas= bundle.getYas();
        float gelenBoy= bundle.getBoy();
        boolean gelenBekarMi= bundle.getBekarMi();

        Kisiler gelenKisi=bundle.getNesne(); //NESNE SINIFINDAN GELEN VERİ SINIFI TANIMLADIK.
        gelenKisi.getKisiAd(); //GET İLE GELENLERİ ALDIK.
        gelenKisi.getKisiNo();

        Log.e("Gelen Nesne AD",gelenKisi.getKisiAd()); //LOG DA YAZDIRDIK.
        Log.e("Gelen Nesne No",String.valueOf(gelenKisi.getKisiNo()));

        Log.e("Gelen Ad",gelenAd);
        Log.e("Gelen Yas",String.valueOf(gelenYas));
        Log.e("Gelen Boy",String.valueOf(gelenBoy));
        Log.e("Gelen Bekar Mı",String.valueOf(gelenBekarMi));


        binding.buttonBitir.setOnClickListener(v -> {
            Navigation.findNavController(v).navigate(R.id.sonucEkraninaGecis);

        });

        return binding.getRoot();
    }
}