package com.daaw;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Display;
import android.view.WindowManager;
import javax.annotation.concurrent.GuardedBy;
/* loaded from: classes.dex */
public final class v24 implements SensorEventListener {
    public final SensorManager a;
    public final Display c;
    @GuardedBy("sensorThreadLock")
    public float[] f;
    public Handler g;
    public u24 h;
    public final float[] d = new float[9];
    public final float[] e = new float[9];
    public final Object b = new Object();

    public v24(Context context) {
        this.a = (SensorManager) context.getSystemService("sensor");
        this.c = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
    }

    public final void a(u24 u24Var) {
        this.h = u24Var;
    }

    public final void b() {
        if (this.g != null) {
            return;
        }
        Sensor defaultSensor = this.a.getDefaultSensor(11);
        if (defaultSensor == null) {
            k04.zzg("No Sensor of TYPE_ROTATION_VECTOR");
            return;
        }
        HandlerThread handlerThread = new HandlerThread("OrientationMonitor");
        handlerThread.start();
        gv6 gv6Var = new gv6(handlerThread.getLooper());
        this.g = gv6Var;
        if (this.a.registerListener(this, defaultSensor, 0, gv6Var)) {
            return;
        }
        k04.zzg("SensorManager.registerListener failed.");
        c();
    }

    public final void c() {
        if (this.g == null) {
            return;
        }
        this.a.unregisterListener(this);
        this.g.post(new t24(this));
        this.g = null;
    }

    public final boolean d(float[] fArr) {
        synchronized (this.b) {
            float[] fArr2 = this.f;
            if (fArr2 == null) {
                return false;
            }
            System.arraycopy(fArr2, 0, fArr, 0, 9);
            return true;
        }
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        float[] fArr = sensorEvent.values;
        if (fArr[0] == 0.0f && fArr[1] == 0.0f && fArr[2] == 0.0f) {
            return;
        }
        synchronized (this.b) {
            if (this.f == null) {
                this.f = new float[9];
            }
        }
        SensorManager.getRotationMatrixFromVector(this.d, fArr);
        int rotation = this.c.getRotation();
        if (rotation == 1) {
            SensorManager.remapCoordinateSystem(this.d, 2, 129, this.e);
        } else if (rotation == 2) {
            SensorManager.remapCoordinateSystem(this.d, 129, 130, this.e);
        } else if (rotation != 3) {
            System.arraycopy(this.d, 0, this.e, 0, 9);
        } else {
            SensorManager.remapCoordinateSystem(this.d, 130, 1, this.e);
        }
        float[] fArr2 = this.e;
        float f = fArr2[1];
        fArr2[1] = fArr2[3];
        fArr2[3] = f;
        float f2 = fArr2[2];
        fArr2[2] = fArr2[6];
        fArr2[6] = f2;
        float f3 = fArr2[5];
        fArr2[5] = fArr2[7];
        fArr2[7] = f3;
        synchronized (this.b) {
            System.arraycopy(this.e, 0, this.f, 0, 9);
        }
        u24 u24Var = this.h;
        if (u24Var != null) {
            u24Var.zza();
        }
    }
}
