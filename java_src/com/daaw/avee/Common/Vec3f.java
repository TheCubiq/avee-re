package com.daaw.avee.Common;
/* loaded from: classes.dex */
public class Vec3f {
    private static final float edF = 1.0E-4f;
    private static final float epsilonF = 1.1920929E-7f;
    public float x;
    public float y;
    public float z;

    public Vec3f(float f, float f2, float f3) {
        this.x = f;
        this.y = f2;
        this.z = f3;
    }

    public static Vec3f cross(Vec3f vec3f, Vec3f vec3f2) {
        float f = vec3f.y;
        float f2 = vec3f2.z;
        float f3 = vec3f.z;
        float f4 = vec3f2.y;
        float f5 = vec3f2.x;
        float f6 = vec3f.x;
        return new Vec3f((f * f2) - (f3 * f4), (f3 * f5) - (f2 * f6), (f6 * f4) - (f * f5));
    }

    public float length() {
        float f = this.x;
        float f2 = this.y;
        float f3 = (f * f) + (f2 * f2);
        float f4 = this.z;
        return (float) Math.sqrt(f3 + (f4 * f4));
    }

    public static float length(float f, float f2, float f3) {
        return (float) Math.sqrt((f * f) + (f2 * f2) + (f3 * f3));
    }

    public void normalize() {
        float length = length();
        this.x /= length;
        this.y /= length;
        this.z /= length;
    }

    public Vec3f normalizedResult() {
        float length = length();
        return new Vec3f(this.x / length, this.y / length, this.z / length);
    }

    public Vec3f cross(Vec3f vec3f) {
        float f = this.y;
        float f2 = vec3f.z;
        float f3 = this.z;
        float f4 = vec3f.y;
        float f5 = (f * f2) - (f3 * f4);
        float f6 = vec3f.x;
        float f7 = this.x;
        return new Vec3f(f5, (f3 * f6) - (f2 * f7), (f7 * f4) - (f * f6));
    }

    public float dot(Vec3f vec3f) {
        return (this.x * vec3f.x) + (this.y * vec3f.y) + (this.z * vec3f.z);
    }

    public float getAngle2d() {
        float length = length();
        if (length == 0.0f) {
            length = epsilonF;
        }
        float f = this.x / length;
        float f2 = this.y / length;
        float f3 = (float) (-Math.atan2(f2 == 0.0f ? 1.1920928955078125E-7d : -f2, f != 0.0f ? f : 1.1920928955078125E-7d));
        return f3 < 0.0f ? f3 + 6.2831855f : f3;
    }
}
