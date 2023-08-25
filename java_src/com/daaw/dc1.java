package com.daaw;

import android.opengl.GLES20;
import java.util.HashMap;
import java.util.List;
/* loaded from: classes2.dex */
public class dc1 {

    /* renamed from: i */
    public static boolean f6905i;

    /* renamed from: a */
    public int f6906a;

    /* renamed from: b */
    public String f6907b;

    /* renamed from: c */
    public HashMap<String, Integer> f6908c;

    /* renamed from: d */
    public C1074a[] f6909d;

    /* renamed from: e */
    public String f6910e;

    /* renamed from: f */
    public String f6911f;

    /* renamed from: g */
    public int f6912g;

    /* renamed from: h */
    public int f6913h;

    /* renamed from: com.daaw.dc1$a */
    /* loaded from: classes2.dex */
    public static class C1074a {

        /* renamed from: a */
        public String f6914a = null;

        /* renamed from: b */
        public int f6915b = -1;
    }

    public dc1(String str, String str2) {
        this(str, str2, null);
    }

    public dc1(String str, String str2, List<ls1> list) {
        this.f6907b = "";
        this.f6908c = new HashMap<>();
        if (str == null || str2 == null) {
            throw new IllegalArgumentException("shader source must be non-null");
        }
        if (!m24545m()) {
            throw new qi0("no shader support found; shaders require OpenGL 2.0");
        }
        this.f6910e = str;
        this.f6911f = str2;
        this.f6912g = m24555c(35633, str);
        this.f6913h = m24555c(35632, str2);
        this.f6906a = m24554d();
        try {
            m24544n(list);
        } catch (qi0 e) {
            m24553e();
            throw e;
        }
    }

    /* renamed from: m */
    public static boolean m24545m() {
        return true;
    }

    /* renamed from: A */
    public boolean m24558A() {
        return this.f6906a != 0;
    }

    /* renamed from: a */
    public void m24557a() {
        GLES20.glAttachShader(m24548j(), this.f6912g);
        GLES20.glAttachShader(m24548j(), this.f6913h);
    }

    /* renamed from: b */
    public C1074a m24556b(String str) {
        int i = 0;
        while (true) {
            C1074a[] c1074aArr = this.f6909d;
            if (i >= c1074aArr.length) {
                if (f6905i) {
                    throw new IllegalArgumentException("no active attribute by name '" + str + "' (disable strict compiling to suppress warnings)");
                }
                return null;
            } else if (str.equals(c1074aArr[i].f6914a)) {
                return this.f6909d[i];
            } else {
                i++;
            }
        }
    }

    /* renamed from: c */
    public int m24555c(int i, String str) {
        String str2;
        int glCreateShader = GLES20.glCreateShader(i);
        if (glCreateShader != 0) {
            GLES20.glShaderSource(glCreateShader, str);
            GLES20.glCompileShader(glCreateShader);
            int[] iArr = new int[1];
            GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
            int i2 = iArr[0];
            String m24533y = m24533y(i);
            String glGetShaderInfoLog = GLES20.glGetShaderInfoLog(glCreateShader);
            if (glGetShaderInfoLog != null && glGetShaderInfoLog.length() != 0) {
                this.f6907b += m24533y + " compile log:\n" + glGetShaderInfoLog + "\n";
            }
            if (i2 == 0) {
                if (this.f6907b.length() != 0) {
                    str2 = this.f6907b;
                } else {
                    str2 = "Could not compile " + m24533y(i);
                }
                throw new qi0(str2);
            }
            return glCreateShader;
        }
        throw new qi0("could not create shader obj; check ShaderProgram.isSupported()");
    }

    /* renamed from: d */
    public int m24554d() {
        int glCreateProgram = GLES20.glCreateProgram();
        if (glCreateProgram != 0) {
            return glCreateProgram;
        }
        throw new qi0("could not create program; check ShaderProgram.isSupported()");
    }

    /* renamed from: e */
    public void m24553e() {
        if (this.f6906a != 0) {
            m24552f();
            GLES20.glDeleteProgram(this.f6906a);
            this.f6906a = 0;
        }
    }

    /* renamed from: f */
    public void m24552f() {
        if (this.f6912g != 0) {
            GLES20.glDetachShader(m24548j(), this.f6912g);
            GLES20.glDeleteShader(this.f6912g);
            this.f6912g = 0;
        }
        if (this.f6913h != 0) {
            GLES20.glDetachShader(m24548j(), this.f6913h);
            GLES20.glDeleteShader(this.f6913h);
            this.f6913h = 0;
        }
    }

    /* renamed from: g */
    public final void m24551g() {
        int[] iArr = new int[1];
        GLES20.glGetProgramiv(this.f6906a, 35721, iArr, 0);
        int i = iArr[0];
        int[] iArr2 = new int[1];
        int[] iArr3 = new int[1];
        int[] iArr4 = new int[1];
        byte[] bArr = new byte[64];
        this.f6909d = new C1074a[i];
        int i2 = 0;
        while (i2 < i) {
            C1074a c1074a = new C1074a();
            int i3 = i2;
            byte[] bArr2 = bArr;
            GLES20.glGetActiveAttrib(this.f6906a, i2, 64, iArr2, 0, iArr3, 0, iArr4, 0, bArr, 0);
            String str = new String(bArr2, 0, iArr2[0]);
            c1074a.f6914a = str;
            c1074a.f6915b = GLES20.glGetAttribLocation(this.f6906a, str);
            this.f6909d[i3] = c1074a;
            i2 = i3 + 1;
            bArr = bArr2;
        }
    }

    /* renamed from: h */
    public final void m24550h() {
        byte[] bArr;
        int[] iArr = new int[1];
        GLES20.glGetProgramiv(this.f6906a, 35718, iArr, 0);
        int i = iArr[0];
        int[] iArr2 = new int[1];
        int[] iArr3 = new int[1];
        int[] iArr4 = new int[1];
        byte[] bArr2 = new byte[64];
        int i2 = 0;
        while (i2 < i) {
            int i3 = i2;
            byte[] bArr3 = bArr2;
            GLES20.glGetActiveUniform(this.f6906a, i2, 64, iArr2, 0, iArr3, 0, iArr4, 0, bArr3, 0);
            int i4 = iArr2[0];
            if (i4 == 0) {
                while (true) {
                    bArr = bArr3;
                    if (i4 >= 64 || bArr[i4] == 0) {
                        break;
                    }
                    i4++;
                    bArr3 = bArr;
                }
            } else {
                bArr = bArr3;
            }
            String str = new String(bArr, 0, i4);
            if (str.contains(" ")) {
                str = str.substring(0, str.indexOf(" "));
            }
            this.f6908c.put(str, Integer.valueOf(GLES20.glGetUniformLocation(this.f6906a, str)));
            i2 = i3 + 1;
            bArr2 = bArr;
        }
    }

    /* renamed from: i */
    public int m24549i(String str) {
        C1074a m24556b = m24556b(str);
        if (m24556b != null) {
            return m24556b.f6915b;
        }
        return -1;
    }

    /* renamed from: j */
    public int m24548j() {
        return this.f6906a;
    }

    /* renamed from: k */
    public String m24547k() {
        return this.f6907b;
    }

    /* renamed from: l */
    public int m24546l(String str) {
        int intValue;
        Integer num = this.f6908c.get(str);
        if (num == null) {
            intValue = GLES20.glGetUniformLocation(this.f6906a, str);
            this.f6908c.put(str, Integer.valueOf(intValue));
        } else {
            intValue = num.intValue();
        }
        if (intValue == -1 && f6905i) {
            throw new IllegalArgumentException("no active uniform by name '" + str + "' (disable strict compiling to suppress warnings)");
        }
        return intValue;
    }

    /* renamed from: n */
    public void m24544n(List<ls1> list) {
        if (!m24558A()) {
            throw new qi0("trying to link an invalid (i.e. released) program");
        }
        this.f6908c.clear();
        if (list != null) {
            for (ls1 ls1Var : list) {
                if (ls1Var != null) {
                    GLES20.glBindAttribLocation(this.f6906a, ls1Var.f17727c, ls1Var.f17725a);
                }
            }
        }
        m24557a();
        GLES20.glLinkProgram(this.f6906a);
        int[] iArr = new int[1];
        GLES20.glGetProgramiv(this.f6906a, 35714, iArr, 0);
        int i = iArr[0];
        String glGetProgramInfoLog = GLES20.glGetProgramInfoLog(this.f6906a);
        if (glGetProgramInfoLog != null && glGetProgramInfoLog.length() != 0) {
            this.f6907b = glGetProgramInfoLog + "\n" + this.f6907b;
        }
        String str = this.f6907b;
        if (str != null) {
            this.f6907b = str.trim();
        }
        if (i == 0) {
            throw new qi0(this.f6907b.length() != 0 ? this.f6907b : "Could not link program");
        }
        m24550h();
        m24551g();
    }

    /* renamed from: o */
    public void m24543o(int i, float f) {
        if (i == -1) {
            return;
        }
        GLES20.glUniform1f(i, f);
    }

    /* renamed from: p */
    public void m24542p(int i, float f, float f2) {
        if (i == -1) {
            return;
        }
        GLES20.glUniform2f(i, f, f2);
    }

    /* renamed from: q */
    public void m24541q(int i, float f, float f2, float f3) {
        if (i == -1) {
            return;
        }
        GLES20.glUniform3f(i, f, f2, f3);
    }

    /* renamed from: r */
    public void m24540r(int i, float f, float f2, float f3, float f4) {
        if (i == -1) {
            return;
        }
        GLES20.glUniform4f(i, f, f2, f3, f4);
    }

    /* renamed from: s */
    public void m24539s(String str, float f) {
        m24543o(m24546l(str), f);
    }

    /* renamed from: t */
    public void m24538t(String str, float f, float f2) {
        m24542p(m24546l(str), f, f2);
    }

    /* renamed from: u */
    public void m24537u(String str, float f, float f2, float f3) {
        m24541q(m24546l(str), f, f2, f3);
    }

    /* renamed from: v */
    public void m24536v(String str, float f, float f2, float f3, float f4) {
        m24540r(m24546l(str), f, f2, f3, f4);
    }

    /* renamed from: w */
    public void m24535w(int i, int i2) {
        if (i == -1) {
            return;
        }
        GLES20.glUniform1i(i, i2);
    }

    /* renamed from: x */
    public void m24534x(String str, int i) {
        m24535w(m24546l(str), i);
    }

    /* renamed from: y */
    public final String m24533y(int i) {
        return i == 35632 ? "FRAGMENT_SHADER" : i == 35633 ? "VERTEX_SHADER" : "shader";
    }

    /* renamed from: z */
    public void m24532z() {
        if (!m24558A()) {
            throw new IllegalStateException("trying to enable a program that is not valid");
        }
        GLES20.glUseProgram(this.f6906a);
    }
}
