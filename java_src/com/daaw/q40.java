package com.daaw;

import android.opengl.GLES20;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.nio.ShortBuffer;
/* loaded from: classes.dex */
public class q40 {

    /* renamed from: k */
    public static float[] f23658k = {-1.0f, 1.0f, 0.0f, -1.0f, -1.0f, 0.0f, 1.0f, -1.0f, 0.0f, 1.0f, 1.0f, 0.0f};

    /* renamed from: l */
    public static float[] f23659l = {0.5f, 0.5f, 0.0f, 1.0f, -1.0f, 0.0f, -1.0f, -1.0f, 0.0f, -1.0f, 1.0f, 0.0f};

    /* renamed from: b */
    public final FloatBuffer f23661b;

    /* renamed from: c */
    public final FloatBuffer f23662c;

    /* renamed from: d */
    public final ShortBuffer f23663d;

    /* renamed from: e */
    public int f23664e;

    /* renamed from: f */
    public int f23665f;

    /* renamed from: g */
    public int f23666g;

    /* renamed from: h */
    public final short[] f23667h;

    /* renamed from: j */
    public int f23669j;

    /* renamed from: a */
    public C3358vp f23660a = new C3358vp();

    /* renamed from: i */
    public final int f23668i = 12;

    public q40() {
        this.f23664e = 0;
        this.f23665f = 0;
        this.f23666g = 0;
        short[] sArr = {0, 1, 2, 0, 2, 3};
        this.f23667h = sArr;
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(f23658k.length * 4);
        allocateDirect.order(ByteOrder.nativeOrder());
        FloatBuffer asFloatBuffer = allocateDirect.asFloatBuffer();
        this.f23661b = asFloatBuffer;
        asFloatBuffer.put(f23658k);
        asFloatBuffer.position(0);
        ByteBuffer allocateDirect2 = ByteBuffer.allocateDirect(f23659l.length * 4);
        allocateDirect2.order(ByteOrder.nativeOrder());
        FloatBuffer asFloatBuffer2 = allocateDirect2.asFloatBuffer();
        this.f23662c = asFloatBuffer2;
        asFloatBuffer2.put(f23659l);
        asFloatBuffer2.position(0);
        ByteBuffer allocateDirect3 = ByteBuffer.allocateDirect(sArr.length * 2);
        allocateDirect3.order(ByteOrder.nativeOrder());
        ShortBuffer asShortBuffer = allocateDirect3.asShortBuffer();
        this.f23663d = asShortBuffer;
        asShortBuffer.put(sArr);
        asShortBuffer.position(0);
        this.f23665f = f80.m22855s(35633, "const vec2 madd=vec2(0.5,0.5);attribute vec3 vertexIn;varying vec2 textureCoord;void main() {textureCoord = vertexIn.xy*madd+madd;gl_Position = vec4(vertexIn,1.0);}");
        this.f23666g = f80.m22855s(35632, "precision mediump float;varying vec2 textureCoord;uniform sampler2D s_texture;void main() {vec4 color1 = texture2D(s_texture,textureCoord);gl_FragColor = color1;}");
        int glCreateProgram = GLES20.glCreateProgram();
        this.f23664e = glCreateProgram;
        GLES20.glAttachShader(glCreateProgram, this.f23665f);
        GLES20.glAttachShader(this.f23664e, this.f23666g);
        GLES20.glLinkProgram(this.f23664e);
        int[] iArr = new int[1];
        GLES20.glGetProgramiv(this.f23664e, 35714, iArr, 0);
        if (iArr[0] != 1) {
            lz1.m16363c("Could not link program: ");
            lz1.m16363c(GLES20.glGetProgramInfoLog(this.f23664e));
            GLES20.glDeleteProgram(this.f23664e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public /* synthetic */ Boolean m12778f() {
        return Boolean.valueOf(this.f23664e == 0);
    }

    /* renamed from: b */
    public void m12782b() {
        if (this.f23664e != 0) {
            m12781c();
            GLES20.glDeleteProgram(this.f23664e);
            this.f23664e = 0;
        }
    }

    /* renamed from: c */
    public final void m12781c() {
        int i = this.f23665f;
        if (i != 0) {
            GLES20.glDetachShader(this.f23664e, i);
            GLES20.glDeleteShader(this.f23665f);
            this.f23665f = 0;
        }
        int i2 = this.f23666g;
        if (i2 != 0) {
            GLES20.glDetachShader(this.f23664e, i2);
            GLES20.glDeleteShader(this.f23666g);
            this.f23666g = 0;
        }
    }

    /* renamed from: d */
    public void m12780d() {
        GLES20.glUseProgram(this.f23664e);
        int glGetAttribLocation = GLES20.glGetAttribLocation(this.f23664e, "vertexIn");
        this.f23669j = glGetAttribLocation;
        GLES20.glEnableVertexAttribArray(glGetAttribLocation);
        GLES20.glVertexAttribPointer(this.f23669j, 3, 5126, false, 12, (Buffer) this.f23661b);
        GLES20.glDrawElements(4, this.f23667h.length, 5123, this.f23663d);
        GLES20.glDisableVertexAttribArray(this.f23669j);
    }

    /* renamed from: e */
    public void m12779e(dc1 dc1Var, String str) {
        int m24549i = dc1Var.m24549i(str);
        GLES20.glEnableVertexAttribArray(m24549i);
        GLES20.glVertexAttribPointer(m24549i, 3, 5126, false, 12, (Buffer) this.f23661b);
        GLES20.glDrawElements(4, this.f23667h.length, 5123, this.f23663d);
        GLES20.glDisableVertexAttribArray(m24549i);
    }

    public void finalize() {
        super.finalize();
        this.f23660a.m6959a(new w40() { // from class: com.daaw.p40
            @Override // com.daaw.w40
            /* renamed from: a */
            public final Object mo3478a() {
                Boolean m12778f;
                m12778f = q40.this.m12778f();
                return m12778f;
            }
        });
    }
}
