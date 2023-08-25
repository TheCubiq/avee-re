.class public final Lcom/daaw/f12;
.super Lcom/daaw/u02;
.source ""

# interfaces
.implements Lcom/daaw/y70$a;
.implements Lcom/daaw/y70$b;


# static fields
.field public static final w:Lcom/daaw/k3$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/k3$a<",
            "+",
            "Lcom/daaw/o12;",
            "Lcom/daaw/xc1;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final p:Landroid/content/Context;

.field public final q:Landroid/os/Handler;

.field public final r:Lcom/daaw/k3$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/k3$a<",
            "+",
            "Lcom/daaw/o12;",
            "Lcom/daaw/xc1;",
            ">;"
        }
    .end annotation
.end field

.field public final s:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Lcom/google/android/gms/common/api/Scope;",
            ">;"
        }
    .end annotation
.end field

.field public final t:Lcom/daaw/xf;

.field public u:Lcom/daaw/o12;

.field public v:Lcom/daaw/e12;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    sget-object v0, Lcom/daaw/k12;->c:Lcom/daaw/k3$a;

    sput-object v0, Lcom/daaw/f12;->w:Lcom/daaw/k3$a;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/os/Handler;Lcom/daaw/xf;)V
    .locals 1

    sget-object v0, Lcom/daaw/f12;->w:Lcom/daaw/k3$a;

    invoke-direct {p0}, Lcom/daaw/u02;-><init>()V

    iput-object p1, p0, Lcom/daaw/f12;->p:Landroid/content/Context;

    iput-object p2, p0, Lcom/daaw/f12;->q:Landroid/os/Handler;

    const-string p1, "ClientSettings must not be null"

    invoke-static {p3, p1}, Lcom/daaw/ry0;->k(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/daaw/xf;

    iput-object p1, p0, Lcom/daaw/f12;->t:Lcom/daaw/xf;

    invoke-virtual {p3}, Lcom/daaw/xf;->e()Ljava/util/Set;

    move-result-object p1

    iput-object p1, p0, Lcom/daaw/f12;->s:Ljava/util/Set;

    iput-object v0, p0, Lcom/daaw/f12;->r:Lcom/daaw/k3$a;

    return-void
.end method

.method public static bridge synthetic h3(Lcom/daaw/f12;)Lcom/daaw/e12;
    .locals 0

    iget-object p0, p0, Lcom/daaw/f12;->v:Lcom/daaw/e12;

    return-object p0
.end method

.method public static bridge synthetic i3(Lcom/daaw/f12;Lcom/google/android/gms/signin/internal/zak;)V
    .locals 3

    invoke-virtual {p1}, Lcom/google/android/gms/signin/internal/zak;->h()Lcom/google/android/gms/common/ConnectionResult;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/common/ConnectionResult;->u()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {p1}, Lcom/google/android/gms/signin/internal/zak;->q()Lcom/google/android/gms/common/internal/zav;

    move-result-object p1

    invoke-static {p1}, Lcom/daaw/ry0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/common/internal/zav;

    invoke-virtual {p1}, Lcom/google/android/gms/common/internal/zav;->h()Lcom/google/android/gms/common/ConnectionResult;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/common/ConnectionResult;->u()Z

    move-result v1

    if-nez v1, :cond_1

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    new-instance v1, Ljava/lang/Exception;

    invoke-direct {v1}, Ljava/lang/Exception;-><init>()V

    const-string v2, "Sign-in succeeded with resolve account failure: "

    invoke-virtual {v2, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const-string v2, "SignInCoordinator"

    invoke-static {v2, p1, v1}, Landroid/util/Log;->wtf(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :cond_0
    iget-object p1, p0, Lcom/daaw/f12;->v:Lcom/daaw/e12;

    invoke-interface {p1, v0}, Lcom/daaw/e12;->b(Lcom/google/android/gms/common/ConnectionResult;)V

    :goto_0
    iget-object p0, p0, Lcom/daaw/f12;->u:Lcom/daaw/o12;

    invoke-interface {p0}, Lcom/daaw/k3$f;->disconnect()V

    return-void

    :cond_1
    iget-object v0, p0, Lcom/daaw/f12;->v:Lcom/daaw/e12;

    invoke-virtual {p1}, Lcom/google/android/gms/common/internal/zav;->q()Lcom/google/android/gms/common/internal/b;

    move-result-object p1

    iget-object v1, p0, Lcom/daaw/f12;->s:Ljava/util/Set;

    invoke-interface {v0, p1, v1}, Lcom/daaw/e12;->c(Lcom/google/android/gms/common/internal/b;Ljava/util/Set;)V

    goto :goto_0
.end method


# virtual methods
.method public final D(I)V
    .locals 0

    iget-object p1, p0, Lcom/daaw/f12;->u:Lcom/daaw/o12;

    invoke-interface {p1}, Lcom/daaw/k3$f;->disconnect()V

    return-void
.end method

.method public final I(Lcom/google/android/gms/common/ConnectionResult;)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/f12;->v:Lcom/daaw/e12;

    invoke-interface {v0, p1}, Lcom/daaw/e12;->b(Lcom/google/android/gms/common/ConnectionResult;)V

    return-void
.end method

.method public final M(Landroid/os/Bundle;)V
    .locals 0

    iget-object p1, p0, Lcom/daaw/f12;->u:Lcom/daaw/o12;

    invoke-interface {p1, p0}, Lcom/daaw/o12;->b(Lcom/daaw/p12;)V

    return-void
.end method

.method public final j3(Lcom/daaw/e12;)V
    .locals 9

    iget-object v0, p0, Lcom/daaw/f12;->u:Lcom/daaw/o12;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/daaw/k3$f;->disconnect()V

    :cond_0
    iget-object v0, p0, Lcom/daaw/f12;->t:Lcom/daaw/xf;

    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/daaw/xf;->i(Ljava/lang/Integer;)V

    iget-object v2, p0, Lcom/daaw/f12;->r:Lcom/daaw/k3$a;

    iget-object v3, p0, Lcom/daaw/f12;->p:Landroid/content/Context;

    iget-object v0, p0, Lcom/daaw/f12;->q:Landroid/os/Handler;

    invoke-virtual {v0}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    move-result-object v4

    iget-object v5, p0, Lcom/daaw/f12;->t:Lcom/daaw/xf;

    invoke-virtual {v5}, Lcom/daaw/xf;->f()Lcom/daaw/xc1;

    move-result-object v6

    move-object v7, p0

    move-object v8, p0

    invoke-virtual/range {v2 .. v8}, Lcom/daaw/k3$a;->b(Landroid/content/Context;Landroid/os/Looper;Lcom/daaw/xf;Ljava/lang/Object;Lcom/daaw/y70$a;Lcom/daaw/y70$b;)Lcom/daaw/k3$f;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/f12;->u:Lcom/daaw/o12;

    iput-object p1, p0, Lcom/daaw/f12;->v:Lcom/daaw/e12;

    iget-object p1, p0, Lcom/daaw/f12;->s:Ljava/util/Set;

    if-eqz p1, :cond_2

    invoke-interface {p1}, Ljava/util/Set;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_1

    goto :goto_0

    :cond_1
    iget-object p1, p0, Lcom/daaw/f12;->u:Lcom/daaw/o12;

    invoke-interface {p1}, Lcom/daaw/o12;->c()V

    return-void

    :cond_2
    :goto_0
    iget-object p1, p0, Lcom/daaw/f12;->q:Landroid/os/Handler;

    new-instance v0, Lcom/daaw/c12;

    invoke-direct {v0, p0}, Lcom/daaw/c12;-><init>(Lcom/daaw/f12;)V

    invoke-virtual {p1, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public final k3()V
    .locals 1

    iget-object v0, p0, Lcom/daaw/f12;->u:Lcom/daaw/o12;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/daaw/k3$f;->disconnect()V

    :cond_0
    return-void
.end method

.method public final z0(Lcom/google/android/gms/signin/internal/zak;)V
    .locals 2

    iget-object v0, p0, Lcom/daaw/f12;->q:Landroid/os/Handler;

    new-instance v1, Lcom/daaw/d12;

    invoke-direct {v1, p0, p1}, Lcom/daaw/d12;-><init>(Lcom/daaw/f12;Lcom/google/android/gms/signin/internal/zak;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method
