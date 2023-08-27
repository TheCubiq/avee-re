package com.daaw.avee.comp.SleepTimer;

import com.daaw.avee.Common.Events.WeakEvent;
import com.daaw.avee.Common.Events.WeakEvent3;
import java.lang.ref.WeakReference;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
/* loaded from: classes.dex */
public class SleepTimer {
    public static WeakEvent3<Boolean, Integer, Boolean> onSleepTimerConfigChanged = new WeakEvent3<>();
    public static WeakEvent onSleepTimerFire = new WeakEvent();
    private static final Object createInstanceLock = new Object();
    private static volatile WeakReference<SleepTimer> instanceWeak = new WeakReference<>(null);
    private boolean enabled = false;
    private int minutes = 0;
    private Date sleepAtTime = new Date();
    private boolean playLastSongToEnd = false;
    private Timer timer = null;

    public SleepTimer() {
        onSleepTimerConfigChanged.invoke(Boolean.valueOf(this.enabled), Integer.valueOf(this.minutes), Boolean.valueOf(this.playLastSongToEnd));
    }

    public static SleepTimer createOrGetInstance() {
        SleepTimer sleepTimer;
        SleepTimer sleepTimer2 = instanceWeak.get();
        if (sleepTimer2 != null) {
            return sleepTimer2;
        }
        synchronized (createInstanceLock) {
            sleepTimer = instanceWeak.get();
            if (sleepTimer == null) {
                sleepTimer = new SleepTimer();
                instanceWeak = new WeakReference<>(sleepTimer);
            }
        }
        return sleepTimer;
    }

    public void configure(boolean z, int i, Date date, boolean z2) {
        if (i < 0) {
            z = false;
        }
        this.enabled = z;
        this.minutes = i;
        this.sleepAtTime = date;
        this.playLastSongToEnd = z2;
        if (z) {
            Timer timer = this.timer;
            if (timer != null) {
                timer.cancel();
            }
            Timer timer2 = new Timer();
            this.timer = timer2;
            timer2.schedule(new TimerTask() { // from class: com.daaw.avee.comp.SleepTimer.SleepTimer.1
                @Override // java.util.TimerTask, java.lang.Runnable
                public void run() {
                    SleepTimer.this.fire();
                }
            }, date);
        } else {
            Timer timer3 = this.timer;
            if (timer3 != null) {
                timer3.cancel();
            }
            this.timer = null;
        }
        onSleepTimerConfigChanged.invoke(Boolean.valueOf(z), Integer.valueOf(i), Boolean.valueOf(z2));
    }

    public SleepTimerConfig getConfig() {
        SleepTimerConfig sleepTimerConfig = new SleepTimerConfig();
        sleepTimerConfig.enabled = this.enabled;
        sleepTimerConfig.minutes = this.minutes;
        sleepTimerConfig.playLastSongToEnd = this.playLastSongToEnd;
        return sleepTimerConfig;
    }

    public int getRemainingSeconds() {
        return ((int) (this.sleepAtTime.getTime() - new Date().getTime())) / 1000;
    }

    public Date getSleepAtTime() {
        return this.sleepAtTime;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void fire() {
        configure(false, this.minutes, this.sleepAtTime, this.playLastSongToEnd);
        onSleepTimerFire.invoke();
    }
}
