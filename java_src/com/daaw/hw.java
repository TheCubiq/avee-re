package com.daaw;

import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;
/* loaded from: classes.dex */
public final class hw {
    public final b a;

    /* loaded from: classes.dex */
    public static class a extends b {
        public final TextView a;
        public final dw b;
        public boolean c = true;

        public a(TextView textView) {
            this.a = textView;
            this.b = new dw(textView);
        }

        @Override // com.daaw.hw.b
        public InputFilter[] a(InputFilter[] inputFilterArr) {
            return !this.c ? h(inputFilterArr) : f(inputFilterArr);
        }

        @Override // com.daaw.hw.b
        public boolean b() {
            return this.c;
        }

        @Override // com.daaw.hw.b
        public void c(boolean z) {
            if (z) {
                l();
            }
        }

        @Override // com.daaw.hw.b
        public void d(boolean z) {
            this.c = z;
            l();
            k();
        }

        @Override // com.daaw.hw.b
        public TransformationMethod e(TransformationMethod transformationMethod) {
            return this.c ? m(transformationMethod) : j(transformationMethod);
        }

        public final InputFilter[] f(InputFilter[] inputFilterArr) {
            int length = inputFilterArr.length;
            for (InputFilter inputFilter : inputFilterArr) {
                if (inputFilter == this.b) {
                    return inputFilterArr;
                }
            }
            InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length + 1];
            System.arraycopy(inputFilterArr, 0, inputFilterArr2, 0, length);
            inputFilterArr2[length] = this.b;
            return inputFilterArr2;
        }

        public final SparseArray<InputFilter> g(InputFilter[] inputFilterArr) {
            SparseArray<InputFilter> sparseArray = new SparseArray<>(1);
            for (int i = 0; i < inputFilterArr.length; i++) {
                if (inputFilterArr[i] instanceof dw) {
                    sparseArray.put(i, inputFilterArr[i]);
                }
            }
            return sparseArray;
        }

        public final InputFilter[] h(InputFilter[] inputFilterArr) {
            SparseArray<InputFilter> g = g(inputFilterArr);
            if (g.size() == 0) {
                return inputFilterArr;
            }
            int length = inputFilterArr.length;
            InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length - g.size()];
            int i = 0;
            for (int i2 = 0; i2 < length; i2++) {
                if (g.indexOfKey(i2) < 0) {
                    inputFilterArr2[i] = inputFilterArr[i2];
                    i++;
                }
            }
            return inputFilterArr2;
        }

        public void i(boolean z) {
            this.c = z;
        }

        public final TransformationMethod j(TransformationMethod transformationMethod) {
            return transformationMethod instanceof jw ? ((jw) transformationMethod).a() : transformationMethod;
        }

        public final void k() {
            this.a.setFilters(a(this.a.getFilters()));
        }

        public void l() {
            this.a.setTransformationMethod(e(this.a.getTransformationMethod()));
        }

        public final TransformationMethod m(TransformationMethod transformationMethod) {
            return ((transformationMethod instanceof jw) || (transformationMethod instanceof PasswordTransformationMethod)) ? transformationMethod : new jw(transformationMethod);
        }
    }

    /* loaded from: classes.dex */
    public static class b {
        public InputFilter[] a(InputFilter[] inputFilterArr) {
            throw null;
        }

        public boolean b() {
            throw null;
        }

        public void c(boolean z) {
            throw null;
        }

        public void d(boolean z) {
            throw null;
        }

        public TransformationMethod e(TransformationMethod transformationMethod) {
            throw null;
        }
    }

    /* loaded from: classes.dex */
    public static class c extends b {
        public final a a;

        public c(TextView textView) {
            this.a = new a(textView);
        }

        @Override // com.daaw.hw.b
        public InputFilter[] a(InputFilter[] inputFilterArr) {
            return f() ? inputFilterArr : this.a.a(inputFilterArr);
        }

        @Override // com.daaw.hw.b
        public boolean b() {
            return this.a.b();
        }

        @Override // com.daaw.hw.b
        public void c(boolean z) {
            if (f()) {
                return;
            }
            this.a.c(z);
        }

        @Override // com.daaw.hw.b
        public void d(boolean z) {
            if (f()) {
                this.a.i(z);
            } else {
                this.a.d(z);
            }
        }

        @Override // com.daaw.hw.b
        public TransformationMethod e(TransformationMethod transformationMethod) {
            return f() ? transformationMethod : this.a.e(transformationMethod);
        }

        public final boolean f() {
            return !androidx.emoji2.text.b.h();
        }
    }

    public hw(TextView textView, boolean z) {
        ty0.g(textView, "textView cannot be null");
        this.a = !z ? new c(textView) : new a(textView);
    }

    public InputFilter[] a(InputFilter[] inputFilterArr) {
        return this.a.a(inputFilterArr);
    }

    public boolean b() {
        return this.a.b();
    }

    public void c(boolean z) {
        this.a.c(z);
    }

    public void d(boolean z) {
        this.a.d(z);
    }

    public TransformationMethod e(TransformationMethod transformationMethod) {
        return this.a.e(transformationMethod);
    }
}
