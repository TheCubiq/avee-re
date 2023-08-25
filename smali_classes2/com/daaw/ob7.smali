.class public final Lcom/daaw/ob7;
.super Lcom/daaw/r95;
.source ""


# instance fields
.field public final p:Lcom/daaw/yb8;

.field public q:Ljava/lang/Boolean;

.field public r:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/daaw/yb8;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Lcom/daaw/r95;-><init>()V

    invoke-static {p1}, Lcom/daaw/ry0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lcom/daaw/ob7;->p:Lcom/daaw/yb8;

    const/4 p1, 0x0

    iput-object p1, p0, Lcom/daaw/ob7;->r:Ljava/lang/String;

    return-void
.end method

.method public static bridge synthetic g3(Lcom/daaw/ob7;)Lcom/daaw/yb8;
    .locals 0

    iget-object p0, p0, Lcom/daaw/ob7;->p:Lcom/daaw/yb8;

    return-object p0
.end method


# virtual methods
.method public final C1(Lcom/google/android/gms/measurement/internal/zzkw;Lcom/google/android/gms/measurement/internal/zzq;)V
    .locals 1

    invoke-static {p1}, Lcom/daaw/ry0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v0, 0x0

    invoke-virtual {p0, p2, v0}, Lcom/daaw/ob7;->k3(Lcom/google/android/gms/measurement/internal/zzq;Z)V

    new-instance v0, Lcom/daaw/c77;

    invoke-direct {v0, p0, p1, p2}, Lcom/daaw/c77;-><init>(Lcom/daaw/ob7;Lcom/google/android/gms/measurement/internal/zzkw;Lcom/google/android/gms/measurement/internal/zzq;)V

    invoke-virtual {p0, v0}, Lcom/daaw/ob7;->j3(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final C2(Lcom/google/android/gms/measurement/internal/zzac;Lcom/google/android/gms/measurement/internal/zzq;)V
    .locals 1

    invoke-static {p1}, Lcom/daaw/ry0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p1, Lcom/google/android/gms/measurement/internal/zzac;->r:Lcom/google/android/gms/measurement/internal/zzkw;

    invoke-static {v0}, Lcom/daaw/ry0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v0, 0x0

    invoke-virtual {p0, p2, v0}, Lcom/daaw/ob7;->k3(Lcom/google/android/gms/measurement/internal/zzq;Z)V

    new-instance v0, Lcom/google/android/gms/measurement/internal/zzac;

    invoke-direct {v0, p1}, Lcom/google/android/gms/measurement/internal/zzac;-><init>(Lcom/google/android/gms/measurement/internal/zzac;)V

    iget-object p1, p2, Lcom/google/android/gms/measurement/internal/zzq;->p:Ljava/lang/String;

    iput-object p1, v0, Lcom/google/android/gms/measurement/internal/zzac;->p:Ljava/lang/String;

    new-instance p1, Lcom/daaw/jt6;

    invoke-direct {p1, p0, v0, p2}, Lcom/daaw/jt6;-><init>(Lcom/daaw/ob7;Lcom/google/android/gms/measurement/internal/zzac;Lcom/google/android/gms/measurement/internal/zzq;)V

    invoke-virtual {p0, p1}, Lcom/daaw/ob7;->j3(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final G0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;
    .locals 2

    const/4 v0, 0x1

    invoke-virtual {p0, p1, v0}, Lcom/daaw/ob7;->l3(Ljava/lang/String;Z)V

    iget-object v0, p0, Lcom/daaw/ob7;->p:Lcom/daaw/yb8;

    invoke-virtual {v0}, Lcom/daaw/yb8;->r()Lcom/daaw/vn6;

    move-result-object v0

    new-instance v1, Lcom/daaw/my6;

    invoke-direct {v1, p0, p1, p2, p3}, Lcom/daaw/my6;-><init>(Lcom/daaw/ob7;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/daaw/vn6;->s(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;

    move-result-object p1

    :try_start_0
    invoke-interface {p1}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    goto :goto_0

    :catch_1
    move-exception p1

    :goto_0
    iget-object p2, p0, Lcom/daaw/ob7;->p:Lcom/daaw/yb8;

    invoke-virtual {p2}, Lcom/daaw/yb8;->i()Lcom/daaw/om5;

    move-result-object p2

    invoke-virtual {p2}, Lcom/daaw/om5;->q()Lcom/daaw/hk5;

    move-result-object p2

    const-string p3, "Failed to get conditional user properties as"

    invoke-virtual {p2, p3, p1}, Lcom/daaw/hk5;->b(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public final I(Lcom/google/android/gms/measurement/internal/zzaw;Lcom/google/android/gms/measurement/internal/zzq;)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/ob7;->p:Lcom/daaw/yb8;

    invoke-virtual {v0}, Lcom/daaw/yb8;->c()V

    iget-object v0, p0, Lcom/daaw/ob7;->p:Lcom/daaw/yb8;

    invoke-virtual {v0, p1, p2}, Lcom/daaw/yb8;->h(Lcom/google/android/gms/measurement/internal/zzaw;Lcom/google/android/gms/measurement/internal/zzq;)V

    return-void
.end method

.method public final M(Lcom/google/android/gms/measurement/internal/zzaw;Lcom/google/android/gms/measurement/internal/zzq;)Lcom/google/android/gms/measurement/internal/zzaw;
    .locals 8

    iget-object p2, p1, Lcom/google/android/gms/measurement/internal/zzaw;->p:Ljava/lang/String;

    const-string v0, "_cmp"

    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_2

    iget-object p2, p1, Lcom/google/android/gms/measurement/internal/zzaw;->q:Lcom/google/android/gms/measurement/internal/zzau;

    if-eqz p2, :cond_2

    invoke-virtual {p2}, Lcom/google/android/gms/measurement/internal/zzau;->zza()I

    move-result p2

    if-nez p2, :cond_0

    goto :goto_0

    :cond_0
    iget-object p2, p1, Lcom/google/android/gms/measurement/internal/zzaw;->q:Lcom/google/android/gms/measurement/internal/zzau;

    const-string v0, "_cis"

    invoke-virtual {p2, v0}, Lcom/google/android/gms/measurement/internal/zzau;->v(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    const-string v0, "referrer broadcast"

    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "referrer API"

    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_2

    :cond_1
    iget-object p2, p0, Lcom/daaw/ob7;->p:Lcom/daaw/yb8;

    invoke-virtual {p2}, Lcom/daaw/yb8;->i()Lcom/daaw/om5;

    move-result-object p2

    invoke-virtual {p2}, Lcom/daaw/om5;->u()Lcom/daaw/hk5;

    move-result-object p2

    invoke-virtual {p1}, Lcom/google/android/gms/measurement/internal/zzaw;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "Event has been filtered "

    invoke-virtual {p2, v1, v0}, Lcom/daaw/hk5;->b(Ljava/lang/String;Ljava/lang/Object;)V

    new-instance p2, Lcom/google/android/gms/measurement/internal/zzaw;

    iget-object v4, p1, Lcom/google/android/gms/measurement/internal/zzaw;->q:Lcom/google/android/gms/measurement/internal/zzau;

    iget-object v5, p1, Lcom/google/android/gms/measurement/internal/zzaw;->r:Ljava/lang/String;

    iget-wide v6, p1, Lcom/google/android/gms/measurement/internal/zzaw;->s:J

    const-string v3, "_cmpx"

    move-object v2, p2

    invoke-direct/range {v2 .. v7}, Lcom/google/android/gms/measurement/internal/zzaw;-><init>(Ljava/lang/String;Lcom/google/android/gms/measurement/internal/zzau;Ljava/lang/String;J)V

    return-object p2

    :cond_2
    :goto_0
    return-object p1
.end method

.method public final T1(Lcom/google/android/gms/measurement/internal/zzq;)V
    .locals 1

    iget-object v0, p1, Lcom/google/android/gms/measurement/internal/zzq;->p:Ljava/lang/String;

    invoke-static {v0}, Lcom/daaw/ry0;->f(Ljava/lang/String;)Ljava/lang/String;

    iget-object v0, p1, Lcom/google/android/gms/measurement/internal/zzq;->K:Ljava/lang/String;

    invoke-static {v0}, Lcom/daaw/ry0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Lcom/daaw/f27;

    invoke-direct {v0, p0, p1}, Lcom/daaw/f27;-><init>(Lcom/daaw/ob7;Lcom/google/android/gms/measurement/internal/zzq;)V

    invoke-static {v0}, Lcom/daaw/ry0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p1, p0, Lcom/daaw/ob7;->p:Lcom/daaw/yb8;

    invoke-virtual {p1}, Lcom/daaw/yb8;->r()Lcom/daaw/vn6;

    move-result-object p1

    invoke-virtual {p1}, Lcom/daaw/vn6;->C()Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    return-void

    :cond_0
    iget-object p1, p0, Lcom/daaw/ob7;->p:Lcom/daaw/yb8;

    invoke-virtual {p1}, Lcom/daaw/yb8;->r()Lcom/daaw/vn6;

    move-result-object p1

    invoke-virtual {p1, v0}, Lcom/daaw/vn6;->A(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final X(Lcom/google/android/gms/measurement/internal/zzq;)V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lcom/daaw/ob7;->k3(Lcom/google/android/gms/measurement/internal/zzq;Z)V

    new-instance v0, Lcom/daaw/c17;

    invoke-direct {v0, p0, p1}, Lcom/daaw/c17;-><init>(Lcom/daaw/ob7;Lcom/google/android/gms/measurement/internal/zzq;)V

    invoke-virtual {p0, v0}, Lcom/daaw/ob7;->j3(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final a2(Ljava/lang/String;Ljava/lang/String;ZLcom/google/android/gms/measurement/internal/zzq;)Ljava/util/List;
    .locals 3

    const/4 v0, 0x0

    invoke-virtual {p0, p4, v0}, Lcom/daaw/ob7;->k3(Lcom/google/android/gms/measurement/internal/zzq;Z)V

    iget-object v0, p4, Lcom/google/android/gms/measurement/internal/zzq;->p:Ljava/lang/String;

    invoke-static {v0}, Lcom/daaw/ry0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v1, p0, Lcom/daaw/ob7;->p:Lcom/daaw/yb8;

    invoke-virtual {v1}, Lcom/daaw/yb8;->r()Lcom/daaw/vn6;

    move-result-object v1

    new-instance v2, Lcom/daaw/dv6;

    invoke-direct {v2, p0, v0, p1, p2}, Lcom/daaw/dv6;-><init>(Lcom/daaw/ob7;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Lcom/daaw/vn6;->s(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;

    move-result-object p1

    :try_start_0
    invoke-interface {p1}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    new-instance p2, Ljava/util/ArrayList;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    invoke-direct {p2, v0}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/mc8;

    if-nez p3, :cond_1

    iget-object v1, v0, Lcom/daaw/mc8;->c:Ljava/lang/String;

    invoke-static {v1}, Lcom/daaw/dd8;->W(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_0

    :cond_1
    new-instance v1, Lcom/google/android/gms/measurement/internal/zzkw;

    invoke-direct {v1, v0}, Lcom/google/android/gms/measurement/internal/zzkw;-><init>(Lcom/daaw/mc8;)V

    invoke-interface {p2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :cond_2
    return-object p2

    :catch_0
    move-exception p1

    goto :goto_1

    :catch_1
    move-exception p1

    :goto_1
    iget-object p2, p0, Lcom/daaw/ob7;->p:Lcom/daaw/yb8;

    invoke-virtual {p2}, Lcom/daaw/yb8;->i()Lcom/daaw/om5;

    move-result-object p2

    invoke-virtual {p2}, Lcom/daaw/om5;->q()Lcom/daaw/hk5;

    move-result-object p2

    iget-object p3, p4, Lcom/google/android/gms/measurement/internal/zzq;->p:Ljava/lang/String;

    invoke-static {p3}, Lcom/daaw/om5;->z(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p3

    const-string p4, "Failed to query user properties. appId"

    invoke-virtual {p2, p4, p3, p1}, Lcom/daaw/hk5;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public final e0(Landroid/os/Bundle;Lcom/google/android/gms/measurement/internal/zzq;)V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, p2, v0}, Lcom/daaw/ob7;->k3(Lcom/google/android/gms/measurement/internal/zzq;Z)V

    iget-object p2, p2, Lcom/google/android/gms/measurement/internal/zzq;->p:Ljava/lang/String;

    invoke-static {p2}, Lcom/daaw/ry0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Lcom/daaw/gs6;

    invoke-direct {v0, p0, p2, p1}, Lcom/daaw/gs6;-><init>(Lcom/daaw/ob7;Ljava/lang/String;Landroid/os/Bundle;)V

    invoke-virtual {p0, v0}, Lcom/daaw/ob7;->j3(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final h0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/util/List;
    .locals 2

    const/4 v0, 0x1

    invoke-virtual {p0, p1, v0}, Lcom/daaw/ob7;->l3(Ljava/lang/String;Z)V

    iget-object v0, p0, Lcom/daaw/ob7;->p:Lcom/daaw/yb8;

    invoke-virtual {v0}, Lcom/daaw/yb8;->r()Lcom/daaw/vn6;

    move-result-object v0

    new-instance v1, Lcom/daaw/gw6;

    invoke-direct {v1, p0, p1, p2, p3}, Lcom/daaw/gw6;-><init>(Lcom/daaw/ob7;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/daaw/vn6;->s(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;

    move-result-object p2

    :try_start_0
    invoke-interface {p2}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/List;

    new-instance p3, Ljava/util/ArrayList;

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v0

    invoke-direct {p3, v0}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_0
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/mc8;

    if-nez p4, :cond_1

    iget-object v1, v0, Lcom/daaw/mc8;->c:Ljava/lang/String;

    invoke-static {v1}, Lcom/daaw/dd8;->W(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_0

    :cond_1
    new-instance v1, Lcom/google/android/gms/measurement/internal/zzkw;

    invoke-direct {v1, v0}, Lcom/google/android/gms/measurement/internal/zzkw;-><init>(Lcom/daaw/mc8;)V

    invoke-interface {p3, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :cond_2
    return-object p3

    :catch_0
    move-exception p2

    goto :goto_1

    :catch_1
    move-exception p2

    :goto_1
    iget-object p3, p0, Lcom/daaw/ob7;->p:Lcom/daaw/yb8;

    invoke-virtual {p3}, Lcom/daaw/yb8;->i()Lcom/daaw/om5;

    move-result-object p3

    invoke-virtual {p3}, Lcom/daaw/om5;->q()Lcom/daaw/hk5;

    move-result-object p3

    invoke-static {p1}, Lcom/daaw/om5;->z(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    const-string p4, "Failed to get user properties as. appId"

    invoke-virtual {p3, p4, p1, p2}, Lcom/daaw/hk5;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public final h3(Lcom/google/android/gms/measurement/internal/zzaw;Lcom/google/android/gms/measurement/internal/zzq;)V
    .locals 6

    iget-object v0, p0, Lcom/daaw/ob7;->p:Lcom/daaw/yb8;

    invoke-virtual {v0}, Lcom/daaw/yb8;->a0()Lcom/daaw/gh6;

    move-result-object v0

    iget-object v1, p2, Lcom/google/android/gms/measurement/internal/zzq;->p:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/daaw/gh6;->C(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0, p1, p2}, Lcom/daaw/ob7;->I(Lcom/google/android/gms/measurement/internal/zzaw;Lcom/google/android/gms/measurement/internal/zzq;)V

    return-void

    :cond_0
    iget-object v0, p0, Lcom/daaw/ob7;->p:Lcom/daaw/yb8;

    invoke-virtual {v0}, Lcom/daaw/yb8;->i()Lcom/daaw/om5;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/om5;->v()Lcom/daaw/hk5;

    move-result-object v0

    iget-object v1, p2, Lcom/google/android/gms/measurement/internal/zzq;->p:Ljava/lang/String;

    const-string v2, "EES config found for"

    invoke-virtual {v0, v2, v1}, Lcom/daaw/hk5;->b(Ljava/lang/String;Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/daaw/ob7;->p:Lcom/daaw/yb8;

    invoke-virtual {v0}, Lcom/daaw/yb8;->a0()Lcom/daaw/gh6;

    move-result-object v0

    iget-object v1, p2, Lcom/google/android/gms/measurement/internal/zzq;->p:Ljava/lang/String;

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_1

    const/4 v0, 0x0

    goto :goto_0

    :cond_1
    iget-object v0, v0, Lcom/daaw/gh6;->j:Lcom/daaw/wl0;

    invoke-virtual {v0, v1}, Lcom/daaw/wl0;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/tr3;

    :goto_0
    if-eqz v0, :cond_6

    :try_start_0
    iget-object v1, p0, Lcom/daaw/ob7;->p:Lcom/daaw/yb8;

    invoke-virtual {v1}, Lcom/daaw/yb8;->g0()Lcom/daaw/ec8;

    move-result-object v1

    iget-object v2, p1, Lcom/google/android/gms/measurement/internal/zzaw;->q:Lcom/google/android/gms/measurement/internal/zzau;

    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/zzau;->q()Landroid/os/Bundle;

    move-result-object v2

    const/4 v3, 0x1

    invoke-virtual {v1, v2, v3}, Lcom/daaw/ec8;->I(Landroid/os/Bundle;Z)Ljava/util/Map;

    move-result-object v1

    iget-object v2, p1, Lcom/google/android/gms/measurement/internal/zzaw;->p:Ljava/lang/String;

    invoke-static {v2}, Lcom/daaw/dh7;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_2

    iget-object v2, p1, Lcom/google/android/gms/measurement/internal/zzaw;->p:Ljava/lang/String;

    :cond_2
    new-instance v3, Lcom/daaw/s32;

    iget-wide v4, p1, Lcom/google/android/gms/measurement/internal/zzaw;->s:J

    invoke-direct {v3, v2, v4, v5, v1}, Lcom/daaw/s32;-><init>(Ljava/lang/String;JLjava/util/Map;)V

    invoke-virtual {v0, v3}, Lcom/daaw/tr3;->e(Lcom/daaw/s32;)Z

    move-result v1
    :try_end_0
    .catch Lcom/daaw/sk4; {:try_start_0 .. :try_end_0} :catch_0

    if-nez v1, :cond_3

    goto/16 :goto_2

    :cond_3
    invoke-virtual {v0}, Lcom/daaw/tr3;->g()Z

    move-result v1

    if-eqz v1, :cond_4

    iget-object v1, p0, Lcom/daaw/ob7;->p:Lcom/daaw/yb8;

    invoke-virtual {v1}, Lcom/daaw/yb8;->i()Lcom/daaw/om5;

    move-result-object v1

    invoke-virtual {v1}, Lcom/daaw/om5;->v()Lcom/daaw/hk5;

    move-result-object v1

    iget-object p1, p1, Lcom/google/android/gms/measurement/internal/zzaw;->p:Ljava/lang/String;

    const-string v2, "EES edited event"

    invoke-virtual {v1, v2, p1}, Lcom/daaw/hk5;->b(Ljava/lang/String;Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/daaw/ob7;->p:Lcom/daaw/yb8;

    invoke-virtual {p1}, Lcom/daaw/yb8;->g0()Lcom/daaw/ec8;

    move-result-object p1

    invoke-virtual {v0}, Lcom/daaw/tr3;->a()Lcom/daaw/z42;

    move-result-object v1

    invoke-virtual {v1}, Lcom/daaw/z42;->b()Lcom/daaw/s32;

    move-result-object v1

    invoke-virtual {p1, v1}, Lcom/daaw/ec8;->A(Lcom/daaw/s32;)Lcom/google/android/gms/measurement/internal/zzaw;

    move-result-object p1

    :cond_4
    invoke-virtual {p0, p1, p2}, Lcom/daaw/ob7;->I(Lcom/google/android/gms/measurement/internal/zzaw;Lcom/google/android/gms/measurement/internal/zzq;)V

    invoke-virtual {v0}, Lcom/daaw/tr3;->f()Z

    move-result p1

    if-eqz p1, :cond_5

    invoke-virtual {v0}, Lcom/daaw/tr3;->a()Lcom/daaw/z42;

    move-result-object p1

    invoke-virtual {p1}, Lcom/daaw/z42;->c()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/s32;

    iget-object v1, p0, Lcom/daaw/ob7;->p:Lcom/daaw/yb8;

    invoke-virtual {v1}, Lcom/daaw/yb8;->i()Lcom/daaw/om5;

    move-result-object v1

    invoke-virtual {v1}, Lcom/daaw/om5;->v()Lcom/daaw/hk5;

    move-result-object v1

    invoke-virtual {v0}, Lcom/daaw/s32;->d()Ljava/lang/String;

    move-result-object v2

    const-string v3, "EES logging created event"

    invoke-virtual {v1, v3, v2}, Lcom/daaw/hk5;->b(Ljava/lang/String;Ljava/lang/Object;)V

    iget-object v1, p0, Lcom/daaw/ob7;->p:Lcom/daaw/yb8;

    invoke-virtual {v1}, Lcom/daaw/yb8;->g0()Lcom/daaw/ec8;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/daaw/ec8;->A(Lcom/daaw/s32;)Lcom/google/android/gms/measurement/internal/zzaw;

    move-result-object v0

    invoke-virtual {p0, v0, p2}, Lcom/daaw/ob7;->I(Lcom/google/android/gms/measurement/internal/zzaw;Lcom/google/android/gms/measurement/internal/zzq;)V

    goto :goto_1

    :cond_5
    return-void

    :catch_0
    iget-object v0, p0, Lcom/daaw/ob7;->p:Lcom/daaw/yb8;

    invoke-virtual {v0}, Lcom/daaw/yb8;->i()Lcom/daaw/om5;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/om5;->q()Lcom/daaw/hk5;

    move-result-object v0

    iget-object v1, p2, Lcom/google/android/gms/measurement/internal/zzq;->q:Ljava/lang/String;

    iget-object v2, p1, Lcom/google/android/gms/measurement/internal/zzaw;->p:Ljava/lang/String;

    const-string v3, "EES error. appId, eventName"

    invoke-virtual {v0, v3, v1, v2}, Lcom/daaw/hk5;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    :goto_2
    iget-object v0, p0, Lcom/daaw/ob7;->p:Lcom/daaw/yb8;

    invoke-virtual {v0}, Lcom/daaw/yb8;->i()Lcom/daaw/om5;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/om5;->v()Lcom/daaw/hk5;

    move-result-object v0

    iget-object v1, p1, Lcom/google/android/gms/measurement/internal/zzaw;->p:Ljava/lang/String;

    const-string v2, "EES was not applied to event"

    :goto_3
    invoke-virtual {v0, v2, v1}, Lcom/daaw/hk5;->b(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual {p0, p1, p2}, Lcom/daaw/ob7;->I(Lcom/google/android/gms/measurement/internal/zzaw;Lcom/google/android/gms/measurement/internal/zzq;)V

    return-void

    :cond_6
    iget-object v0, p0, Lcom/daaw/ob7;->p:Lcom/daaw/yb8;

    invoke-virtual {v0}, Lcom/daaw/yb8;->i()Lcom/daaw/om5;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/om5;->v()Lcom/daaw/hk5;

    move-result-object v0

    iget-object v1, p2, Lcom/google/android/gms/measurement/internal/zzq;->p:Ljava/lang/String;

    const-string v2, "EES not loaded for"

    goto :goto_3
.end method

.method public final i1(Lcom/google/android/gms/measurement/internal/zzaw;Lcom/google/android/gms/measurement/internal/zzq;)V
    .locals 1

    invoke-static {p1}, Lcom/daaw/ry0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v0, 0x0

    invoke-virtual {p0, p2, v0}, Lcom/daaw/ob7;->k3(Lcom/google/android/gms/measurement/internal/zzq;Z)V

    new-instance v0, Lcom/daaw/h37;

    invoke-direct {v0, p0, p1, p2}, Lcom/daaw/h37;-><init>(Lcom/daaw/ob7;Lcom/google/android/gms/measurement/internal/zzaw;Lcom/google/android/gms/measurement/internal/zzq;)V

    invoke-virtual {p0, v0}, Lcom/daaw/ob7;->j3(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final synthetic i3(Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 12

    iget-object v0, p0, Lcom/daaw/ob7;->p:Lcom/daaw/yb8;

    invoke-virtual {v0}, Lcom/daaw/yb8;->W()Lcom/daaw/uh2;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/rc7;->f()V

    invoke-virtual {v0}, Lcom/daaw/pa8;->g()V

    new-instance v11, Lcom/daaw/on2;

    iget-object v2, v0, Lcom/daaw/rc7;->a:Lcom/daaw/dr6;

    const-string v3, ""

    const-string v5, "dep"

    const-wide/16 v6, 0x0

    const-wide/16 v8, 0x0

    move-object v1, v11

    move-object v4, p1

    move-object v10, p2

    invoke-direct/range {v1 .. v10}, Lcom/daaw/on2;-><init>(Lcom/daaw/dr6;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJLandroid/os/Bundle;)V

    iget-object p2, v0, Lcom/daaw/na8;->b:Lcom/daaw/yb8;

    invoke-virtual {p2}, Lcom/daaw/yb8;->g0()Lcom/daaw/ec8;

    move-result-object p2

    invoke-virtual {p2, v11}, Lcom/daaw/ec8;->B(Lcom/daaw/on2;)Lcom/daaw/it6;

    move-result-object p2

    invoke-virtual {p2}, Lcom/daaw/w48;->i()[B

    move-result-object p2

    iget-object v1, v0, Lcom/daaw/rc7;->a:Lcom/daaw/dr6;

    invoke-virtual {v1}, Lcom/daaw/dr6;->i()Lcom/daaw/om5;

    move-result-object v1

    invoke-virtual {v1}, Lcom/daaw/om5;->v()Lcom/daaw/hk5;

    move-result-object v1

    iget-object v2, v0, Lcom/daaw/rc7;->a:Lcom/daaw/dr6;

    invoke-virtual {v2}, Lcom/daaw/dr6;->D()Lcom/daaw/xg5;

    move-result-object v2

    invoke-virtual {v2, p1}, Lcom/daaw/xg5;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    array-length v3, p2

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const-string v4, "Saving default event parameters, appId, data size"

    invoke-virtual {v1, v4, v2, v3}, Lcom/daaw/hk5;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v1, Landroid/content/ContentValues;

    invoke-direct {v1}, Landroid/content/ContentValues;-><init>()V

    const-string v2, "app_id"

    invoke-virtual {v1, v2, p1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "parameters"

    invoke-virtual {v1, v2, p2}, Landroid/content/ContentValues;->put(Ljava/lang/String;[B)V

    :try_start_0
    invoke-virtual {v0}, Lcom/daaw/uh2;->P()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object p2

    const-string v2, "default_event_params"

    const/4 v3, 0x0

    const/4 v4, 0x5

    invoke-virtual {p2, v2, v3, v1, v4}, Landroid/database/sqlite/SQLiteDatabase;->insertWithOnConflict(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;I)J

    move-result-wide v1

    const-wide/16 v3, -0x1

    cmp-long p2, v1, v3

    if-nez p2, :cond_0

    iget-object p2, v0, Lcom/daaw/rc7;->a:Lcom/daaw/dr6;

    invoke-virtual {p2}, Lcom/daaw/dr6;->i()Lcom/daaw/om5;

    move-result-object p2

    invoke-virtual {p2}, Lcom/daaw/om5;->q()Lcom/daaw/hk5;

    move-result-object p2

    const-string v1, "Failed to insert default event parameters (got -1). appId"

    invoke-static {p1}, Lcom/daaw/om5;->z(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {p2, v1, v2}, Lcom/daaw/hk5;->b(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    return-void

    :catch_0
    move-exception p2

    iget-object v0, v0, Lcom/daaw/rc7;->a:Lcom/daaw/dr6;

    invoke-virtual {v0}, Lcom/daaw/dr6;->i()Lcom/daaw/om5;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/om5;->q()Lcom/daaw/hk5;

    move-result-object v0

    invoke-static {p1}, Lcom/daaw/om5;->z(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    const-string v1, "Error storing default event parameters. appId"

    invoke-virtual {v0, v1, p1, p2}, Lcom/daaw/hk5;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

.method public final j3(Ljava/lang/Runnable;)V
    .locals 1

    invoke-static {p1}, Lcom/daaw/ry0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/daaw/ob7;->p:Lcom/daaw/yb8;

    invoke-virtual {v0}, Lcom/daaw/yb8;->r()Lcom/daaw/vn6;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/vn6;->C()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/lang/Runnable;->run()V

    return-void

    :cond_0
    iget-object v0, p0, Lcom/daaw/ob7;->p:Lcom/daaw/yb8;

    invoke-virtual {v0}, Lcom/daaw/yb8;->r()Lcom/daaw/vn6;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/daaw/vn6;->z(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final k0(Lcom/google/android/gms/measurement/internal/zzac;)V
    .locals 2

    invoke-static {p1}, Lcom/daaw/ry0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p1, Lcom/google/android/gms/measurement/internal/zzac;->r:Lcom/google/android/gms/measurement/internal/zzkw;

    invoke-static {v0}, Lcom/daaw/ry0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p1, Lcom/google/android/gms/measurement/internal/zzac;->p:Ljava/lang/String;

    invoke-static {v0}, Lcom/daaw/ry0;->f(Ljava/lang/String;)Ljava/lang/String;

    iget-object v0, p1, Lcom/google/android/gms/measurement/internal/zzac;->p:Ljava/lang/String;

    const/4 v1, 0x1

    invoke-virtual {p0, v0, v1}, Lcom/daaw/ob7;->l3(Ljava/lang/String;Z)V

    new-instance v0, Lcom/google/android/gms/measurement/internal/zzac;

    invoke-direct {v0, p1}, Lcom/google/android/gms/measurement/internal/zzac;-><init>(Lcom/google/android/gms/measurement/internal/zzac;)V

    new-instance p1, Lcom/daaw/hu6;

    invoke-direct {p1, p0, v0}, Lcom/daaw/hu6;-><init>(Lcom/daaw/ob7;Lcom/google/android/gms/measurement/internal/zzac;)V

    invoke-virtual {p0, p1}, Lcom/daaw/ob7;->j3(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final k3(Lcom/google/android/gms/measurement/internal/zzq;Z)V
    .locals 1

    invoke-static {p1}, Lcom/daaw/ry0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p2, p1, Lcom/google/android/gms/measurement/internal/zzq;->p:Ljava/lang/String;

    invoke-static {p2}, Lcom/daaw/ry0;->f(Ljava/lang/String;)Ljava/lang/String;

    iget-object p2, p1, Lcom/google/android/gms/measurement/internal/zzq;->p:Ljava/lang/String;

    const/4 v0, 0x0

    invoke-virtual {p0, p2, v0}, Lcom/daaw/ob7;->l3(Ljava/lang/String;Z)V

    iget-object p2, p0, Lcom/daaw/ob7;->p:Lcom/daaw/yb8;

    invoke-virtual {p2}, Lcom/daaw/yb8;->h0()Lcom/daaw/dd8;

    move-result-object p2

    iget-object v0, p1, Lcom/google/android/gms/measurement/internal/zzq;->q:Ljava/lang/String;

    iget-object p1, p1, Lcom/google/android/gms/measurement/internal/zzq;->F:Ljava/lang/String;

    invoke-virtual {p2, v0, p1}, Lcom/daaw/dd8;->L(Ljava/lang/String;Ljava/lang/String;)Z

    return-void
.end method

.method public final l0(Lcom/google/android/gms/measurement/internal/zzq;Z)Ljava/util/List;
    .locals 4

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lcom/daaw/ob7;->k3(Lcom/google/android/gms/measurement/internal/zzq;Z)V

    iget-object v0, p1, Lcom/google/android/gms/measurement/internal/zzq;->p:Ljava/lang/String;

    invoke-static {v0}, Lcom/daaw/ry0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v1, p0, Lcom/daaw/ob7;->p:Lcom/daaw/yb8;

    invoke-virtual {v1}, Lcom/daaw/yb8;->r()Lcom/daaw/vn6;

    move-result-object v1

    new-instance v2, Lcom/daaw/f87;

    invoke-direct {v2, p0, v0}, Lcom/daaw/f87;-><init>(Lcom/daaw/ob7;Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Lcom/daaw/vn6;->s(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;

    move-result-object v0

    :try_start_0
    invoke-interface {v0}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    new-instance v1, Ljava/util/ArrayList;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/daaw/mc8;

    if-nez p2, :cond_1

    iget-object v3, v2, Lcom/daaw/mc8;->c:Ljava/lang/String;

    invoke-static {v3}, Lcom/daaw/dd8;->W(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_0

    :cond_1
    new-instance v3, Lcom/google/android/gms/measurement/internal/zzkw;

    invoke-direct {v3, v2}, Lcom/google/android/gms/measurement/internal/zzkw;-><init>(Lcom/daaw/mc8;)V

    invoke-interface {v1, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :cond_2
    return-object v1

    :catch_0
    move-exception p2

    goto :goto_1

    :catch_1
    move-exception p2

    :goto_1
    iget-object v0, p0, Lcom/daaw/ob7;->p:Lcom/daaw/yb8;

    invoke-virtual {v0}, Lcom/daaw/yb8;->i()Lcom/daaw/om5;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/om5;->q()Lcom/daaw/hk5;

    move-result-object v0

    iget-object p1, p1, Lcom/google/android/gms/measurement/internal/zzq;->p:Ljava/lang/String;

    invoke-static {p1}, Lcom/daaw/om5;->z(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    const-string v1, "Failed to get user properties. appId"

    invoke-virtual {v0, v1, p1, p2}, Lcom/daaw/hk5;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    const/4 p1, 0x0

    return-object p1
.end method

.method public final l3(Ljava/lang/String;Z)V
    .locals 3

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_7

    const/4 v0, 0x0

    const/4 v1, 0x1

    if-eqz p2, :cond_3

    :try_start_0
    iget-object p2, p0, Lcom/daaw/ob7;->q:Ljava/lang/Boolean;

    if-nez p2, :cond_2

    const-string p2, "com.google.android.gms"

    iget-object v2, p0, Lcom/daaw/ob7;->r:Ljava/lang/String;

    invoke-virtual {p2, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_1

    iget-object p2, p0, Lcom/daaw/ob7;->p:Lcom/daaw/yb8;

    invoke-virtual {p2}, Lcom/daaw/yb8;->d()Landroid/content/Context;

    move-result-object p2

    invoke-static {}, Landroid/os/Binder;->getCallingUid()I

    move-result v2

    invoke-static {p2, v2}, Lcom/daaw/fp1;->a(Landroid/content/Context;I)Z

    move-result p2

    if-nez p2, :cond_1

    iget-object p2, p0, Lcom/daaw/ob7;->p:Lcom/daaw/yb8;

    invoke-virtual {p2}, Lcom/daaw/yb8;->d()Landroid/content/Context;

    move-result-object p2

    invoke-static {p2}, Lcom/daaw/d80;->a(Landroid/content/Context;)Lcom/daaw/d80;

    move-result-object p2

    invoke-static {}, Landroid/os/Binder;->getCallingUid()I

    move-result v2

    invoke-virtual {p2, v2}, Lcom/daaw/d80;->c(I)Z

    move-result p2

    if-eqz p2, :cond_0

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p2, 0x1

    :goto_1
    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p2

    iput-object p2, p0, Lcom/daaw/ob7;->q:Ljava/lang/Boolean;

    :cond_2
    iget-object p2, p0, Lcom/daaw/ob7;->q:Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    if-nez p2, :cond_5

    :cond_3
    iget-object p2, p0, Lcom/daaw/ob7;->r:Ljava/lang/String;

    if-nez p2, :cond_4

    iget-object p2, p0, Lcom/daaw/ob7;->p:Lcom/daaw/yb8;

    invoke-virtual {p2}, Lcom/daaw/yb8;->d()Landroid/content/Context;

    move-result-object p2

    invoke-static {}, Landroid/os/Binder;->getCallingUid()I

    move-result v2

    invoke-static {p2, v2, p1}, Lcom/daaw/c80;->j(Landroid/content/Context;ILjava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_4

    iput-object p1, p0, Lcom/daaw/ob7;->r:Ljava/lang/String;

    :cond_4
    iget-object p2, p0, Lcom/daaw/ob7;->r:Ljava/lang/String;

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_6

    :cond_5
    return-void

    :cond_6
    new-instance p2, Ljava/lang/SecurityException;

    new-array v1, v1, [Ljava/lang/Object;

    aput-object p1, v1, v0

    const-string v0, "Unknown calling package name \'%s\'."

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p2, v0}, Ljava/lang/SecurityException;-><init>(Ljava/lang/String;)V

    throw p2
    :try_end_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    move-exception p2

    iget-object v0, p0, Lcom/daaw/ob7;->p:Lcom/daaw/yb8;

    invoke-virtual {v0}, Lcom/daaw/yb8;->i()Lcom/daaw/om5;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/om5;->q()Lcom/daaw/hk5;

    move-result-object v0

    invoke-static {p1}, Lcom/daaw/om5;->z(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    const-string v1, "Measurement Service called with invalid calling package. appId"

    invoke-virtual {v0, v1, p1}, Lcom/daaw/hk5;->b(Ljava/lang/String;Ljava/lang/Object;)V

    throw p2

    :cond_7
    iget-object p1, p0, Lcom/daaw/ob7;->p:Lcom/daaw/yb8;

    invoke-virtual {p1}, Lcom/daaw/yb8;->i()Lcom/daaw/om5;

    move-result-object p1

    invoke-virtual {p1}, Lcom/daaw/om5;->q()Lcom/daaw/hk5;

    move-result-object p1

    const-string p2, "Measurement Service called without app package"

    invoke-virtual {p1, p2}, Lcom/daaw/hk5;->a(Ljava/lang/String;)V

    new-instance p1, Ljava/lang/SecurityException;

    invoke-direct {p1, p2}, Ljava/lang/SecurityException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final m0(Lcom/google/android/gms/measurement/internal/zzaw;Ljava/lang/String;)[B
    .locals 11

    invoke-static {p2}, Lcom/daaw/ry0;->f(Ljava/lang/String;)Ljava/lang/String;

    invoke-static {p1}, Lcom/daaw/ry0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v0, 0x1

    invoke-virtual {p0, p2, v0}, Lcom/daaw/ob7;->l3(Ljava/lang/String;Z)V

    iget-object v0, p0, Lcom/daaw/ob7;->p:Lcom/daaw/yb8;

    invoke-virtual {v0}, Lcom/daaw/yb8;->i()Lcom/daaw/om5;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/om5;->p()Lcom/daaw/hk5;

    move-result-object v0

    iget-object v1, p0, Lcom/daaw/ob7;->p:Lcom/daaw/yb8;

    invoke-virtual {v1}, Lcom/daaw/yb8;->X()Lcom/daaw/xg5;

    move-result-object v1

    iget-object v2, p1, Lcom/google/android/gms/measurement/internal/zzaw;->p:Ljava/lang/String;

    invoke-virtual {v1, v2}, Lcom/daaw/xg5;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "Log and bundle. event"

    invoke-virtual {v0, v2, v1}, Lcom/daaw/hk5;->b(Ljava/lang/String;Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/daaw/ob7;->p:Lcom/daaw/yb8;

    invoke-virtual {v0}, Lcom/daaw/yb8;->b()Lcom/daaw/ag;

    move-result-object v0

    invoke-interface {v0}, Lcom/daaw/ag;->c()J

    move-result-wide v0

    const-wide/32 v2, 0xf4240

    div-long/2addr v0, v2

    iget-object v4, p0, Lcom/daaw/ob7;->p:Lcom/daaw/yb8;

    invoke-virtual {v4}, Lcom/daaw/yb8;->r()Lcom/daaw/vn6;

    move-result-object v4

    new-instance v5, Lcom/daaw/z57;

    invoke-direct {v5, p0, p1, p2}, Lcom/daaw/z57;-><init>(Lcom/daaw/ob7;Lcom/google/android/gms/measurement/internal/zzaw;Ljava/lang/String;)V

    invoke-virtual {v4, v5}, Lcom/daaw/vn6;->t(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;

    move-result-object v4

    :try_start_0
    invoke-interface {v4}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, [B

    if-nez v4, :cond_0

    iget-object v4, p0, Lcom/daaw/ob7;->p:Lcom/daaw/yb8;

    invoke-virtual {v4}, Lcom/daaw/yb8;->i()Lcom/daaw/om5;

    move-result-object v4

    invoke-virtual {v4}, Lcom/daaw/om5;->q()Lcom/daaw/hk5;

    move-result-object v4

    const-string v5, "Log and bundle returned null. appId"

    invoke-static {p2}, Lcom/daaw/om5;->z(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v6

    invoke-virtual {v4, v5, v6}, Lcom/daaw/hk5;->b(Ljava/lang/String;Ljava/lang/Object;)V

    const/4 v4, 0x0

    new-array v4, v4, [B

    :cond_0
    iget-object v5, p0, Lcom/daaw/ob7;->p:Lcom/daaw/yb8;

    invoke-virtual {v5}, Lcom/daaw/yb8;->b()Lcom/daaw/ag;

    move-result-object v5

    invoke-interface {v5}, Lcom/daaw/ag;->c()J

    move-result-wide v5

    iget-object v7, p0, Lcom/daaw/ob7;->p:Lcom/daaw/yb8;

    invoke-virtual {v7}, Lcom/daaw/yb8;->i()Lcom/daaw/om5;

    move-result-object v7

    invoke-virtual {v7}, Lcom/daaw/om5;->p()Lcom/daaw/hk5;

    move-result-object v7

    const-string v8, "Log and bundle processed. event, size, time_ms"

    iget-object v9, p0, Lcom/daaw/ob7;->p:Lcom/daaw/yb8;

    invoke-virtual {v9}, Lcom/daaw/yb8;->X()Lcom/daaw/xg5;

    move-result-object v9

    iget-object v10, p1, Lcom/google/android/gms/measurement/internal/zzaw;->p:Ljava/lang/String;

    invoke-virtual {v9, v10}, Lcom/daaw/xg5;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    array-length v10, v4

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    div-long/2addr v5, v2

    sub-long/2addr v5, v0

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v7, v8, v9, v10, v0}, Lcom/daaw/hk5;->d(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v4

    :catch_0
    move-exception v0

    goto :goto_0

    :catch_1
    move-exception v0

    :goto_0
    iget-object v1, p0, Lcom/daaw/ob7;->p:Lcom/daaw/yb8;

    invoke-virtual {v1}, Lcom/daaw/yb8;->i()Lcom/daaw/om5;

    move-result-object v1

    invoke-virtual {v1}, Lcom/daaw/om5;->q()Lcom/daaw/hk5;

    move-result-object v1

    invoke-static {p2}, Lcom/daaw/om5;->z(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p2

    iget-object v2, p0, Lcom/daaw/ob7;->p:Lcom/daaw/yb8;

    invoke-virtual {v2}, Lcom/daaw/yb8;->X()Lcom/daaw/xg5;

    move-result-object v2

    iget-object p1, p1, Lcom/google/android/gms/measurement/internal/zzaw;->p:Ljava/lang/String;

    invoke-virtual {v2, p1}, Lcom/daaw/xg5;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const-string v2, "Failed to log and bundle. appId, event, error"

    invoke-virtual {v1, v2, p2, p1, v0}, Lcom/daaw/hk5;->d(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    const/4 p1, 0x0

    return-object p1
.end method

.method public final m1(Lcom/google/android/gms/measurement/internal/zzq;)V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lcom/daaw/ob7;->k3(Lcom/google/android/gms/measurement/internal/zzq;Z)V

    new-instance v0, Lcom/daaw/i97;

    invoke-direct {v0, p0, p1}, Lcom/daaw/i97;-><init>(Lcom/daaw/ob7;Lcom/google/android/gms/measurement/internal/zzq;)V

    invoke-virtual {p0, v0}, Lcom/daaw/ob7;->j3(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final n1(Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/measurement/internal/zzq;)Ljava/util/List;
    .locals 2

    const/4 v0, 0x0

    invoke-virtual {p0, p3, v0}, Lcom/daaw/ob7;->k3(Lcom/google/android/gms/measurement/internal/zzq;Z)V

    iget-object p3, p3, Lcom/google/android/gms/measurement/internal/zzq;->p:Ljava/lang/String;

    invoke-static {p3}, Lcom/daaw/ry0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/daaw/ob7;->p:Lcom/daaw/yb8;

    invoke-virtual {v0}, Lcom/daaw/yb8;->r()Lcom/daaw/vn6;

    move-result-object v0

    new-instance v1, Lcom/daaw/jx6;

    invoke-direct {v1, p0, p3, p1, p2}, Lcom/daaw/jx6;-><init>(Lcom/daaw/ob7;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/daaw/vn6;->s(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;

    move-result-object p1

    :try_start_0
    invoke-interface {p1}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    goto :goto_0

    :catch_1
    move-exception p1

    :goto_0
    iget-object p2, p0, Lcom/daaw/ob7;->p:Lcom/daaw/yb8;

    invoke-virtual {p2}, Lcom/daaw/yb8;->i()Lcom/daaw/om5;

    move-result-object p2

    invoke-virtual {p2}, Lcom/daaw/om5;->q()Lcom/daaw/hk5;

    move-result-object p2

    const-string p3, "Failed to get conditional user properties"

    invoke-virtual {p2, p3, p1}, Lcom/daaw/hk5;->b(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public final s2(Lcom/google/android/gms/measurement/internal/zzq;)V
    .locals 2

    iget-object v0, p1, Lcom/google/android/gms/measurement/internal/zzq;->p:Ljava/lang/String;

    invoke-static {v0}, Lcom/daaw/ry0;->f(Ljava/lang/String;)Ljava/lang/String;

    iget-object v0, p1, Lcom/google/android/gms/measurement/internal/zzq;->p:Ljava/lang/String;

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Lcom/daaw/ob7;->l3(Ljava/lang/String;Z)V

    new-instance v0, Lcom/daaw/pz6;

    invoke-direct {v0, p0, p1}, Lcom/daaw/pz6;-><init>(Lcom/daaw/ob7;Lcom/google/android/gms/measurement/internal/zzq;)V

    invoke-virtual {p0, v0}, Lcom/daaw/ob7;->j3(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final u1(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 8

    new-instance v7, Lcom/daaw/la7;

    move-object v0, v7

    move-object v1, p0

    move-object v2, p4

    move-object v3, p5

    move-object v4, p3

    move-wide v5, p1

    invoke-direct/range {v0 .. v6}, Lcom/daaw/la7;-><init>(Lcom/daaw/ob7;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V

    invoke-virtual {p0, v7}, Lcom/daaw/ob7;->j3(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final w0(Lcom/google/android/gms/measurement/internal/zzq;)Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lcom/daaw/ob7;->k3(Lcom/google/android/gms/measurement/internal/zzq;Z)V

    iget-object v0, p0, Lcom/daaw/ob7;->p:Lcom/daaw/yb8;

    invoke-virtual {v0, p1}, Lcom/daaw/yb8;->j0(Lcom/google/android/gms/measurement/internal/zzq;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final y1(Lcom/google/android/gms/measurement/internal/zzaw;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-static {p1}, Lcom/daaw/ry0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p2}, Lcom/daaw/ry0;->f(Ljava/lang/String;)Ljava/lang/String;

    const/4 p3, 0x1

    invoke-virtual {p0, p2, p3}, Lcom/daaw/ob7;->l3(Ljava/lang/String;Z)V

    new-instance p3, Lcom/daaw/k47;

    invoke-direct {p3, p0, p1, p2}, Lcom/daaw/k47;-><init>(Lcom/daaw/ob7;Lcom/google/android/gms/measurement/internal/zzaw;Ljava/lang/String;)V

    invoke-virtual {p0, p3}, Lcom/daaw/ob7;->j3(Ljava/lang/Runnable;)V

    return-void
.end method
