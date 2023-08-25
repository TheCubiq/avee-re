.class public final Lcom/daaw/mw0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/eo1;


# instance fields
.field public final a:Lcom/daaw/wv;

.field public final b:Lcom/daaw/qv0;

.field public c:I

.field public d:I

.field public e:Lcom/daaw/ol1;

.field public f:Z

.field public g:Z

.field public h:Z

.field public i:I

.field public j:I

.field public k:Z

.field public l:J


# direct methods
.method public constructor <init>(Lcom/daaw/wv;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/mw0;->a:Lcom/daaw/wv;

    new-instance p1, Lcom/daaw/qv0;

    const/16 v0, 0xa

    new-array v0, v0, [B

    invoke-direct {p1, v0}, Lcom/daaw/qv0;-><init>([B)V

    iput-object p1, p0, Lcom/daaw/mw0;->b:Lcom/daaw/qv0;

    const/4 p1, 0x0

    iput p1, p0, Lcom/daaw/mw0;->c:I

    return-void
.end method


# virtual methods
.method public final a(Lcom/daaw/rv0;Z)V
    .locals 6

    const/4 v0, -0x1

    const/4 v1, 0x1

    const/4 v2, 0x3

    if-eqz p2, :cond_1

    iget p2, p0, Lcom/daaw/mw0;->c:I

    if-eq p2, v2, :cond_0

    goto :goto_0

    :cond_0
    iget p2, p0, Lcom/daaw/mw0;->j:I

    if-eq p2, v0, :cond_5

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Unexpected start indicator: expected "

    invoke-virtual {p2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v3, p0, Lcom/daaw/mw0;->j:I

    invoke-virtual {p2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v3, " more bytes"

    invoke-virtual {p2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_3

    :goto_0
    invoke-virtual {p0, v1}, Lcom/daaw/mw0;->g(I)V

    :cond_1
    :goto_1
    invoke-virtual {p1}, Lcom/daaw/rv0;->a()I

    move-result p2

    if-lez p2, :cond_a

    iget p2, p0, Lcom/daaw/mw0;->c:I

    if-eqz p2, :cond_9

    const/4 v3, 0x0

    const/4 v4, 0x2

    if-eq p2, v1, :cond_7

    if-eq p2, v4, :cond_6

    if-eq p2, v2, :cond_2

    goto :goto_1

    :cond_2
    invoke-virtual {p1}, Lcom/daaw/rv0;->a()I

    move-result p2

    iget v4, p0, Lcom/daaw/mw0;->j:I

    if-ne v4, v0, :cond_3

    goto :goto_2

    :cond_3
    sub-int v3, p2, v4

    :goto_2
    if-lez v3, :cond_4

    sub-int/2addr p2, v3

    invoke-virtual {p1}, Lcom/daaw/rv0;->c()I

    move-result v3

    add-int/2addr v3, p2

    invoke-virtual {p1, v3}, Lcom/daaw/rv0;->I(I)V

    :cond_4
    iget-object v3, p0, Lcom/daaw/mw0;->a:Lcom/daaw/wv;

    invoke-interface {v3, p1}, Lcom/daaw/wv;->a(Lcom/daaw/rv0;)V

    iget v3, p0, Lcom/daaw/mw0;->j:I

    if-eq v3, v0, :cond_1

    sub-int/2addr v3, p2

    iput v3, p0, Lcom/daaw/mw0;->j:I

    if-nez v3, :cond_1

    :cond_5
    :goto_3
    iget-object p2, p0, Lcom/daaw/mw0;->a:Lcom/daaw/wv;

    invoke-interface {p2}, Lcom/daaw/wv;->c()V

    goto :goto_0

    :cond_6
    const/16 p2, 0xa

    iget v3, p0, Lcom/daaw/mw0;->i:I

    invoke-static {p2, v3}, Ljava/lang/Math;->min(II)I

    move-result p2

    iget-object v3, p0, Lcom/daaw/mw0;->b:Lcom/daaw/qv0;

    iget-object v3, v3, Lcom/daaw/qv0;->a:[B

    invoke-virtual {p0, p1, v3, p2}, Lcom/daaw/mw0;->d(Lcom/daaw/rv0;[BI)Z

    move-result p2

    if-eqz p2, :cond_1

    const/4 p2, 0x0

    iget v3, p0, Lcom/daaw/mw0;->i:I

    invoke-virtual {p0, p1, p2, v3}, Lcom/daaw/mw0;->d(Lcom/daaw/rv0;[BI)Z

    move-result p2

    if-eqz p2, :cond_1

    invoke-virtual {p0}, Lcom/daaw/mw0;->f()V

    iget-object p2, p0, Lcom/daaw/mw0;->a:Lcom/daaw/wv;

    iget-wide v3, p0, Lcom/daaw/mw0;->l:J

    iget-boolean v5, p0, Lcom/daaw/mw0;->k:Z

    invoke-interface {p2, v3, v4, v5}, Lcom/daaw/wv;->e(JZ)V

    invoke-virtual {p0, v2}, Lcom/daaw/mw0;->g(I)V

    goto :goto_1

    :cond_7
    iget-object p2, p0, Lcom/daaw/mw0;->b:Lcom/daaw/qv0;

    iget-object p2, p2, Lcom/daaw/qv0;->a:[B

    const/16 v5, 0x9

    invoke-virtual {p0, p1, p2, v5}, Lcom/daaw/mw0;->d(Lcom/daaw/rv0;[BI)Z

    move-result p2

    if-eqz p2, :cond_1

    invoke-virtual {p0}, Lcom/daaw/mw0;->e()Z

    move-result p2

    if-eqz p2, :cond_8

    const/4 v3, 0x2

    :cond_8
    invoke-virtual {p0, v3}, Lcom/daaw/mw0;->g(I)V

    goto :goto_1

    :cond_9
    invoke-virtual {p1}, Lcom/daaw/rv0;->a()I

    move-result p2

    invoke-virtual {p1, p2}, Lcom/daaw/rv0;->K(I)V

    goto/16 :goto_1

    :cond_a
    return-void
.end method

.method public final b()V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lcom/daaw/mw0;->c:I

    iput v0, p0, Lcom/daaw/mw0;->d:I

    iput-boolean v0, p0, Lcom/daaw/mw0;->h:Z

    iget-object v0, p0, Lcom/daaw/mw0;->a:Lcom/daaw/wv;

    invoke-interface {v0}, Lcom/daaw/wv;->b()V

    return-void
.end method

.method public c(Lcom/daaw/ol1;Lcom/daaw/d00;Lcom/daaw/eo1$d;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/mw0;->e:Lcom/daaw/ol1;

    iget-object p1, p0, Lcom/daaw/mw0;->a:Lcom/daaw/wv;

    invoke-interface {p1, p2, p3}, Lcom/daaw/wv;->d(Lcom/daaw/d00;Lcom/daaw/eo1$d;)V

    return-void
.end method

.method public final d(Lcom/daaw/rv0;[BI)Z
    .locals 3

    invoke-virtual {p1}, Lcom/daaw/rv0;->a()I

    move-result v0

    iget v1, p0, Lcom/daaw/mw0;->d:I

    sub-int v1, p3, v1

    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v0

    const/4 v1, 0x1

    if-gtz v0, :cond_0

    return v1

    :cond_0
    if-nez p2, :cond_1

    invoke-virtual {p1, v0}, Lcom/daaw/rv0;->K(I)V

    goto :goto_0

    :cond_1
    iget v2, p0, Lcom/daaw/mw0;->d:I

    invoke-virtual {p1, p2, v2, v0}, Lcom/daaw/rv0;->g([BII)V

    :goto_0
    iget p1, p0, Lcom/daaw/mw0;->d:I

    add-int/2addr p1, v0

    iput p1, p0, Lcom/daaw/mw0;->d:I

    if-ne p1, p3, :cond_2

    goto :goto_1

    :cond_2
    const/4 v1, 0x0

    :goto_1
    return v1
.end method

.method public final e()Z
    .locals 6

    iget-object v0, p0, Lcom/daaw/mw0;->b:Lcom/daaw/qv0;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/daaw/qv0;->m(I)V

    iget-object v0, p0, Lcom/daaw/mw0;->b:Lcom/daaw/qv0;

    const/16 v2, 0x18

    invoke-virtual {v0, v2}, Lcom/daaw/qv0;->h(I)I

    move-result v0

    const/4 v2, -0x1

    const/4 v3, 0x1

    if-eq v0, v3, :cond_0

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Unexpected start code prefix: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    iput v2, p0, Lcom/daaw/mw0;->j:I

    return v1

    :cond_0
    iget-object v0, p0, Lcom/daaw/mw0;->b:Lcom/daaw/qv0;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lcom/daaw/qv0;->o(I)V

    iget-object v0, p0, Lcom/daaw/mw0;->b:Lcom/daaw/qv0;

    const/16 v4, 0x10

    invoke-virtual {v0, v4}, Lcom/daaw/qv0;->h(I)I

    move-result v0

    iget-object v4, p0, Lcom/daaw/mw0;->b:Lcom/daaw/qv0;

    const/4 v5, 0x5

    invoke-virtual {v4, v5}, Lcom/daaw/qv0;->o(I)V

    iget-object v4, p0, Lcom/daaw/mw0;->b:Lcom/daaw/qv0;

    invoke-virtual {v4}, Lcom/daaw/qv0;->g()Z

    move-result v4

    iput-boolean v4, p0, Lcom/daaw/mw0;->k:Z

    iget-object v4, p0, Lcom/daaw/mw0;->b:Lcom/daaw/qv0;

    const/4 v5, 0x2

    invoke-virtual {v4, v5}, Lcom/daaw/qv0;->o(I)V

    iget-object v4, p0, Lcom/daaw/mw0;->b:Lcom/daaw/qv0;

    invoke-virtual {v4}, Lcom/daaw/qv0;->g()Z

    move-result v4

    iput-boolean v4, p0, Lcom/daaw/mw0;->f:Z

    iget-object v4, p0, Lcom/daaw/mw0;->b:Lcom/daaw/qv0;

    invoke-virtual {v4}, Lcom/daaw/qv0;->g()Z

    move-result v4

    iput-boolean v4, p0, Lcom/daaw/mw0;->g:Z

    iget-object v4, p0, Lcom/daaw/mw0;->b:Lcom/daaw/qv0;

    const/4 v5, 0x6

    invoke-virtual {v4, v5}, Lcom/daaw/qv0;->o(I)V

    iget-object v4, p0, Lcom/daaw/mw0;->b:Lcom/daaw/qv0;

    invoke-virtual {v4, v1}, Lcom/daaw/qv0;->h(I)I

    move-result v1

    iput v1, p0, Lcom/daaw/mw0;->i:I

    if-nez v0, :cond_1

    iput v2, p0, Lcom/daaw/mw0;->j:I

    goto :goto_0

    :cond_1
    add-int/2addr v0, v5

    add-int/lit8 v0, v0, -0x9

    sub-int/2addr v0, v1

    iput v0, p0, Lcom/daaw/mw0;->j:I

    :goto_0
    return v3
.end method

.method public final f()V
    .locals 10

    iget-object v0, p0, Lcom/daaw/mw0;->b:Lcom/daaw/qv0;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/daaw/qv0;->m(I)V

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide v0, p0, Lcom/daaw/mw0;->l:J

    iget-boolean v0, p0, Lcom/daaw/mw0;->f:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/daaw/mw0;->b:Lcom/daaw/qv0;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Lcom/daaw/qv0;->o(I)V

    iget-object v0, p0, Lcom/daaw/mw0;->b:Lcom/daaw/qv0;

    const/4 v2, 0x3

    invoke-virtual {v0, v2}, Lcom/daaw/qv0;->h(I)I

    move-result v0

    int-to-long v3, v0

    const/16 v0, 0x1e

    shl-long/2addr v3, v0

    iget-object v5, p0, Lcom/daaw/mw0;->b:Lcom/daaw/qv0;

    const/4 v6, 0x1

    invoke-virtual {v5, v6}, Lcom/daaw/qv0;->o(I)V

    iget-object v5, p0, Lcom/daaw/mw0;->b:Lcom/daaw/qv0;

    const/16 v7, 0xf

    invoke-virtual {v5, v7}, Lcom/daaw/qv0;->h(I)I

    move-result v5

    shl-int/2addr v5, v7

    int-to-long v8, v5

    or-long/2addr v3, v8

    iget-object v5, p0, Lcom/daaw/mw0;->b:Lcom/daaw/qv0;

    invoke-virtual {v5, v6}, Lcom/daaw/qv0;->o(I)V

    iget-object v5, p0, Lcom/daaw/mw0;->b:Lcom/daaw/qv0;

    invoke-virtual {v5, v7}, Lcom/daaw/qv0;->h(I)I

    move-result v5

    int-to-long v8, v5

    or-long/2addr v3, v8

    iget-object v5, p0, Lcom/daaw/mw0;->b:Lcom/daaw/qv0;

    invoke-virtual {v5, v6}, Lcom/daaw/qv0;->o(I)V

    iget-boolean v5, p0, Lcom/daaw/mw0;->h:Z

    if-nez v5, :cond_0

    iget-boolean v5, p0, Lcom/daaw/mw0;->g:Z

    if-eqz v5, :cond_0

    iget-object v5, p0, Lcom/daaw/mw0;->b:Lcom/daaw/qv0;

    invoke-virtual {v5, v1}, Lcom/daaw/qv0;->o(I)V

    iget-object v1, p0, Lcom/daaw/mw0;->b:Lcom/daaw/qv0;

    invoke-virtual {v1, v2}, Lcom/daaw/qv0;->h(I)I

    move-result v1

    int-to-long v1, v1

    shl-long v0, v1, v0

    iget-object v2, p0, Lcom/daaw/mw0;->b:Lcom/daaw/qv0;

    invoke-virtual {v2, v6}, Lcom/daaw/qv0;->o(I)V

    iget-object v2, p0, Lcom/daaw/mw0;->b:Lcom/daaw/qv0;

    invoke-virtual {v2, v7}, Lcom/daaw/qv0;->h(I)I

    move-result v2

    shl-int/2addr v2, v7

    int-to-long v8, v2

    or-long/2addr v0, v8

    iget-object v2, p0, Lcom/daaw/mw0;->b:Lcom/daaw/qv0;

    invoke-virtual {v2, v6}, Lcom/daaw/qv0;->o(I)V

    iget-object v2, p0, Lcom/daaw/mw0;->b:Lcom/daaw/qv0;

    invoke-virtual {v2, v7}, Lcom/daaw/qv0;->h(I)I

    move-result v2

    int-to-long v7, v2

    or-long/2addr v0, v7

    iget-object v2, p0, Lcom/daaw/mw0;->b:Lcom/daaw/qv0;

    invoke-virtual {v2, v6}, Lcom/daaw/qv0;->o(I)V

    iget-object v2, p0, Lcom/daaw/mw0;->e:Lcom/daaw/ol1;

    invoke-virtual {v2, v0, v1}, Lcom/daaw/ol1;->b(J)J

    iput-boolean v6, p0, Lcom/daaw/mw0;->h:Z

    :cond_0
    iget-object v0, p0, Lcom/daaw/mw0;->e:Lcom/daaw/ol1;

    invoke-virtual {v0, v3, v4}, Lcom/daaw/ol1;->b(J)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/daaw/mw0;->l:J

    :cond_1
    return-void
.end method

.method public final g(I)V
    .locals 0

    iput p1, p0, Lcom/daaw/mw0;->c:I

    const/4 p1, 0x0

    iput p1, p0, Lcom/daaw/mw0;->d:I

    return-void
.end method
