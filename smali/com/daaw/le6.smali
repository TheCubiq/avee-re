.class public final Lcom/daaw/le6;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/cf6;


# instance fields
.field public final a:Lcom/daaw/fk6;

.field public final b:Ljava/util/concurrent/Executor;

.field public final c:Lcom/daaw/o67;


# direct methods
.method public constructor <init>(Lcom/daaw/fk6;Ljava/util/concurrent/Executor;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/daaw/je6;

    invoke-direct {v0, p0}, Lcom/daaw/je6;-><init>(Lcom/daaw/le6;)V

    iput-object v0, p0, Lcom/daaw/le6;->c:Lcom/daaw/o67;

    iput-object p1, p0, Lcom/daaw/le6;->a:Lcom/daaw/fk6;

    iput-object p2, p0, Lcom/daaw/le6;->b:Ljava/util/concurrent/Executor;

    return-void
.end method


# virtual methods
.method public final bridge synthetic a(Lcom/daaw/df6;Lcom/daaw/ye6;Ljava/lang/Object;)Lcom/daaw/f77;
    .locals 0

    const/4 p3, 0x0

    invoke-virtual {p0, p1, p2, p3}, Lcom/daaw/le6;->c(Lcom/daaw/df6;Lcom/daaw/ye6;Lcom/daaw/rp4;)Lcom/daaw/f77;

    move-result-object p1

    return-object p1
.end method

.method public final synthetic b(Lcom/daaw/rp4;Lcom/daaw/ue6;)Lcom/daaw/f77;
    .locals 4

    iget-object v0, p2, Lcom/daaw/ue6;->b:Lcom/daaw/rk6;

    iget-object p2, p2, Lcom/daaw/ue6;->a:Lcom/google/android/gms/internal/ads/zzccb;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    iget-object v2, p0, Lcom/daaw/le6;->a:Lcom/daaw/fk6;

    invoke-interface {v2, v0}, Lcom/daaw/fk6;->b(Lcom/daaw/rk6;)Lcom/daaw/qk6;

    move-result-object v2

    goto :goto_0

    :cond_0
    move-object v2, v1

    :goto_0
    if-nez v0, :cond_1

    invoke-static {v1}, Lcom/daaw/s67;->i(Ljava/lang/Object;)Lcom/daaw/f77;

    move-result-object p1

    goto :goto_1

    :cond_1
    if-eqz v2, :cond_2

    if-eqz p2, :cond_2

    invoke-interface {p1}, Lcom/daaw/rp4;->zzb()Lcom/daaw/jn4;

    move-result-object p1

    invoke-virtual {p1, p2}, Lcom/daaw/jn4;->h(Lcom/google/android/gms/internal/ads/zzccb;)Lcom/daaw/f77;

    move-result-object p1

    iget-object v1, p0, Lcom/daaw/le6;->c:Lcom/daaw/o67;

    iget-object v3, p0, Lcom/daaw/le6;->b:Ljava/util/concurrent/Executor;

    invoke-static {p1, v1, v3}, Lcom/daaw/s67;->r(Lcom/daaw/f77;Lcom/daaw/o67;Ljava/util/concurrent/Executor;)V

    :cond_2
    new-instance p1, Lcom/daaw/ke6;

    invoke-direct {p1, v0, p2, v2}, Lcom/daaw/ke6;-><init>(Lcom/daaw/rk6;Lcom/google/android/gms/internal/ads/zzccb;Lcom/daaw/qk6;)V

    invoke-static {p1}, Lcom/daaw/s67;->i(Ljava/lang/Object;)Lcom/daaw/f77;

    move-result-object p1

    :goto_1
    return-object p1
.end method

.method public final c(Lcom/daaw/df6;Lcom/daaw/ye6;Lcom/daaw/rp4;)Lcom/daaw/f77;
    .locals 1

    new-instance p1, Lcom/daaw/ve6;

    iget-object p2, p0, Lcom/daaw/le6;->a:Lcom/daaw/fk6;

    iget-object v0, p0, Lcom/daaw/le6;->b:Ljava/util/concurrent/Executor;

    invoke-direct {p1, p2, p3, v0}, Lcom/daaw/ve6;-><init>(Lcom/daaw/fk6;Lcom/daaw/rp4;Ljava/util/concurrent/Executor;)V

    invoke-virtual {p1}, Lcom/daaw/ve6;->c()Lcom/daaw/f77;

    move-result-object p1

    invoke-static {p1}, Lcom/daaw/j67;->D(Lcom/daaw/f77;)Lcom/daaw/j67;

    move-result-object p1

    new-instance p2, Lcom/daaw/he6;

    invoke-direct {p2, p0, p3}, Lcom/daaw/he6;-><init>(Lcom/daaw/le6;Lcom/daaw/rp4;)V

    iget-object p3, p0, Lcom/daaw/le6;->b:Ljava/util/concurrent/Executor;

    invoke-static {p1, p2, p3}, Lcom/daaw/s67;->n(Lcom/daaw/f77;Lcom/daaw/w57;Ljava/util/concurrent/Executor;)Lcom/daaw/f77;

    move-result-object p1

    new-instance p2, Lcom/daaw/ie6;

    invoke-direct {p2, p0}, Lcom/daaw/ie6;-><init>(Lcom/daaw/le6;)V

    const-class p3, Ljava/lang/Exception;

    iget-object v0, p0, Lcom/daaw/le6;->b:Ljava/util/concurrent/Executor;

    invoke-static {p1, p3, p2, v0}, Lcom/daaw/s67;->f(Lcom/daaw/f77;Ljava/lang/Class;Lcom/daaw/ey6;Ljava/util/concurrent/Executor;)Lcom/daaw/f77;

    move-result-object p1

    return-object p1
.end method

.method public final bridge synthetic zzd()Ljava/lang/Object;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method
