.class public final Lcom/daaw/hd2;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/ud2;


# instance fields
.field public final a:Lcom/daaw/gd2;

.field public final b:Lcom/daaw/ik5;

.field public c:I

.field public d:I

.field public e:Z

.field public f:Z


# direct methods
.method public constructor <init>(Lcom/daaw/gd2;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/hd2;->a:Lcom/daaw/gd2;

    new-instance p1, Lcom/daaw/ik5;

    const/16 v0, 0x20

    invoke-direct {p1, v0}, Lcom/daaw/ik5;-><init>(I)V

    iput-object p1, p0, Lcom/daaw/hd2;->b:Lcom/daaw/ik5;

    return-void
.end method


# virtual methods
.method public final a(Lcom/daaw/ik5;I)V
    .locals 6

    const/4 v0, 0x1

    and-int/2addr p2, v0

    const/4 v1, -0x1

    if-eqz p2, :cond_0

    invoke-virtual {p1}, Lcom/daaw/ik5;->s()I

    move-result v2

    invoke-virtual {p1}, Lcom/daaw/ik5;->k()I

    move-result v3

    add-int/2addr v3, v2

    goto :goto_0

    :cond_0
    const/4 v3, -0x1

    :goto_0
    iget-boolean v2, p0, Lcom/daaw/hd2;->f:Z

    const/4 v4, 0x0

    if-nez v2, :cond_1

    goto :goto_2

    :cond_1
    if-nez p2, :cond_2

    return-void

    :cond_2
    iput-boolean v4, p0, Lcom/daaw/hd2;->f:Z

    invoke-virtual {p1, v3}, Lcom/daaw/ik5;->f(I)V

    :goto_1
    iput v4, p0, Lcom/daaw/hd2;->d:I

    :cond_3
    :goto_2
    invoke-virtual {p1}, Lcom/daaw/ik5;->i()I

    move-result p2

    if-lez p2, :cond_a

    iget p2, p0, Lcom/daaw/hd2;->d:I

    const/4 v2, 0x3

    if-ge p2, v2, :cond_7

    if-nez p2, :cond_5

    invoke-virtual {p1}, Lcom/daaw/ik5;->s()I

    move-result p2

    invoke-virtual {p1}, Lcom/daaw/ik5;->k()I

    move-result v3

    add-int/2addr v3, v1

    invoke-virtual {p1, v3}, Lcom/daaw/ik5;->f(I)V

    const/16 v3, 0xff

    if-eq p2, v3, :cond_4

    goto :goto_3

    :cond_4
    iput-boolean v0, p0, Lcom/daaw/hd2;->f:Z

    return-void

    :cond_5
    :goto_3
    invoke-virtual {p1}, Lcom/daaw/ik5;->i()I

    move-result p2

    iget v3, p0, Lcom/daaw/hd2;->d:I

    rsub-int/lit8 v3, v3, 0x3

    invoke-static {p2, v3}, Ljava/lang/Math;->min(II)I

    move-result p2

    iget-object v3, p0, Lcom/daaw/hd2;->b:Lcom/daaw/ik5;

    invoke-virtual {v3}, Lcom/daaw/ik5;->h()[B

    move-result-object v3

    iget v5, p0, Lcom/daaw/hd2;->d:I

    invoke-virtual {p1, v3, v5, p2}, Lcom/daaw/ik5;->b([BII)V

    iget v3, p0, Lcom/daaw/hd2;->d:I

    add-int/2addr v3, p2

    iput v3, p0, Lcom/daaw/hd2;->d:I

    if-ne v3, v2, :cond_3

    iget-object p2, p0, Lcom/daaw/hd2;->b:Lcom/daaw/ik5;

    invoke-virtual {p2, v4}, Lcom/daaw/ik5;->f(I)V

    iget-object p2, p0, Lcom/daaw/hd2;->b:Lcom/daaw/ik5;

    invoke-virtual {p2, v2}, Lcom/daaw/ik5;->e(I)V

    iget-object p2, p0, Lcom/daaw/hd2;->b:Lcom/daaw/ik5;

    invoke-virtual {p2, v0}, Lcom/daaw/ik5;->g(I)V

    iget-object p2, p0, Lcom/daaw/hd2;->b:Lcom/daaw/ik5;

    invoke-virtual {p2}, Lcom/daaw/ik5;->s()I

    move-result p2

    iget-object v3, p0, Lcom/daaw/hd2;->b:Lcom/daaw/ik5;

    invoke-virtual {v3}, Lcom/daaw/ik5;->s()I

    move-result v3

    and-int/lit16 v5, p2, 0x80

    if-eqz v5, :cond_6

    const/4 v5, 0x1

    goto :goto_4

    :cond_6
    const/4 v5, 0x0

    :goto_4
    iput-boolean v5, p0, Lcom/daaw/hd2;->e:Z

    and-int/lit8 p2, p2, 0xf

    shl-int/lit8 p2, p2, 0x8

    or-int/2addr p2, v3

    add-int/2addr p2, v2

    iput p2, p0, Lcom/daaw/hd2;->c:I

    iget-object p2, p0, Lcom/daaw/hd2;->b:Lcom/daaw/ik5;

    invoke-virtual {p2}, Lcom/daaw/ik5;->j()I

    move-result p2

    iget v2, p0, Lcom/daaw/hd2;->c:I

    if-ge p2, v2, :cond_3

    iget-object p2, p0, Lcom/daaw/hd2;->b:Lcom/daaw/ik5;

    invoke-virtual {p2}, Lcom/daaw/ik5;->j()I

    move-result p2

    add-int/2addr p2, p2

    invoke-static {v2, p2}, Ljava/lang/Math;->max(II)I

    move-result p2

    const/16 v2, 0x1002

    invoke-static {v2, p2}, Ljava/lang/Math;->min(II)I

    move-result p2

    iget-object v2, p0, Lcom/daaw/hd2;->b:Lcom/daaw/ik5;

    invoke-virtual {v2, p2}, Lcom/daaw/ik5;->H(I)V

    goto/16 :goto_2

    :cond_7
    invoke-virtual {p1}, Lcom/daaw/ik5;->i()I

    move-result v2

    iget v3, p0, Lcom/daaw/hd2;->c:I

    sub-int/2addr v3, p2

    invoke-static {v2, v3}, Ljava/lang/Math;->min(II)I

    move-result p2

    iget-object v2, p0, Lcom/daaw/hd2;->b:Lcom/daaw/ik5;

    invoke-virtual {v2}, Lcom/daaw/ik5;->h()[B

    move-result-object v2

    iget v3, p0, Lcom/daaw/hd2;->d:I

    invoke-virtual {p1, v2, v3, p2}, Lcom/daaw/ik5;->b([BII)V

    iget v2, p0, Lcom/daaw/hd2;->d:I

    add-int/2addr v2, p2

    iput v2, p0, Lcom/daaw/hd2;->d:I

    iget p2, p0, Lcom/daaw/hd2;->c:I

    if-ne v2, p2, :cond_3

    iget-boolean v2, p0, Lcom/daaw/hd2;->e:Z

    if-eqz v2, :cond_9

    iget-object v2, p0, Lcom/daaw/hd2;->b:Lcom/daaw/ik5;

    invoke-virtual {v2}, Lcom/daaw/ik5;->h()[B

    move-result-object v2

    invoke-static {v2, v4, p2, v1}, Lcom/daaw/it5;->Q([BIII)I

    move-result p2

    if-eqz p2, :cond_8

    iput-boolean v0, p0, Lcom/daaw/hd2;->f:Z

    return-void

    :cond_8
    iget-object p2, p0, Lcom/daaw/hd2;->b:Lcom/daaw/ik5;

    iget v2, p0, Lcom/daaw/hd2;->c:I

    add-int/lit8 v2, v2, -0x4

    invoke-virtual {p2, v2}, Lcom/daaw/ik5;->e(I)V

    goto :goto_5

    :cond_9
    iget-object v2, p0, Lcom/daaw/hd2;->b:Lcom/daaw/ik5;

    invoke-virtual {v2, p2}, Lcom/daaw/ik5;->e(I)V

    :goto_5
    iget-object p2, p0, Lcom/daaw/hd2;->b:Lcom/daaw/ik5;

    invoke-virtual {p2, v4}, Lcom/daaw/ik5;->f(I)V

    iget-object p2, p0, Lcom/daaw/hd2;->a:Lcom/daaw/gd2;

    iget-object v2, p0, Lcom/daaw/hd2;->b:Lcom/daaw/ik5;

    invoke-interface {p2, v2}, Lcom/daaw/gd2;->a(Lcom/daaw/ik5;)V

    goto/16 :goto_1

    :cond_a
    return-void
.end method

.method public final b(Lcom/daaw/cr5;Lcom/daaw/m09;Lcom/daaw/td2;)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/hd2;->a:Lcom/daaw/gd2;

    invoke-interface {v0, p1, p2, p3}, Lcom/daaw/gd2;->b(Lcom/daaw/cr5;Lcom/daaw/m09;Lcom/daaw/td2;)V

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/daaw/hd2;->f:Z

    return-void
.end method

.method public final zzc()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/daaw/hd2;->f:Z

    return-void
.end method
