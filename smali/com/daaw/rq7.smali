.class public final Lcom/daaw/rq7;
.super Lcom/daaw/uq7;
.source ""


# instance fields
.field public final u:I

.field public final v:I


# direct methods
.method public constructor <init>([BII)V
    .locals 1

    invoke-direct {p0, p1}, Lcom/daaw/uq7;-><init>([B)V

    add-int v0, p2, p3

    array-length p1, p1

    invoke-static {p2, v0, p1}, Lcom/daaw/yq7;->A(III)I

    iput p2, p0, Lcom/daaw/rq7;->u:I

    iput p3, p0, Lcom/daaw/rq7;->v:I

    return-void
.end method


# virtual methods
.method public final L()I
    .locals 1

    iget v0, p0, Lcom/daaw/rq7;->u:I

    return v0
.end method

.method public final k(I)B
    .locals 2

    iget v0, p0, Lcom/daaw/rq7;->v:I

    invoke-static {p1, v0}, Lcom/daaw/yq7;->e(II)V

    iget-object v0, p0, Lcom/daaw/uq7;->t:[B

    iget v1, p0, Lcom/daaw/rq7;->u:I

    add-int/2addr v1, p1

    aget-byte p1, v0, v1

    return p1
.end method

.method public final m(I)B
    .locals 2

    iget-object v0, p0, Lcom/daaw/uq7;->t:[B

    iget v1, p0, Lcom/daaw/rq7;->u:I

    add-int/2addr v1, p1

    aget-byte p1, v0, v1

    return p1
.end method

.method public final o()I
    .locals 1

    iget v0, p0, Lcom/daaw/rq7;->v:I

    return v0
.end method

.method public final p([BIII)V
    .locals 2

    iget-object v0, p0, Lcom/daaw/uq7;->t:[B

    iget v1, p0, Lcom/daaw/rq7;->u:I

    add-int/2addr v1, p2

    invoke-static {v0, v1, p1, p3, p4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-void
.end method
