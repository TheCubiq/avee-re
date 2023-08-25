.class public Lcom/daaw/mr1;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/rc0;


# instance fields
.field public a:Lcom/daaw/vp;

.field public b:I

.field public c:Ljava/nio/FloatBuffer;

.field public d:I

.field public e:[F

.field public f:I

.field public g:I

.field public final h:I


# direct methods
.method public constructor <init>(II)V
    .locals 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/daaw/vp;

    invoke-direct {v0}, Lcom/daaw/vp;-><init>()V

    iput-object v0, p0, Lcom/daaw/mr1;->a:Lcom/daaw/vp;

    const/4 v0, 0x0

    iput v0, p0, Lcom/daaw/mr1;->d:I

    iput v0, p0, Lcom/daaw/mr1;->g:I

    const/4 v1, 0x4

    iput v1, p0, Lcom/daaw/mr1;->h:I

    iput p2, p0, Lcom/daaw/mr1;->b:I

    iput p1, p0, Lcom/daaw/mr1;->f:I

    int-to-float p2, p2

    const/high16 v2, 0x40800000    # 4.0f

    div-float/2addr p2, v2

    float-to-double v2, p2

    invoke-static {v2, v3}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v2

    double-to-int p2, v2

    mul-int p1, p1, p2

    new-array p1, p1, [F

    iput-object p1, p0, Lcom/daaw/mr1;->e:[F

    invoke-static {p1}, Ljava/nio/FloatBuffer;->wrap([F)Ljava/nio/FloatBuffer;

    move-result-object p1

    iput-object p1, p0, Lcom/daaw/mr1;->c:Ljava/nio/FloatBuffer;

    const/4 p1, 0x1

    new-array p2, p1, [I

    invoke-static {p1, p2, v0}, Landroid/opengl/GLES20;->glGenBuffers(I[II)V

    aget p1, p2, v0

    iput p1, p0, Lcom/daaw/mr1;->g:I

    const p2, 0x8892

    invoke-static {p2, p1}, Landroid/opengl/GLES20;->glBindBuffer(II)V

    invoke-virtual {p0}, Lcom/daaw/mr1;->e()V

    iget-object p1, p0, Lcom/daaw/mr1;->c:Ljava/nio/FloatBuffer;

    invoke-virtual {p1}, Ljava/nio/FloatBuffer;->clear()Ljava/nio/Buffer;

    iget-object p1, p0, Lcom/daaw/mr1;->c:Ljava/nio/FloatBuffer;

    invoke-virtual {p1}, Ljava/nio/FloatBuffer;->capacity()I

    move-result p1

    mul-int/lit8 p1, p1, 0x4

    iget-object v1, p0, Lcom/daaw/mr1;->c:Ljava/nio/FloatBuffer;

    const v2, 0x88e8

    invoke-static {p2, p1, v1, v2}, Landroid/opengl/GLES20;->glBufferData(IILjava/nio/Buffer;I)V

    invoke-virtual {p0}, Lcom/daaw/mr1;->e()V

    invoke-static {p2, v0}, Landroid/opengl/GLES20;->glBindBuffer(II)V

    return-void
.end method

.method public static synthetic d(Lcom/daaw/mr1;)Ljava/lang/Boolean;
    .locals 0

    invoke-direct {p0}, Lcom/daaw/mr1;->j()Ljava/lang/Boolean;

    move-result-object p0

    return-object p0
.end method

.method private synthetic j()Ljava/lang/Boolean;
    .locals 1

    iget v0, p0, Lcom/daaw/mr1;->g:I

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
.method public a()V
    .locals 2

    const v0, 0x8892

    const/4 v1, 0x0

    invoke-static {v0, v1}, Landroid/opengl/GLES20;->glBindBuffer(II)V

    return-void
.end method

.method public b()V
    .locals 4

    iget-object v0, p0, Lcom/daaw/mr1;->c:Ljava/nio/FloatBuffer;

    iget v1, p0, Lcom/daaw/mr1;->d:I

    invoke-virtual {v0, v1}, Ljava/nio/FloatBuffer;->limit(I)Ljava/nio/Buffer;

    iget v0, p0, Lcom/daaw/mr1;->g:I

    const v1, 0x8892

    invoke-static {v1, v0}, Landroid/opengl/GLES20;->glBindBuffer(II)V

    invoke-virtual {p0}, Lcom/daaw/mr1;->e()V

    iget-object v0, p0, Lcom/daaw/mr1;->c:Ljava/nio/FloatBuffer;

    invoke-virtual {v0}, Ljava/nio/FloatBuffer;->limit()I

    move-result v0

    mul-int/lit8 v0, v0, 0x4

    iget-object v2, p0, Lcom/daaw/mr1;->c:Ljava/nio/FloatBuffer;

    const/4 v3, 0x0

    invoke-static {v1, v3, v0, v2}, Landroid/opengl/GLES20;->glBufferSubData(IIILjava/nio/Buffer;)V

    invoke-virtual {p0}, Lcom/daaw/mr1;->e()V

    return-void
.end method

.method public c(III)V
    .locals 0

    invoke-static {p1, p2, p3}, Landroid/opengl/GLES20;->glDrawArrays(III)V

    return-void
.end method

.method public final e()V
    .locals 0

    return-void
.end method

.method public f()V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lcom/daaw/mr1;->d:I

    return-void
.end method

.method public finalize()V
    .locals 2

    invoke-super {p0}, Ljava/lang/Object;->finalize()V

    iget-object v0, p0, Lcom/daaw/mr1;->a:Lcom/daaw/vp;

    new-instance v1, Lcom/daaw/lr1;

    invoke-direct {v1, p0}, Lcom/daaw/lr1;-><init>(Lcom/daaw/mr1;)V

    invoke-virtual {v0, v1}, Lcom/daaw/vp;->a(Lcom/daaw/w40;)V

    return-void
.end method

.method public g()V
    .locals 4

    iget v0, p0, Lcom/daaw/mr1;->g:I

    if-eqz v0, :cond_0

    const/4 v1, 0x1

    new-array v2, v1, [I

    const/4 v3, 0x0

    aput v0, v2, v3

    invoke-static {v1, v2, v3}, Landroid/opengl/GLES20;->glDeleteBuffers(I[II)V

    invoke-virtual {p0}, Lcom/daaw/mr1;->e()V

    iput v3, p0, Lcom/daaw/mr1;->g:I

    :cond_0
    return-void
.end method

.method public h()V
    .locals 0

    return-void
.end method

.method public i()I
    .locals 1

    iget v0, p0, Lcom/daaw/mr1;->b:I

    return v0
.end method

.method public k(F)V
    .locals 2

    iget-object v0, p0, Lcom/daaw/mr1;->e:[F

    iget v1, p0, Lcom/daaw/mr1;->d:I

    aput p1, v0, v1

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, Lcom/daaw/mr1;->d:I

    return-void
.end method

.method public l(I)V
    .locals 2

    iget-object v0, p0, Lcom/daaw/mr1;->e:[F

    iget v1, p0, Lcom/daaw/mr1;->d:I

    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result p1

    aput p1, v0, v1

    iget p1, p0, Lcom/daaw/mr1;->d:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Lcom/daaw/mr1;->d:I

    return-void
.end method

.method public m()I
    .locals 2

    iget-object v0, p0, Lcom/daaw/mr1;->e:[F

    array-length v0, v0

    iget v1, p0, Lcom/daaw/mr1;->d:I

    sub-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x4

    return v0
.end method
