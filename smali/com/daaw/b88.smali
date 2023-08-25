.class public final Lcom/daaw/b88;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/zr8;
.implements Lcom/daaw/ln8;


# instance fields
.field public final a:Lcom/daaw/h88;

.field public b:Lcom/daaw/yr8;

.field public c:Lcom/daaw/jn8;

.field public final synthetic d:Lcom/daaw/n88;


# direct methods
.method public constructor <init>(Lcom/daaw/n88;Lcom/daaw/h88;)V
    .locals 1

    iput-object p1, p0, Lcom/daaw/b88;->d:Lcom/daaw/n88;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lcom/daaw/n88;->d(Lcom/daaw/n88;)Lcom/daaw/yr8;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/b88;->b:Lcom/daaw/yr8;

    invoke-static {p1}, Lcom/daaw/n88;->c(Lcom/daaw/n88;)Lcom/daaw/jn8;

    move-result-object p1

    iput-object p1, p0, Lcom/daaw/b88;->c:Lcom/daaw/jn8;

    iput-object p2, p0, Lcom/daaw/b88;->a:Lcom/daaw/h88;

    return-void
.end method


# virtual methods
.method public final K(ILcom/daaw/pr8;Lcom/daaw/ar8;Lcom/daaw/lr8;)V
    .locals 0

    invoke-virtual {p0, p1, p2}, Lcom/daaw/b88;->a(ILcom/daaw/pr8;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/daaw/b88;->b:Lcom/daaw/yr8;

    invoke-virtual {p1, p3, p4}, Lcom/daaw/yr8;->k(Lcom/daaw/ar8;Lcom/daaw/lr8;)V

    :cond_0
    return-void
.end method

.method public final N(ILcom/daaw/pr8;Lcom/daaw/ar8;Lcom/daaw/lr8;Ljava/io/IOException;Z)V
    .locals 0

    invoke-virtual {p0, p1, p2}, Lcom/daaw/b88;->a(ILcom/daaw/pr8;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/daaw/b88;->b:Lcom/daaw/yr8;

    invoke-virtual {p1, p3, p4, p5, p6}, Lcom/daaw/yr8;->i(Lcom/daaw/ar8;Lcom/daaw/lr8;Ljava/io/IOException;Z)V

    :cond_0
    return-void
.end method

.method public final V(ILcom/daaw/pr8;Lcom/daaw/ar8;Lcom/daaw/lr8;)V
    .locals 0

    invoke-virtual {p0, p1, p2}, Lcom/daaw/b88;->a(ILcom/daaw/pr8;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/daaw/b88;->b:Lcom/daaw/yr8;

    invoke-virtual {p1, p3, p4}, Lcom/daaw/yr8;->g(Lcom/daaw/ar8;Lcom/daaw/lr8;)V

    :cond_0
    return-void
.end method

.method public final W(ILcom/daaw/pr8;Lcom/daaw/ar8;Lcom/daaw/lr8;)V
    .locals 0

    invoke-virtual {p0, p1, p2}, Lcom/daaw/b88;->a(ILcom/daaw/pr8;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/daaw/b88;->b:Lcom/daaw/yr8;

    invoke-virtual {p1, p3, p4}, Lcom/daaw/yr8;->e(Lcom/daaw/ar8;Lcom/daaw/lr8;)V

    :cond_0
    return-void
.end method

.method public final a(ILcom/daaw/pr8;)Z
    .locals 9

    const/4 v0, 0x0

    if-eqz p2, :cond_3

    iget-object v1, p0, Lcom/daaw/b88;->a:Lcom/daaw/h88;

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    iget-object v4, v1, Lcom/daaw/h88;->c:Ljava/util/List;

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v4

    if-ge v3, v4, :cond_1

    iget-object v4, v1, Lcom/daaw/h88;->c:Ljava/util/List;

    invoke-interface {v4, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/daaw/pr8;

    iget-wide v4, v4, Lcom/daaw/md3;->d:J

    iget-wide v6, p2, Lcom/daaw/md3;->d:J

    cmp-long v8, v4, v6

    if-nez v8, :cond_0

    iget-object v0, p2, Lcom/daaw/md3;->a:Ljava/lang/Object;

    iget-object v1, v1, Lcom/daaw/h88;->b:Ljava/lang/Object;

    invoke-static {v1, v0}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    move-result-object v0

    invoke-virtual {p2, v0}, Lcom/daaw/pr8;->c(Ljava/lang/Object;)Lcom/daaw/pr8;

    move-result-object p2

    move-object v0, p2

    goto :goto_1

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    :goto_1
    if-eqz v0, :cond_2

    goto :goto_2

    :cond_2
    return v2

    :cond_3
    :goto_2
    iget-object p2, p0, Lcom/daaw/b88;->a:Lcom/daaw/h88;

    iget p2, p2, Lcom/daaw/h88;->d:I

    add-int/2addr p1, p2

    iget-object p2, p0, Lcom/daaw/b88;->b:Lcom/daaw/yr8;

    iget v1, p2, Lcom/daaw/yr8;->a:I

    if-ne v1, p1, :cond_4

    iget-object p2, p2, Lcom/daaw/yr8;->b:Lcom/daaw/pr8;

    invoke-static {p2, v0}, Lcom/daaw/it5;->t(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_5

    :cond_4
    iget-object p2, p0, Lcom/daaw/b88;->d:Lcom/daaw/n88;

    invoke-static {p2}, Lcom/daaw/n88;->d(Lcom/daaw/n88;)Lcom/daaw/yr8;

    move-result-object p2

    const-wide/16 v1, 0x0

    invoke-virtual {p2, p1, v0, v1, v2}, Lcom/daaw/yr8;->a(ILcom/daaw/pr8;J)Lcom/daaw/yr8;

    move-result-object p2

    iput-object p2, p0, Lcom/daaw/b88;->b:Lcom/daaw/yr8;

    :cond_5
    iget-object p2, p0, Lcom/daaw/b88;->c:Lcom/daaw/jn8;

    iget v1, p2, Lcom/daaw/jn8;->a:I

    if-ne v1, p1, :cond_6

    iget-object p2, p2, Lcom/daaw/jn8;->b:Lcom/daaw/pr8;

    invoke-static {p2, v0}, Lcom/daaw/it5;->t(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_7

    :cond_6
    iget-object p2, p0, Lcom/daaw/b88;->d:Lcom/daaw/n88;

    invoke-static {p2}, Lcom/daaw/n88;->c(Lcom/daaw/n88;)Lcom/daaw/jn8;

    move-result-object p2

    invoke-virtual {p2, p1, v0}, Lcom/daaw/jn8;->a(ILcom/daaw/pr8;)Lcom/daaw/jn8;

    move-result-object p1

    iput-object p1, p0, Lcom/daaw/b88;->c:Lcom/daaw/jn8;

    :cond_7
    const/4 p1, 0x1

    return p1
.end method

.method public final d(ILcom/daaw/pr8;Lcom/daaw/lr8;)V
    .locals 0

    invoke-virtual {p0, p1, p2}, Lcom/daaw/b88;->a(ILcom/daaw/pr8;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/daaw/b88;->b:Lcom/daaw/yr8;

    invoke-virtual {p1, p3}, Lcom/daaw/yr8;->c(Lcom/daaw/lr8;)V

    :cond_0
    return-void
.end method
