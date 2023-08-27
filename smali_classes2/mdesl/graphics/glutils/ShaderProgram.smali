.class public Lmdesl/graphics/glutils/ShaderProgram;
.super Ljava/lang/Object;
.source "ShaderProgram.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lmdesl/graphics/glutils/ShaderProgram$Attrib;
    }
.end annotation


# static fields
.field public static final FRAGMENT_SHADER:I = 0x8b30

.field public static final VERTEX_SHADER:I = 0x8b31

.field private static fbuf16:Ljava/nio/FloatBuffer; = null

.field private static ibuf4:Ljava/nio/IntBuffer; = null

.field private static strict:Z = false


# instance fields
.field protected attributes:[Lmdesl/graphics/glutils/ShaderProgram$Attrib;

.field protected frag:I

.field protected fragShaderSource:Ljava/lang/String;

.field protected log:Ljava/lang/String;

.field protected program:I

.field protected uniforms:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field protected vert:I

.field protected vertShaderSource:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method protected constructor <init>()V
    .locals 1

    .line 250
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, ""

    .line 164
    iput-object v0, p0, Lmdesl/graphics/glutils/ShaderProgram;->log:Ljava/lang/String;

    .line 166
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lmdesl/graphics/glutils/ShaderProgram;->uniforms:Ljava/util/HashMap;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/lwjgl/LWJGLException;
        }
    .end annotation

    const/4 v0, 0x0

    .line 242
    invoke-direct {p0, p1, p2, v0}, Lmdesl/graphics/glutils/ShaderProgram;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lmdesl/graphics/glutils/VertexAttrib;",
            ">;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/lwjgl/LWJGLException;
        }
    .end annotation

    .line 202
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, ""

    .line 164
    iput-object v0, p0, Lmdesl/graphics/glutils/ShaderProgram;->log:Ljava/lang/String;

    .line 166
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lmdesl/graphics/glutils/ShaderProgram;->uniforms:Ljava/util/HashMap;

    if-eqz p1, :cond_1

    if-eqz p2, :cond_1

    .line 205
    invoke-static {}, Lmdesl/graphics/glutils/ShaderProgram;->isSupported()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 207
    iput-object p1, p0, Lmdesl/graphics/glutils/ShaderProgram;->vertShaderSource:Ljava/lang/String;

    .line 208
    iput-object p2, p0, Lmdesl/graphics/glutils/ShaderProgram;->fragShaderSource:Ljava/lang/String;

    const v0, 0x8b31

    .line 209
    invoke-virtual {p0, v0, p1}, Lmdesl/graphics/glutils/ShaderProgram;->compileShader(ILjava/lang/String;)I

    move-result p1

    iput p1, p0, Lmdesl/graphics/glutils/ShaderProgram;->vert:I

    const p1, 0x8b30

    .line 210
    invoke-virtual {p0, p1, p2}, Lmdesl/graphics/glutils/ShaderProgram;->compileShader(ILjava/lang/String;)I

    move-result p1

    iput p1, p0, Lmdesl/graphics/glutils/ShaderProgram;->frag:I

    .line 211
    invoke-virtual {p0}, Lmdesl/graphics/glutils/ShaderProgram;->createProgram()I

    move-result p1

    iput p1, p0, Lmdesl/graphics/glutils/ShaderProgram;->program:I

    .line 213
    :try_start_0
    invoke-virtual {p0, p3}, Lmdesl/graphics/glutils/ShaderProgram;->linkProgram(Ljava/util/List;)V
    :try_end_0
    .catch Lorg/lwjgl/LWJGLException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    .line 215
    invoke-virtual {p0}, Lmdesl/graphics/glutils/ShaderProgram;->dispose()V

    .line 216
    throw p1

    .line 206
    :cond_0
    new-instance p1, Lorg/lwjgl/LWJGLException;

    const-string p2, "no shader support found; shaders require OpenGL 2.0"

    invoke-direct {p1, p2}, Lorg/lwjgl/LWJGLException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 204
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "shader source must be non-null"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private fetchAttributes()V
    .locals 21

    move-object/from16 v0, p0

    const/4 v1, 0x1

    new-array v2, v1, [I

    .line 482
    iget v3, v0, Lmdesl/graphics/glutils/ShaderProgram;->program:I

    const/4 v4, 0x0

    const v5, 0x8b89

    invoke-static {v3, v5, v2, v4}, Landroid/opengl/GLES20;->glGetProgramiv(II[II)V

    .line 483
    aget v2, v2, v4

    new-array v3, v1, [I

    new-array v15, v1, [I

    new-array v1, v1, [I

    const/16 v5, 0x40

    new-array v14, v5, [B

    .line 491
    new-array v5, v2, [Lmdesl/graphics/glutils/ShaderProgram$Attrib;

    iput-object v5, v0, Lmdesl/graphics/glutils/ShaderProgram;->attributes:[Lmdesl/graphics/glutils/ShaderProgram$Attrib;

    const/4 v13, 0x0

    :goto_0
    if-ge v13, v2, :cond_0

    .line 493
    new-instance v12, Lmdesl/graphics/glutils/ShaderProgram$Attrib;

    invoke-direct {v12}, Lmdesl/graphics/glutils/ShaderProgram$Attrib;-><init>()V

    .line 497
    iget v5, v0, Lmdesl/graphics/glutils/ShaderProgram;->program:I

    const/16 v7, 0x40

    const/4 v9, 0x0

    const/4 v11, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    move v6, v13

    move-object v8, v3

    move-object v10, v15

    move-object/from16 v18, v12

    move-object v12, v1

    move/from16 v19, v13

    move/from16 v13, v16

    move-object/from16 v16, v14

    move-object/from16 v20, v15

    move/from16 v15, v17

    invoke-static/range {v5 .. v15}, Landroid/opengl/GLES20;->glGetActiveAttrib(III[II[II[II[BI)V

    .line 499
    new-instance v5, Ljava/lang/String;

    aget v6, v3, v4

    move-object/from16 v7, v16

    invoke-direct {v5, v7, v4, v6}, Ljava/lang/String;-><init>([BII)V

    move-object/from16 v6, v18

    iput-object v5, v6, Lmdesl/graphics/glutils/ShaderProgram$Attrib;->name:Ljava/lang/String;

    .line 502
    iget v5, v0, Lmdesl/graphics/glutils/ShaderProgram;->program:I

    iget-object v8, v6, Lmdesl/graphics/glutils/ShaderProgram$Attrib;->name:Ljava/lang/String;

    invoke-static {v5, v8}, Landroid/opengl/GLES20;->glGetAttribLocation(ILjava/lang/String;)I

    move-result v5

    iput v5, v6, Lmdesl/graphics/glutils/ShaderProgram$Attrib;->location:I

    .line 503
    iget-object v5, v0, Lmdesl/graphics/glutils/ShaderProgram;->attributes:[Lmdesl/graphics/glutils/ShaderProgram$Attrib;

    aput-object v6, v5, v19

    add-int/lit8 v13, v19, 0x1

    move-object v14, v7

    move-object/from16 v15, v20

    goto :goto_0

    :cond_0
    return-void
.end method

.method private fetchUniforms()V
    .locals 20

    move-object/from16 v0, p0

    const/4 v1, 0x1

    new-array v2, v1, [I

    .line 447
    iget v3, v0, Lmdesl/graphics/glutils/ShaderProgram;->program:I

    const/4 v4, 0x0

    const v5, 0x8b86

    invoke-static {v3, v5, v2, v4}, Landroid/opengl/GLES20;->glGetProgramiv(II[II)V

    .line 448
    aget v2, v2, v4

    new-array v3, v1, [I

    new-array v15, v1, [I

    new-array v1, v1, [I

    const/16 v14, 0x40

    new-array v13, v14, [B

    const/4 v12, 0x0

    :goto_0
    if-ge v12, v2, :cond_3

    .line 458
    iget v5, v0, Lmdesl/graphics/glutils/ShaderProgram;->program:I

    const/16 v7, 0x40

    const/4 v9, 0x0

    const/4 v11, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    move v6, v12

    move-object v8, v3

    move-object v10, v15

    move/from16 v18, v12

    move-object v12, v1

    move-object/from16 v19, v13

    move/from16 v13, v16

    move-object/from16 v14, v19

    move-object/from16 v16, v15

    move/from16 v15, v17

    invoke-static/range {v5 .. v15}, Landroid/opengl/GLES20;->glGetActiveUniform(III[II[II[II[BI)V

    .line 460
    aget v5, v3, v4

    if-nez v5, :cond_0

    const/16 v6, 0x40

    :goto_1
    move-object/from16 v7, v19

    if-ge v5, v6, :cond_1

    .line 463
    aget-byte v8, v7, v5

    if-eqz v8, :cond_1

    add-int/lit8 v5, v5, 0x1

    move-object/from16 v19, v7

    goto :goto_1

    :cond_0
    move-object/from16 v7, v19

    const/16 v6, 0x40

    .line 468
    :cond_1
    new-instance v8, Ljava/lang/String;

    invoke-direct {v8, v7, v4, v5}, Ljava/lang/String;-><init>([BII)V

    const-string v5, " "

    .line 470
    invoke-virtual {v8, v5}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v9

    if-eqz v9, :cond_2

    .line 471
    invoke-virtual {v8, v5}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v5

    invoke-virtual {v8, v4, v5}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v8

    .line 474
    :cond_2
    iget v5, v0, Lmdesl/graphics/glutils/ShaderProgram;->program:I

    invoke-static {v5, v8}, Landroid/opengl/GLES20;->glGetUniformLocation(ILjava/lang/String;)I

    move-result v5

    .line 475
    iget-object v9, v0, Lmdesl/graphics/glutils/ShaderProgram;->uniforms:Ljava/util/HashMap;

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-virtual {v9, v8, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v12, v18, 0x1

    move-object v13, v7

    move-object/from16 v15, v16

    const/16 v14, 0x40

    goto :goto_0

    :cond_3
    return-void
.end method

.method public static isStrictMode()Z
    .locals 1

    .line 158
    sget-boolean v0, Lmdesl/graphics/glutils/ShaderProgram;->strict:Z

    return v0
.end method

.method public static isSupported()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public static setStrictMode(Z)V
    .locals 0

    .line 144
    sput-boolean p0, Lmdesl/graphics/glutils/ShaderProgram;->strict:Z

    return-void
.end method

.method private shaderTypeString(I)Ljava/lang/String;
    .locals 1

    const v0, 0x8b30

    if-ne p1, v0, :cond_0

    const-string p1, "FRAGMENT_SHADER"

    return-object p1

    :cond_0
    const v0, 0x8b31

    if-ne p1, v0, :cond_1

    const-string p1, "VERTEX_SHADER"

    return-object p1

    :cond_1
    const-string p1, "shader"

    return-object p1
.end method

.method private uniformf(I)Ljava/nio/FloatBuffer;
    .locals 2

    .line 619
    sget-object v0, Lmdesl/graphics/glutils/ShaderProgram;->fbuf16:Ljava/nio/FloatBuffer;

    if-nez v0, :cond_0

    const/16 v0, 0x40

    .line 620
    invoke-static {v0}, Ljava/nio/ByteBuffer;->allocateDirect(I)Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-static {}, Ljava/nio/ByteOrder;->nativeOrder()Ljava/nio/ByteOrder;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->asFloatBuffer()Ljava/nio/FloatBuffer;

    move-result-object v0

    sput-object v0, Lmdesl/graphics/glutils/ShaderProgram;->fbuf16:Ljava/nio/FloatBuffer;

    .line 621
    :cond_0
    sget-object v0, Lmdesl/graphics/glutils/ShaderProgram;->fbuf16:Ljava/nio/FloatBuffer;

    invoke-virtual {v0}, Ljava/nio/FloatBuffer;->clear()Ljava/nio/Buffer;

    const/4 v0, -0x1

    if-ne p1, v0, :cond_1

    .line 623
    sget-object p1, Lmdesl/graphics/glutils/ShaderProgram;->fbuf16:Ljava/nio/FloatBuffer;

    return-object p1

    .line 624
    :cond_1
    sget-object v0, Lmdesl/graphics/glutils/ShaderProgram;->fbuf16:Ljava/nio/FloatBuffer;

    invoke-virtual {p0, p1, v0}, Lmdesl/graphics/glutils/ShaderProgram;->getUniform(ILjava/nio/FloatBuffer;)V

    .line 625
    sget-object p1, Lmdesl/graphics/glutils/ShaderProgram;->fbuf16:Ljava/nio/FloatBuffer;

    return-object p1
.end method

.method private uniformi(I)Ljava/nio/IntBuffer;
    .locals 2

    .line 629
    sget-object v0, Lmdesl/graphics/glutils/ShaderProgram;->ibuf4:Ljava/nio/IntBuffer;

    if-nez v0, :cond_0

    const/16 v0, 0x10

    .line 630
    invoke-static {v0}, Ljava/nio/ByteBuffer;->allocateDirect(I)Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-static {}, Ljava/nio/ByteOrder;->nativeOrder()Ljava/nio/ByteOrder;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->asIntBuffer()Ljava/nio/IntBuffer;

    move-result-object v0

    sput-object v0, Lmdesl/graphics/glutils/ShaderProgram;->ibuf4:Ljava/nio/IntBuffer;

    .line 631
    :cond_0
    sget-object v0, Lmdesl/graphics/glutils/ShaderProgram;->ibuf4:Ljava/nio/IntBuffer;

    invoke-virtual {v0}, Ljava/nio/IntBuffer;->clear()Ljava/nio/Buffer;

    const/4 v0, -0x1

    if-ne p1, v0, :cond_1

    .line 633
    sget-object p1, Lmdesl/graphics/glutils/ShaderProgram;->ibuf4:Ljava/nio/IntBuffer;

    return-object p1

    .line 634
    :cond_1
    sget-object v0, Lmdesl/graphics/glutils/ShaderProgram;->ibuf4:Ljava/nio/IntBuffer;

    invoke-virtual {p0, p1, v0}, Lmdesl/graphics/glutils/ShaderProgram;->getUniform(ILjava/nio/IntBuffer;)V

    .line 635
    sget-object p1, Lmdesl/graphics/glutils/ShaderProgram;->ibuf4:Ljava/nio/IntBuffer;

    return-object p1
.end method


# virtual methods
.method protected attachShaders()V
    .locals 2

    .line 309
    invoke-virtual {p0}, Lmdesl/graphics/glutils/ShaderProgram;->getID()I

    move-result v0

    iget v1, p0, Lmdesl/graphics/glutils/ShaderProgram;->vert:I

    invoke-static {v0, v1}, Landroid/opengl/GLES20;->glAttachShader(II)V

    .line 310
    invoke-virtual {p0}, Lmdesl/graphics/glutils/ShaderProgram;->getID()I

    move-result v0

    iget v1, p0, Lmdesl/graphics/glutils/ShaderProgram;->frag:I

    invoke-static {v0, v1}, Landroid/opengl/GLES20;->glAttachShader(II)V

    return-void
.end method

.method attrib(Ljava/lang/String;)Lmdesl/graphics/glutils/ShaderProgram$Attrib;
    .locals 3

    const/4 v0, 0x0

    .line 529
    :goto_0
    iget-object v1, p0, Lmdesl/graphics/glutils/ShaderProgram;->attributes:[Lmdesl/graphics/glutils/ShaderProgram$Attrib;

    array-length v2, v1

    if-ge v0, v2, :cond_1

    .line 530
    aget-object v1, v1, v0

    iget-object v1, v1, Lmdesl/graphics/glutils/ShaderProgram$Attrib;->name:Ljava/lang/String;

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 531
    iget-object p1, p0, Lmdesl/graphics/glutils/ShaderProgram;->attributes:[Lmdesl/graphics/glutils/ShaderProgram$Attrib;

    aget-object p1, p1, v0

    return-object p1

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 534
    :cond_1
    sget-boolean v0, Lmdesl/graphics/glutils/ShaderProgram;->strict:Z

    if-nez v0, :cond_2

    const/4 p1, 0x0

    return-object p1

    .line 535
    :cond_2
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "no active attribute by name \'"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "\' "

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "(disable strict compiling to suppress warnings)"

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    goto :goto_2

    :goto_1
    throw v0

    :goto_2
    goto :goto_1
.end method

.method protected compileShader(ILjava/lang/String;)I
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/lwjgl/LWJGLException;
        }
    .end annotation

    .line 286
    invoke-static {p1}, Landroid/opengl/GLES20;->glCreateShader(I)I

    move-result v0

    if-eqz v0, :cond_3

    .line 290
    invoke-static {v0, p2}, Landroid/opengl/GLES20;->glShaderSource(ILjava/lang/String;)V

    .line 291
    invoke-static {v0}, Landroid/opengl/GLES20;->glCompileShader(I)V

    const/4 p2, 0x1

    new-array p2, p2, [I

    const v1, 0x8b81

    const/4 v2, 0x0

    .line 295
    invoke-static {v0, v1, p2, v2}, Landroid/opengl/GLES20;->glGetShaderiv(II[II)V

    .line 296
    aget p2, p2, v2

    .line 297
    invoke-direct {p0, p1}, Lmdesl/graphics/glutils/ShaderProgram;->shaderTypeString(I)Ljava/lang/String;

    move-result-object v1

    .line 298
    invoke-static {v0}, Landroid/opengl/GLES20;->glGetShaderInfoLog(I)Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_0

    .line 299
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v3

    if-eqz v3, :cond_0

    .line 300
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v4, p0, Lmdesl/graphics/glutils/ShaderProgram;->log:Ljava/lang/String;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " compile log:\n"

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\n"

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lmdesl/graphics/glutils/ShaderProgram;->log:Ljava/lang/String;

    :cond_0
    if-nez p2, :cond_2

    .line 302
    new-instance p2, Lorg/lwjgl/LWJGLException;

    iget-object v0, p0, Lmdesl/graphics/glutils/ShaderProgram;->log:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-eqz v0, :cond_1

    iget-object p1, p0, Lmdesl/graphics/glutils/ShaderProgram;->log:Ljava/lang/String;

    goto :goto_0

    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Could not compile "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-direct {p0, p1}, Lmdesl/graphics/glutils/ShaderProgram;->shaderTypeString(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    :goto_0
    invoke-direct {p2, p1}, Lorg/lwjgl/LWJGLException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_2
    return v0

    .line 288
    :cond_3
    new-instance p1, Lorg/lwjgl/LWJGLException;

    const-string p2, "could not create shader obj; check ShaderProgram.isSupported()"

    invoke-direct {p1, p2}, Lorg/lwjgl/LWJGLException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method protected createProgram()I
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/lwjgl/LWJGLException;
        }
    .end annotation

    .line 259
    invoke-static {}, Landroid/opengl/GLES20;->glCreateProgram()I

    move-result v0

    if-eqz v0, :cond_0

    return v0

    .line 261
    :cond_0
    new-instance v0, Lorg/lwjgl/LWJGLException;

    const-string v1, "could not create program; check ShaderProgram.isSupported()"

    invoke-direct {v0, v1}, Lorg/lwjgl/LWJGLException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public dispose()V
    .locals 1

    .line 394
    iget v0, p0, Lmdesl/graphics/glutils/ShaderProgram;->program:I

    if-eqz v0, :cond_0

    .line 395
    invoke-virtual {p0}, Lmdesl/graphics/glutils/ShaderProgram;->disposeShaders()V

    .line 396
    iget v0, p0, Lmdesl/graphics/glutils/ShaderProgram;->program:I

    invoke-static {v0}, Landroid/opengl/GLES20;->glDeleteProgram(I)V

    const/4 v0, 0x0

    .line 397
    iput v0, p0, Lmdesl/graphics/glutils/ShaderProgram;->program:I

    :cond_0
    return-void
.end method

.method public disposeShaders()V
    .locals 3

    .line 377
    iget v0, p0, Lmdesl/graphics/glutils/ShaderProgram;->vert:I

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 378
    invoke-virtual {p0}, Lmdesl/graphics/glutils/ShaderProgram;->getID()I

    move-result v0

    iget v2, p0, Lmdesl/graphics/glutils/ShaderProgram;->vert:I

    invoke-static {v0, v2}, Landroid/opengl/GLES20;->glDetachShader(II)V

    .line 379
    iget v0, p0, Lmdesl/graphics/glutils/ShaderProgram;->vert:I

    invoke-static {v0}, Landroid/opengl/GLES20;->glDeleteShader(I)V

    .line 380
    iput v1, p0, Lmdesl/graphics/glutils/ShaderProgram;->vert:I

    .line 382
    :cond_0
    iget v0, p0, Lmdesl/graphics/glutils/ShaderProgram;->frag:I

    if-eqz v0, :cond_1

    .line 383
    invoke-virtual {p0}, Lmdesl/graphics/glutils/ShaderProgram;->getID()I

    move-result v0

    iget v2, p0, Lmdesl/graphics/glutils/ShaderProgram;->frag:I

    invoke-static {v0, v2}, Landroid/opengl/GLES20;->glDetachShader(II)V

    .line 384
    iget v0, p0, Lmdesl/graphics/glutils/ShaderProgram;->frag:I

    invoke-static {v0}, Landroid/opengl/GLES20;->glDeleteShader(I)V

    .line 385
    iput v1, p0, Lmdesl/graphics/glutils/ShaderProgram;->frag:I

    :cond_1
    return-void
.end method

.method public getAttributeLocation(Ljava/lang/String;)I
    .locals 0

    .line 548
    invoke-virtual {p0, p1}, Lmdesl/graphics/glutils/ShaderProgram;->attrib(Ljava/lang/String;)Lmdesl/graphics/glutils/ShaderProgram$Attrib;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 549
    iget p1, p1, Lmdesl/graphics/glutils/ShaderProgram$Attrib;->location:I

    goto :goto_0

    :cond_0
    const/4 p1, -0x1

    :goto_0
    return p1
.end method

.method public getAttributeNames()[Ljava/lang/String;
    .locals 4

    .line 580
    iget-object v0, p0, Lmdesl/graphics/glutils/ShaderProgram;->attributes:[Lmdesl/graphics/glutils/ShaderProgram$Attrib;

    array-length v0, v0

    new-array v0, v0, [Ljava/lang/String;

    const/4 v1, 0x0

    .line 581
    :goto_0
    iget-object v2, p0, Lmdesl/graphics/glutils/ShaderProgram;->attributes:[Lmdesl/graphics/glutils/ShaderProgram$Attrib;

    array-length v3, v2

    if-ge v1, v3, :cond_0

    .line 582
    aget-object v2, v2, v1

    iget-object v2, v2, Lmdesl/graphics/glutils/ShaderProgram$Attrib;->name:Ljava/lang/String;

    aput-object v2, v0, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method public getFragmentShaderID()I
    .locals 1

    .line 412
    iget v0, p0, Lmdesl/graphics/glutils/ShaderProgram;->frag:I

    return v0
.end method

.method public getFragmentShaderSource()Ljava/lang/String;
    .locals 1

    .line 426
    iget-object v0, p0, Lmdesl/graphics/glutils/ShaderProgram;->fragShaderSource:Ljava/lang/String;

    return-object v0
.end method

.method public getID()I
    .locals 1

    .line 433
    iget v0, p0, Lmdesl/graphics/glutils/ShaderProgram;->program:I

    return v0
.end method

.method public getLog()Ljava/lang/String;
    .locals 1

    .line 356
    iget-object v0, p0, Lmdesl/graphics/glutils/ShaderProgram;->log:Ljava/lang/String;

    return-object v0
.end method

.method public getUniform(ILjava/nio/FloatBuffer;)V
    .locals 1

    .line 644
    iget v0, p0, Lmdesl/graphics/glutils/ShaderProgram;->program:I

    invoke-static {v0, p1, p2}, Landroid/opengl/GLES20;->glGetUniformfv(IILjava/nio/FloatBuffer;)V

    return-void
.end method

.method public getUniform(ILjava/nio/IntBuffer;)V
    .locals 1

    .line 652
    iget v0, p0, Lmdesl/graphics/glutils/ShaderProgram;->program:I

    invoke-static {v0, p1, p2}, Landroid/opengl/GLES20;->glGetUniformiv(IILjava/nio/IntBuffer;)V

    return-void
.end method

.method public getUniform(Ljava/lang/String;Ljava/nio/FloatBuffer;)Z
    .locals 1

    .line 667
    invoke-virtual {p0, p1}, Lmdesl/graphics/glutils/ShaderProgram;->getUniformLocation(Ljava/lang/String;)I

    move-result p1

    const/4 v0, -0x1

    if-ne p1, v0, :cond_0

    const/4 p1, 0x0

    return p1

    .line 670
    :cond_0
    invoke-virtual {p0, p1, p2}, Lmdesl/graphics/glutils/ShaderProgram;->getUniform(ILjava/nio/FloatBuffer;)V

    const/4 p1, 0x1

    return p1
.end method

.method public getUniform(Ljava/lang/String;Ljava/nio/IntBuffer;)Z
    .locals 1

    .line 686
    invoke-virtual {p0, p1}, Lmdesl/graphics/glutils/ShaderProgram;->getUniformLocation(Ljava/lang/String;)I

    move-result p1

    const/4 v0, -0x1

    if-ne p1, v0, :cond_0

    const/4 p1, 0x0

    return p1

    .line 689
    :cond_0
    invoke-virtual {p0, p1, p2}, Lmdesl/graphics/glutils/ShaderProgram;->getUniform(ILjava/nio/IntBuffer;)V

    const/4 p1, 0x1

    return p1
.end method

.method public getUniform1f(I)F
    .locals 1

    .line 782
    invoke-direct {p0, p1}, Lmdesl/graphics/glutils/ShaderProgram;->uniformf(I)Ljava/nio/FloatBuffer;

    move-result-object p1

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Ljava/nio/FloatBuffer;->get(I)F

    move-result p1

    return p1
.end method

.method public getUniform1f(Ljava/lang/String;)F
    .locals 0

    .line 791
    invoke-virtual {p0, p1}, Lmdesl/graphics/glutils/ShaderProgram;->getUniformLocation(Ljava/lang/String;)I

    move-result p1

    invoke-virtual {p0, p1}, Lmdesl/graphics/glutils/ShaderProgram;->getUniform1f(I)F

    move-result p1

    return p1
.end method

.method public getUniform1i(I)I
    .locals 1

    .line 699
    invoke-direct {p0, p1}, Lmdesl/graphics/glutils/ShaderProgram;->uniformi(I)Ljava/nio/IntBuffer;

    move-result-object p1

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Ljava/nio/IntBuffer;->get(I)I

    move-result p1

    return p1
.end method

.method public getUniform1i(Ljava/lang/String;)I
    .locals 0

    .line 708
    invoke-virtual {p0, p1}, Lmdesl/graphics/glutils/ShaderProgram;->getUniformLocation(Ljava/lang/String;)I

    move-result p1

    invoke-virtual {p0, p1}, Lmdesl/graphics/glutils/ShaderProgram;->getUniform1i(I)I

    move-result p1

    return p1
.end method

.method public getUniform2f(I)[F
    .locals 3

    .line 801
    invoke-direct {p0, p1}, Lmdesl/graphics/glutils/ShaderProgram;->uniformf(I)Ljava/nio/FloatBuffer;

    move-result-object p1

    const/4 v0, 0x2

    new-array v0, v0, [F

    const/4 v1, 0x0

    .line 802
    invoke-virtual {p1, v1}, Ljava/nio/FloatBuffer;->get(I)F

    move-result v2

    aput v2, v0, v1

    const/4 v1, 0x1

    invoke-virtual {p1, v1}, Ljava/nio/FloatBuffer;->get(I)F

    move-result p1

    aput p1, v0, v1

    return-object v0
.end method

.method public getUniform2f(Ljava/lang/String;)[F
    .locals 0

    .line 813
    invoke-virtual {p0, p1}, Lmdesl/graphics/glutils/ShaderProgram;->getUniformLocation(Ljava/lang/String;)I

    move-result p1

    invoke-virtual {p0, p1}, Lmdesl/graphics/glutils/ShaderProgram;->getUniform2f(I)[F

    move-result-object p1

    return-object p1
.end method

.method public getUniform2i(I)[I
    .locals 3

    .line 718
    invoke-direct {p0, p1}, Lmdesl/graphics/glutils/ShaderProgram;->uniformi(I)Ljava/nio/IntBuffer;

    move-result-object p1

    const/4 v0, 0x2

    new-array v0, v0, [I

    const/4 v1, 0x0

    .line 719
    invoke-virtual {p1, v1}, Ljava/nio/IntBuffer;->get(I)I

    move-result v2

    aput v2, v0, v1

    const/4 v1, 0x1

    invoke-virtual {p1, v1}, Ljava/nio/IntBuffer;->get(I)I

    move-result p1

    aput p1, v0, v1

    return-object v0
.end method

.method public getUniform2i(Ljava/lang/String;)[I
    .locals 0

    .line 730
    invoke-virtual {p0, p1}, Lmdesl/graphics/glutils/ShaderProgram;->getUniformLocation(Ljava/lang/String;)I

    move-result p1

    invoke-virtual {p0, p1}, Lmdesl/graphics/glutils/ShaderProgram;->getUniform2i(I)[I

    move-result-object p1

    return-object p1
.end method

.method public getUniform3f(I)[F
    .locals 3

    .line 823
    invoke-direct {p0, p1}, Lmdesl/graphics/glutils/ShaderProgram;->uniformf(I)Ljava/nio/FloatBuffer;

    move-result-object p1

    const/4 v0, 0x3

    new-array v0, v0, [F

    const/4 v1, 0x0

    .line 824
    invoke-virtual {p1, v1}, Ljava/nio/FloatBuffer;->get(I)F

    move-result v2

    aput v2, v0, v1

    const/4 v1, 0x1

    invoke-virtual {p1, v1}, Ljava/nio/FloatBuffer;->get(I)F

    move-result v2

    aput v2, v0, v1

    const/4 v1, 0x2

    invoke-virtual {p1, v1}, Ljava/nio/FloatBuffer;->get(I)F

    move-result p1

    aput p1, v0, v1

    return-object v0
.end method

.method public getUniform3f(Ljava/lang/String;)[F
    .locals 0

    .line 835
    invoke-virtual {p0, p1}, Lmdesl/graphics/glutils/ShaderProgram;->getUniformLocation(Ljava/lang/String;)I

    move-result p1

    invoke-virtual {p0, p1}, Lmdesl/graphics/glutils/ShaderProgram;->getUniform3f(I)[F

    move-result-object p1

    return-object p1
.end method

.method public getUniform3i(I)[I
    .locals 3

    .line 740
    invoke-direct {p0, p1}, Lmdesl/graphics/glutils/ShaderProgram;->uniformi(I)Ljava/nio/IntBuffer;

    move-result-object p1

    const/4 v0, 0x3

    new-array v0, v0, [I

    const/4 v1, 0x0

    .line 741
    invoke-virtual {p1, v1}, Ljava/nio/IntBuffer;->get(I)I

    move-result v2

    aput v2, v0, v1

    const/4 v1, 0x1

    invoke-virtual {p1, v1}, Ljava/nio/IntBuffer;->get(I)I

    move-result v2

    aput v2, v0, v1

    const/4 v1, 0x2

    invoke-virtual {p1, v1}, Ljava/nio/IntBuffer;->get(I)I

    move-result p1

    aput p1, v0, v1

    return-object v0
.end method

.method public getUniform3i(Ljava/lang/String;)[I
    .locals 0

    .line 752
    invoke-virtual {p0, p1}, Lmdesl/graphics/glutils/ShaderProgram;->getUniformLocation(Ljava/lang/String;)I

    move-result p1

    invoke-virtual {p0, p1}, Lmdesl/graphics/glutils/ShaderProgram;->getUniform3i(I)[I

    move-result-object p1

    return-object p1
.end method

.method public getUniform4f(I)[F
    .locals 3

    .line 845
    invoke-direct {p0, p1}, Lmdesl/graphics/glutils/ShaderProgram;->uniformf(I)Ljava/nio/FloatBuffer;

    move-result-object p1

    const/4 v0, 0x4

    new-array v0, v0, [F

    const/4 v1, 0x0

    .line 846
    invoke-virtual {p1, v1}, Ljava/nio/FloatBuffer;->get(I)F

    move-result v2

    aput v2, v0, v1

    const/4 v1, 0x1

    invoke-virtual {p1, v1}, Ljava/nio/FloatBuffer;->get(I)F

    move-result v2

    aput v2, v0, v1

    const/4 v1, 0x2

    invoke-virtual {p1, v1}, Ljava/nio/FloatBuffer;->get(I)F

    move-result v2

    aput v2, v0, v1

    const/4 v1, 0x3

    invoke-virtual {p1, v1}, Ljava/nio/FloatBuffer;->get(I)F

    move-result p1

    aput p1, v0, v1

    return-object v0
.end method

.method public getUniform4f(Ljava/lang/String;)[F
    .locals 0

    .line 857
    invoke-virtual {p0, p1}, Lmdesl/graphics/glutils/ShaderProgram;->getUniformLocation(Ljava/lang/String;)I

    move-result p1

    invoke-virtual {p0, p1}, Lmdesl/graphics/glutils/ShaderProgram;->getUniform4f(I)[F

    move-result-object p1

    return-object p1
.end method

.method public getUniform4i(I)[I
    .locals 3

    .line 762
    invoke-direct {p0, p1}, Lmdesl/graphics/glutils/ShaderProgram;->uniformi(I)Ljava/nio/IntBuffer;

    move-result-object p1

    const/4 v0, 0x4

    new-array v0, v0, [I

    const/4 v1, 0x0

    .line 763
    invoke-virtual {p1, v1}, Ljava/nio/IntBuffer;->get(I)I

    move-result v2

    aput v2, v0, v1

    const/4 v1, 0x1

    invoke-virtual {p1, v1}, Ljava/nio/IntBuffer;->get(I)I

    move-result v2

    aput v2, v0, v1

    const/4 v1, 0x2

    invoke-virtual {p1, v1}, Ljava/nio/IntBuffer;->get(I)I

    move-result v2

    aput v2, v0, v1

    const/4 v1, 0x3

    invoke-virtual {p1, v1}, Ljava/nio/IntBuffer;->get(I)I

    move-result p1

    aput p1, v0, v1

    return-object v0
.end method

.method public getUniform4i(Ljava/lang/String;)[I
    .locals 0

    .line 774
    invoke-virtual {p0, p1}, Lmdesl/graphics/glutils/ShaderProgram;->getUniformLocation(Ljava/lang/String;)I

    move-result p1

    invoke-virtual {p0, p1}, Lmdesl/graphics/glutils/ShaderProgram;->getUniform4i(I)[I

    move-result-object p1

    return-object p1
.end method

.method public getUniformLocation(Ljava/lang/String;)I
    .locals 3

    .line 515
    iget-object v0, p0, Lmdesl/graphics/glutils/ShaderProgram;->uniforms:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    if-nez v0, :cond_0

    .line 517
    iget v0, p0, Lmdesl/graphics/glutils/ShaderProgram;->program:I

    invoke-static {v0, p1}, Landroid/opengl/GLES20;->glGetUniformLocation(ILjava/lang/String;)I

    move-result v0

    .line 518
    iget-object v1, p0, Lmdesl/graphics/glutils/ShaderProgram;->uniforms:Ljava/util/HashMap;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, p1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 520
    :cond_0
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    :goto_0
    const/4 v1, -0x1

    if-ne v0, v1, :cond_2

    .line 522
    sget-boolean v1, Lmdesl/graphics/glutils/ShaderProgram;->strict:Z

    if-nez v1, :cond_1

    goto :goto_1

    .line 523
    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "no active uniform by name \'"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "\' "

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "(disable strict compiling to suppress warnings)"

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    :goto_1
    return v0
.end method

.method public getUniformNames()[Ljava/lang/String;
    .locals 2

    .line 592
    iget-object v0, p0, Lmdesl/graphics/glutils/ShaderProgram;->uniforms:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    move-result-object v0

    iget-object v1, p0, Lmdesl/graphics/glutils/ShaderProgram;->uniforms:Ljava/util/HashMap;

    invoke-virtual {v1}, Ljava/util/HashMap;->size()I

    move-result v1

    new-array v1, v1, [Ljava/lang/String;

    invoke-interface {v0, v1}, Ljava/util/Set;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/String;

    return-object v0
.end method

.method public getVertexShaderID()I
    .locals 1

    .line 405
    iget v0, p0, Lmdesl/graphics/glutils/ShaderProgram;->vert:I

    return v0
.end method

.method public getVertexShaderSource()Ljava/lang/String;
    .locals 1

    .line 419
    iget-object v0, p0, Lmdesl/graphics/glutils/ShaderProgram;->vertShaderSource:Ljava/lang/String;

    return-object v0
.end method

.method public hasAttribute(Ljava/lang/String;)Z
    .locals 4

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 610
    :goto_0
    iget-object v2, p0, Lmdesl/graphics/glutils/ShaderProgram;->attributes:[Lmdesl/graphics/glutils/ShaderProgram$Attrib;

    array-length v3, v2

    if-ge v1, v3, :cond_1

    .line 611
    aget-object v2, v2, v1

    iget-object v2, v2, Lmdesl/graphics/glutils/ShaderProgram$Attrib;->name:Ljava/lang/String;

    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return v0
.end method

.method public hasUniform(Ljava/lang/String;)Z
    .locals 1

    .line 601
    iget-object v0, p0, Lmdesl/graphics/glutils/ShaderProgram;->uniforms:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method protected linkProgram(Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lmdesl/graphics/glutils/VertexAttrib;",
            ">;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/lwjgl/LWJGLException;
        }
    .end annotation

    .line 321
    invoke-virtual {p0}, Lmdesl/graphics/glutils/ShaderProgram;->valid()Z

    move-result v0

    if-eqz v0, :cond_6

    .line 324
    iget-object v0, p0, Lmdesl/graphics/glutils/ShaderProgram;->uniforms:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    if-eqz p1, :cond_1

    .line 328
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lmdesl/graphics/glutils/VertexAttrib;

    if-eqz v0, :cond_0

    .line 330
    iget v1, p0, Lmdesl/graphics/glutils/ShaderProgram;->program:I

    iget v2, v0, Lmdesl/graphics/glutils/VertexAttrib;->location:I

    iget-object v0, v0, Lmdesl/graphics/glutils/VertexAttrib;->name:Ljava/lang/String;

    invoke-static {v1, v2, v0}, Landroid/opengl/GLES20;->glBindAttribLocation(IILjava/lang/String;)V

    goto :goto_0

    .line 334
    :cond_1
    invoke-virtual {p0}, Lmdesl/graphics/glutils/ShaderProgram;->attachShaders()V

    .line 335
    iget p1, p0, Lmdesl/graphics/glutils/ShaderProgram;->program:I

    invoke-static {p1}, Landroid/opengl/GLES20;->glLinkProgram(I)V

    const/4 p1, 0x1

    new-array p1, p1, [I

    .line 338
    iget v0, p0, Lmdesl/graphics/glutils/ShaderProgram;->program:I

    const v1, 0x8b82

    const/4 v2, 0x0

    invoke-static {v0, v1, p1, v2}, Landroid/opengl/GLES20;->glGetProgramiv(II[II)V

    .line 339
    aget p1, p1, v2

    .line 340
    iget v0, p0, Lmdesl/graphics/glutils/ShaderProgram;->program:I

    invoke-static {v0}, Landroid/opengl/GLES20;->glGetProgramInfoLog(I)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 341
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    if-eqz v1, :cond_2

    .line 342
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "\n"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Lmdesl/graphics/glutils/ShaderProgram;->log:Ljava/lang/String;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lmdesl/graphics/glutils/ShaderProgram;->log:Ljava/lang/String;

    .line 343
    :cond_2
    iget-object v0, p0, Lmdesl/graphics/glutils/ShaderProgram;->log:Ljava/lang/String;

    if-eqz v0, :cond_3

    .line 344
    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lmdesl/graphics/glutils/ShaderProgram;->log:Ljava/lang/String;

    :cond_3
    if-nez p1, :cond_5

    .line 346
    new-instance p1, Lorg/lwjgl/LWJGLException;

    iget-object v0, p0, Lmdesl/graphics/glutils/ShaderProgram;->log:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-eqz v0, :cond_4

    iget-object v0, p0, Lmdesl/graphics/glutils/ShaderProgram;->log:Ljava/lang/String;

    goto :goto_1

    :cond_4
    const-string v0, "Could not link program"

    :goto_1
    invoke-direct {p1, v0}, Lorg/lwjgl/LWJGLException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 348
    :cond_5
    invoke-direct {p0}, Lmdesl/graphics/glutils/ShaderProgram;->fetchUniforms()V

    .line 349
    invoke-direct {p0}, Lmdesl/graphics/glutils/ShaderProgram;->fetchAttributes()V

    return-void

    .line 322
    :cond_6
    new-instance p1, Lorg/lwjgl/LWJGLException;

    const-string v0, "trying to link an invalid (i.e. released) program"

    invoke-direct {p1, v0}, Lorg/lwjgl/LWJGLException;-><init>(Ljava/lang/String;)V

    goto :goto_3

    :goto_2
    throw p1

    :goto_3
    goto :goto_2
.end method

.method public setUniformf(IF)V
    .locals 1

    const/4 v0, -0x1

    if-ne p1, v0, :cond_0

    return-void

    .line 869
    :cond_0
    invoke-static {p1, p2}, Landroid/opengl/GLES20;->glUniform1f(IF)V

    return-void
.end method

.method public setUniformf(IFF)V
    .locals 1

    const/4 v0, -0x1

    if-ne p1, v0, :cond_0

    return-void

    .line 880
    :cond_0
    invoke-static {p1, p2, p3}, Landroid/opengl/GLES20;->glUniform2f(IFF)V

    return-void
.end method

.method public setUniformf(IFFF)V
    .locals 1

    const/4 v0, -0x1

    if-ne p1, v0, :cond_0

    return-void

    .line 892
    :cond_0
    invoke-static {p1, p2, p3, p4}, Landroid/opengl/GLES20;->glUniform3f(IFFF)V

    return-void
.end method

.method public setUniformf(IFFFF)V
    .locals 1

    const/4 v0, -0x1

    if-ne p1, v0, :cond_0

    return-void

    .line 905
    :cond_0
    invoke-static {p1, p2, p3, p4, p5}, Landroid/opengl/GLES20;->glUniform4f(IFFFF)V

    return-void
.end method

.method public setUniformf(Ljava/lang/String;F)V
    .locals 0

    .line 963
    invoke-virtual {p0, p1}, Lmdesl/graphics/glutils/ShaderProgram;->getUniformLocation(Ljava/lang/String;)I

    move-result p1

    invoke-virtual {p0, p1, p2}, Lmdesl/graphics/glutils/ShaderProgram;->setUniformf(IF)V

    return-void
.end method

.method public setUniformf(Ljava/lang/String;FF)V
    .locals 0

    .line 973
    invoke-virtual {p0, p1}, Lmdesl/graphics/glutils/ShaderProgram;->getUniformLocation(Ljava/lang/String;)I

    move-result p1

    invoke-virtual {p0, p1, p2, p3}, Lmdesl/graphics/glutils/ShaderProgram;->setUniformf(IFF)V

    return-void
.end method

.method public setUniformf(Ljava/lang/String;FFF)V
    .locals 0

    .line 984
    invoke-virtual {p0, p1}, Lmdesl/graphics/glutils/ShaderProgram;->getUniformLocation(Ljava/lang/String;)I

    move-result p1

    invoke-virtual {p0, p1, p2, p3, p4}, Lmdesl/graphics/glutils/ShaderProgram;->setUniformf(IFFF)V

    return-void
.end method

.method public setUniformf(Ljava/lang/String;FFFF)V
    .locals 6

    .line 996
    invoke-virtual {p0, p1}, Lmdesl/graphics/glutils/ShaderProgram;->getUniformLocation(Ljava/lang/String;)I

    move-result v1

    move-object v0, p0

    move v2, p2

    move v3, p3

    move v4, p4

    move v5, p5

    invoke-virtual/range {v0 .. v5}, Lmdesl/graphics/glutils/ShaderProgram;->setUniformf(IFFFF)V

    return-void
.end method

.method public setUniformi(II)V
    .locals 1

    const/4 v0, -0x1

    if-ne p1, v0, :cond_0

    return-void

    .line 915
    :cond_0
    invoke-static {p1, p2}, Landroid/opengl/GLES20;->glUniform1i(II)V

    return-void
.end method

.method public setUniformi(III)V
    .locals 1

    const/4 v0, -0x1

    if-ne p1, v0, :cond_0

    return-void

    .line 926
    :cond_0
    invoke-static {p1, p2, p3}, Landroid/opengl/GLES20;->glUniform2i(III)V

    return-void
.end method

.method public setUniformi(IIII)V
    .locals 1

    const/4 v0, -0x1

    if-ne p1, v0, :cond_0

    return-void

    .line 938
    :cond_0
    invoke-static {p1, p2, p3, p4}, Landroid/opengl/GLES20;->glUniform3i(IIII)V

    return-void
.end method

.method public setUniformi(IIIII)V
    .locals 1

    const/4 v0, -0x1

    if-ne p1, v0, :cond_0

    return-void

    .line 951
    :cond_0
    invoke-static {p1, p2, p3, p4, p5}, Landroid/opengl/GLES20;->glUniform4i(IIIII)V

    return-void
.end method

.method public setUniformi(Ljava/lang/String;I)V
    .locals 0

    .line 1005
    invoke-virtual {p0, p1}, Lmdesl/graphics/glutils/ShaderProgram;->getUniformLocation(Ljava/lang/String;)I

    move-result p1

    invoke-virtual {p0, p1, p2}, Lmdesl/graphics/glutils/ShaderProgram;->setUniformi(II)V

    return-void
.end method

.method public setUniformi(Ljava/lang/String;II)V
    .locals 0

    .line 1015
    invoke-virtual {p0, p1}, Lmdesl/graphics/glutils/ShaderProgram;->getUniformLocation(Ljava/lang/String;)I

    move-result p1

    invoke-virtual {p0, p1, p2, p3}, Lmdesl/graphics/glutils/ShaderProgram;->setUniformi(III)V

    return-void
.end method

.method public setUniformi(Ljava/lang/String;III)V
    .locals 0

    .line 1026
    invoke-virtual {p0, p1}, Lmdesl/graphics/glutils/ShaderProgram;->getUniformLocation(Ljava/lang/String;)I

    move-result p1

    invoke-virtual {p0, p1, p2, p3, p4}, Lmdesl/graphics/glutils/ShaderProgram;->setUniformi(IIII)V

    return-void
.end method

.method public setUniformi(Ljava/lang/String;IIII)V
    .locals 6

    .line 1038
    invoke-virtual {p0, p1}, Lmdesl/graphics/glutils/ShaderProgram;->getUniformLocation(Ljava/lang/String;)I

    move-result v1

    move-object v0, p0

    move v2, p2

    move v3, p3

    move v4, p4

    move v5, p5

    invoke-virtual/range {v0 .. v5}, Lmdesl/graphics/glutils/ShaderProgram;->setUniformi(IIIII)V

    return-void
.end method

.method public use()V
    .locals 2

    .line 365
    invoke-virtual {p0}, Lmdesl/graphics/glutils/ShaderProgram;->valid()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 367
    iget v0, p0, Lmdesl/graphics/glutils/ShaderProgram;->program:I

    invoke-static {v0}, Landroid/opengl/GLES20;->glUseProgram(I)V

    return-void

    .line 366
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "trying to enable a program that is not valid"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public valid()Z
    .locals 1

    .line 441
    iget v0, p0, Lmdesl/graphics/glutils/ShaderProgram;->program:I

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method
