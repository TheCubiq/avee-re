package com.daaw.avee.comp.playbackHeadset;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.daaw.avee.Common.Events.WeakEvent;
/* loaded from: classes.dex */
public class HeadsetEventReceiver extends BroadcastReceiver {
    public WeakEvent onHeadsetPluggedIn = new WeakEvent();

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (!isInitialStickyBroadcast() && intent.getAction().equals("android.intent.action.HEADSET_PLUG") && intent.getIntExtra("state", 0) == 1) {
            this.onHeadsetPluggedIn.invoke();
        }
    }
}
