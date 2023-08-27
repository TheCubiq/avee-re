package com.daaw.avee.comp.playback;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.view.KeyEvent;
/* loaded from: classes.dex */
public class MediaButtonEventReceiver extends BroadcastReceiver {
    private static final int LONG_PRESS_DELAY = 1000;
    private static final int MSG_LONGPRESS_TIMEOUT = 1;
    private static boolean mDown = false;
    private static Handler mHandler = null;
    private static long mLastClickTime = 0;
    private static boolean mLaunched = false;

    public MediaButtonEventReceiver() {
        mHandler = new Handler(new Handler.Callback() { // from class: com.daaw.avee.comp.playback.MediaButtonEventReceiver.1
            @Override // android.os.Handler.Callback
            public boolean handleMessage(Message message) {
                if (message.what == 1 && !MediaButtonEventReceiver.mLaunched) {
                    MediaButtonEventReceiver.this.notifyEvent((Context) message.obj, MediaPlaybackServiceDefs.HEADSET_ASSIST_ACTION);
                    boolean unused = MediaButtonEventReceiver.mLaunched = true;
                    return false;
                }
                return false;
            }
        });
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
                str = MediaPlaybackServiceDefs.PLAY_ACTION;
            } else if (keyCode != 127) {
                switch (keyCode) {
                    case 86:
                        str = MediaPlaybackServiceDefs.STOP_ACTION;
                        break;
                    case 87:
                        str = MediaPlaybackServiceDefs.NEXT_ACTION;
                        break;
                    case 88:
                        str = MediaPlaybackServiceDefs.PREVIOUS_ACTION;
                        break;
                }
            } else {
                str = MediaPlaybackServiceDefs.PAUSE_ACTION;
            }
            if (str == null) {
                if (action == 0) {
                    if (mDown) {
                        if (MediaPlaybackServiceDefs.TOGGLE_PAUSE_ACTION.equals(str) || MediaPlaybackServiceDefs.PLAY_ACTION.equals(str)) {
                            long j = mLastClickTime;
                            if (j != 0 && eventTime - j > 1000) {
                                Handler handler = mHandler;
                                handler.sendMessage(handler.obtainMessage(1, context));
                            }
                        }
                    } else if (keyEvent.getRepeatCount() == 0) {
                        if (keyCode == 79 && eventTime - mLastClickTime < 300) {
                            notifyEvent(context, MediaPlaybackServiceDefs.NEXT_ACTION);
                            mLastClickTime = 0L;
                        } else {
                            notifyEvent(context, str);
                            mLastClickTime = eventTime;
                        }
                        mLaunched = false;
                        mDown = true;
                    }
                } else {
                    mHandler.removeMessages(1);
                    mDown = false;
                }
                if (isOrderedBroadcast()) {
                    abortBroadcast();
                    return;
                }
                return;
            }
            return;
        }
        str = MediaPlaybackServiceDefs.TOGGLE_PAUSE_ACTION;
        if (str == null) {
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
