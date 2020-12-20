package com.example.aula11app;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

public class Broadcast extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {

        Intent in = new Intent(context, NotificacaoService.class);
        context.startService(in);

        Log.d("CST", "O serviço foi iniciado com sucesso");
    }


}
