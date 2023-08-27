.class public Lcom/android/grafika/gles/Texture2dProgram;
.super Ljava/lang/Object;
.source "Texture2dProgram.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/android/grafika/gles/Texture2dProgram$ProgramType;
    }
.end annotation


# static fields
.field private static final FRAGMENT_SHADER_2D:Ljava/lang/String; = "precision mediump float;\nvarying vec2 vTextureCoord;\nuniform sampler2D sTexture;\nvoid main() {\n    gl_FragColor = texture2D(sTexture, vTextureCoord);\n}\n"

.field private static final FRAGMENT_SHADER_EXT:Ljava/lang/String; = "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 vTextureCoord;\nuniform samplerExternalOES sTexture;\nvoid main() {\n    gl_FragColor = texture2D(sTexture, vTextureCoord);\n}\n"

.field private static final FRAGMENT_SHADER_EXT_BW:Ljava/lang/String; = "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 vTextureCoord;\nuniform samplerExternalOES sTexture;\nvoid main() {\n    vec4 tc = texture2D(sTexture, vTextureCoord);\n    float color = tc.r * 0.3 + tc.g * 0.59 + tc.b * 0.11;\n    gl_FragColor = vec4(color, color, color, 1.0);\n}\n"

.field private static final FRAGMENT_SHADER_EXT_FILT:Ljava/lang/String; = "#extension GL_OES_EGL_image_external : require\n#define KERNEL_SIZE 9\nprecision highp float;\nvarying vec2 vTextureCoord;\nuniform samplerExternalOES sTexture;\nuniform float uKernel[KERNEL_SIZE];\nuniform vec2 uTexOffset[KERNEL_SIZE];\nuniform float uColorAdjust;\nvoid main() {\n    int i = 0;\n    vec4 sum = vec4(0.0);\n    if (vTextureCoord.x < vTextureCoord.y - 0.005) {\n        for (i = 0; i < KERNEL_SIZE; i++) {\n            vec4 texc = texture2D(sTexture, vTextureCoord + uTexOffset[i]);\n            sum += texc * uKernel[i];\n        }\n    sum += uColorAdjust;\n    } else if (vTextureCoord.x > vTextureCoord.y + 0.005) {\n        sum = texture2D(sTexture, vTextureCoord);\n    } else {\n        sum.r = 1.0;\n    }\n    gl_FragColor = sum;\n}\n"

.field public static final KERNEL_SIZE:I = 0x9

.field private static final TAG:Ljava/lang/String; = "Grafika"

.field private static final VERTEX_SHADER:Ljava/lang/String; = "uniform mat4 uMVPMatrix;\nuniform mat4 uTexMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n    gl_Position = uMVPMatrix * aPosition;\n    vTextureCoord = (uTexMatrix * aTextureCoord).xy;\n}\n"


# instance fields
.field private mColorAdjust:F

.field private mKernel:[F

.field private mProgramHandle:I

.field private mProgramType:Lcom/android/grafika/gles/Texture2dProgram$ProgramType;

.field private mTexOffset:[F

.field private mTextureTarget:I

.field private maPositionLoc:I

.field private maTextureCoordLoc:I

.field private muColorAdjustLoc:I

.field private muKernelLoc:I

.field private muMVPMatrixLoc:I

.field private muTexMatrixLoc:I

.field private muTexOffsetLoc:I


# direct methods
.method public constructor <init>(Lcom/android/grafika/gles/Texture2dProgram$ProgramType;)V
    .locals 5

    .line 138
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x9

    new-array v1, v0, [F

    .line 130
    iput-object v1, p0, Lcom/android/grafika/gles/Texture2dProgram;->mKernel:[F

    .line 139
    iput-object p1, p0, Lcom/android/grafika/gles/Texture2dProgram;->mProgramType:Lcom/android/grafika/gles/Texture2dProgram$ProgramType;

    .line 141
    sget-object v1, Lcom/android/grafika/gles/Texture2dProgram$1;->$SwitchMap$com$android$grafika$gles$Texture2dProgram$ProgramType:[I

    invoke-virtual {p1}, Lcom/android/grafika/gles/Texture2dProgram$ProgramType;->ordinal()I

    move-result v2

    aget v1, v1, v2

    const/4 v2, 0x1

    const-string v3, "uniform mat4 uMVPMatrix;\nuniform mat4 uTexMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n    gl_Position = uMVPMatrix * aPosition;\n    vTextureCoord = (uTexMatrix * aTextureCoord).xy;\n}\n"

    if-eq v1, v2, :cond_3

    const/4 v2, 0x2

    const v4, 0x8d65

    if-eq v1, v2, :cond_2

    const/4 v2, 0x3

    if-eq v1, v2, :cond_1

    const/4 v2, 0x4

    if-ne v1, v2, :cond_0

    .line 155
    iput v4, p0, Lcom/android/grafika/gles/Texture2dProgram;->mTextureTarget:I

    const-string v1, "#extension GL_OES_EGL_image_external : require\n#define KERNEL_SIZE 9\nprecision highp float;\nvarying vec2 vTextureCoord;\nuniform samplerExternalOES sTexture;\nuniform float uKernel[KERNEL_SIZE];\nuniform vec2 uTexOffset[KERNEL_SIZE];\nuniform float uColorAdjust;\nvoid main() {\n    int i = 0;\n    vec4 sum = vec4(0.0);\n    if (vTextureCoord.x < vTextureCoord.y - 0.005) {\n        for (i = 0; i < KERNEL_SIZE; i++) {\n            vec4 texc = texture2D(sTexture, vTextureCoord + uTexOffset[i]);\n            sum += texc * uKernel[i];\n        }\n    sum += uColorAdjust;\n    } else if (vTextureCoord.x > vTextureCoord.y + 0.005) {\n        sum = texture2D(sTexture, vTextureCoord);\n    } else {\n        sum.r = 1.0;\n    }\n    gl_FragColor = sum;\n}\n"

    .line 156
    invoke-static {v3, v1}, Lcom/android/grafika/gles/GlUtil;->createProgram(Ljava/lang/String;Ljava/lang/String;)I

    move-result v1

    iput v1, p0, Lcom/android/grafika/gles/Texture2dProgram;->mProgramHandle:I

    goto :goto_0

    .line 159
    :cond_0
    new-instance v0, Ljava/lang/RuntimeException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unhandled type "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 151
    :cond_1
    iput v4, p0, Lcom/android/grafika/gles/Texture2dProgram;->mTextureTarget:I

    const-string v1, "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 vTextureCoord;\nuniform samplerExternalOES sTexture;\nvoid main() {\n    vec4 tc = texture2D(sTexture, vTextureCoord);\n    float color = tc.r * 0.3 + tc.g * 0.59 + tc.b * 0.11;\n    gl_FragColor = vec4(color, color, color, 1.0);\n}\n"

    .line 152
    invoke-static {v3, v1}, Lcom/android/grafika/gles/GlUtil;->createProgram(Ljava/lang/String;Ljava/lang/String;)I

    move-result v1

    iput v1, p0, Lcom/android/grafika/gles/Texture2dProgram;->mProgramHandle:I

    goto :goto_0

    .line 147
    :cond_2
    iput v4, p0, Lcom/android/grafika/gles/Texture2dProgram;->mTextureTarget:I

    const-string v1, "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 vTextureCoord;\nuniform samplerExternalOES sTexture;\nvoid main() {\n    gl_FragColor = texture2D(sTexture, vTextureCoord);\n}\n"

    .line 148
    invoke-static {v3, v1}, Lcom/android/grafika/gles/GlUtil;->createProgram(Ljava/lang/String;Ljava/lang/String;)I

    move-result v1

    iput v1, p0, Lcom/android/grafika/gles/Texture2dProgram;->mProgramHandle:I

    goto :goto_0

    :cond_3
    const/16 v1, 0xde1

    .line 143
    iput v1, p0, Lcom/android/grafika/gles/Texture2dProgram;->mTextureTarget:I

    const-string v1, "precision mediump float;\nvarying vec2 vTextureCoord;\nuniform sampler2D sTexture;\nvoid main() {\n    gl_FragColor = texture2D(sTexture, vTextureCoord);\n}\n"

    .line 144
    invoke-static {v3, v1}, Lcom/android/grafika/gles/GlUtil;->createProgram(Ljava/lang/String;Ljava/lang/String;)I

    move-result v1

    iput v1, p0, Lcom/android/grafika/gles/Texture2dProgram;->mProgramHandle:I

    .line 161
    :goto_0
    iget v1, p0, Lcom/android/grafika/gles/Texture2dProgram;->mProgramHandle:I

    if-eqz v1, :cond_5

    .line 164
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Created program "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Lcom/android/grafika/gles/Texture2dProgram;->mProgramHandle:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, " ("

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, ")"

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v1, "Grafika"

    invoke-static {v1, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 168
    iget p1, p0, Lcom/android/grafika/gles/Texture2dProgram;->mProgramHandle:I

    const-string v1, "aPosition"

    invoke-static {p1, v1}, Landroid/opengl/GLES20;->glGetAttribLocation(ILjava/lang/String;)I

    move-result p1

    iput p1, p0, Lcom/android/grafika/gles/Texture2dProgram;->maPositionLoc:I

    .line 169
    invoke-static {p1, v1}, Lcom/android/grafika/gles/GlUtil;->checkLocation(ILjava/lang/String;)V

    .line 170
    iget p1, p0, Lcom/android/grafika/gles/Texture2dProgram;->mProgramHandle:I

    const-string v1, "aTextureCoord"

    invoke-static {p1, v1}, Landroid/opengl/GLES20;->glGetAttribLocation(ILjava/lang/String;)I

    move-result p1

    iput p1, p0, Lcom/android/grafika/gles/Texture2dProgram;->maTextureCoordLoc:I

    .line 171
    invoke-static {p1, v1}, Lcom/android/grafika/gles/GlUtil;->checkLocation(ILjava/lang/String;)V

    .line 172
    iget p1, p0, Lcom/android/grafika/gles/Texture2dProgram;->mProgramHandle:I

    const-string v1, "uMVPMatrix"

    invoke-static {p1, v1}, Landroid/opengl/GLES20;->glGetUniformLocation(ILjava/lang/String;)I

    move-result p1

    iput p1, p0, Lcom/android/grafika/gles/Texture2dProgram;->muMVPMatrixLoc:I

    .line 173
    invoke-static {p1, v1}, Lcom/android/grafika/gles/GlUtil;->checkLocation(ILjava/lang/String;)V

    .line 174
    iget p1, p0, Lcom/android/grafika/gles/Texture2dProgram;->mProgramHandle:I

    const-string v1, "uTexMatrix"

    invoke-static {p1, v1}, Landroid/opengl/GLES20;->glGetUniformLocation(ILjava/lang/String;)I

    move-result p1

    iput p1, p0, Lcom/android/grafika/gles/Texture2dProgram;->muTexMatrixLoc:I

    .line 175
    invoke-static {p1, v1}, Lcom/android/grafika/gles/GlUtil;->checkLocation(ILjava/lang/String;)V

    .line 176
    iget p1, p0, Lcom/android/grafika/gles/Texture2dProgram;->mProgramHandle:I

    const-string v1, "uKernel"

    invoke-static {p1, v1}, Landroid/opengl/GLES20;->glGetUniformLocation(ILjava/lang/String;)I

    move-result p1

    iput p1, p0, Lcom/android/grafika/gles/Texture2dProgram;->muKernelLoc:I

    if-gez p1, :cond_4

    const/4 p1, -0x1

    .line 179
    iput p1, p0, Lcom/android/grafika/gles/Texture2dProgram;->muKernelLoc:I

    .line 180
    iput p1, p0, Lcom/android/grafika/gles/Texture2dProgram;->muTexOffsetLoc:I

    .line 181
    iput p1, p0, Lcom/android/grafika/gles/Texture2dProgram;->muColorAdjustLoc:I

    goto :goto_1

    .line 184
    :cond_4
    iget p1, p0, Lcom/android/grafika/gles/Texture2dProgram;->mProgramHandle:I

    const-string v1, "uTexOffset"

    invoke-static {p1, v1}, Landroid/opengl/GLES20;->glGetUniformLocation(ILjava/lang/String;)I

    move-result p1

    iput p1, p0, Lcom/android/grafika/gles/Texture2dProgram;->muTexOffsetLoc:I

    .line 185
    invoke-static {p1, v1}, Lcom/android/grafika/gles/GlUtil;->checkLocation(ILjava/lang/String;)V

    .line 186
    iget p1, p0, Lcom/android/grafika/gles/Texture2dProgram;->mProgramHandle:I

    const-string v1, "uColorAdjust"

    invoke-static {p1, v1}, Landroid/opengl/GLES20;->glGetUniformLocation(ILjava/lang/String;)I

    move-result p1

    iput p1, p0, Lcom/android/grafika/gles/Texture2dProgram;->muColorAdjustLoc:I

    .line 187
    invoke-static {p1, v1}, Lcom/android/grafika/gles/GlUtil;->checkLocation(ILjava/lang/String;)V

    new-array p1, v0, [F

    .line 190
    fill-array-data p1, :array_0

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lcom/android/grafika/gles/Texture2dProgram;->setKernel([FF)V

    const/16 p1, 0x100

    .line 191
    invoke-virtual {p0, p1, p1}, Lcom/android/grafika/gles/Texture2dProgram;->setTexSize(II)V

    :goto_1
    return-void

    .line 162
    :cond_5
    new-instance p1, Ljava/lang/RuntimeException;

    const-string v0, "Unable to create program"

    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1

    :array_0
    .array-data 4
        0x0
        0x0
        0x0
        0x0
        0x3f800000    # 1.0f
        0x0
        0x0
        0x0
        0x0
    .end array-data
.end method


# virtual methods
.method public createTextureObject()I
    .locals 4

    const/4 v0, 0x1

    new-array v1, v0, [I

    const/4 v2, 0x0

    .line 221
    invoke-static {v0, v1, v2}, Landroid/opengl/GLES20;->glGenTextures(I[II)V

    const-string v0, "glGenTextures"

    .line 222
    invoke-static {v0}, Lcom/android/grafika/gles/GlUtil;->checkGlError(Ljava/lang/String;)V

    .line 224
    aget v0, v1, v2

    .line 225
    iget v1, p0, Lcom/android/grafika/gles/Texture2dProgram;->mTextureTarget:I

    invoke-static {v1, v0}, Landroid/opengl/GLES20;->glBindTexture(II)V

    .line 226
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "glBindTexture "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/android/grafika/gles/GlUtil;->checkGlError(Ljava/lang/String;)V

    const v1, 0x8d65

    const/16 v2, 0x2801

    const/high16 v3, 0x46180000    # 9728.0f

    .line 228
    invoke-static {v1, v2, v3}, Landroid/opengl/GLES20;->glTexParameterf(IIF)V

    const/16 v2, 0x2800

    const v3, 0x46180400    # 9729.0f

    .line 230
    invoke-static {v1, v2, v3}, Landroid/opengl/GLES20;->glTexParameterf(IIF)V

    const v2, 0x812f

    const/16 v3, 0x2802

    .line 232
    invoke-static {v1, v3, v2}, Landroid/opengl/GLES20;->glTexParameteri(III)V

    const/16 v3, 0x2803

    .line 234
    invoke-static {v1, v3, v2}, Landroid/opengl/GLES20;->glTexParameteri(III)V

    const-string v1, "glTexParameter"

    .line 236
    invoke-static {v1}, Lcom/android/grafika/gles/GlUtil;->checkGlError(Ljava/lang/String;)V

    return v0
.end method

.method public draw([FLjava/nio/FloatBuffer;IIII[FLjava/nio/FloatBuffer;II)V
    .locals 11

    move-object v0, p0

    const-string v1, "draw start"

    .line 290
    invoke-static {v1}, Lcom/android/grafika/gles/GlUtil;->checkGlError(Ljava/lang/String;)V

    .line 293
    iget v1, v0, Lcom/android/grafika/gles/Texture2dProgram;->mProgramHandle:I

    invoke-static {v1}, Landroid/opengl/GLES20;->glUseProgram(I)V

    const-string v1, "glUseProgram"

    .line 294
    invoke-static {v1}, Lcom/android/grafika/gles/GlUtil;->checkGlError(Ljava/lang/String;)V

    const v1, 0x84c0

    .line 297
    invoke-static {v1}, Landroid/opengl/GLES20;->glActiveTexture(I)V

    .line 298
    iget v1, v0, Lcom/android/grafika/gles/Texture2dProgram;->mTextureTarget:I

    move/from16 v2, p9

    invoke-static {v1, v2}, Landroid/opengl/GLES20;->glBindTexture(II)V

    .line 301
    iget v1, v0, Lcom/android/grafika/gles/Texture2dProgram;->muMVPMatrixLoc:I

    const/4 v2, 0x1

    const/4 v3, 0x0

    move-object v4, p1

    invoke-static {v1, v2, v3, p1, v3}, Landroid/opengl/GLES20;->glUniformMatrix4fv(IIZ[FI)V

    const-string v1, "glUniformMatrix4fv"

    .line 302
    invoke-static {v1}, Lcom/android/grafika/gles/GlUtil;->checkGlError(Ljava/lang/String;)V

    .line 305
    iget v4, v0, Lcom/android/grafika/gles/Texture2dProgram;->muTexMatrixLoc:I

    move-object/from16 v5, p7

    invoke-static {v4, v2, v3, v5, v3}, Landroid/opengl/GLES20;->glUniformMatrix4fv(IIZ[FI)V

    .line 306
    invoke-static {v1}, Lcom/android/grafika/gles/GlUtil;->checkGlError(Ljava/lang/String;)V

    .line 309
    iget v1, v0, Lcom/android/grafika/gles/Texture2dProgram;->maPositionLoc:I

    invoke-static {v1}, Landroid/opengl/GLES20;->glEnableVertexAttribArray(I)V

    const-string v1, "glEnableVertexAttribArray"

    .line 310
    invoke-static {v1}, Lcom/android/grafika/gles/GlUtil;->checkGlError(Ljava/lang/String;)V

    .line 313
    iget v4, v0, Lcom/android/grafika/gles/Texture2dProgram;->maPositionLoc:I

    const/16 v6, 0x1406

    const/4 v7, 0x0

    move/from16 v5, p5

    move/from16 v8, p6

    move-object v9, p2

    invoke-static/range {v4 .. v9}, Landroid/opengl/GLES20;->glVertexAttribPointer(IIIZILjava/nio/Buffer;)V

    const-string v2, "glVertexAttribPointer"

    .line 315
    invoke-static {v2}, Lcom/android/grafika/gles/GlUtil;->checkGlError(Ljava/lang/String;)V

    .line 318
    iget v4, v0, Lcom/android/grafika/gles/Texture2dProgram;->maTextureCoordLoc:I

    invoke-static {v4}, Landroid/opengl/GLES20;->glEnableVertexAttribArray(I)V

    .line 319
    invoke-static {v1}, Lcom/android/grafika/gles/GlUtil;->checkGlError(Ljava/lang/String;)V

    .line 322
    iget v5, v0, Lcom/android/grafika/gles/Texture2dProgram;->maTextureCoordLoc:I

    const/4 v6, 0x2

    const/16 v7, 0x1406

    const/4 v8, 0x0

    move/from16 v9, p10

    move-object/from16 v10, p8

    invoke-static/range {v5 .. v10}, Landroid/opengl/GLES20;->glVertexAttribPointer(IIIZILjava/nio/Buffer;)V

    .line 324
    invoke-static {v2}, Lcom/android/grafika/gles/GlUtil;->checkGlError(Ljava/lang/String;)V

    .line 327
    iget v1, v0, Lcom/android/grafika/gles/Texture2dProgram;->muKernelLoc:I

    if-ltz v1, :cond_0

    .line 328
    iget-object v2, v0, Lcom/android/grafika/gles/Texture2dProgram;->mKernel:[F

    const/16 v4, 0x9

    invoke-static {v1, v4, v2, v3}, Landroid/opengl/GLES20;->glUniform1fv(II[FI)V

    .line 329
    iget v1, v0, Lcom/android/grafika/gles/Texture2dProgram;->muTexOffsetLoc:I

    iget-object v2, v0, Lcom/android/grafika/gles/Texture2dProgram;->mTexOffset:[F

    invoke-static {v1, v4, v2, v3}, Landroid/opengl/GLES20;->glUniform2fv(II[FI)V

    .line 330
    iget v1, v0, Lcom/android/grafika/gles/Texture2dProgram;->muColorAdjustLoc:I

    iget v2, v0, Lcom/android/grafika/gles/Texture2dProgram;->mColorAdjust:F

    invoke-static {v1, v2}, Landroid/opengl/GLES20;->glUniform1f(IF)V

    :cond_0
    const/4 v1, 0x5

    move v2, p3

    move v4, p4

    .line 334
    invoke-static {v1, p3, p4}, Landroid/opengl/GLES20;->glDrawArrays(III)V

    const-string v1, "glDrawArrays"

    .line 335
    invoke-static {v1}, Lcom/android/grafika/gles/GlUtil;->checkGlError(Ljava/lang/String;)V

    .line 338
    iget v1, v0, Lcom/android/grafika/gles/Texture2dProgram;->maPositionLoc:I

    invoke-static {v1}, Landroid/opengl/GLES20;->glDisableVertexAttribArray(I)V

    .line 339
    iget v1, v0, Lcom/android/grafika/gles/Texture2dProgram;->maTextureCoordLoc:I

    invoke-static {v1}, Landroid/opengl/GLES20;->glDisableVertexAttribArray(I)V

    .line 340
    iget v1, v0, Lcom/android/grafika/gles/Texture2dProgram;->mTextureTarget:I

    invoke-static {v1, v3}, Landroid/opengl/GLES20;->glBindTexture(II)V

    .line 341
    invoke-static {v3}, Landroid/opengl/GLES20;->glUseProgram(I)V

    return-void
.end method

.method public getProgramType()Lcom/android/grafika/gles/Texture2dProgram$ProgramType;
    .locals 1

    .line 211
    iget-object v0, p0, Lcom/android/grafika/gles/Texture2dProgram;->mProgramType:Lcom/android/grafika/gles/Texture2dProgram$ProgramType;

    return-object v0
.end method

.method public release()V
    .locals 2

    .line 202
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "deleting program "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/android/grafika/gles/Texture2dProgram;->mProgramHandle:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "Grafika"

    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 203
    iget v0, p0, Lcom/android/grafika/gles/Texture2dProgram;->mProgramHandle:I

    invoke-static {v0}, Landroid/opengl/GLES20;->glDeleteProgram(I)V

    const/4 v0, -0x1

    .line 204
    iput v0, p0, Lcom/android/grafika/gles/Texture2dProgram;->mProgramHandle:I

    return-void
.end method

.method public setKernel([FF)V
    .locals 3

    .line 247
    array-length v0, p1

    const/16 v1, 0x9

    if-ne v0, v1, :cond_0

    .line 251
    iget-object v0, p0, Lcom/android/grafika/gles/Texture2dProgram;->mKernel:[F

    const/4 v2, 0x0

    invoke-static {p1, v2, v0, v2, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 252
    iput p2, p0, Lcom/android/grafika/gles/Texture2dProgram;->mColorAdjust:F

    return-void

    .line 248
    :cond_0
    new-instance p2, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Kernel size is "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    array-length p1, p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, " vs. "

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public setTexSize(II)V
    .locals 5

    int-to-float p1, p1

    const/high16 v0, 0x3f800000    # 1.0f

    div-float p1, v0, p1

    int-to-float p2, p2

    div-float/2addr v0, p2

    const/16 p2, 0x12

    new-array p2, p2, [F

    neg-float v1, p1

    const/4 v2, 0x0

    aput v1, p2, v2

    neg-float v2, v0

    const/4 v3, 0x1

    aput v2, p2, v3

    const/4 v3, 0x0

    const/4 v4, 0x2

    aput v3, p2, v4

    const/4 v4, 0x3

    aput v2, p2, v4

    const/4 v4, 0x4

    aput p1, p2, v4

    const/4 v4, 0x5

    aput v2, p2, v4

    const/4 v2, 0x6

    aput v1, p2, v2

    const/4 v2, 0x7

    aput v3, p2, v2

    const/16 v2, 0x8

    aput v3, p2, v2

    const/16 v2, 0x9

    aput v3, p2, v2

    const/16 v2, 0xa

    aput p1, p2, v2

    const/16 v2, 0xb

    aput v3, p2, v2

    const/16 v2, 0xc

    aput v1, p2, v2

    const/16 v1, 0xd

    aput v0, p2, v1

    const/16 v1, 0xe

    aput v3, p2, v1

    const/16 v1, 0xf

    aput v0, p2, v1

    const/16 v1, 0x10

    aput p1, p2, v1

    const/16 p1, 0x11

    aput v0, p2, p1

    .line 264
    iput-object p2, p0, Lcom/android/grafika/gles/Texture2dProgram;->mTexOffset:[F

    return-void
.end method
