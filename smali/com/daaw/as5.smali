.class public final Lcom/daaw/as5;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/qq5;


# instance fields
.field public final a:Lcom/daaw/zj4;

.field public final b:Landroid/content/Context;

.field public final c:Lcom/daaw/ia5;

.field public final d:Lcom/daaw/ri6;

.field public final e:Ljava/util/concurrent/Executor;

.field public final f:Lcom/daaw/ey6;


# direct methods
.method public constructor <init>(Lcom/daaw/zj4;Landroid/content/Context;Ljava/util/concurrent/Executor;Lcom/daaw/ia5;Lcom/daaw/ri6;Lcom/daaw/ey6;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/daaw/as5;->b:Landroid/content/Context;

    iput-object p1, p0, Lcom/daaw/as5;->a:Lcom/daaw/zj4;

    iput-object p3, p0, Lcom/daaw/as5;->e:Ljava/util/concurrent/Executor;

    iput-object p4, p0, Lcom/daaw/as5;->c:Lcom/daaw/ia5;

    iput-object p5, p0, Lcom/daaw/as5;->d:Lcom/daaw/ri6;

    iput-object p6, p0, Lcom/daaw/as5;->f:Lcom/daaw/ey6;

    return-void
.end method


# virtual methods
.method public final a(Lcom/daaw/fi6;Lcom/daaw/th6;)Z
    .locals 0

    iget-object p1, p2, Lcom/daaw/th6;->t:Lcom/daaw/yh6;

    if-eqz p1, :cond_0

    iget-object p1, p1, Lcom/daaw/yh6;->a:Ljava/lang/String;

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final b(Lcom/daaw/fi6;Lcom/daaw/th6;)Lcom/daaw/f77;
    .locals 2

    const/4 v0, 0x0

    invoke-static {v0}, Lcom/daaw/s67;->i(Ljava/lang/Object;)Lcom/daaw/f77;

    move-result-object v0

    new-instance v1, Lcom/daaw/ur5;

    invoke-direct {v1, p0, p1, p2}, Lcom/daaw/ur5;-><init>(Lcom/daaw/as5;Lcom/daaw/fi6;Lcom/daaw/th6;)V

    iget-object p1, p0, Lcom/daaw/as5;->e:Ljava/util/concurrent/Executor;

    invoke-static {v0, v1, p1}, Lcom/daaw/s67;->n(Lcom/daaw/f77;Lcom/daaw/w57;Ljava/util/concurrent/Executor;)Lcom/daaw/f77;

    move-result-object p1

    return-object p1
.end method

.method public final synthetic c(Lcom/daaw/fi6;Lcom/daaw/th6;Ljava/lang/Object;)Lcom/daaw/f77;
    .locals 6

    iget-object p3, p0, Lcom/daaw/as5;->b:Landroid/content/Context;

    iget-object v0, p2, Lcom/daaw/th6;->v:Ljava/util/List;

    invoke-static {p3, v0}, Lcom/daaw/vi6;->a(Landroid/content/Context;Ljava/util/List;)Lcom/google/android/gms/ads/internal/client/zzq;

    move-result-object p3

    iget-object v0, p0, Lcom/daaw/as5;->c:Lcom/daaw/ia5;

    iget-object v1, p1, Lcom/daaw/fi6;->b:Lcom/daaw/ei6;

    iget-object v1, v1, Lcom/daaw/ei6;->b:Lcom/daaw/wh6;

    invoke-virtual {v0, p3, p2, v1}, Lcom/daaw/ia5;->a(Lcom/google/android/gms/ads/internal/client/zzq;Lcom/daaw/th6;Lcom/daaw/wh6;)Lcom/daaw/a74;

    move-result-object v0

    iget-boolean v1, p2, Lcom/daaw/th6;->X:Z

    invoke-interface {v0, v1}, Lcom/daaw/a74;->X(Z)V

    sget-object v1, Lcom/daaw/g93;->Z6:Lcom/daaw/y83;

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/daaw/e93;

    move-result-object v2

    invoke-virtual {v2, v1}, Lcom/daaw/e93;->b(Lcom/daaw/y83;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_0

    iget-boolean v1, p2, Lcom/daaw/th6;->i0:Z

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/daaw/as5;->b:Landroid/content/Context;

    move-object v2, v0

    check-cast v2, Landroid/view/View;

    invoke-static {v1, v2, p2}, Lcom/daaw/qk4;->a(Landroid/content/Context;Landroid/view/View;Lcom/daaw/th6;)Lcom/daaw/qk4;

    move-result-object v1

    goto :goto_0

    :cond_0
    new-instance v1, Lcom/daaw/la5;

    iget-object v2, p0, Lcom/daaw/as5;->b:Landroid/content/Context;

    iget-object v3, p0, Lcom/daaw/as5;->f:Lcom/daaw/ey6;

    invoke-interface {v3, p2}, Lcom/daaw/ey6;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/google/android/gms/ads/internal/util/zzas;

    move-object v4, v0

    check-cast v4, Landroid/view/View;

    invoke-direct {v1, v2, v4, v3}, Lcom/daaw/la5;-><init>(Landroid/content/Context;Landroid/view/View;Lcom/google/android/gms/ads/internal/util/zzas;)V

    :goto_0
    iget-object v2, p0, Lcom/daaw/as5;->a:Lcom/daaw/zj4;

    new-instance v3, Lcom/daaw/rm4;

    const/4 v4, 0x0

    invoke-direct {v3, p1, p2, v4}, Lcom/daaw/rm4;-><init>(Lcom/daaw/fi6;Lcom/daaw/th6;Ljava/lang/String;)V

    new-instance p1, Lcom/daaw/gj4;

    new-instance v5, Lcom/daaw/vr5;

    invoke-direct {v5, v0}, Lcom/daaw/vr5;-><init>(Lcom/daaw/a74;)V

    invoke-static {p3}, Lcom/daaw/vi6;->c(Lcom/google/android/gms/ads/internal/client/zzq;)Lcom/daaw/uh6;

    move-result-object p3

    invoke-direct {p1, v1, v0, v5, p3}, Lcom/daaw/gj4;-><init>(Landroid/view/View;Lcom/daaw/a74;Lcom/daaw/xl4;Lcom/daaw/uh6;)V

    invoke-virtual {v2, v3, p1}, Lcom/daaw/zj4;->a(Lcom/daaw/rm4;Lcom/daaw/gj4;)Lcom/daaw/aj4;

    move-result-object p1

    invoke-virtual {p1}, Lcom/daaw/aj4;->j()Lcom/daaw/ha5;

    move-result-object p3

    const/4 v1, 0x0

    invoke-virtual {p3, v0, v1, v4}, Lcom/daaw/ha5;->i(Lcom/daaw/a74;ZLcom/daaw/bh3;)V

    invoke-virtual {p1}, Lcom/daaw/am4;->b()Lcom/daaw/gr4;

    move-result-object p3

    new-instance v1, Lcom/daaw/wr5;

    invoke-direct {v1, v0}, Lcom/daaw/wr5;-><init>(Lcom/daaw/a74;)V

    sget-object v2, Lcom/daaw/z04;->f:Lcom/daaw/g77;

    invoke-virtual {p3, v1, v2}, Lcom/daaw/kw4;->n0(Ljava/lang/Object;Ljava/util/concurrent/Executor;)V

    invoke-virtual {p1}, Lcom/daaw/aj4;->j()Lcom/daaw/ha5;

    iget-object p3, p2, Lcom/daaw/th6;->t:Lcom/daaw/yh6;

    iget-object v1, p3, Lcom/daaw/yh6;->b:Ljava/lang/String;

    iget-object p3, p3, Lcom/daaw/yh6;->a:Ljava/lang/String;

    invoke-static {v0, v1, p3}, Lcom/daaw/ha5;->j(Lcom/daaw/a74;Ljava/lang/String;Ljava/lang/String;)Lcom/daaw/f77;

    move-result-object p3

    iget-boolean p2, p2, Lcom/daaw/th6;->N:Z

    if-eqz p2, :cond_1

    new-instance p2, Lcom/daaw/xr5;

    invoke-direct {p2, v0}, Lcom/daaw/xr5;-><init>(Lcom/daaw/a74;)V

    iget-object v1, p0, Lcom/daaw/as5;->e:Ljava/util/concurrent/Executor;

    invoke-interface {p3, p2, v1}, Lcom/daaw/f77;->f(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    :cond_1
    new-instance p2, Lcom/daaw/yr5;

    invoke-direct {p2, p0, v0}, Lcom/daaw/yr5;-><init>(Lcom/daaw/as5;Lcom/daaw/a74;)V

    iget-object v0, p0, Lcom/daaw/as5;->e:Ljava/util/concurrent/Executor;

    invoke-interface {p3, p2, v0}, Lcom/daaw/f77;->f(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    new-instance p2, Lcom/daaw/zr5;

    invoke-direct {p2, p1}, Lcom/daaw/zr5;-><init>(Lcom/daaw/aj4;)V

    invoke-static {p3, p2, v2}, Lcom/daaw/s67;->m(Lcom/daaw/f77;Lcom/daaw/ey6;Ljava/util/concurrent/Executor;)Lcom/daaw/f77;

    move-result-object p1

    return-object p1
.end method

.method public final synthetic d(Lcom/daaw/a74;)V
    .locals 1

    invoke-interface {p1}, Lcom/daaw/a74;->v0()V

    invoke-interface {p1}, Lcom/daaw/a74;->zzs()Lcom/daaw/z74;

    move-result-object p1

    iget-object v0, p0, Lcom/daaw/as5;->d:Lcom/daaw/ri6;

    iget-object v0, v0, Lcom/daaw/ri6;->a:Lcom/google/android/gms/ads/internal/client/zzfl;

    if-eqz v0, :cond_0

    if-eqz p1, :cond_0

    invoke-virtual {p1, v0}, Lcom/daaw/z74;->j3(Lcom/google/android/gms/ads/internal/client/zzfl;)V

    :cond_0
    return-void
.end method
