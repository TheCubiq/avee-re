.class public Lcom/daaw/q40;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static k:[F

.field public static l:[F


# instance fields
.field public a:Lcom/daaw/vp;

.field public final b:Ljava/nio/FloatBuffer;

.field public final c:Ljava/nio/FloatBuffer;

.field public final d:Ljava/nio/ShortBuffer;

.field public e:I

.field public f:I

.field public g:I

.field public final h:[S

.field public final i:I

.field public j:I


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    const/16 v0, 0xc

    new-array v1, v0, [F

    fill-array-data v1, :array_0

    sput-object v1, Lcom/daaw/q40;->k:[F

    new-array v0, v0, [F

    fill-array-data v0, :array_1

    sput-object v0, Lcom/daaw/q40;->l:[F

    return-void

    nop

    :array_0
    .array-data 4
        -0x40800000    # -1.0f
        0x3f800000    # 1.0f
        0x0
        -0x40800000    # -1.0f
        -0x40800000    # -1.0f
        0x0
        0x3f800000    # 1.0f
        -0x40800000    # -1.0f
        0x0
        0x3f800000    # 1.0f
        0x3f800000    # 1.0f
        0x0
    .end array-data

    :array_1
    .array-data 4
        0x3f000000    # 0.5f
        0x3f000000    # 0.5f
        0x0
        0x3f800000    # 1.0f
        -0x40800000    # -1.0f
        0x0
        -0x40800000    # -1.0f
        -0x40800000    # -1.0f
        0x0
        -0x40800000    # -1.0f
        0x3f800000    # 1.0f
        0x0
    .end array-data
.end method

.method public constructor <init>()V
    .locals 5

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/daaw/vp;

    invoke-direct {v0}, Lcom/daaw/vp;-><init>()V

    iput-object v0, p0, Lcom/daaw/q40;->a:Lcom/daaw/vp;

    const/4 v0, 0x0

    iput v0, p0, Lcom/daaw/q40;->e:I

    iput v0, p0, Lcom/daaw/q40;->f:I

    iput v0, p0, Lcom/daaw/q40;->g:I

    const/4 v1, 0x6

    new-array v1, v1, [S

    fill-array-data v1, :array_0

    iput-object v1, p0, Lcom/daaw/q40;->h:[S

    const/16 v2, 0xc

    iput v2, p0, Lcom/daaw/q40;->i:I

    sget-object v2, Lcom/daaw/q40;->k:[F

    array-length v2, v2

    mul-int/lit8 v2, v2, 0x4

    invoke-static {v2}, Ljava/nio/ByteBuffer;->allocateDirect(I)Ljava/nio/ByteBuffer;

    move-result-object v2

    invoke-static {}, Ljava/nio/ByteOrder;->nativeOrder()Ljava/nio/ByteOrder;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    invoke-virtual {v2}, Ljava/nio/ByteBuffer;->asFloatBuffer()Ljava/nio/FloatBuffer;

    move-result-object v2

    iput-object v2, p0, Lcom/daaw/q40;->b:Ljava/nio/FloatBuffer;

    sget-object v3, Lcom/daaw/q40;->k:[F

    invoke-virtual {v2, v3}, Ljava/nio/FloatBuffer;->put([F)Ljava/nio/FloatBuffer;

    invoke-virtual {v2, v0}, Ljava/nio/FloatBuffer;->position(I)Ljava/nio/Buffer;

    sget-object v2, Lcom/daaw/q40;->l:[F

    array-length v2, v2

    mul-int/lit8 v2, v2, 0x4

    invoke-static {v2}, Ljava/nio/ByteBuffer;->allocateDirect(I)Ljava/nio/ByteBuffer;

    move-result-object v2

    invoke-static {}, Ljava/nio/ByteOrder;->nativeOrder()Ljava/nio/ByteOrder;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    invoke-virtual {v2}, Ljava/nio/ByteBuffer;->asFloatBuffer()Ljava/nio/FloatBuffer;

    move-result-object v2

    iput-object v2, p0, Lcom/daaw/q40;->c:Ljava/nio/FloatBuffer;

    sget-object v3, Lcom/daaw/q40;->l:[F

    invoke-virtual {v2, v3}, Ljava/nio/FloatBuffer;->put([F)Ljava/nio/FloatBuffer;

    invoke-virtual {v2, v0}, Ljava/nio/FloatBuffer;->position(I)Ljava/nio/Buffer;

    array-length v2, v1

    mul-int/lit8 v2, v2, 0x2

    invoke-static {v2}, Ljava/nio/ByteBuffer;->allocateDirect(I)Ljava/nio/ByteBuffer;

    move-result-object v2

    invoke-static {}, Ljava/nio/ByteOrder;->nativeOrder()Ljava/nio/ByteOrder;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    invoke-virtual {v2}, Ljava/nio/ByteBuffer;->asShortBuffer()Ljava/nio/ShortBuffer;

    move-result-object v2

    iput-object v2, p0, Lcom/daaw/q40;->d:Ljava/nio/ShortBuffer;

    invoke-virtual {v2, v1}, Ljava/nio/ShortBuffer;->put([S)Ljava/nio/ShortBuffer;

    invoke-virtual {v2, v0}, Ljava/nio/ShortBuffer;->position(I)Ljava/nio/Buffer;

    const v1, 0x8b31

    const-string v2, "const vec2 madd=vec2(0.5,0.5);attribute vec3 vertexIn;varying vec2 textureCoord;void main() {textureCoord = vertexIn.xy*madd+madd;gl_Position = vec4(vertexIn,1.0);}"

    invoke-static {v1, v2}, Lcom/daaw/f80;->s(ILjava/lang/String;)I

    move-result v1

    iput v1, p0, Lcom/daaw/q40;->f:I

    const v1, 0x8b30

    const-string v2, "precision mediump float;varying vec2 textureCoord;uniform sampler2D s_texture;void main() {vec4 color1 = texture2D(s_texture,textureCoord);gl_FragColor = color1;}"

    invoke-static {v1, v2}, Lcom/daaw/f80;->s(ILjava/lang/String;)I

    move-result v1

    iput v1, p0, Lcom/daaw/q40;->g:I

    invoke-static {}, Landroid/opengl/GLES20;->glCreateProgram()I

    move-result v1

    iput v1, p0, Lcom/daaw/q40;->e:I

    iget v2, p0, Lcom/daaw/q40;->f:I

    invoke-static {v1, v2}, Landroid/opengl/GLES20;->glAttachShader(II)V

    iget v1, p0, Lcom/daaw/q40;->e:I

    iget v2, p0, Lcom/daaw/q40;->g:I

    invoke-static {v1, v2}, Landroid/opengl/GLES20;->glAttachShader(II)V

    iget v1, p0, Lcom/daaw/q40;->e:I

    invoke-static {v1}, Landroid/opengl/GLES20;->glLinkProgram(I)V

    const/4 v1, 0x1

    new-array v2, v1, [I

    iget v3, p0, Lcom/daaw/q40;->e:I

    const v4, 0x8b82

    invoke-static {v3, v4, v2, v0}, Landroid/opengl/GLES20;->glGetProgramiv(II[II)V

    aget v0, v2, v0

    if-eq v0, v1, :cond_0

    const-string v0, "Could not link program: "

    invoke-static {v0}, Lcom/daaw/lz1;->c(Ljava/lang/String;)V

    iget v0, p0, Lcom/daaw/q40;->e:I

    invoke-static {v0}, Landroid/opengl/GLES20;->glGetProgramInfoLog(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/daaw/lz1;->c(Ljava/lang/String;)V

    iget v0, p0, Lcom/daaw/q40;->e:I

    invoke-static {v0}, Landroid/opengl/GLES20;->glDeleteProgram(I)V

    :cond_0
    return-void

    nop

    :array_0
    .array-data 2
        0x0s
        0x1s
        0x2s
        0x0s
        0x2s
        0x3s
    .end array-data
.end method

.method public static synthetic a(Lcom/daaw/q40;)Ljava/lang/Boolean;
    .locals 0

    invoke-direct {p0}, Lcom/daaw/q40;->f()Ljava/lang/Boolean;

    move-result-object p0

    return-object p0
.end method

.method private synthetic f()Ljava/lang/Boolean;
    .locals 1

    iget v0, p0, Lcom/daaw/q40;->e:I

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public b()V
    .locals 1

    iget v0, p0, Lcom/daaw/q40;->e:I

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/daaw/q40;->c()V

    iget v0, p0, Lcom/daaw/q40;->e:I

    invoke-static {v0}, Landroid/opengl/GLES20;->glDeleteProgram(I)V

    const/4 v0, 0x0

    iput v0, p0, Lcom/daaw/q40;->e:I

    :cond_0
    return-void
.end method

.method public final c()V
    .locals 3

    iget v0, p0, Lcom/daaw/q40;->f:I

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    iget v2, p0, Lcom/daaw/q40;->e:I

    invoke-static {v2, v0}, Landroid/opengl/GLES20;->glDetachShader(II)V

    iget v0, p0, Lcom/daaw/q40;->f:I

    invoke-static {v0}, Landroid/opengl/GLES20;->glDeleteShader(I)V

    iput v1, p0, Lcom/daaw/q40;->f:I

    :cond_0
    iget v0, p0, Lcom/daaw/q40;->g:I

    if-eqz v0, :cond_1

    iget v2, p0, Lcom/daaw/q40;->e:I

    invoke-static {v2, v0}, Landroid/opengl/GLES20;->glDetachShader(II)V

    iget v0, p0, Lcom/daaw/q40;->g:I

    invoke-static {v0}, Landroid/opengl/GLES20;->glDeleteShader(I)V

    iput v1, p0, Lcom/daaw/q40;->g:I

    :cond_1
    return-void
.end method

.method public d()V
    .locals 7

    iget v0, p0, Lcom/daaw/q40;->e:I

    invoke-static {v0}, Landroid/opengl/GLES20;->glUseProgram(I)V

    iget v0, p0, Lcom/daaw/q40;->e:I

    const-string v1, "vertexIn"

    invoke-static {v0, v1}, Landroid/opengl/GLES20;->glGetAttribLocation(ILjava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/daaw/q40;->j:I

    invoke-static {v0}, Landroid/opengl/GLES20;->glEnableVertexAttribArray(I)V

    iget v1, p0, Lcom/daaw/q40;->j:I

    iget-object v6, p0, Lcom/daaw/q40;->b:Ljava/nio/FloatBuffer;

    const/4 v2, 0x3

    const/16 v3, 0x1406

    const/4 v4, 0x0

    const/16 v5, 0xc

    invoke-static/range {v1 .. v6}, Landroid/opengl/GLES20;->glVertexAttribPointer(IIIZILjava/nio/Buffer;)V

    iget-object v0, p0, Lcom/daaw/q40;->h:[S

    array-length v0, v0

    iget-object v1, p0, Lcom/daaw/q40;->d:Ljava/nio/ShortBuffer;

    const/4 v2, 0x4

    const/16 v3, 0x1403

    invoke-static {v2, v0, v3, v1}, Landroid/opengl/GLES20;->glDrawElements(IIILjava/nio/Buffer;)V

    iget v0, p0, Lcom/daaw/q40;->j:I

    invoke-static {v0}, Landroid/opengl/GLES20;->glDisableVertexAttribArray(I)V

    return-void
.end method

.method public e(Lcom/daaw/dc1;Ljava/lang/String;)V
    .locals 6

    invoke-virtual {p1, p2}, Lcom/daaw/dc1;->i(Ljava/lang/String;)I

    move-result p1

    invoke-static {p1}, Landroid/opengl/GLES20;->glEnableVertexAttribArray(I)V

    iget-object v5, p0, Lcom/daaw/q40;->b:Ljava/nio/FloatBuffer;

    const/4 v1, 0x3

    const/16 v2, 0x1406

    const/4 v3, 0x0

    const/16 v4, 0xc

    move v0, p1

    invoke-static/range {v0 .. v5}, Landroid/opengl/GLES20;->glVertexAttribPointer(IIIZILjava/nio/Buffer;)V

    iget-object p2, p0, Lcom/daaw/q40;->h:[S

    array-length p2, p2

    iget-object v0, p0, Lcom/daaw/q40;->d:Ljava/nio/ShortBuffer;

    const/4 v1, 0x4

    const/16 v2, 0x1403

    invoke-static {v1, p2, v2, v0}, Landroid/opengl/GLES20;->glDrawElements(IIILjava/nio/Buffer;)V

    invoke-static {p1}, Landroid/opengl/GLES20;->glDisableVertexAttribArray(I)V

    return-void
.end method

.method public finalize()V
    .locals 2

    invoke-super {p0}, Ljava/lang/Object;->finalize()V

    iget-object v0, p0, Lcom/daaw/q40;->a:Lcom/daaw/vp;

    new-instance v1, Lcom/daaw/p40;

    invoke-direct {v1, p0}, Lcom/daaw/p40;-><init>(Lcom/daaw/q40;)V

    invoke-virtual {v0, v1}, Lcom/daaw/vp;->a(Lcom/daaw/w40;)V

    return-void
.end method
