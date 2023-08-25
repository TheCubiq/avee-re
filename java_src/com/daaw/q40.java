package com.daaw;

import android.opengl.GLES20;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.nio.ShortBuffer;
/* loaded from: classes.dex */
public class q40 {
    public static float[] k = {-1.0f, 1.0f, 0.0f, -1.0f, -1.0f, 0.0f, 1.0f, -1.0f, 0.0f, 1.0f, 1.0f, 0.0f};
    public static float[] l = {0.5f, 0.5f, 0.0f, 1.0f, -1.0f, 0.0f, -1.0f, -1.0f, 0.0f, -1.0f, 1.0f, 0.0f};
    public final FloatBuffer b;
    public final FloatBuffer c;
    public final ShortBuffer d;
    public int e;
    public int f;
    public int g;
    public final short[] h;
    public int j;
    public vp a = new vp();
    public final int i = 12;

    public q40() {
        this.e = 0;
        this.f = 0;
        this.g = 0;
        short[] sArr = {0, 1, 2, 0, 2, 3};
        this.h = sArr;
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(k.length * 4);
        allocateDirect.order(ByteOrder.nativeOrder());
        FloatBuffer asFloatBuffer = allocateDirect.asFloatBuffer();
        this.b = asFloatBuffer;
        asFloatBuffer.put(k);
        asFloatBuffer.position(0);
        ByteBuffer allocateDirect2 = ByteBuffer.allocateDirect(l.length * 4);
        allocateDirect2.order(ByteOrder.nativeOrder());
        FloatBuffer asFloatBuffer2 = allocateDirect2.asFloatBuffer();
        this.c = asFloatBuffer2;
        asFloatBuffer2.put(l);
        asFloatBuffer2.position(0);
        ByteBuffer allocateDirect3 = ByteBuffer.allocateDirect(sArr.length * 2);
        allocateDirect3.order(ByteOrder.nativeOrder());
        ShortBuffer asShortBuffer = allocateDirect3.asShortBuffer();
        this.d = asShortBuffer;
        asShortBuffer.put(sArr);
        asShortBuffer.position(0);
        this.f = f80.s(35633, "const vec2 madd=vec2(0.5,0.5);attribute vec3 vertexIn;varying vec2 textureCoord;void main() {textureCoord = vertexIn.xy*madd+madd;gl_Position = vec4(vertexIn,1.0);}");
        this.g = f80.s(35632, "precision mediump float;varying vec2 textureCoord;uniform sampler2D s_texture;void main() {vec4 color1 = texture2D(s_texture,textureCoord);gl_FragColor = color1;}");
        int glCreateProgram = GLES20.glCreateProgram();
        this.e = glCreateProgram;
        GLES20.glAttachShader(glCreateProgram, this.f);
        GLES20.glAttachShader(this.e, this.g);
        GLES20.glLinkProgram(this.e);
        int[] iArr = new int[1];
        GLES20.glGetProgramiv(this.e, 35714, iArr, 0);
        if (iArr[0] != 1) {
            lz1.c("Could not link program: ");
            lz1.c(GLES20.glGetProgramInfoLog(this.e));
            GLES20.glDeleteProgram(this.e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Boolean f() {
        return Boolean.valueOf(this.e == 0);
    }

    public void b() {
        if (this.e != 0) {
            c();
            GLES20.glDeleteProgram(this.e);
            this.e = 0;
        }
    }

    public final void c() {
        int i = this.f;
        if (i != 0) {
            GLES20.glDetachShader(this.e, i);
            GLES20.glDeleteShader(this.f);
            this.f = 0;
        }
        int i2 = this.g;
        if (i2 != 0) {
            GLES20.glDetachShader(this.e, i2);
            GLES20.glDeleteShader(this.g);
            this.g = 0;
        }
    }

    public void d() {
        GLES20.glUseProgram(this.e);
        int glGetAttribLocation = GLES20.glGetAttribLocation(this.e, "vertexIn");
        this.j = glGetAttribLocation;
        GLES20.glEnableVertexAttribArray(glGetAttribLocation);
        GLES20.glVertexAttribPointer(this.j, 3, 5126, false, 12, (Buffer) this.b);
        GLES20.glDrawElements(4, this.h.length, 5123, this.d);
        GLES20.glDisableVertexAttribArray(this.j);
    }

    public void e(dc1 dc1Var, String str) {
        int i = dc1Var.i(str);
        GLES20.glEnableVertexAttribArray(i);
        GLES20.glVertexAttribPointer(i, 3, 5126, false, 12, (Buffer) this.b);
        GLES20.glDrawElements(4, this.h.length, 5123, this.d);
        GLES20.glDisableVertexAttribArray(i);
    }

    public void finalize() {
        super.finalize();
        this.a.a(new w40() { // from class: com.daaw.p40
            @Override // com.daaw.w40
            public final Object a() {
                Boolean f;
                f = q40.this.f();
                return f;
            }
        });
    }
}
