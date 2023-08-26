.class public Lmdesl/graphics/glutils/VertexArray;
.super Ljava/lang/Object;
.source "VertexArray.java"

# interfaces
.implements Lmdesl/graphics/glutils/VertexData;


# instance fields
.field protected attributes:[Lmdesl/graphics/glutils/VertexAttrib;

.field protected buffer:Ljava/nio/FloatBuffer;

.field private stride:I

.field private totalNumComponents:I

.field private vertCount:I


# direct methods
.method public constructor <init>(ILjava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/List<",
            "Lmdesl/graphics/glutils/VertexAttrib;",
            ">;)V"
        }
    .end annotation

    .line 72
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v0

    new-array v0, v0, [Lmdesl/graphics/glutils/VertexAttrib;

    invoke-interface {p2, v0}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p2

    check-cast p2, [Lmdesl/graphics/glutils/VertexAttrib;

    invoke-direct {p0, p1, p2}, Lmdesl/graphics/glutils/VertexArray;-><init>(I[Lmdesl/graphics/glutils/VertexAttrib;)V

    return-void
.end method

.method public varargs constructor <init>(I[Lmdesl/graphics/glutils/VertexAttrib;)V
    .locals 4

    .line 61
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 62
    iput-object p2, p0, Lmdesl/graphics/glutils/VertexArray;->attributes:[Lmdesl/graphics/glutils/VertexAttrib;

    .line 63
    array-length v0, p2

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    aget-object v2, p2, v1

    .line 64
    iget v3, p0, Lmdesl/graphics/glutils/VertexArray;->totalNumComponents:I

    iget v2, v2, Lmdesl/graphics/glutils/VertexAttrib;->numComponents:I

    add-int/2addr v3, v2

    iput v3, p0, Lmdesl/graphics/glutils/VertexArray;->totalNumComponents:I

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 65
    :cond_0
    iput p1, p0, Lmdesl/graphics/glutils/VertexArray;->vertCount:I

    .line 68
    iget p2, p0, Lmdesl/graphics/glutils/VertexArray;->totalNumComponents:I

    mul-int p1, p1, p2

    shl-int/lit8 p1, p1, 0x2

    invoke-static {p1}, Ljava/nio/ByteBuffer;->allocateDirect(I)Ljava/nio/ByteBuffer;

    move-result-object p1

    invoke-static {}, Ljava/nio/ByteOrder;->nativeOrder()Ljava/nio/ByteOrder;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    move-result-object p1

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->asFloatBuffer()Ljava/nio/FloatBuffer;

    move-result-object p1

    iput-object p1, p0, Lmdesl/graphics/glutils/VertexArray;->buffer:Ljava/nio/FloatBuffer;

    return-void
.end method


# virtual methods
.method public bind()V
    .locals 10

    .line 110
    iget v0, p0, Lmdesl/graphics/glutils/VertexArray;->totalNumComponents:I

    mul-int/lit8 v0, v0, 0x4

    const/4 v1, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    .line 112
    :goto_0
    iget-object v1, p0, Lmdesl/graphics/glutils/VertexArray;->attributes:[Lmdesl/graphics/glutils/VertexAttrib;

    array-length v2, v1

    if-ge v7, v2, :cond_0

    .line 113
    aget-object v9, v1, v7

    .line 114
    iget-object v1, p0, Lmdesl/graphics/glutils/VertexArray;->buffer:Ljava/nio/FloatBuffer;

    invoke-virtual {v1, v8}, Ljava/nio/FloatBuffer;->position(I)Ljava/nio/Buffer;

    .line 115
    iget v1, v9, Lmdesl/graphics/glutils/VertexAttrib;->location:I

    invoke-static {v1}, Landroid/opengl/GLES20;->glEnableVertexAttribArray(I)V

    .line 116
    iget v1, v9, Lmdesl/graphics/glutils/VertexAttrib;->location:I

    iget v2, v9, Lmdesl/graphics/glutils/VertexAttrib;->numComponents:I

    const/16 v3, 0x1406

    const/4 v4, 0x0

    iget-object v6, p0, Lmdesl/graphics/glutils/VertexArray;->buffer:Ljava/nio/FloatBuffer;

    move v5, v0

    invoke-static/range {v1 .. v6}, Landroid/opengl/GLES20;->glVertexAttribPointer(IIIZILjava/nio/Buffer;)V

    .line 117
    iget v1, v9, Lmdesl/graphics/glutils/VertexAttrib;->numComponents:I

    add-int/2addr v8, v1

    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public buffer()Ljava/nio/FloatBuffer;
    .locals 1

    .line 96
    iget-object v0, p0, Lmdesl/graphics/glutils/VertexArray;->buffer:Ljava/nio/FloatBuffer;

    return-object v0
.end method

.method public clear()Lmdesl/graphics/glutils/VertexArray;
    .locals 1

    .line 81
    iget-object v0, p0, Lmdesl/graphics/glutils/VertexArray;->buffer:Ljava/nio/FloatBuffer;

    invoke-virtual {v0}, Ljava/nio/FloatBuffer;->clear()Ljava/nio/Buffer;

    return-object p0
.end method

.method public bridge synthetic clear()Lmdesl/graphics/glutils/VertexData;
    .locals 1

    .line 47
    invoke-virtual {p0}, Lmdesl/graphics/glutils/VertexArray;->clear()Lmdesl/graphics/glutils/VertexArray;

    move-result-object v0

    return-object v0
.end method

.method public draw(III)V
    .locals 0

    .line 122
    invoke-static {p1, p2, p3}, Landroid/opengl/GLES20;->glDrawArrays(III)V

    return-void
.end method

.method public flip()Lmdesl/graphics/glutils/VertexArray;
    .locals 1

    .line 76
    iget-object v0, p0, Lmdesl/graphics/glutils/VertexArray;->buffer:Ljava/nio/FloatBuffer;

    invoke-virtual {v0}, Ljava/nio/FloatBuffer;->flip()Ljava/nio/Buffer;

    return-object p0
.end method

.method public bridge synthetic flip()Lmdesl/graphics/glutils/VertexData;
    .locals 1

    .line 47
    invoke-virtual {p0}, Lmdesl/graphics/glutils/VertexArray;->flip()Lmdesl/graphics/glutils/VertexArray;

    move-result-object v0

    return-object v0
.end method

.method public getTotalNumComponents()I
    .locals 1

    .line 100
    iget v0, p0, Lmdesl/graphics/glutils/VertexArray;->totalNumComponents:I

    return v0
.end method

.method public getVertexCount()I
    .locals 1

    .line 104
    iget v0, p0, Lmdesl/graphics/glutils/VertexArray;->vertCount:I

    return v0
.end method

.method public put(F)Lmdesl/graphics/glutils/VertexArray;
    .locals 1

    .line 91
    iget-object v0, p0, Lmdesl/graphics/glutils/VertexArray;->buffer:Ljava/nio/FloatBuffer;

    invoke-virtual {v0, p1}, Ljava/nio/FloatBuffer;->put(F)Ljava/nio/FloatBuffer;

    return-object p0
.end method

.method public put([FII)Lmdesl/graphics/glutils/VertexArray;
    .locals 1

    .line 86
    iget-object v0, p0, Lmdesl/graphics/glutils/VertexArray;->buffer:Ljava/nio/FloatBuffer;

    invoke-virtual {v0, p1, p2, p3}, Ljava/nio/FloatBuffer;->put([FII)Ljava/nio/FloatBuffer;

    return-object p0
.end method

.method public bridge synthetic put(F)Lmdesl/graphics/glutils/VertexData;
    .locals 0

    .line 47
    invoke-virtual {p0, p1}, Lmdesl/graphics/glutils/VertexArray;->put(F)Lmdesl/graphics/glutils/VertexArray;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic put([FII)Lmdesl/graphics/glutils/VertexData;
    .locals 0

    .line 47
    invoke-virtual {p0, p1, p2, p3}, Lmdesl/graphics/glutils/VertexArray;->put([FII)Lmdesl/graphics/glutils/VertexArray;

    move-result-object p1

    return-object p1
.end method

.method public unbind()V
    .locals 3

    const/4 v0, 0x0

    .line 126
    :goto_0
    iget-object v1, p0, Lmdesl/graphics/glutils/VertexArray;->attributes:[Lmdesl/graphics/glutils/VertexAttrib;

    array-length v2, v1

    if-ge v0, v2, :cond_0

    .line 127
    aget-object v1, v1, v0

    .line 128
    iget v1, v1, Lmdesl/graphics/glutils/VertexAttrib;->location:I

    invoke-static {v1}, Landroid/opengl/GLES20;->glDisableVertexAttribArray(I)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method
