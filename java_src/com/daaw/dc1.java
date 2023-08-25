package com.daaw;

import android.opengl.GLES20;
import java.util.HashMap;
import java.util.List;
/* loaded from: classes2.dex */
public class dc1 {
    public static boolean i;
    public int a;
    public String b;
    public HashMap<String, Integer> c;
    public a[] d;
    public String e;
    public String f;
    public int g;
    public int h;

    /* loaded from: classes2.dex */
    public static class a {
        public String a = null;
        public int b = -1;
    }

    public dc1(String str, String str2) {
        this(str, str2, null);
    }

    public dc1(String str, String str2, List<ls1> list) {
        this.b = "";
        this.c = new HashMap<>();
        if (str == null || str2 == null) {
            throw new IllegalArgumentException("shader source must be non-null");
        }
        if (!m()) {
            throw new qi0("no shader support found; shaders require OpenGL 2.0");
        }
        this.e = str;
        this.f = str2;
        this.g = c(35633, str);
        this.h = c(35632, str2);
        this.a = d();
        try {
            n(list);
        } catch (qi0 e) {
            e();
            throw e;
        }
    }

    public static boolean m() {
        return true;
    }

    public boolean A() {
        return this.a != 0;
    }

    public void a() {
        GLES20.glAttachShader(j(), this.g);
        GLES20.glAttachShader(j(), this.h);
    }

    public a b(String str) {
        int i2 = 0;
        while (true) {
            a[] aVarArr = this.d;
            if (i2 >= aVarArr.length) {
                if (i) {
                    throw new IllegalArgumentException("no active attribute by name '" + str + "' (disable strict compiling to suppress warnings)");
                }
                return null;
            } else if (str.equals(aVarArr[i2].a)) {
                return this.d[i2];
            } else {
                i2++;
            }
        }
    }

    public int c(int i2, String str) {
        String str2;
        int glCreateShader = GLES20.glCreateShader(i2);
        if (glCreateShader != 0) {
            GLES20.glShaderSource(glCreateShader, str);
            GLES20.glCompileShader(glCreateShader);
            int[] iArr = new int[1];
            GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
            int i3 = iArr[0];
            String y = y(i2);
            String glGetShaderInfoLog = GLES20.glGetShaderInfoLog(glCreateShader);
            if (glGetShaderInfoLog != null && glGetShaderInfoLog.length() != 0) {
                this.b += y + " compile log:\n" + glGetShaderInfoLog + "\n";
            }
            if (i3 == 0) {
                if (this.b.length() != 0) {
                    str2 = this.b;
                } else {
                    str2 = "Could not compile " + y(i2);
                }
                throw new qi0(str2);
            }
            return glCreateShader;
        }
        throw new qi0("could not create shader obj; check ShaderProgram.isSupported()");
    }

    public int d() {
        int glCreateProgram = GLES20.glCreateProgram();
        if (glCreateProgram != 0) {
            return glCreateProgram;
        }
        throw new qi0("could not create program; check ShaderProgram.isSupported()");
    }

    public void e() {
        if (this.a != 0) {
            f();
            GLES20.glDeleteProgram(this.a);
            this.a = 0;
        }
    }

    public void f() {
        if (this.g != 0) {
            GLES20.glDetachShader(j(), this.g);
            GLES20.glDeleteShader(this.g);
            this.g = 0;
        }
        if (this.h != 0) {
            GLES20.glDetachShader(j(), this.h);
            GLES20.glDeleteShader(this.h);
            this.h = 0;
        }
    }

    public final void g() {
        int[] iArr = new int[1];
        GLES20.glGetProgramiv(this.a, 35721, iArr, 0);
        int i2 = iArr[0];
        int[] iArr2 = new int[1];
        int[] iArr3 = new int[1];
        int[] iArr4 = new int[1];
        byte[] bArr = new byte[64];
        this.d = new a[i2];
        int i3 = 0;
        while (i3 < i2) {
            a aVar = new a();
            int i4 = i3;
            byte[] bArr2 = bArr;
            GLES20.glGetActiveAttrib(this.a, i3, 64, iArr2, 0, iArr3, 0, iArr4, 0, bArr, 0);
            String str = new String(bArr2, 0, iArr2[0]);
            aVar.a = str;
            aVar.b = GLES20.glGetAttribLocation(this.a, str);
            this.d[i4] = aVar;
            i3 = i4 + 1;
            bArr = bArr2;
        }
    }

    public final void h() {
        byte[] bArr;
        int[] iArr = new int[1];
        GLES20.glGetProgramiv(this.a, 35718, iArr, 0);
        int i2 = iArr[0];
        int[] iArr2 = new int[1];
        int[] iArr3 = new int[1];
        int[] iArr4 = new int[1];
        byte[] bArr2 = new byte[64];
        int i3 = 0;
        while (i3 < i2) {
            int i4 = i3;
            byte[] bArr3 = bArr2;
            GLES20.glGetActiveUniform(this.a, i3, 64, iArr2, 0, iArr3, 0, iArr4, 0, bArr3, 0);
            int i5 = iArr2[0];
            if (i5 == 0) {
                while (true) {
                    bArr = bArr3;
                    if (i5 >= 64 || bArr[i5] == 0) {
                        break;
                    }
                    i5++;
                    bArr3 = bArr;
                }
            } else {
                bArr = bArr3;
            }
            String str = new String(bArr, 0, i5);
            if (str.contains(" ")) {
                str = str.substring(0, str.indexOf(" "));
            }
            this.c.put(str, Integer.valueOf(GLES20.glGetUniformLocation(this.a, str)));
            i3 = i4 + 1;
            bArr2 = bArr;
        }
    }

    public int i(String str) {
        a b = b(str);
        if (b != null) {
            return b.b;
        }
        return -1;
    }

    public int j() {
        return this.a;
    }

    public String k() {
        return this.b;
    }

    public int l(String str) {
        int intValue;
        Integer num = this.c.get(str);
        if (num == null) {
            intValue = GLES20.glGetUniformLocation(this.a, str);
            this.c.put(str, Integer.valueOf(intValue));
        } else {
            intValue = num.intValue();
        }
        if (intValue == -1 && i) {
            throw new IllegalArgumentException("no active uniform by name '" + str + "' (disable strict compiling to suppress warnings)");
        }
        return intValue;
    }

    public void n(List<ls1> list) {
        if (!A()) {
            throw new qi0("trying to link an invalid (i.e. released) program");
        }
        this.c.clear();
        if (list != null) {
            for (ls1 ls1Var : list) {
                if (ls1Var != null) {
                    GLES20.glBindAttribLocation(this.a, ls1Var.c, ls1Var.a);
                }
            }
        }
        a();
        GLES20.glLinkProgram(this.a);
        int[] iArr = new int[1];
        GLES20.glGetProgramiv(this.a, 35714, iArr, 0);
        int i2 = iArr[0];
        String glGetProgramInfoLog = GLES20.glGetProgramInfoLog(this.a);
        if (glGetProgramInfoLog != null && glGetProgramInfoLog.length() != 0) {
            this.b = glGetProgramInfoLog + "\n" + this.b;
        }
        String str = this.b;
        if (str != null) {
            this.b = str.trim();
        }
        if (i2 == 0) {
            throw new qi0(this.b.length() != 0 ? this.b : "Could not link program");
        }
        h();
        g();
    }

    public void o(int i2, float f) {
        if (i2 == -1) {
            return;
        }
        GLES20.glUniform1f(i2, f);
    }

    public void p(int i2, float f, float f2) {
        if (i2 == -1) {
            return;
        }
        GLES20.glUniform2f(i2, f, f2);
    }

    public void q(int i2, float f, float f2, float f3) {
        if (i2 == -1) {
            return;
        }
        GLES20.glUniform3f(i2, f, f2, f3);
    }

    public void r(int i2, float f, float f2, float f3, float f4) {
        if (i2 == -1) {
            return;
        }
        GLES20.glUniform4f(i2, f, f2, f3, f4);
    }

    public void s(String str, float f) {
        o(l(str), f);
    }

    public void t(String str, float f, float f2) {
        p(l(str), f, f2);
    }

    public void u(String str, float f, float f2, float f3) {
        q(l(str), f, f2, f3);
    }

    public void v(String str, float f, float f2, float f3, float f4) {
        r(l(str), f, f2, f3, f4);
    }

    public void w(int i2, int i3) {
        if (i2 == -1) {
            return;
        }
        GLES20.glUniform1i(i2, i3);
    }

    public void x(String str, int i2) {
        w(l(str), i2);
    }

    public final String y(int i2) {
        return i2 == 35632 ? "FRAGMENT_SHADER" : i2 == 35633 ? "VERTEX_SHADER" : "shader";
    }

    public void z() {
        if (!A()) {
            throw new IllegalStateException("trying to enable a program that is not valid");
        }
        GLES20.glUseProgram(this.a);
    }
}
