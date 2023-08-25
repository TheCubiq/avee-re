package com.daaw.avee.comp.playback;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import com.daaw.zo0;
/* loaded from: classes.dex */
public class MediaButtonEventReceiver extends BroadcastReceiver {
    public static Handler a;
    public static long b;
    public static boolean c;
    public static boolean d;

    /* loaded from: classes.dex */
    public class a implements Handler.Callback {
        public a() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what == 1 && !MediaButtonEventReceiver.d) {
                MediaButtonEventReceiver.this.c((Context) message.obj, "HEADSET_ASSIST_ACTION");
                boolean unused = MediaButtonEventReceiver.d = true;
                return false;
            }
            return false;
        }
    }

    public MediaButtonEventReceiver() {
        a = new Handler(new a());
    }

    public void c(Context context, String str) {
        Intent intent = new Intent(str);
        intent.setComponent(new ComponentName(context, zo0.e));
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
        To view partially-correct add '--show-bad-code' argument
    */
    public void onReceive(android.content.Context r14, android.content.Intent r15) {
        /*
            r13 = this;
            java.lang.String r0 = r15.getAction()
            java.lang.String r1 = "android.intent.action.MEDIA_BUTTON"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto La9
            java.lang.String r0 = "android.intent.extra.KEY_EVENT"
            android.os.Parcelable r15 = r15.getParcelableExtra(r0)
            android.view.KeyEvent r15 = (android.view.KeyEvent) r15
            if (r15 != 0) goto L17
            return
        L17:
            int r0 = r15.getKeyCode()
            int r1 = r15.getAction()
            long r2 = r15.getEventTime()
            r4 = 0
            java.lang.String r5 = "PLAY_ACTION"
            java.lang.String r6 = "NEXT_ACTION"
            java.lang.String r7 = "TOGGLE_PAUSE_ACTION"
            r8 = 79
            if (r0 == r8) goto L47
            r9 = 126(0x7e, float:1.77E-43)
            if (r0 == r9) goto L45
            r9 = 127(0x7f, float:1.78E-43)
            if (r0 == r9) goto L42
            switch(r0) {
                case 85: goto L47;
                case 86: goto L3f;
                case 87: goto L3d;
                case 88: goto L3a;
                default: goto L39;
            }
        L39:
            goto L48
        L3a:
            java.lang.String r4 = "PREVIOUS_ACTION"
            goto L48
        L3d:
            r4 = r6
            goto L48
        L3f:
            java.lang.String r4 = "STOP_ACTION"
            goto L48
        L42:
            java.lang.String r4 = "PAUSE_ACTION"
            goto L48
        L45:
            r4 = r5
            goto L48
        L47:
            r4 = r7
        L48:
            if (r4 == 0) goto La9
            r9 = 0
            r10 = 1
            if (r1 != 0) goto L99
            boolean r1 = com.daaw.avee.comp.playback.MediaButtonEventReceiver.c
            r11 = 0
            if (r1 == 0) goto L77
            boolean r15 = r7.equals(r4)
            if (r15 != 0) goto L60
            boolean r15 = r5.equals(r4)
            if (r15 == 0) goto La0
        L60:
            long r0 = com.daaw.avee.comp.playback.MediaButtonEventReceiver.b
            int r15 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r15 == 0) goto La0
            long r2 = r2 - r0
            r0 = 1000(0x3e8, double:4.94E-321)
            int r15 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r15 <= 0) goto La0
            android.os.Handler r15 = com.daaw.avee.comp.playback.MediaButtonEventReceiver.a
            android.os.Message r14 = r15.obtainMessage(r10, r14)
            r15.sendMessage(r14)
            goto La0
        L77:
            int r15 = r15.getRepeatCount()
            if (r15 != 0) goto La0
            if (r0 != r8) goto L8f
            long r0 = com.daaw.avee.comp.playback.MediaButtonEventReceiver.b
            long r0 = r2 - r0
            r7 = 300(0x12c, double:1.48E-321)
            int r15 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r15 >= 0) goto L8f
            r13.c(r14, r6)
            com.daaw.avee.comp.playback.MediaButtonEventReceiver.b = r11
            goto L94
        L8f:
            r13.c(r14, r4)
            com.daaw.avee.comp.playback.MediaButtonEventReceiver.b = r2
        L94:
            com.daaw.avee.comp.playback.MediaButtonEventReceiver.d = r9
            com.daaw.avee.comp.playback.MediaButtonEventReceiver.c = r10
            goto La0
        L99:
            android.os.Handler r14 = com.daaw.avee.comp.playback.MediaButtonEventReceiver.a
            r14.removeMessages(r10)
            com.daaw.avee.comp.playback.MediaButtonEventReceiver.c = r9
        La0:
            boolean r14 = r13.isOrderedBroadcast()
            if (r14 == 0) goto La9
            r13.abortBroadcast()
        La9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.avee.comp.playback.MediaButtonEventReceiver.onReceive(android.content.Context, android.content.Intent):void");
    }
}
