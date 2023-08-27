package com.mpatric.mp3agic;
/* loaded from: classes2.dex */
public class MutableInteger {
    private int value;

    public MutableInteger(int i) {
        this.value = i;
    }

    public void increment() {
        this.value++;
    }

    public int getValue() {
        return this.value;
    }

    public void setValue(int i) {
        this.value = i;
    }

    public int hashCode() {
        return 31 + this.value;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.value == ((MutableInteger) obj).value;
    }
}
