package com.daaw;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzt;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;
/* loaded from: classes.dex */
public final class fi5 implements SensorEventListener {

    /* renamed from: a */
    public final Context f9616a;
    @Nullable

    /* renamed from: b */
    public SensorManager f9617b;

    /* renamed from: c */
    public Sensor f9618c;

    /* renamed from: d */
    public long f9619d;

    /* renamed from: e */
    public int f9620e;

    /* renamed from: f */
    public ei5 f9621f;
    @GuardedBy("this")

    /* renamed from: g */
    public boolean f9622g;

    public fi5(Context context) {
        this.f9616a = context;
    }

    /* renamed from: a */
    public final void m22622a() {
        synchronized (this) {
            if (this.f9622g) {
                SensorManager sensorManager = this.f9617b;
                if (sensorManager != null) {
                    sensorManager.unregisterListener(this, this.f9618c);
                    zze.zza("Stopped listening for shake gestures.");
                }
                this.f9622g = false;
            }
        }
    }

    /* renamed from: b */
    public final void m22621b() {
        SensorManager sensorManager;
        Sensor sensor;
        synchronized (this) {
            if (((Boolean) zzba.zzc().m23658b(g93.f10641b8)).booleanValue()) {
                if (this.f9617b == null) {
                    SensorManager sensorManager2 = (SensorManager) this.f9616a.getSystemService("sensor");
                    this.f9617b = sensorManager2;
                    if (sensorManager2 == null) {
                        k04.zzj("Shake detection failed to initialize. Failed to obtain accelerometer.");
                        return;
                    }
                    this.f9618c = sensorManager2.getDefaultSensor(1);
                }
                if (!this.f9622g && (sensorManager = this.f9617b) != null && (sensor = this.f9618c) != null) {
                    sensorManager.registerListener(this, sensor, 2);
                    this.f9619d = zzt.zzB().mo15860a() - ((Integer) zzba.zzc().m23658b(g93.f10663d8)).intValue();
                    this.f9622g = true;
                    zze.zza("Listening for shake gestures.");
                }
            }
        }
    }

    /* renamed from: c */
    public final void m22620c(ei5 ei5Var) {
        this.f9621f = ei5Var;
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        if (((Boolean) zzba.zzc().m23658b(g93.f10641b8)).booleanValue()) {
            float[] fArr = sensorEvent.values;
            float f = fArr[0] / 9.80665f;
            float f2 = fArr[1] / 9.80665f;
            float f3 = fArr[2] / 9.80665f;
            if (((float) Math.sqrt((f * f) + (f2 * f2) + (f3 * f3))) < ((Float) zzba.zzc().m23658b(g93.f10652c8)).floatValue()) {
                return;
            }
            long mo15860a = zzt.zzB().mo15860a();
            if (this.f9619d + ((Integer) zzba.zzc().m23658b(g93.f10663d8)).intValue() > mo15860a) {
                return;
            }
            if (this.f9619d + ((Integer) zzba.zzc().m23658b(g93.f10674e8)).intValue() < mo15860a) {
                this.f9620e = 0;
            }
            zze.zza("Shake detected.");
            this.f9619d = mo15860a;
            int i = this.f9620e + 1;
            this.f9620e = i;
            ei5 ei5Var = this.f9621f;
            if (ei5Var != null) {
                if (i == ((Integer) zzba.zzc().m23658b(g93.f10685f8)).intValue()) {
                    dh5 dh5Var = (dh5) ei5Var;
                    dh5Var.m24403h(new ah5(dh5Var), ch5.GESTURE);
                }
            }
        }
    }
}
