package com.daaw.avee.comp.playback;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
/* loaded from: classes.dex */
public class MediaEventReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        if (action.equals("android.media.AUDIO_BECOMING_NOISY")) {
            notifyEvent(context, MediaPlaybackServiceDefs.AUDIO_BECOMING_NOISY_ACTION);
        } else if (action.equals("android.intent.action.HEADSET_PLUG") && intent.getIntExtra("state", 0) == 1) {
            notifyEvent(context, MediaPlaybackServiceDefs.ACTION_HEADSET_PLUGGED_IN);
        }
    }

    void notifyEvent(Context context, String str) {
        Intent intent = new Intent(str);
        intent.setComponent(new ComponentName(context, MediaPlaybackServiceDefs.MediaServiceClass));
        if (Build.VERSION.SDK_INT >= 26) {
            context.startForegroundService(intent);
        } else {
            context.startService(intent);
        }
    }
}
