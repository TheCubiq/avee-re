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
    public final Context a;
    @Nullable
    public SensorManager b;
    public Sensor c;
    public long d;
    public int e;
    public ei5 f;
    @GuardedBy("this")
    public boolean g;

    public fi5(Context context) {
        this.a = context;
    }

    public final void a() {
        synchronized (this) {
            if (this.g) {
                SensorManager sensorManager = this.b;
                if (sensorManager != null) {
                    sensorManager.unregisterListener(this, this.c);
                    zze.zza("Stopped listening for shake gestures.");
                }
                this.g = false;
            }
        }
    }

    public final void b() {
        SensorManager sensorManager;
        Sensor sensor;
        synchronized (this) {
            if (((Boolean) zzba.zzc().b(g93.b8)).booleanValue()) {
                if (this.b == null) {
                    SensorManager sensorManager2 = (SensorManager) this.a.getSystemService("sensor");
                    this.b = sensorManager2;
                    if (sensorManager2 == null) {
                        k04.zzj("Shake detection failed to initialize. Failed to obtain accelerometer.");
                        return;
                    }
                    this.c = sensorManager2.getDefaultSensor(1);
                }
                if (!this.g && (sensorManager = this.b) != null && (sensor = this.c) != null) {
                    sensorManager.registerListener(this, sensor, 2);
                    this.d = zzt.zzB().a() - ((Integer) zzba.zzc().b(g93.d8)).intValue();
                    this.g = true;
                    zze.zza("Listening for shake gestures.");
                }
            }
        }
    }

    public final void c(ei5 ei5Var) {
        this.f = ei5Var;
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        if (((Boolean) zzba.zzc().b(g93.b8)).booleanValue()) {
            float[] fArr = sensorEvent.values;
            float f = fArr[0] / 9.80665f;
            float f2 = fArr[1] / 9.80665f;
            float f3 = fArr[2] / 9.80665f;
            if (((float) Math.sqrt((f * f) + (f2 * f2) + (f3 * f3))) < ((Float) zzba.zzc().b(g93.c8)).floatValue()) {
                return;
            }
            long a = zzt.zzB().a();
            if (this.d + ((Integer) zzba.zzc().b(g93.d8)).intValue() > a) {
                return;
            }
            if (this.d + ((Integer) zzba.zzc().b(g93.e8)).intValue() < a) {
                this.e = 0;
            }
            zze.zza("Shake detected.");
            this.d = a;
            int i = this.e + 1;
            this.e = i;
            ei5 ei5Var = this.f;
            if (ei5Var != null) {
                if (i == ((Integer) zzba.zzc().b(g93.f8)).intValue()) {
                    dh5 dh5Var = (dh5) ei5Var;
                    dh5Var.h(new ah5(dh5Var), ch5.GESTURE);
                }
            }
        }
    }
}
