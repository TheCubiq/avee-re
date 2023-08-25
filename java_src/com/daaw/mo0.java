package com.daaw;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
/* loaded from: classes.dex */
public class mo0 extends BroadcastReceiver {
    public void a(Context context, String str) {
        Intent intent = new Intent(str);
        intent.setComponent(new ComponentName(context, zo0.e));
        if (Build.VERSION.SDK_INT >= 26) {
            context.startForegroundService(intent);
        } else {
            context.startService(intent);
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        String str;
        String action = intent.getAction();
        if (action.equals("android.media.AUDIO_BECOMING_NOISY")) {
            str = "AUDIO_BECOMING_NOISY_ACTION";
        } else if (!action.equals("android.intent.action.HEADSET_PLUG") || intent.getIntExtra("state", 0) != 1) {
            return;
        } else {
            str = "ACTION_HEADSET_PLUGGED_IN";
        }
        a(context, str);
    }
}
