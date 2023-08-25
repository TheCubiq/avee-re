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
public final class mg5 implements SensorEventListener {
    @Nullable
    public final SensorManager a;
    @Nullable
    public final Sensor b;
    public float c = 0.0f;
    public Float d = Float.valueOf(0.0f);
    public long e = zzt.zzB().a();
    public int f = 0;
    public boolean g = false;
    public boolean h = false;
    @Nullable
    public lg5 i = null;
    @GuardedBy("this")
    public boolean j = false;

    public mg5(Context context) {
        SensorManager sensorManager = (SensorManager) context.getSystemService("sensor");
        this.a = sensorManager;
        if (sensorManager != null) {
            this.b = sensorManager.getDefaultSensor(4);
        } else {
            this.b = null;
        }
    }

    public final void a() {
        SensorManager sensorManager;
        Sensor sensor;
        synchronized (this) {
            if (this.j && (sensorManager = this.a) != null && (sensor = this.b) != null) {
                sensorManager.unregisterListener(this, sensor);
                this.j = false;
                zze.zza("Stopped listening for flick gestures.");
            }
        }
    }

    public final void b() {
        SensorManager sensorManager;
        Sensor sensor;
        synchronized (this) {
            if (((Boolean) zzba.zzc().b(g93.g8)).booleanValue()) {
                if (!this.j && (sensorManager = this.a) != null && (sensor = this.b) != null) {
                    sensorManager.registerListener(this, sensor, 2);
                    this.j = true;
                    zze.zza("Listening for flick gestures.");
                }
                if (this.a == null || this.b == null) {
                    k04.zzj("Flick detection failed to initialize. Failed to obtain gyroscope.");
                }
            }
        }
    }

    public final void c(lg5 lg5Var) {
        this.i = lg5Var;
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        if (((Boolean) zzba.zzc().b(g93.g8)).booleanValue()) {
            long a = zzt.zzB().a();
            if (this.e + ((Integer) zzba.zzc().b(g93.i8)).intValue() < a) {
                this.f = 0;
                this.e = a;
                this.g = false;
                this.h = false;
                this.c = this.d.floatValue();
            }
            Float valueOf = Float.valueOf(this.d.floatValue() + (sensorEvent.values[1] * 4.0f));
            this.d = valueOf;
            float floatValue = valueOf.floatValue();
            float f = this.c;
            y83 y83Var = g93.h8;
            if (floatValue > f + ((Float) zzba.zzc().b(y83Var)).floatValue()) {
                this.c = this.d.floatValue();
                this.h = true;
            } else if (this.d.floatValue() < this.c - ((Float) zzba.zzc().b(y83Var)).floatValue()) {
                this.c = this.d.floatValue();
                this.g = true;
            }
            if (this.d.isInfinite()) {
                this.d = Float.valueOf(0.0f);
                this.c = 0.0f;
            }
            if (this.g && this.h) {
                zze.zza("Flick detected.");
                this.e = a;
                int i = this.f + 1;
                this.f = i;
                this.g = false;
                this.h = false;
                lg5 lg5Var = this.i;
                if (lg5Var != null) {
                    if (i == ((Integer) zzba.zzc().b(g93.j8)).intValue()) {
                        dh5 dh5Var = (dh5) lg5Var;
                        dh5Var.h(new bh5(dh5Var), ch5.GESTURE);
                    }
                }
            }
        }
    }
}
