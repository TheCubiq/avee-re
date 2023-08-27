package com.daaw.avee.Common;
/* loaded from: classes.dex */
public class Quaternion {
    public static final float PI2 = 6.2831855f;
    private static Quaternion tmp2 = new Quaternion(0.0f, 0.0f, 0.0f, 0.0f);
    private float w;
    private float x;
    private float y;
    private float z;

    public Quaternion fromAngles(float f, float f2, float f3) {
        double d = f3 * 0.5f;
        float sin = (float) Math.sin(d);
        float cos = (float) Math.cos(d);
        double d2 = f2 * 0.5f;
        float sin2 = (float) Math.sin(d2);
        float cos2 = (float) Math.cos(d2);
        double d3 = f * 0.5f;
        float sin3 = (float) Math.sin(d3);
        float cos3 = (float) Math.cos(d3);
        float f4 = cos2 * cos;
        float f5 = sin2 * sin;
        float f6 = cos2 * sin;
        float f7 = sin2 * cos;
        this.w = (f4 * cos3) - (f5 * sin3);
        this.x = (f4 * sin3) + (f5 * cos3);
        this.y = (f7 * cos3) + (f6 * sin3);
        this.z = (f6 * cos3) - (f7 * sin3);
        normalize();
        return this;
    }

    public void normalize() {
        float invSqrt = invSqrt(_norm());
        this.x *= invSqrt;
        this.y *= invSqrt;
        this.z *= invSqrt;
        this.w *= invSqrt;
    }

    public float _norm() {
        float f = this.w;
        float f2 = this.x;
        float f3 = (f * f) + (f2 * f2);
        float f4 = this.y;
        float f5 = f3 + (f4 * f4);
        float f6 = this.z;
        return f5 + (f6 * f6);
    }

    float invSqrt(float f) {
        return 1.0f / ((float) Math.sqrt(f));
    }

    public Quaternion(float f, float f2, float f3, float f4) {
        this.x = f;
        this.y = f2;
        this.z = f3;
        this.w = f4;
    }

    public Quaternion setFromAxisRad(float f, float f2, float f3, float f4) {
        float length = Vec3f.length(f, f2, f3);
        if (length == 0.0f) {
            return idt();
        }
        float f5 = 1.0f / length;
        double d = (f4 < 0.0f ? 6.2831855f - ((-f4) % 6.2831855f) : f4 % 6.2831855f) / 2.0f;
        float sin = (float) Math.sin(d);
        set(f * f5 * sin, f2 * f5 * sin, f5 * f3 * sin, (float) Math.cos(d));
        normalize();
        return this;
    }

    public Quaternion idt() {
        set(0.0f, 0.0f, 0.0f, 1.0f);
        return this;
    }

    private void set(float f, float f2, float f3, float f4) {
        this.x = f;
        this.y = f2;
        this.z = f3;
        this.w = f4;
    }

    public String toString() {
        return this.x + " + " + this.y + "i + " + this.z + "j + " + this.w + "k";
    }

    public void set(Quaternion quaternion) {
        this.x = quaternion.x;
        this.y = quaternion.y;
        this.z = quaternion.z;
        this.w = quaternion.w;
    }

    public double norm() {
        float f = this.x;
        float f2 = this.y;
        float f3 = (f * f) + (f2 * f2);
        float f4 = this.z;
        float f5 = f3 + (f4 * f4);
        float f6 = this.w;
        return Math.sqrt(f5 + (f6 * f6));
    }

    public Quaternion conjugate() {
        return new Quaternion(this.x, -this.y, -this.z, -this.w);
    }

    public Quaternion plus(Quaternion quaternion) {
        return new Quaternion(this.x + quaternion.x, this.y + quaternion.y, this.z + quaternion.z, this.w + quaternion.w);
    }

    public Quaternion times(Quaternion quaternion) {
        float f = this.x;
        float f2 = quaternion.x;
        float f3 = this.y;
        float f4 = quaternion.y;
        float f5 = this.z;
        float f6 = quaternion.z;
        float f7 = ((f * f2) - (f3 * f4)) - (f5 * f6);
        float f8 = this.w;
        float f9 = quaternion.w;
        return new Quaternion(f7 - (f8 * f9), (((f * f4) + (f3 * f2)) + (f5 * f9)) - (f8 * f6), ((f * f6) - (f3 * f9)) + (f5 * f2) + (f8 * f4), (((f * f9) + (f3 * f6)) - (f5 * f4)) + (f8 * f2));
    }

    public Quaternion inverse() {
        float f = this.x;
        float f2 = this.y;
        float f3 = (f * f) + (f2 * f2);
        float f4 = this.z;
        float f5 = f3 + (f4 * f4);
        float f6 = this.w;
        float f7 = f5 + (f6 * f6);
        return new Quaternion(this.x / f7, (-this.y) / f7, (-this.z) / f7, (-this.w) / f7);
    }

    public Quaternion divides(Quaternion quaternion) {
        return times(quaternion.inverse());
    }

    public Vec3f transform(Vec3f vec3f) {
        tmp2.set(this);
        tmp2.conjugate();
        tmp2.mulLeft(vec3f.x, vec3f.y, vec3f.z, 0.0f).mulLeft(this.x, this.y, this.z, this.w);
        vec3f.x = tmp2.x;
        vec3f.y = tmp2.y;
        vec3f.z = tmp2.z;
        return vec3f;
    }

    public Quaternion mulLeft(float f, float f2, float f3, float f4) {
        float f5 = this.x;
        float f6 = this.w;
        float f7 = this.z;
        float f8 = this.y;
        this.x = (((f4 * f5) + (f * f6)) + (f2 * f7)) - (f3 * f8);
        this.y = (((f4 * f8) + (f2 * f6)) + (f3 * f5)) - (f * f7);
        this.z = (((f4 * f7) + (f3 * f6)) + (f * f8)) - (f2 * f5);
        this.w = (((f4 * f6) - (f * f5)) - (f2 * f8)) - (f3 * f7);
        return this;
    }
}
