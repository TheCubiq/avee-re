package com.daaw.avee.comp.Visualizer.Graphic;

import android.opengl.GLES20;
import com.daaw.avee.Common.DbgVar;
import com.daaw.avee.Common.Func.Func;
import com.daaw.avee.Common.tlog;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.nio.ShortBuffer;
import mdesl.graphics.glutils.ShaderProgram;
/* loaded from: classes.dex */
public class FullscreenQuad {
    private static final int COORDS_PER_VERTEX = 3;
    private static final String fragmentShaderCode = "precision mediump float;varying vec2 textureCoord;uniform sampler2D s_texture;void main() {vec4 color1 = texture2D(s_texture,textureCoord);gl_FragColor = color1;}";
    private static float[] squareCoords = {-1.0f, 1.0f, 0.0f, -1.0f, -1.0f, 0.0f, 1.0f, -1.0f, 0.0f, 1.0f, 1.0f, 0.0f};
    private static float[] squareFlippedCoords = {0.5f, 0.5f, 0.0f, 1.0f, -1.0f, 0.0f, -1.0f, -1.0f, 0.0f, -1.0f, 1.0f, 0.0f};
    private static final String vertexShaderCode = "const vec2 madd=vec2(0.5,0.5);attribute vec3 vertexIn;varying vec2 textureCoord;void main() {textureCoord = vertexIn.xy*madd+madd;gl_Position = vec4(vertexIn,1.0);}";
    private final ShortBuffer drawListBuffer;
    private int fragmentShader;
    private int positionHandle;
    private int program;
    private final FloatBuffer vertexBuffer;
    private final FloatBuffer vertexBufferFlipped;
    private int vertexShader;
    private DbgVar dbgVar = new DbgVar();
    private final short[] drawOrder = {0, 1, 2, 0, 2, 3};
    private final int vertexStride = 12;

    public FullscreenQuad() {
        this.program = 0;
        this.vertexShader = 0;
        this.fragmentShader = 0;
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(squareCoords.length * 4);
        allocateDirect.order(ByteOrder.nativeOrder());
        FloatBuffer asFloatBuffer = allocateDirect.asFloatBuffer();
        this.vertexBuffer = asFloatBuffer;
        asFloatBuffer.put(squareCoords);
        this.vertexBuffer.position(0);
        ByteBuffer allocateDirect2 = ByteBuffer.allocateDirect(squareFlippedCoords.length * 4);
        allocateDirect2.order(ByteOrder.nativeOrder());
        FloatBuffer asFloatBuffer2 = allocateDirect2.asFloatBuffer();
        this.vertexBufferFlipped = asFloatBuffer2;
        asFloatBuffer2.put(squareFlippedCoords);
        this.vertexBufferFlipped.position(0);
        ByteBuffer allocateDirect3 = ByteBuffer.allocateDirect(this.drawOrder.length * 2);
        allocateDirect3.order(ByteOrder.nativeOrder());
        ShortBuffer asShortBuffer = allocateDirect3.asShortBuffer();
        this.drawListBuffer = asShortBuffer;
        asShortBuffer.put(this.drawOrder);
        this.drawListBuffer.position(0);
        this.vertexShader = GraphicsUtils.loadShader(ShaderProgram.VERTEX_SHADER, vertexShaderCode);
        this.fragmentShader = GraphicsUtils.loadShader(ShaderProgram.FRAGMENT_SHADER, fragmentShaderCode);
        int glCreateProgram = GLES20.glCreateProgram();
        this.program = glCreateProgram;
        GLES20.glAttachShader(glCreateProgram, this.vertexShader);
        GLES20.glAttachShader(this.program, this.fragmentShader);
        GLES20.glLinkProgram(this.program);
        int[] iArr = new int[1];
        GLES20.glGetProgramiv(this.program, 35714, iArr, 0);
        if (iArr[0] != 1) {
            tlog.w("Could not link program: ");
            tlog.w(GLES20.glGetProgramInfoLog(this.program));
            GLES20.glDeleteProgram(this.program);
        }
    }

    protected void finalize() throws Throwable {
        super.finalize();
        this.dbgVar.assertDisposed(new Func() { // from class: com.daaw.avee.comp.Visualizer.Graphic.-$$Lambda$FullscreenQuad$kTAxrsuCfIKcD0sdxf_VwEJXlfs
            @Override // com.daaw.avee.Common.Func.Func
            public final Object onInvoke() {
                return FullscreenQuad.this.lambda$finalize$0$FullscreenQuad();
            }
        });
    }

    public /* synthetic */ Boolean lambda$finalize$0$FullscreenQuad() {
        return Boolean.valueOf(this.program == 0);
    }

    public void dispose() {
        if (this.program != 0) {
            disposeShaders();
            GLES20.glDeleteProgram(this.program);
            this.program = 0;
        }
    }

    private void disposeShaders() {
        int i = this.vertexShader;
        if (i != 0) {
            GLES20.glDetachShader(this.program, i);
            GLES20.glDeleteShader(this.vertexShader);
            this.vertexShader = 0;
        }
        int i2 = this.fragmentShader;
        if (i2 != 0) {
            GLES20.glDetachShader(this.program, i2);
            GLES20.glDeleteShader(this.fragmentShader);
            this.fragmentShader = 0;
        }
    }

    public void drawFlipped() {
        GLES20.glUseProgram(this.program);
        int glGetAttribLocation = GLES20.glGetAttribLocation(this.program, "vertexIn");
        this.positionHandle = glGetAttribLocation;
        GLES20.glEnableVertexAttribArray(glGetAttribLocation);
        GLES20.glVertexAttribPointer(this.positionHandle, 3, 5126, false, 12, (Buffer) this.vertexBufferFlipped);
        GLES20.glDrawElements(4, this.drawOrder.length, 5123, this.drawListBuffer);
        GLES20.glDisableVertexAttribArray(this.positionHandle);
    }

    public void draw() {
        GLES20.glUseProgram(this.program);
        int glGetAttribLocation = GLES20.glGetAttribLocation(this.program, "vertexIn");
        this.positionHandle = glGetAttribLocation;
        GLES20.glEnableVertexAttribArray(glGetAttribLocation);
        GLES20.glVertexAttribPointer(this.positionHandle, 3, 5126, false, 12, (Buffer) this.vertexBuffer);
        GLES20.glDrawElements(4, this.drawOrder.length, 5123, this.drawListBuffer);
        GLES20.glDisableVertexAttribArray(this.positionHandle);
    }

    public void drawShader(ShaderProgram shaderProgram, String str) {
        int attributeLocation = shaderProgram.getAttributeLocation(str);
        GLES20.glEnableVertexAttribArray(attributeLocation);
        GLES20.glVertexAttribPointer(attributeLocation, 3, 5126, false, 12, (Buffer) this.vertexBuffer);
        GLES20.glDrawElements(4, this.drawOrder.length, 5123, this.drawListBuffer);
        GLES20.glDisableVertexAttribArray(attributeLocation);
    }
}
