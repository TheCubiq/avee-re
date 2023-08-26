package com.android.grafika.gles;

import android.opengl.GLES20;
import android.util.Log;
import java.nio.Buffer;
import java.nio.FloatBuffer;
import mdesl.graphics.Texture;
/* loaded from: classes.dex */
public class Texture2dProgram {
    private static final String FRAGMENT_SHADER_2D = "precision mediump float;\nvarying vec2 vTextureCoord;\nuniform sampler2D sTexture;\nvoid main() {\n    gl_FragColor = texture2D(sTexture, vTextureCoord);\n}\n";
    private static final String FRAGMENT_SHADER_EXT = "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 vTextureCoord;\nuniform samplerExternalOES sTexture;\nvoid main() {\n    gl_FragColor = texture2D(sTexture, vTextureCoord);\n}\n";
    private static final String FRAGMENT_SHADER_EXT_BW = "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 vTextureCoord;\nuniform samplerExternalOES sTexture;\nvoid main() {\n    vec4 tc = texture2D(sTexture, vTextureCoord);\n    float color = tc.r * 0.3 + tc.g * 0.59 + tc.b * 0.11;\n    gl_FragColor = vec4(color, color, color, 1.0);\n}\n";
    private static final String FRAGMENT_SHADER_EXT_FILT = "#extension GL_OES_EGL_image_external : require\n#define KERNEL_SIZE 9\nprecision highp float;\nvarying vec2 vTextureCoord;\nuniform samplerExternalOES sTexture;\nuniform float uKernel[KERNEL_SIZE];\nuniform vec2 uTexOffset[KERNEL_SIZE];\nuniform float uColorAdjust;\nvoid main() {\n    int i = 0;\n    vec4 sum = vec4(0.0);\n    if (vTextureCoord.x < vTextureCoord.y - 0.005) {\n        for (i = 0; i < KERNEL_SIZE; i++) {\n            vec4 texc = texture2D(sTexture, vTextureCoord + uTexOffset[i]);\n            sum += texc * uKernel[i];\n        }\n    sum += uColorAdjust;\n    } else if (vTextureCoord.x > vTextureCoord.y + 0.005) {\n        sum = texture2D(sTexture, vTextureCoord);\n    } else {\n        sum.r = 1.0;\n    }\n    gl_FragColor = sum;\n}\n";
    public static final int KERNEL_SIZE = 9;
    private static final String TAG = "Grafika";
    private static final String VERTEX_SHADER = "uniform mat4 uMVPMatrix;\nuniform mat4 uTexMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n    gl_Position = uMVPMatrix * aPosition;\n    vTextureCoord = (uTexMatrix * aTextureCoord).xy;\n}\n";
    private float mColorAdjust;
    private float[] mKernel = new float[9];
    private int mProgramHandle;
    private ProgramType mProgramType;
    private float[] mTexOffset;
    private int mTextureTarget;
    private int maPositionLoc;
    private int maTextureCoordLoc;
    private int muColorAdjustLoc;
    private int muKernelLoc;
    private int muMVPMatrixLoc;
    private int muTexMatrixLoc;
    private int muTexOffsetLoc;

    /* loaded from: classes.dex */
    public enum ProgramType {
        TEXTURE_2D,
        TEXTURE_EXT,
        TEXTURE_EXT_BW,
        TEXTURE_EXT_FILT
    }

    public Texture2dProgram(ProgramType programType) {
        this.mProgramType = programType;
        int i = AnonymousClass1.$SwitchMap$com$android$grafika$gles$Texture2dProgram$ProgramType[programType.ordinal()];
        if (i == 1) {
            this.mTextureTarget = 3553;
            this.mProgramHandle = GlUtil.createProgram(VERTEX_SHADER, FRAGMENT_SHADER_2D);
        } else if (i == 2) {
            this.mTextureTarget = 36197;
            this.mProgramHandle = GlUtil.createProgram(VERTEX_SHADER, FRAGMENT_SHADER_EXT);
        } else if (i == 3) {
            this.mTextureTarget = 36197;
            this.mProgramHandle = GlUtil.createProgram(VERTEX_SHADER, FRAGMENT_SHADER_EXT_BW);
        } else if (i == 4) {
            this.mTextureTarget = 36197;
            this.mProgramHandle = GlUtil.createProgram(VERTEX_SHADER, FRAGMENT_SHADER_EXT_FILT);
        } else {
            throw new RuntimeException("Unhandled type " + programType);
        }
        if (this.mProgramHandle == 0) {
            throw new RuntimeException("Unable to create program");
        }
        Log.d("Grafika", "Created program " + this.mProgramHandle + " (" + programType + ")");
        int glGetAttribLocation = GLES20.glGetAttribLocation(this.mProgramHandle, "aPosition");
        this.maPositionLoc = glGetAttribLocation;
        GlUtil.checkLocation(glGetAttribLocation, "aPosition");
        int glGetAttribLocation2 = GLES20.glGetAttribLocation(this.mProgramHandle, "aTextureCoord");
        this.maTextureCoordLoc = glGetAttribLocation2;
        GlUtil.checkLocation(glGetAttribLocation2, "aTextureCoord");
        int glGetUniformLocation = GLES20.glGetUniformLocation(this.mProgramHandle, "uMVPMatrix");
        this.muMVPMatrixLoc = glGetUniformLocation;
        GlUtil.checkLocation(glGetUniformLocation, "uMVPMatrix");
        int glGetUniformLocation2 = GLES20.glGetUniformLocation(this.mProgramHandle, "uTexMatrix");
        this.muTexMatrixLoc = glGetUniformLocation2;
        GlUtil.checkLocation(glGetUniformLocation2, "uTexMatrix");
        int glGetUniformLocation3 = GLES20.glGetUniformLocation(this.mProgramHandle, "uKernel");
        this.muKernelLoc = glGetUniformLocation3;
        if (glGetUniformLocation3 < 0) {
            this.muKernelLoc = -1;
            this.muTexOffsetLoc = -1;
            this.muColorAdjustLoc = -1;
            return;
        }
        int glGetUniformLocation4 = GLES20.glGetUniformLocation(this.mProgramHandle, "uTexOffset");
        this.muTexOffsetLoc = glGetUniformLocation4;
        GlUtil.checkLocation(glGetUniformLocation4, "uTexOffset");
        int glGetUniformLocation5 = GLES20.glGetUniformLocation(this.mProgramHandle, "uColorAdjust");
        this.muColorAdjustLoc = glGetUniformLocation5;
        GlUtil.checkLocation(glGetUniformLocation5, "uColorAdjust");
        setKernel(new float[]{0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f}, 0.0f);
        setTexSize(256, 256);
    }

    /* renamed from: com.android.grafika.gles.Texture2dProgram$1  reason: invalid class name */
    /* loaded from: classes.dex */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$android$grafika$gles$Texture2dProgram$ProgramType;

        static {
            int[] iArr = new int[ProgramType.values().length];
            $SwitchMap$com$android$grafika$gles$Texture2dProgram$ProgramType = iArr;
            try {
                iArr[ProgramType.TEXTURE_2D.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$android$grafika$gles$Texture2dProgram$ProgramType[ProgramType.TEXTURE_EXT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$android$grafika$gles$Texture2dProgram$ProgramType[ProgramType.TEXTURE_EXT_BW.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$android$grafika$gles$Texture2dProgram$ProgramType[ProgramType.TEXTURE_EXT_FILT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public void release() {
        Log.d("Grafika", "deleting program " + this.mProgramHandle);
        GLES20.glDeleteProgram(this.mProgramHandle);
        this.mProgramHandle = -1;
    }

    public ProgramType getProgramType() {
        return this.mProgramType;
    }

    public int createTextureObject() {
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        GlUtil.checkGlError("glGenTextures");
        int i = iArr[0];
        GLES20.glBindTexture(this.mTextureTarget, i);
        GlUtil.checkGlError("glBindTexture " + i);
        GLES20.glTexParameterf(36197, 10241, 9728.0f);
        GLES20.glTexParameterf(36197, 10240, 9729.0f);
        GLES20.glTexParameteri(36197, 10242, Texture.CLAMP_TO_EDGE);
        GLES20.glTexParameteri(36197, 10243, Texture.CLAMP_TO_EDGE);
        GlUtil.checkGlError("glTexParameter");
        return i;
    }

    public void setKernel(float[] fArr, float f) {
        if (fArr.length != 9) {
            throw new IllegalArgumentException("Kernel size is " + fArr.length + " vs. 9");
        }
        System.arraycopy(fArr, 0, this.mKernel, 0, 9);
        this.mColorAdjust = f;
    }

    public void setTexSize(int i, int i2) {
        float f = 1.0f / i;
        float f2 = 1.0f / i2;
        float f3 = -f;
        float f4 = -f2;
        this.mTexOffset = new float[]{f3, f4, 0.0f, f4, f, f4, f3, 0.0f, 0.0f, 0.0f, f, 0.0f, f3, f2, 0.0f, f2, f, f2};
    }

    public void draw(float[] fArr, FloatBuffer floatBuffer, int i, int i2, int i3, int i4, float[] fArr2, FloatBuffer floatBuffer2, int i5, int i6) {
        GlUtil.checkGlError("draw start");
        GLES20.glUseProgram(this.mProgramHandle);
        GlUtil.checkGlError("glUseProgram");
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(this.mTextureTarget, i5);
        GLES20.glUniformMatrix4fv(this.muMVPMatrixLoc, 1, false, fArr, 0);
        GlUtil.checkGlError("glUniformMatrix4fv");
        GLES20.glUniformMatrix4fv(this.muTexMatrixLoc, 1, false, fArr2, 0);
        GlUtil.checkGlError("glUniformMatrix4fv");
        GLES20.glEnableVertexAttribArray(this.maPositionLoc);
        GlUtil.checkGlError("glEnableVertexAttribArray");
        GLES20.glVertexAttribPointer(this.maPositionLoc, i3, 5126, false, i4, (Buffer) floatBuffer);
        GlUtil.checkGlError("glVertexAttribPointer");
        GLES20.glEnableVertexAttribArray(this.maTextureCoordLoc);
        GlUtil.checkGlError("glEnableVertexAttribArray");
        GLES20.glVertexAttribPointer(this.maTextureCoordLoc, 2, 5126, false, i6, (Buffer) floatBuffer2);
        GlUtil.checkGlError("glVertexAttribPointer");
        int i7 = this.muKernelLoc;
        if (i7 >= 0) {
            GLES20.glUniform1fv(i7, 9, this.mKernel, 0);
            GLES20.glUniform2fv(this.muTexOffsetLoc, 9, this.mTexOffset, 0);
            GLES20.glUniform1f(this.muColorAdjustLoc, this.mColorAdjust);
        }
        GLES20.glDrawArrays(5, i, i2);
        GlUtil.checkGlError("glDrawArrays");
        GLES20.glDisableVertexAttribArray(this.maPositionLoc);
        GLES20.glDisableVertexAttribArray(this.maTextureCoordLoc);
        GLES20.glBindTexture(this.mTextureTarget, 0);
        GLES20.glUseProgram(0);
    }
}
