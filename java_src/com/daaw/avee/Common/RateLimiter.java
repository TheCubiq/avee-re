package com.daaw.avee.Common;

import android.os.Handler;
import android.os.Message;
/* loaded from: classes.dex */
public class RateLimiter {
    private static final int MSG_INVOKE_DELAYED = 2;
    long delayMillis;
    Action currentListener = null;
    private Handler mHandler = new Handler(new Handler.Callback() { // from class: com.daaw.avee.Common.RateLimiter.1
        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what != 2) {
                return false;
            }
            Action action = RateLimiter.this.currentListener;
            RateLimiter.this.currentListener = null;
            if (action != null) {
                action.onInvoke();
                return false;
            }
            return false;
        }
    });

    public RateLimiter(long j) {
        this.delayMillis = j;
    }

    public void call(Action action) {
        UtilsUI.AssertIsUiThread();
        this.currentListener = action;
        if (this.mHandler.hasMessages(2)) {
            return;
        }
        this.mHandler.sendMessageDelayed(this.mHandler.obtainMessage(2, action), this.delayMillis);
    }
}
