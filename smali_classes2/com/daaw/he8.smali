.class public final Lcom/daaw/he8;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/ve8;


# instance fields
.field public final a:Lcom/daaw/zd8;

.field public final b:Lcom/daaw/og8;

.field public final c:Z

.field public final d:Lcom/daaw/o88;


# direct methods
.method public constructor <init>(Lcom/daaw/og8;Lcom/daaw/o88;Lcom/daaw/zd8;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/he8;->b:Lcom/daaw/og8;

    invoke-virtual {p2, p3}, Lcom/daaw/o88;->c(Lcom/daaw/zd8;)Z

    move-result p1

    iput-boolean p1, p0, Lcom/daaw/he8;->c:Z

    iput-object p2, p0, Lcom/daaw/he8;->d:Lcom/daaw/o88;

    iput-object p3, p0, Lcom/daaw/he8;->a:Lcom/daaw/zd8;

    return-void
.end method

.method public static h(Lcom/daaw/og8;Lcom/daaw/o88;Lcom/daaw/zd8;)Lcom/daaw/he8;
    .locals 1

    new-instance v0, Lcom/daaw/he8;

    invoke-direct {v0, p0, p1, p2}, Lcom/daaw/he8;-><init>(Lcom/daaw/og8;Lcom/daaw/o88;Lcom/daaw/zd8;)V

    return-object v0
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)I
    .locals 2

    iget-object v0, p0, Lcom/daaw/he8;->b:Lcom/daaw/og8;

    invoke-virtual {v0, p1}, Lcom/daaw/og8;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    iget-boolean v1, p0, Lcom/daaw/he8;->c:Z

    if-nez v1, :cond_0

    return v0

    :cond_0
    iget-object v0, p0, Lcom/daaw/he8;->d:Lcom/daaw/o88;

    invoke-virtual {v0, p1}, Lcom/daaw/o88;->a(Ljava/lang/Object;)Lcom/daaw/a98;

    const/4 p1, 0x0

    throw p1
.end method

.method public final b(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/he8;->b:Lcom/daaw/og8;

    invoke-virtual {v0, p1}, Lcom/daaw/og8;->g(Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/daaw/he8;->d:Lcom/daaw/o88;

    invoke-virtual {v0, p1}, Lcom/daaw/o88;->b(Ljava/lang/Object;)V

    return-void
.end method

.method public final c(Ljava/lang/Object;)Z
    .locals 1

    iget-object v0, p0, Lcom/daaw/he8;->d:Lcom/daaw/o88;

    invoke-virtual {v0, p1}, Lcom/daaw/o88;->a(Ljava/lang/Object;)Lcom/daaw/a98;

    const/4 p1, 0x0

    throw p1
.end method

.method public final d(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/he8;->b:Lcom/daaw/og8;

    invoke-static {v0, p1, p2}, Lcom/daaw/ze8;->f(Lcom/daaw/og8;Ljava/lang/Object;Ljava/lang/Object;)V

    iget-boolean v0, p0, Lcom/daaw/he8;->c:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/daaw/he8;->d:Lcom/daaw/o88;

    invoke-static {v0, p1, p2}, Lcom/daaw/ze8;->e(Lcom/daaw/o88;Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public final e(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 2

    iget-object v0, p0, Lcom/daaw/he8;->b:Lcom/daaw/og8;

    invoke-virtual {v0, p1}, Lcom/daaw/og8;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    iget-object v1, p0, Lcom/daaw/he8;->b:Lcom/daaw/og8;

    invoke-virtual {v1, p2}, Lcom/daaw/og8;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    iget-boolean v0, p0, Lcom/daaw/he8;->c:Z

    if-nez v0, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    iget-object v0, p0, Lcom/daaw/he8;->d:Lcom/daaw/o88;

    invoke-virtual {v0, p1}, Lcom/daaw/o88;->a(Ljava/lang/Object;)Lcom/daaw/a98;

    iget-object p1, p0, Lcom/daaw/he8;->d:Lcom/daaw/o88;

    invoke-virtual {p1, p2}, Lcom/daaw/o88;->a(Ljava/lang/Object;)Lcom/daaw/a98;

    const/4 p1, 0x0

    throw p1
.end method

.method public final f(Ljava/lang/Object;Lcom/daaw/ki8;)V
    .locals 0

    iget-object p2, p0, Lcom/daaw/he8;->d:Lcom/daaw/o88;

    invoke-virtual {p2, p1}, Lcom/daaw/o88;->a(Ljava/lang/Object;)Lcom/daaw/a98;

    const/4 p1, 0x0

    throw p1
.end method

.method public final g(Ljava/lang/Object;[BIILcom/daaw/e58;)V
    .locals 0

    move-object p2, p1

    check-cast p2, Lcom/daaw/ja8;

    iget-object p3, p2, Lcom/daaw/ja8;->zzc:Lcom/daaw/qg8;

    invoke-static {}, Lcom/daaw/qg8;->c()Lcom/daaw/qg8;

    move-result-object p4

    if-eq p3, p4, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {}, Lcom/daaw/qg8;->f()Lcom/daaw/qg8;

    move-result-object p3

    iput-object p3, p2, Lcom/daaw/ja8;->zzc:Lcom/daaw/qg8;

    :goto_0
    check-cast p1, Lcom/daaw/ba8;

    const/4 p1, 0x0

    throw p1
.end method

.method public final zza(Ljava/lang/Object;)I
    .locals 2

    iget-object v0, p0, Lcom/daaw/he8;->b:Lcom/daaw/og8;

    invoke-virtual {v0, p1}, Lcom/daaw/og8;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/daaw/og8;->b(Ljava/lang/Object;)I

    move-result v0

    iget-boolean v1, p0, Lcom/daaw/he8;->c:Z

    if-nez v1, :cond_0

    return v0

    :cond_0
    iget-object v0, p0, Lcom/daaw/he8;->d:Lcom/daaw/o88;

    invoke-virtual {v0, p1}, Lcom/daaw/o88;->a(Ljava/lang/Object;)Lcom/daaw/a98;

    const/4 p1, 0x0

    throw p1
.end method

.method public final zze()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lcom/daaw/he8;->a:Lcom/daaw/zd8;

    instance-of v1, v0, Lcom/daaw/ja8;

    if-eqz v1, :cond_0

    check-cast v0, Lcom/daaw/ja8;

    invoke-virtual {v0}, Lcom/daaw/ja8;->k()Lcom/daaw/ja8;

    move-result-object v0

    return-object v0

    :cond_0
    invoke-interface {v0}, Lcom/daaw/zd8;->a()Lcom/daaw/xd8;

    move-result-object v0

    invoke-interface {v0}, Lcom/daaw/xd8;->q()Lcom/daaw/zd8;

    move-result-object v0

    return-object v0
.end method
