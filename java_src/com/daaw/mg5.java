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

    /* renamed from: a */
    public final SensorManager f18862a;
    @Nullable

    /* renamed from: b */
    public final Sensor f18863b;

    /* renamed from: c */
    public float f18864c = 0.0f;

    /* renamed from: d */
    public Float f18865d = Float.valueOf(0.0f);

    /* renamed from: e */
    public long f18866e = zzt.zzB().mo15860a();

    /* renamed from: f */
    public int f18867f = 0;

    /* renamed from: g */
    public boolean f18868g = false;

    /* renamed from: h */
    public boolean f18869h = false;
    @Nullable

    /* renamed from: i */
    public lg5 f18870i = null;
    @GuardedBy("this")

    /* renamed from: j */
    public boolean f18871j = false;

    public mg5(Context context) {
        SensorManager sensorManager = (SensorManager) context.getSystemService("sensor");
        this.f18862a = sensorManager;
        if (sensorManager != null) {
            this.f18863b = sensorManager.getDefaultSensor(4);
        } else {
            this.f18863b = null;
        }
    }

    /* renamed from: a */
    public final void m16037a() {
        SensorManager sensorManager;
        Sensor sensor;
        synchronized (this) {
            if (this.f18871j && (sensorManager = this.f18862a) != null && (sensor = this.f18863b) != null) {
                sensorManager.unregisterListener(this, sensor);
                this.f18871j = false;
                zze.zza("Stopped listening for flick gestures.");
            }
        }
    }

    /* renamed from: b */
    public final void m16036b() {
        SensorManager sensorManager;
        Sensor sensor;
        synchronized (this) {
            if (((Boolean) zzba.zzc().m23658b(g93.f10696g8)).booleanValue()) {
                if (!this.f18871j && (sensorManager = this.f18862a) != null && (sensor = this.f18863b) != null) {
                    sensorManager.registerListener(this, sensor, 2);
                    this.f18871j = true;
                    zze.zza("Listening for flick gestures.");
                }
                if (this.f18862a == null || this.f18863b == null) {
                    k04.zzj("Flick detection failed to initialize. Failed to obtain gyroscope.");
                }
            }
        }
    }

    /* renamed from: c */
    public final void m16035c(lg5 lg5Var) {
        this.f18870i = lg5Var;
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        if (((Boolean) zzba.zzc().m23658b(g93.f10696g8)).booleanValue()) {
            long mo15860a = zzt.zzB().mo15860a();
            if (this.f18866e + ((Integer) zzba.zzc().m23658b(g93.f10718i8)).intValue() < mo15860a) {
                this.f18867f = 0;
                this.f18866e = mo15860a;
                this.f18868g = false;
                this.f18869h = false;
                this.f18864c = this.f18865d.floatValue();
            }
            Float valueOf = Float.valueOf(this.f18865d.floatValue() + (sensorEvent.values[1] * 4.0f));
            this.f18865d = valueOf;
            float floatValue = valueOf.floatValue();
            float f = this.f18864c;
            y83 y83Var = g93.f10707h8;
            if (floatValue > f + ((Float) zzba.zzc().m23658b(y83Var)).floatValue()) {
                this.f18864c = this.f18865d.floatValue();
                this.f18869h = true;
            } else if (this.f18865d.floatValue() < this.f18864c - ((Float) zzba.zzc().m23658b(y83Var)).floatValue()) {
                this.f18864c = this.f18865d.floatValue();
                this.f18868g = true;
            }
            if (this.f18865d.isInfinite()) {
                this.f18865d = Float.valueOf(0.0f);
                this.f18864c = 0.0f;
            }
            if (this.f18868g && this.f18869h) {
                zze.zza("Flick detected.");
                this.f18866e = mo15860a;
                int i = this.f18867f + 1;
                this.f18867f = i;
                this.f18868g = false;
                this.f18869h = false;
                lg5 lg5Var = this.f18870i;
                if (lg5Var != null) {
                    if (i == ((Integer) zzba.zzc().m23658b(g93.f10729j8)).intValue()) {
                        dh5 dh5Var = (dh5) lg5Var;
                        dh5Var.m24403h(new bh5(dh5Var), ch5.GESTURE);
                    }
                }
            }
        }
    }
}
