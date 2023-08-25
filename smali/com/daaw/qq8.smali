.class public final Lcom/daaw/qq8;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/zr8;
.implements Lcom/daaw/ln8;


# instance fields
.field public final a:Ljava/lang/Object;

.field public b:Lcom/daaw/yr8;

.field public c:Lcom/daaw/jn8;

.field public final synthetic d:Lcom/daaw/sq8;


# direct methods
.method public constructor <init>(Lcom/daaw/sq8;Ljava/lang/Object;)V
    .locals 2

    iput-object p1, p0, Lcom/daaw/qq8;->d:Lcom/daaw/sq8;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/daaw/lq8;->s(Lcom/daaw/pr8;)Lcom/daaw/yr8;

    move-result-object v1

    iput-object v1, p0, Lcom/daaw/qq8;->b:Lcom/daaw/yr8;

    invoke-virtual {p1, v0}, Lcom/daaw/lq8;->q(Lcom/daaw/pr8;)Lcom/daaw/jn8;

    move-result-object p1

    iput-object p1, p0, Lcom/daaw/qq8;->c:Lcom/daaw/jn8;

    iput-object p2, p0, Lcom/daaw/qq8;->a:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final K(ILcom/daaw/pr8;Lcom/daaw/ar8;Lcom/daaw/lr8;)V
    .locals 0

    invoke-virtual {p0, p1, p2}, Lcom/daaw/qq8;->k(ILcom/daaw/pr8;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/daaw/qq8;->b:Lcom/daaw/yr8;

    invoke-virtual {p0, p4}, Lcom/daaw/qq8;->a(Lcom/daaw/lr8;)Lcom/daaw/lr8;

    move-result-object p2

    invoke-virtual {p1, p3, p2}, Lcom/daaw/yr8;->k(Lcom/daaw/ar8;Lcom/daaw/lr8;)V

    :cond_0
    return-void
.end method

.method public final N(ILcom/daaw/pr8;Lcom/daaw/ar8;Lcom/daaw/lr8;Ljava/io/IOException;Z)V
    .locals 0

    invoke-virtual {p0, p1, p2}, Lcom/daaw/qq8;->k(ILcom/daaw/pr8;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/daaw/qq8;->b:Lcom/daaw/yr8;

    invoke-virtual {p0, p4}, Lcom/daaw/qq8;->a(Lcom/daaw/lr8;)Lcom/daaw/lr8;

    move-result-object p2

    invoke-virtual {p1, p3, p2, p5, p6}, Lcom/daaw/yr8;->i(Lcom/daaw/ar8;Lcom/daaw/lr8;Ljava/io/IOException;Z)V

    :cond_0
    return-void
.end method

.method public final V(ILcom/daaw/pr8;Lcom/daaw/ar8;Lcom/daaw/lr8;)V
    .locals 0

    invoke-virtual {p0, p1, p2}, Lcom/daaw/qq8;->k(ILcom/daaw/pr8;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/daaw/qq8;->b:Lcom/daaw/yr8;

    invoke-virtual {p0, p4}, Lcom/daaw/qq8;->a(Lcom/daaw/lr8;)Lcom/daaw/lr8;

    move-result-object p2

    invoke-virtual {p1, p3, p2}, Lcom/daaw/yr8;->g(Lcom/daaw/ar8;Lcom/daaw/lr8;)V

    :cond_0
    return-void
.end method

.method public final W(ILcom/daaw/pr8;Lcom/daaw/ar8;Lcom/daaw/lr8;)V
    .locals 0

    invoke-virtual {p0, p1, p2}, Lcom/daaw/qq8;->k(ILcom/daaw/pr8;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/daaw/qq8;->b:Lcom/daaw/yr8;

    invoke-virtual {p0, p4}, Lcom/daaw/qq8;->a(Lcom/daaw/lr8;)Lcom/daaw/lr8;

    move-result-object p2

    invoke-virtual {p1, p3, p2}, Lcom/daaw/yr8;->e(Lcom/daaw/ar8;Lcom/daaw/lr8;)V

    :cond_0
    return-void
.end method

.method public final a(Lcom/daaw/lr8;)Lcom/daaw/lr8;
    .locals 12

    iget-object v0, p0, Lcom/daaw/qq8;->d:Lcom/daaw/sq8;

    iget-object v1, p0, Lcom/daaw/qq8;->a:Ljava/lang/Object;

    iget-wide v8, p1, Lcom/daaw/lr8;->c:J

    invoke-virtual {v0, v1, v8, v9}, Lcom/daaw/sq8;->C(Ljava/lang/Object;J)J

    iget-object v0, p0, Lcom/daaw/qq8;->d:Lcom/daaw/sq8;

    iget-object v1, p0, Lcom/daaw/qq8;->a:Ljava/lang/Object;

    iget-wide v10, p1, Lcom/daaw/lr8;->d:J

    invoke-virtual {v0, v1, v10, v11}, Lcom/daaw/sq8;->C(Ljava/lang/Object;J)J

    iget-wide v0, p1, Lcom/daaw/lr8;->c:J

    cmp-long v2, v8, v0

    if-nez v2, :cond_0

    iget-wide v0, p1, Lcom/daaw/lr8;->d:J

    cmp-long v2, v10, v0

    if-nez v2, :cond_0

    return-object p1

    :cond_0
    new-instance v0, Lcom/daaw/lr8;

    const/4 v3, 0x1

    iget v4, p1, Lcom/daaw/lr8;->a:I

    iget-object v5, p1, Lcom/daaw/lr8;->b:Lcom/daaw/f92;

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v2, v0

    invoke-direct/range {v2 .. v11}, Lcom/daaw/lr8;-><init>(IILcom/daaw/f92;ILjava/lang/Object;JJ)V

    return-object v0
.end method

.method public final d(ILcom/daaw/pr8;Lcom/daaw/lr8;)V
    .locals 0

    invoke-virtual {p0, p1, p2}, Lcom/daaw/qq8;->k(ILcom/daaw/pr8;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/daaw/qq8;->b:Lcom/daaw/yr8;

    invoke-virtual {p0, p3}, Lcom/daaw/qq8;->a(Lcom/daaw/lr8;)Lcom/daaw/lr8;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/daaw/yr8;->c(Lcom/daaw/lr8;)V

    :cond_0
    return-void
.end method

.method public final k(ILcom/daaw/pr8;)Z
    .locals 3

    if-eqz p2, :cond_1

    iget-object v0, p0, Lcom/daaw/qq8;->d:Lcom/daaw/sq8;

    iget-object v1, p0, Lcom/daaw/qq8;->a:Ljava/lang/Object;

    invoke-virtual {v0, v1, p2}, Lcom/daaw/sq8;->D(Ljava/lang/Object;Lcom/daaw/pr8;)Lcom/daaw/pr8;

    move-result-object p2

    if-eqz p2, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    return p1

    :cond_1
    const/4 p2, 0x0

    :goto_0
    iget-object v0, p0, Lcom/daaw/qq8;->d:Lcom/daaw/sq8;

    iget-object v1, p0, Lcom/daaw/qq8;->a:Ljava/lang/Object;

    invoke-virtual {v0, v1, p1}, Lcom/daaw/sq8;->B(Ljava/lang/Object;I)I

    iget-object v0, p0, Lcom/daaw/qq8;->b:Lcom/daaw/yr8;

    iget v1, v0, Lcom/daaw/yr8;->a:I

    if-ne v1, p1, :cond_2

    iget-object v0, v0, Lcom/daaw/yr8;->b:Lcom/daaw/pr8;

    invoke-static {v0, p2}, Lcom/daaw/it5;->t(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    :cond_2
    iget-object v0, p0, Lcom/daaw/qq8;->d:Lcom/daaw/sq8;

    const-wide/16 v1, 0x0

    invoke-virtual {v0, p1, p2, v1, v2}, Lcom/daaw/lq8;->t(ILcom/daaw/pr8;J)Lcom/daaw/yr8;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/qq8;->b:Lcom/daaw/yr8;

    :cond_3
    iget-object v0, p0, Lcom/daaw/qq8;->c:Lcom/daaw/jn8;

    iget v1, v0, Lcom/daaw/jn8;->a:I

    if-ne v1, p1, :cond_4

    iget-object v0, v0, Lcom/daaw/jn8;->b:Lcom/daaw/pr8;

    invoke-static {v0, p2}, Lcom/daaw/it5;->t(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_5

    :cond_4
    iget-object v0, p0, Lcom/daaw/qq8;->d:Lcom/daaw/sq8;

    invoke-virtual {v0, p1, p2}, Lcom/daaw/lq8;->r(ILcom/daaw/pr8;)Lcom/daaw/jn8;

    move-result-object p1

    iput-object p1, p0, Lcom/daaw/qq8;->c:Lcom/daaw/jn8;

    :cond_5
    const/4 p1, 0x1

    return p1
.end method
