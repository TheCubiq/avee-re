.class public abstract Lcom/daaw/jd1;
.super Lcom/daaw/ed1;
.source ""

# interfaces
.implements Lcom/daaw/uh1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/daaw/ed1<",
        "Lcom/daaw/xh1;",
        "Lcom/daaw/yh1;",
        "Lcom/daaw/vh1;",
        ">;",
        "Lcom/daaw/uh1;"
    }
.end annotation


# instance fields
.field public final n:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 2

    const/4 v0, 0x2

    new-array v1, v0, [Lcom/daaw/xh1;

    new-array v0, v0, [Lcom/daaw/yh1;

    invoke-direct {p0, v1, v0}, Lcom/daaw/ed1;-><init>([Lcom/daaw/gq;[Lcom/daaw/av0;)V

    iput-object p1, p0, Lcom/daaw/jd1;->n:Ljava/lang/String;

    const/16 p1, 0x400

    invoke-virtual {p0, p1}, Lcom/daaw/ed1;->v(I)V

    return-void
.end method


# virtual methods
.method public final A(Lcom/daaw/xh1;Lcom/daaw/yh1;Z)Lcom/daaw/vh1;
    .locals 8

    :try_start_0
    iget-object v0, p1, Lcom/daaw/gq;->r:Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v1

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->limit()I

    move-result v0

    invoke-virtual {p0, v1, v0, p3}, Lcom/daaw/jd1;->z([BIZ)Lcom/daaw/th1;

    move-result-object v5

    iget-wide v3, p1, Lcom/daaw/gq;->s:J

    iget-wide v6, p1, Lcom/daaw/xh1;->u:J

    move-object v2, p2

    invoke-virtual/range {v2 .. v7}, Lcom/daaw/yh1;->n(JLcom/daaw/th1;J)V

    const/high16 p1, -0x80000000

    invoke-virtual {p2, p1}, Lcom/daaw/rc;->g(I)V
    :try_end_0
    .catch Lcom/daaw/vh1; {:try_start_0 .. :try_end_0} :catch_0

    const/4 p1, 0x0

    return-object p1

    :catch_0
    move-exception p1

    return-object p1
.end method

.method public final B(Lcom/daaw/yh1;)V
    .locals 0

    invoke-super {p0, p1}, Lcom/daaw/ed1;->s(Lcom/daaw/av0;)V

    return-void
.end method

.method public b(J)V
    .locals 0

    return-void
.end method

.method public bridge synthetic h()Lcom/daaw/gq;
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/jd1;->w()Lcom/daaw/xh1;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic i()Lcom/daaw/av0;
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/jd1;->x()Lcom/daaw/yh1;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic j(Ljava/lang/Throwable;)Ljava/lang/Exception;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/daaw/jd1;->y(Ljava/lang/Throwable;)Lcom/daaw/vh1;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic k(Lcom/daaw/gq;Lcom/daaw/av0;Z)Ljava/lang/Exception;
    .locals 0

    check-cast p1, Lcom/daaw/xh1;

    check-cast p2, Lcom/daaw/yh1;

    invoke-virtual {p0, p1, p2, p3}, Lcom/daaw/jd1;->A(Lcom/daaw/xh1;Lcom/daaw/yh1;Z)Lcom/daaw/vh1;

    move-result-object p1

    return-object p1
.end method

.method public final w()Lcom/daaw/xh1;
    .locals 1

    new-instance v0, Lcom/daaw/xh1;

    invoke-direct {v0}, Lcom/daaw/xh1;-><init>()V

    return-object v0
.end method

.method public final x()Lcom/daaw/yh1;
    .locals 1

    new-instance v0, Lcom/daaw/kd1;

    invoke-direct {v0, p0}, Lcom/daaw/kd1;-><init>(Lcom/daaw/jd1;)V

    return-object v0
.end method

.method public final y(Ljava/lang/Throwable;)Lcom/daaw/vh1;
    .locals 2

    new-instance v0, Lcom/daaw/vh1;

    const-string v1, "Unexpected decode error"

    invoke-direct {v0, v1, p1}, Lcom/daaw/vh1;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-object v0
.end method

.method public abstract z([BIZ)Lcom/daaw/th1;
.end method
