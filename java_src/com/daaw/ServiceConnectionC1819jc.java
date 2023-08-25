package com.daaw;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
/* renamed from: com.daaw.jc */
/* loaded from: classes.dex */
public class ServiceConnectionC1819jc implements ServiceConnection {

    /* renamed from: a */
    public boolean f14862a = false;

    /* renamed from: b */
    public final BlockingQueue f14863b = new LinkedBlockingQueue();

    /* renamed from: a */
    public IBinder m18607a(long j, TimeUnit timeUnit) {
        ry0.m10831i("BlockingServiceConnection.getServiceWithTimeout() called on main thread");
        if (this.f14862a) {
            throw new IllegalStateException("Cannot call get on this connection more than once");
        }
        this.f14862a = true;
        IBinder iBinder = (IBinder) this.f14863b.poll(j, timeUnit);
        if (iBinder != null) {
            return iBinder;
        }
        throw new TimeoutException("Timed out waiting for the service connection");
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f14863b.add(iBinder);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
    }
}
