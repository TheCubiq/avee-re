package com.daaw.avee.comp.playbackHeadset;

import android.app.Service;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.IBinder;
import com.daaw.avee.Common.Events.WeakEvent;
import com.daaw.avee.Common.tlog;
import com.daaw.avee.MainActivity;
import java.util.LinkedList;
import java.util.List;
/* loaded from: classes.dex */
public class HeadsetMonitorService extends Service {
    private List<Object> listenerRefHolder = new LinkedList();
    private HeadsetEventReceiver mediaEventReceiver;

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        return 1;
    }

    @Override // android.app.Service
    public void onTaskRemoved(Intent intent) {
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        tlog.w("HeadsetMonitorService");
        HeadsetEventReceiver headsetEventReceiver = new HeadsetEventReceiver();
        this.mediaEventReceiver = headsetEventReceiver;
        headsetEventReceiver.onHeadsetPluggedIn.subscribeWeak(new WeakEvent.Handler() { // from class: com.daaw.avee.comp.playbackHeadset.HeadsetMonitorService.1
            @Override // com.daaw.avee.Common.Events.WeakEvent.Handler
            public void invoke() {
                HeadsetMonitorService.this.onHeadsetPluggedIn();
            }
        }, this.listenerRefHolder);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.HEADSET_PLUG");
        registerReceiver(this.mediaEventReceiver, intentFilter);
    }

    @Override // android.app.Service
    public void onDestroy() {
        tlog.w("HeadsetMonitorService");
        HeadsetEventReceiver headsetEventReceiver = this.mediaEventReceiver;
        if (headsetEventReceiver != null) {
            headsetEventReceiver.onHeadsetPluggedIn.unSubscribeWeak(this.listenerRefHolder);
        }
        this.listenerRefHolder.clear();
        try {
            unregisterReceiver(this.mediaEventReceiver);
        } catch (IllegalArgumentException unused) {
        }
        super.onDestroy();
    }

    void onHeadsetPluggedIn() {
        tlog.w("onHeadsetPluggedIn");
        startActivity();
    }

    void startActivity() {
        Intent intent = new Intent(this, MainActivity.class);
        intent.setFlags(268435456);
        startActivity(intent);
    }
}
