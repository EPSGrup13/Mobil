package com.example.e_park;

import android.content.Context;
import android.content.SharedPreferences;

public class PaylasilanTercihYapilandirmasi {
    private SharedPreferences sharedPreferences;
    private Context context;

    public PaylasilanTercihYapilandirmasi(Context context)
    {
        this.context = context;
        sharedPreferences = context.getSharedPreferences(context.getResources().getString(R.string.giris_tercihi),Context.MODE_PRIVATE);
    }
    public void girisDurumuYaz(Boolean durum)
    {
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putBoolean(context.getResources().getString(R.string.giris_durumu_tercihi),durum);
        editor.commit();
    }

    public Boolean girisDurumuOku()
    {
        boolean durum = false;
        durum = sharedPreferences.getBoolean(context.getResources().getString(R.string.giris_durumu_tercihi),false);
        return durum;
    }
}
