package com.daaw.avee.comp.playback;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.view.KeyEvent;
import com.daaw.zo0;
/* loaded from: classes.dex */
public class MediaButtonEventReceiver extends BroadcastReceiver {

    /* renamed from: a */
    public static Handler f3850a;

    /* renamed from: b */
    public static long f3851b;

    /* renamed from: c */
    public static boolean f3852c;

    /* renamed from: d */
    public static boolean f3853d;

    /* renamed from: com.daaw.avee.comp.playback.MediaButtonEventReceiver$a */
    /* loaded from: classes.dex */
    public class C0712a implements Handler.Callback {
        public C0712a() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what == 1 && !MediaButtonEventReceiver.f3853d) {
                MediaButtonEventReceiver.this.m26834c((Context) message.obj, "HEADSET_ASSIST_ACTION");
                boolean unused = MediaButtonEventReceiver.f3853d = true;
                return false;
            }
            return false;
        }
    }

    public MediaButtonEventReceiver() {
        f3850a = new Handler(new C0712a());
    }

    /* renamed from: c */
    public void m26834c(Context context, String str) {
        Intent intent = new Intent(str);
        intent.setComponent(new ComponentName(context, zo0.f35300e));
        if (Build.VERSION.SDK_INT >= 26) {
            context.startForegroundService(intent);
        } else {
            context.startService(intent);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    @Override // android.content.BroadcastReceiver
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onReceive(Context context, Intent intent) {
        KeyEvent keyEvent;
        if (!"android.intent.action.MEDIA_BUTTON".equals(intent.getAction()) || (keyEvent = (KeyEvent) intent.getParcelableExtra("android.intent.extra.KEY_EVENT")) == null) {
            return;
        }
        int keyCode = keyEvent.getKeyCode();
        int action = keyEvent.getAction();
        long eventTime = keyEvent.getEventTime();
        String str = null;
        if (keyCode != 79) {
            if (keyCode == 126) {
                str = "PLAY_ACTION";
            } else if (keyCode != 127) {
                switch (keyCode) {
                    case 86:
                        str = "STOP_ACTION";
                        break;
                    case 87:
                        str = "NEXT_ACTION";
                        break;
                    case 88:
                        str = "PREVIOUS_ACTION";
                        break;
                }
            } else {
                str = "PAUSE_ACTION";
            }
            if (str == null) {
                if (action != 0) {
                    f3850a.removeMessages(1);
                    f3852c = false;
                } else if (f3852c) {
                    if ("TOGGLE_PAUSE_ACTION".equals(str) || "PLAY_ACTION".equals(str)) {
                        long j = f3851b;
                        if (j != 0 && eventTime - j > 1000) {
                            Handler handler = f3850a;
                            handler.sendMessage(handler.obtainMessage(1, context));
                        }
                    }
                } else if (keyEvent.getRepeatCount() == 0) {
                    if (keyCode != 79 || eventTime - f3851b >= 300) {
                        m26834c(context, str);
                        f3851b = eventTime;
                    } else {
                        m26834c(context, "NEXT_ACTION");
                        f3851b = 0L;
                    }
                    f3853d = false;
                    f3852c = true;
                }
                if (isOrderedBroadcast()) {
                    abortBroadcast();
                    return;
                }
                return;
            }
            return;
        }
        str = "TOGGLE_PAUSE_ACTION";
        if (str == null) {
        }
    }
}
