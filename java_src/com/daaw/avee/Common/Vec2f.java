package com.daaw.avee.Common;

import java.util.Locale;
/* loaded from: classes.dex */
public class Vec2f {
    private static final float edF = 1.0E-4f;
    private static final float epsilonF = 1.1920929E-7f;
    public float x;
    public float y;

    public static float ccw90X(float f, float f2) {
        return -f2;
    }

    public static float ccw90Y(float f, float f2) {
        return f;
    }

    public static float cw90X(float f, float f2) {
        return f2;
    }

    public static float cw90Y(float f, float f2) {
        return -f;
    }

    public static float dot(float f, float f2, float f3, float f4) {
        return (f * f3) + (f2 * f4);
    }

    public static Vec2f invalid() {
        return new Vec2f(-3.4028235E38f, -3.4028235E38f);
    }

    public static Vec2f zero() {
        return new Vec2f(0.0f, 0.0f);
    }

    public static Vec2f one() {
        return new Vec2f(1.0f, 1.0f);
    }

    public static Vec2f FromString(String str, Vec2f vec2f) {
        if (str == null) {
            return vec2f;
        }
        try {
            int indexOf = str.indexOf(" ");
            if (indexOf < 0) {
                return vec2f;
            }
            return new Vec2f(Float.parseFloat(str.substring(0, indexOf)), Float.parseFloat(str.substring(indexOf + 1)));
        } catch (NumberFormatException unused) {
            return vec2f;
        }
    }

    public Vec2f(float f, float f2) {
        this.x = f;
        this.y = f2;
    }

    public String toString() {
        return String.format(Locale.US, "%f %f", Float.valueOf(this.x), Float.valueOf(this.y));
    }

    public static Vec2f fromAngleRad(float f) {
        double radians = (float) Math.toRadians(f);
        return new Vec2f((float) Math.cos(radians), (float) Math.sin(radians));
    }

    public static Vec2f fromAngle(float f) {
        double d = f;
        return new Vec2f((float) Math.cos(d), (float) Math.sin(d));
    }

    public static void fromAngle(Vec2f vec2f, float f) {
        double d = f;
        vec2f.x = (float) Math.cos(d);
        vec2f.y = (float) Math.sin(d);
    }

    public static void fromAngleXY(Vec3f vec3f, float f) {
        double d = f;
        vec3f.x = (float) Math.cos(d);
        vec3f.y = (float) Math.sin(d);
    }

    public static Vec2f rotate(Vec2f vec2f, float f) {
        double d = f;
        return new Vec2f((((float) Math.cos(d)) * vec2f.x) - (((float) Math.sin(d)) * vec2f.y), (((float) Math.sin(d)) * vec2f.x) + (((float) Math.cos(d)) * vec2f.y));
    }

    public static float cross(Vec2f vec2f, Vec2f vec2f2) {
        return (vec2f.x * vec2f2.y) - (vec2f.y * vec2f2.x);
    }

    public static float dot(Vec2f vec2f, Vec2f vec2f2) {
        return (vec2f.x * vec2f2.x) + (vec2f.y * vec2f2.y);
    }

    public void multiplyByValueDividedByDotCapped(Vec2f vec2f, float f) {
        float max = f / Math.max((this.x * vec2f.x) + (this.y * vec2f.y), 0.25f);
        this.x *= max;
        this.y *= max;
    }

    public void multiplyByValueDividedByDotCapped(float f, float f2, float f3) {
        float max = f3 / Math.max((this.x * f) + (this.y * f2), 0.25f);
        this.x *= max;
        this.y *= max;
    }

    public static float normalizeAndDot(float f, float f2, float f3, float f4) {
        float sqrt = (float) Math.sqrt((f * f) + (f2 * f2));
        float f5 = f / sqrt;
        float f6 = f2 / sqrt;
        float sqrt2 = (float) Math.sqrt((f3 * f3) + (f4 * f4));
        return (f5 * (f3 / sqrt2)) + (f6 * (f4 / sqrt2));
    }

    public static void interpolate(float f, Vec2f vec2f, Vec2f vec2f2, Vec2f vec2f3) {
        float f2 = vec2f.x;
        vec2f3.x = f2 + ((vec2f2.x - f2) * f);
        float f3 = vec2f.y;
        vec2f3.y = f3 + (f * (vec2f2.y - f3));
    }

    public void rotate(float f) {
        double d = f;
        float cos = (((float) Math.cos(d)) * this.x) - (((float) Math.sin(d)) * this.y);
        this.y = (((float) Math.sin(d)) * this.x) + (((float) Math.cos(d)) * this.y);
        this.x = cos;
    }

    public boolean equals(Vec2f vec2f) {
        return this.x == vec2f.x && this.y == vec2f.y;
    }

    public void abs() {
        this.x = Math.abs(this.x);
        this.y = Math.abs(this.y);
    }

    public static float length(float f, float f2) {
        return (float) Math.sqrt((f * f) + (f2 * f2));
    }

    public float length() {
        float f = this.x;
        float f2 = this.y;
        return (float) Math.sqrt((f * f) + (f2 * f2));
    }

    public float distance(Vec2f vec2f) {
        float f = this.x - vec2f.x;
        float f2 = this.y - vec2f.y;
        return (float) Math.sqrt((f * f) + (f2 * f2));
    }

    public Vec2f normalize() {
        float f = this.x;
        float f2 = this.y;
        float sqrt = (float) Math.sqrt((f * f) + (f2 * f2));
        this.x /= sqrt;
        this.y /= sqrt;
        return this;
    }

    public Vec2f normalizeSafe() {
        float f = this.x;
        float f2 = this.y;
        float sqrt = (float) Math.sqrt((f * f) + (f2 * f2));
        if (sqrt == 0.0f) {
            sqrt = epsilonF;
        }
        this.x /= sqrt;
        this.y /= sqrt;
        return this;
    }

    public Vec2f normalizedResult() {
        float length = length();
        return new Vec2f(this.x / length, this.y / length);
    }

    public float getAngle() {
        return getAngle(this.x, this.y);
    }

    public static float getAngle(float f, float f2) {
        float sqrt = (float) Math.sqrt((f * f) + (f2 * f2));
        if (sqrt == 0.0f) {
            sqrt = epsilonF;
        }
        float f3 = f / sqrt;
        float f4 = f2 / sqrt;
        float f5 = (float) (-Math.atan2(f4 == 0.0f ? 1.1920928955078125E-7d : -f4, f3 != 0.0f ? f3 : 1.1920928955078125E-7d));
        return f5 < 0.0f ? f5 + 6.2831855f : f5;
    }

    public boolean compareValues(Vec2f vec2f) {
        return Math.abs(this.x - vec2f.x) < 1.0E-4f && Math.abs(this.y - vec2f.y) < 1.0E-4f;
    }
}
