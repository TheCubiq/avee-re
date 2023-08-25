.class public final Lcom/daaw/i09;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/m42;


# instance fields
.field public final a:[B


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x1000

    new-array v0, v0, [B

    iput-object v0, p0, Lcom/daaw/i09;->a:[B

    return-void
.end method


# virtual methods
.method public final a(Lcom/daaw/ik5;II)V
    .locals 0

    invoke-virtual {p1, p2}, Lcom/daaw/ik5;->g(I)V

    return-void
.end method

.method public final b(JIIILcom/daaw/l42;)V
    .locals 0

    return-void
.end method

.method public final synthetic c(Lcom/daaw/ik5;I)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/daaw/k42;->b(Lcom/daaw/m42;Lcom/daaw/ik5;I)V

    return-void
.end method

.method public final d(Lcom/daaw/xp8;IZI)I
    .locals 1

    const/16 p4, 0x1000

    invoke-static {p4, p2}, Ljava/lang/Math;->min(II)I

    move-result p2

    iget-object p4, p0, Lcom/daaw/i09;->a:[B

    const/4 v0, 0x0

    invoke-interface {p1, p4, v0, p2}, Lcom/daaw/xp8;->a([BII)I

    move-result p1

    const/4 p2, -0x1

    if-ne p1, p2, :cond_1

    if-eqz p3, :cond_0

    return p2

    :cond_0
    new-instance p1, Ljava/io/EOFException;

    invoke-direct {p1}, Ljava/io/EOFException;-><init>()V

    throw p1

    :cond_1
    return p1
.end method

.method public final synthetic e(Lcom/daaw/xp8;IZ)I
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/daaw/k42;->a(Lcom/daaw/m42;Lcom/daaw/xp8;IZ)I

    move-result p1

    return p1
.end method

.method public final f(Lcom/daaw/f92;)V
    .locals 0

    return-void
.end method
