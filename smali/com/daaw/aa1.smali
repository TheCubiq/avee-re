.class public final Lcom/daaw/aa1;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/eo1;


# instance fields
.field public final a:Lcom/daaw/z91;

.field public final b:Lcom/daaw/rv0;

.field public c:I

.field public d:I

.field public e:Z

.field public f:Z


# direct methods
.method public constructor <init>(Lcom/daaw/z91;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/aa1;->a:Lcom/daaw/z91;

    new-instance p1, Lcom/daaw/rv0;

    const/16 v0, 0x20

    invoke-direct {p1, v0}, Lcom/daaw/rv0;-><init>(I)V

    iput-object p1, p0, Lcom/daaw/aa1;->b:Lcom/daaw/rv0;

    return-void
.end method


# virtual methods
.method public a(Lcom/daaw/rv0;Z)V
    .locals 7

    const/4 v0, -0x1

    if-eqz p2, :cond_0

    invoke-virtual {p1}, Lcom/daaw/rv0;->x()I

    move-result v1

    invoke-virtual {p1}, Lcom/daaw/rv0;->c()I

    move-result v2

    add-int/2addr v2, v1

    goto :goto_0

    :cond_0
    const/4 v2, -0x1

    :goto_0
    iget-boolean v1, p0, Lcom/daaw/aa1;->f:Z

    const/4 v3, 0x0

    if-eqz v1, :cond_2

    if-nez p2, :cond_1

    return-void

    :cond_1
    iput-boolean v3, p0, Lcom/daaw/aa1;->f:Z

    invoke-virtual {p1, v2}, Lcom/daaw/rv0;->J(I)V

    :goto_1
    iput v3, p0, Lcom/daaw/aa1;->d:I

    :cond_2
    :goto_2
    invoke-virtual {p1}, Lcom/daaw/rv0;->a()I

    move-result p2

    if-lez p2, :cond_8

    iget p2, p0, Lcom/daaw/aa1;->d:I

    const/4 v1, 0x1

    const/4 v2, 0x3

    if-ge p2, v2, :cond_5

    if-nez p2, :cond_3

    invoke-virtual {p1}, Lcom/daaw/rv0;->x()I

    move-result p2

    invoke-virtual {p1}, Lcom/daaw/rv0;->c()I

    move-result v4

    sub-int/2addr v4, v1

    invoke-virtual {p1, v4}, Lcom/daaw/rv0;->J(I)V

    const/16 v4, 0xff

    if-ne p2, v4, :cond_3

    iput-boolean v1, p0, Lcom/daaw/aa1;->f:Z

    return-void

    :cond_3
    invoke-virtual {p1}, Lcom/daaw/rv0;->a()I

    move-result p2

    iget v4, p0, Lcom/daaw/aa1;->d:I

    rsub-int/lit8 v4, v4, 0x3

    invoke-static {p2, v4}, Ljava/lang/Math;->min(II)I

    move-result p2

    iget-object v4, p0, Lcom/daaw/aa1;->b:Lcom/daaw/rv0;

    iget-object v4, v4, Lcom/daaw/rv0;->a:[B

    iget v5, p0, Lcom/daaw/aa1;->d:I

    invoke-virtual {p1, v4, v5, p2}, Lcom/daaw/rv0;->g([BII)V

    iget v4, p0, Lcom/daaw/aa1;->d:I

    add-int/2addr v4, p2

    iput v4, p0, Lcom/daaw/aa1;->d:I

    if-ne v4, v2, :cond_2

    iget-object p2, p0, Lcom/daaw/aa1;->b:Lcom/daaw/rv0;

    invoke-virtual {p2, v2}, Lcom/daaw/rv0;->G(I)V

    iget-object p2, p0, Lcom/daaw/aa1;->b:Lcom/daaw/rv0;

    invoke-virtual {p2, v1}, Lcom/daaw/rv0;->K(I)V

    iget-object p2, p0, Lcom/daaw/aa1;->b:Lcom/daaw/rv0;

    invoke-virtual {p2}, Lcom/daaw/rv0;->x()I

    move-result p2

    iget-object v4, p0, Lcom/daaw/aa1;->b:Lcom/daaw/rv0;

    invoke-virtual {v4}, Lcom/daaw/rv0;->x()I

    move-result v4

    and-int/lit16 v5, p2, 0x80

    if-eqz v5, :cond_4

    goto :goto_3

    :cond_4
    const/4 v1, 0x0

    :goto_3
    iput-boolean v1, p0, Lcom/daaw/aa1;->e:Z

    and-int/lit8 p2, p2, 0xf

    shl-int/lit8 p2, p2, 0x8

    or-int/2addr p2, v4

    add-int/2addr p2, v2

    iput p2, p0, Lcom/daaw/aa1;->c:I

    iget-object p2, p0, Lcom/daaw/aa1;->b:Lcom/daaw/rv0;

    invoke-virtual {p2}, Lcom/daaw/rv0;->b()I

    move-result p2

    iget v1, p0, Lcom/daaw/aa1;->c:I

    if-ge p2, v1, :cond_2

    iget-object p2, p0, Lcom/daaw/aa1;->b:Lcom/daaw/rv0;

    iget-object v4, p2, Lcom/daaw/rv0;->a:[B

    const/16 v5, 0x1002

    array-length v6, v4

    mul-int/lit8 v6, v6, 0x2

    invoke-static {v1, v6}, Ljava/lang/Math;->max(II)I

    move-result v1

    invoke-static {v5, v1}, Ljava/lang/Math;->min(II)I

    move-result v1

    invoke-virtual {p2, v1}, Lcom/daaw/rv0;->G(I)V

    iget-object p2, p0, Lcom/daaw/aa1;->b:Lcom/daaw/rv0;

    iget-object p2, p2, Lcom/daaw/rv0;->a:[B

    invoke-static {v4, v3, p2, v3, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    goto/16 :goto_2

    :cond_5
    invoke-virtual {p1}, Lcom/daaw/rv0;->a()I

    move-result p2

    iget v2, p0, Lcom/daaw/aa1;->c:I

    iget v4, p0, Lcom/daaw/aa1;->d:I

    sub-int/2addr v2, v4

    invoke-static {p2, v2}, Ljava/lang/Math;->min(II)I

    move-result p2

    iget-object v2, p0, Lcom/daaw/aa1;->b:Lcom/daaw/rv0;

    iget-object v2, v2, Lcom/daaw/rv0;->a:[B

    iget v4, p0, Lcom/daaw/aa1;->d:I

    invoke-virtual {p1, v2, v4, p2}, Lcom/daaw/rv0;->g([BII)V

    iget v2, p0, Lcom/daaw/aa1;->d:I

    add-int/2addr v2, p2

    iput v2, p0, Lcom/daaw/aa1;->d:I

    iget p2, p0, Lcom/daaw/aa1;->c:I

    if-ne v2, p2, :cond_2

    iget-boolean v2, p0, Lcom/daaw/aa1;->e:Z

    if-eqz v2, :cond_7

    iget-object v2, p0, Lcom/daaw/aa1;->b:Lcom/daaw/rv0;

    iget-object v2, v2, Lcom/daaw/rv0;->a:[B

    invoke-static {v2, v3, p2, v0}, Lcom/daaw/sq1;->n([BIII)I

    move-result p2

    if-eqz p2, :cond_6

    iput-boolean v1, p0, Lcom/daaw/aa1;->f:Z

    return-void

    :cond_6
    iget-object p2, p0, Lcom/daaw/aa1;->b:Lcom/daaw/rv0;

    iget v1, p0, Lcom/daaw/aa1;->c:I

    add-int/lit8 v1, v1, -0x4

    invoke-virtual {p2, v1}, Lcom/daaw/rv0;->G(I)V

    goto :goto_4

    :cond_7
    iget-object v1, p0, Lcom/daaw/aa1;->b:Lcom/daaw/rv0;

    invoke-virtual {v1, p2}, Lcom/daaw/rv0;->G(I)V

    :goto_4
    iget-object p2, p0, Lcom/daaw/aa1;->a:Lcom/daaw/z91;

    iget-object v1, p0, Lcom/daaw/aa1;->b:Lcom/daaw/rv0;

    invoke-interface {p2, v1}, Lcom/daaw/z91;->a(Lcom/daaw/rv0;)V

    goto/16 :goto_1

    :cond_8
    return-void
.end method

.method public b()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/daaw/aa1;->f:Z

    return-void
.end method

.method public c(Lcom/daaw/ol1;Lcom/daaw/d00;Lcom/daaw/eo1$d;)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/aa1;->a:Lcom/daaw/z91;

    invoke-interface {v0, p1, p2, p3}, Lcom/daaw/z91;->c(Lcom/daaw/ol1;Lcom/daaw/d00;Lcom/daaw/eo1$d;)V

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/daaw/aa1;->f:Z

    return-void
.end method
