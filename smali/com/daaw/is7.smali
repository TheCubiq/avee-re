.class public final Lcom/daaw/is7;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/g78;


# instance fields
.field public final p:Lcom/daaw/ia8;

.field public final q:Lcom/daaw/fr7;

.field public r:Lcom/daaw/i98;

.field public s:Lcom/daaw/g78;

.field public t:Z

.field public u:Z


# direct methods
.method public constructor <init>(Lcom/daaw/fr7;Lcom/daaw/xp4;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/is7;->q:Lcom/daaw/fr7;

    new-instance p1, Lcom/daaw/ia8;

    invoke-direct {p1, p2}, Lcom/daaw/ia8;-><init>(Lcom/daaw/xp4;)V

    iput-object p1, p0, Lcom/daaw/is7;->p:Lcom/daaw/ia8;

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/daaw/is7;->t:Z

    return-void
.end method


# virtual methods
.method public final a(Z)J
    .locals 5

    iget-object v0, p0, Lcom/daaw/is7;->r:Lcom/daaw/i98;

    if-eqz v0, :cond_3

    invoke-interface {v0}, Lcom/daaw/i98;->zzM()Z

    move-result v0

    if-nez v0, :cond_3

    iget-object v0, p0, Lcom/daaw/is7;->r:Lcom/daaw/i98;

    invoke-interface {v0}, Lcom/daaw/i98;->zzN()Z

    move-result v0

    if-nez v0, :cond_0

    if-nez p1, :cond_3

    iget-object p1, p0, Lcom/daaw/is7;->r:Lcom/daaw/i98;

    invoke-interface {p1}, Lcom/daaw/i98;->j()Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lcom/daaw/is7;->s:Lcom/daaw/g78;

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {p1}, Lcom/daaw/g78;->zza()J

    move-result-wide v0

    iget-boolean v2, p0, Lcom/daaw/is7;->t:Z

    if-eqz v2, :cond_2

    iget-object v2, p0, Lcom/daaw/is7;->p:Lcom/daaw/ia8;

    invoke-virtual {v2}, Lcom/daaw/ia8;->zza()J

    move-result-wide v2

    cmp-long v4, v0, v2

    if-gez v4, :cond_1

    iget-object p1, p0, Lcom/daaw/is7;->p:Lcom/daaw/ia8;

    invoke-virtual {p1}, Lcom/daaw/ia8;->c()V

    goto :goto_1

    :cond_1
    const/4 v2, 0x0

    iput-boolean v2, p0, Lcom/daaw/is7;->t:Z

    iget-boolean v2, p0, Lcom/daaw/is7;->u:Z

    if-eqz v2, :cond_2

    iget-object v2, p0, Lcom/daaw/is7;->p:Lcom/daaw/ia8;

    invoke-virtual {v2}, Lcom/daaw/ia8;->b()V

    :cond_2
    iget-object v2, p0, Lcom/daaw/is7;->p:Lcom/daaw/ia8;

    invoke-virtual {v2, v0, v1}, Lcom/daaw/ia8;->a(J)V

    invoke-interface {p1}, Lcom/daaw/g78;->zzc()Lcom/daaw/pp3;

    move-result-object p1

    iget-object v0, p0, Lcom/daaw/is7;->p:Lcom/daaw/ia8;

    invoke-virtual {v0}, Lcom/daaw/ia8;->zzc()Lcom/daaw/pp3;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/daaw/pp3;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    iget-object v0, p0, Lcom/daaw/is7;->p:Lcom/daaw/ia8;

    invoke-virtual {v0, p1}, Lcom/daaw/ia8;->l(Lcom/daaw/pp3;)V

    iget-object v0, p0, Lcom/daaw/is7;->q:Lcom/daaw/fr7;

    invoke-interface {v0, p1}, Lcom/daaw/fr7;->b(Lcom/daaw/pp3;)V

    goto :goto_1

    :cond_3
    :goto_0
    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/daaw/is7;->t:Z

    iget-boolean p1, p0, Lcom/daaw/is7;->u:Z

    if-eqz p1, :cond_4

    iget-object p1, p0, Lcom/daaw/is7;->p:Lcom/daaw/ia8;

    invoke-virtual {p1}, Lcom/daaw/ia8;->b()V

    :cond_4
    :goto_1
    iget-boolean p1, p0, Lcom/daaw/is7;->t:Z

    if-eqz p1, :cond_5

    iget-object p1, p0, Lcom/daaw/is7;->p:Lcom/daaw/ia8;

    invoke-virtual {p1}, Lcom/daaw/ia8;->zza()J

    move-result-wide v0

    goto :goto_2

    :cond_5
    iget-object p1, p0, Lcom/daaw/is7;->s:Lcom/daaw/g78;

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {p1}, Lcom/daaw/g78;->zza()J

    move-result-wide v0

    :goto_2
    return-wide v0
.end method

.method public final b(Lcom/daaw/i98;)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/is7;->r:Lcom/daaw/i98;

    if-ne p1, v0, :cond_0

    const/4 p1, 0x0

    iput-object p1, p0, Lcom/daaw/is7;->s:Lcom/daaw/g78;

    iput-object p1, p0, Lcom/daaw/is7;->r:Lcom/daaw/i98;

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/daaw/is7;->t:Z

    :cond_0
    return-void
.end method

.method public final c(Lcom/daaw/i98;)V
    .locals 2

    invoke-interface {p1}, Lcom/daaw/i98;->zzi()Lcom/daaw/g78;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v1, p0, Lcom/daaw/is7;->s:Lcom/daaw/g78;

    if-eq v0, v1, :cond_1

    if-nez v1, :cond_0

    iput-object v0, p0, Lcom/daaw/is7;->s:Lcom/daaw/g78;

    iput-object p1, p0, Lcom/daaw/is7;->r:Lcom/daaw/i98;

    iget-object p1, p0, Lcom/daaw/is7;->p:Lcom/daaw/ia8;

    invoke-virtual {p1}, Lcom/daaw/ia8;->zzc()Lcom/daaw/pp3;

    move-result-object p1

    invoke-interface {v0, p1}, Lcom/daaw/g78;->l(Lcom/daaw/pp3;)V

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Multiple renderer media clocks enabled."

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    const/16 v0, 0x3e8

    invoke-static {p1, v0}, Lcom/daaw/vu7;->d(Ljava/lang/RuntimeException;I)Lcom/daaw/vu7;

    move-result-object p1

    throw p1

    :cond_1
    return-void
.end method

.method public final d(J)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/is7;->p:Lcom/daaw/ia8;

    invoke-virtual {v0, p1, p2}, Lcom/daaw/ia8;->a(J)V

    return-void
.end method

.method public final e()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/daaw/is7;->u:Z

    iget-object v0, p0, Lcom/daaw/is7;->p:Lcom/daaw/ia8;

    invoke-virtual {v0}, Lcom/daaw/ia8;->b()V

    return-void
.end method

.method public final f()V
    .locals 1

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/daaw/is7;->u:Z

    iget-object v0, p0, Lcom/daaw/is7;->p:Lcom/daaw/ia8;

    invoke-virtual {v0}, Lcom/daaw/ia8;->c()V

    return-void
.end method

.method public final l(Lcom/daaw/pp3;)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/is7;->s:Lcom/daaw/g78;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Lcom/daaw/g78;->l(Lcom/daaw/pp3;)V

    iget-object p1, p0, Lcom/daaw/is7;->s:Lcom/daaw/g78;

    invoke-interface {p1}, Lcom/daaw/g78;->zzc()Lcom/daaw/pp3;

    move-result-object p1

    :cond_0
    iget-object v0, p0, Lcom/daaw/is7;->p:Lcom/daaw/ia8;

    invoke-virtual {v0, p1}, Lcom/daaw/ia8;->l(Lcom/daaw/pp3;)V

    return-void
.end method

.method public final zza()J
    .locals 1

    const/4 v0, 0x0

    throw v0
.end method

.method public final zzc()Lcom/daaw/pp3;
    .locals 1

    iget-object v0, p0, Lcom/daaw/is7;->s:Lcom/daaw/g78;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/daaw/g78;->zzc()Lcom/daaw/pp3;

    move-result-object v0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/daaw/is7;->p:Lcom/daaw/ia8;

    invoke-virtual {v0}, Lcom/daaw/ia8;->zzc()Lcom/daaw/pp3;

    move-result-object v0

    :goto_0
    return-object v0
.end method
