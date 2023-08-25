package com.daaw;

import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import java.io.Serializable;
/* renamed from: com.daaw.zc */
/* loaded from: classes.dex */
public final class C3827zc {
    /* renamed from: a */
    public static final Bundle m2494a(nv0<String, ? extends Object>... nv0VarArr) {
        ug0.m8267g(nv0VarArr, "pairs");
        Bundle bundle = new Bundle(nv0VarArr.length);
        for (nv0<String, ? extends Object> nv0Var : nv0VarArr) {
            String m14779a = nv0Var.m14779a();
            Object m14778b = nv0Var.m14778b();
            if (m14778b == null) {
                bundle.putString(m14779a, null);
            } else if (m14778b instanceof Boolean) {
                bundle.putBoolean(m14779a, ((Boolean) m14778b).booleanValue());
            } else if (m14778b instanceof Byte) {
                bundle.putByte(m14779a, ((Number) m14778b).byteValue());
            } else if (m14778b instanceof Character) {
                bundle.putChar(m14779a, ((Character) m14778b).charValue());
            } else if (m14778b instanceof Double) {
                bundle.putDouble(m14779a, ((Number) m14778b).doubleValue());
            } else if (m14778b instanceof Float) {
                bundle.putFloat(m14779a, ((Number) m14778b).floatValue());
            } else if (m14778b instanceof Integer) {
                bundle.putInt(m14779a, ((Number) m14778b).intValue());
            } else if (m14778b instanceof Long) {
                bundle.putLong(m14779a, ((Number) m14778b).longValue());
            } else if (m14778b instanceof Short) {
                bundle.putShort(m14779a, ((Number) m14778b).shortValue());
            } else if (m14778b instanceof Bundle) {
                bundle.putBundle(m14779a, (Bundle) m14778b);
            } else if (m14778b instanceof CharSequence) {
                bundle.putCharSequence(m14779a, (CharSequence) m14778b);
            } else if (m14778b instanceof Parcelable) {
                bundle.putParcelable(m14779a, (Parcelable) m14778b);
            } else if (m14778b instanceof boolean[]) {
                bundle.putBooleanArray(m14779a, (boolean[]) m14778b);
            } else if (m14778b instanceof byte[]) {
                bundle.putByteArray(m14779a, (byte[]) m14778b);
            } else if (m14778b instanceof char[]) {
                bundle.putCharArray(m14779a, (char[]) m14778b);
            } else if (m14778b instanceof double[]) {
                bundle.putDoubleArray(m14779a, (double[]) m14778b);
            } else if (m14778b instanceof float[]) {
                bundle.putFloatArray(m14779a, (float[]) m14778b);
            } else if (m14778b instanceof int[]) {
                bundle.putIntArray(m14779a, (int[]) m14778b);
            } else if (m14778b instanceof long[]) {
                bundle.putLongArray(m14779a, (long[]) m14778b);
            } else if (m14778b instanceof short[]) {
                bundle.putShortArray(m14779a, (short[]) m14778b);
            } else if (m14778b instanceof Object[]) {
                Class<?> componentType = m14778b.getClass().getComponentType();
                if (componentType == null) {
                    ug0.m8259o();
                }
                ug0.m8272b(componentType, "value::class.java.componentType!!");
                if (Parcelable.class.isAssignableFrom(componentType)) {
                    bundle.putParcelableArray(m14779a, (Parcelable[]) m14778b);
                } else if (String.class.isAssignableFrom(componentType)) {
                    bundle.putStringArray(m14779a, (String[]) m14778b);
                } else if (CharSequence.class.isAssignableFrom(componentType)) {
                    bundle.putCharSequenceArray(m14779a, (CharSequence[]) m14778b);
                } else {
                    if (!Serializable.class.isAssignableFrom(componentType)) {
                        throw new IllegalArgumentException("Illegal value array type " + componentType.getCanonicalName() + " for key \"" + m14779a + '\"');
                    }
                    bundle.putSerializable(m14779a, (Serializable) m14778b);
                }
            } else {
                if (!(m14778b instanceof Serializable)) {
                    int i = Build.VERSION.SDK_INT;
                    if (m14778b instanceof IBinder) {
                        bundle.putBinder(m14779a, (IBinder) m14778b);
                    } else if (i >= 21 && (m14778b instanceof Size)) {
                        bundle.putSize(m14779a, (Size) m14778b);
                    } else if (i < 21 || !(m14778b instanceof SizeF)) {
                        throw new IllegalArgumentException("Illegal value type " + m14778b.getClass().getCanonicalName() + " for key \"" + m14779a + '\"');
                    } else {
                        bundle.putSizeF(m14779a, (SizeF) m14778b);
                    }
                }
                bundle.putSerializable(m14779a, (Serializable) m14778b);
            }
        }
        return bundle;
    }
}
