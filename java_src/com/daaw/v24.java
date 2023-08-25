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

    /* renamed from: a */
    public final SensorManager f29776a;

    /* renamed from: c */
    public final Display f29778c;
    @GuardedBy("sensorThreadLock")

    /* renamed from: f */
    public float[] f29781f;

    /* renamed from: g */
    public Handler f29782g;

    /* renamed from: h */
    public u24 f29783h;

    /* renamed from: d */
    public final float[] f29779d = new float[9];

    /* renamed from: e */
    public final float[] f29780e = new float[9];

    /* renamed from: b */
    public final Object f29777b = new Object();

    public v24(Context context) {
        this.f29776a = (SensorManager) context.getSystemService("sensor");
        this.f29778c = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
    }

    /* renamed from: a */
    public final void m7544a(u24 u24Var) {
        this.f29783h = u24Var;
    }

    /* renamed from: b */
    public final void m7543b() {
        if (this.f29782g != null) {
            return;
        }
        Sensor defaultSensor = this.f29776a.getDefaultSensor(11);
        if (defaultSensor == null) {
            k04.zzg("No Sensor of TYPE_ROTATION_VECTOR");
            return;
        }
        HandlerThread handlerThread = new HandlerThread("OrientationMonitor");
        handlerThread.start();
        gv6 gv6Var = new gv6(handlerThread.getLooper());
        this.f29782g = gv6Var;
        if (this.f29776a.registerListener(this, defaultSensor, 0, gv6Var)) {
            return;
        }
        k04.zzg("SensorManager.registerListener failed.");
        m7542c();
    }

    /* renamed from: c */
    public final void m7542c() {
        if (this.f29782g == null) {
            return;
        }
        this.f29776a.unregisterListener(this);
        this.f29782g.post(new t24(this));
        this.f29782g = null;
    }

    /* renamed from: d */
    public final boolean m7541d(float[] fArr) {
        synchronized (this.f29777b) {
            float[] fArr2 = this.f29781f;
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
        synchronized (this.f29777b) {
            if (this.f29781f == null) {
                this.f29781f = new float[9];
            }
        }
        SensorManager.getRotationMatrixFromVector(this.f29779d, fArr);
        int rotation = this.f29778c.getRotation();
        if (rotation == 1) {
            SensorManager.remapCoordinateSystem(this.f29779d, 2, 129, this.f29780e);
        } else if (rotation == 2) {
            SensorManager.remapCoordinateSystem(this.f29779d, 129, 130, this.f29780e);
        } else if (rotation != 3) {
            System.arraycopy(this.f29779d, 0, this.f29780e, 0, 9);
        } else {
            SensorManager.remapCoordinateSystem(this.f29779d, 130, 1, this.f29780e);
        }
        float[] fArr2 = this.f29780e;
        float f = fArr2[1];
        fArr2[1] = fArr2[3];
        fArr2[3] = f;
        float f2 = fArr2[2];
        fArr2[2] = fArr2[6];
        fArr2[6] = f2;
        float f3 = fArr2[5];
        fArr2[5] = fArr2[7];
        fArr2[7] = f3;
        synchronized (this.f29777b) {
            System.arraycopy(this.f29780e, 0, this.f29781f, 0, 9);
        }
        u24 u24Var = this.f29783h;
        if (u24Var != null) {
            u24Var.zza();
        }
    }
}
