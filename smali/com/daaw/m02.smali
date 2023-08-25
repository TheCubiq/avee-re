.class public final Lcom/daaw/m02;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/pa$c;
.implements Lcom/daaw/e12;


# instance fields
.field public final a:Lcom/daaw/k3$f;

.field public final b:Lcom/daaw/o3;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/o3<",
            "*>;"
        }
    .end annotation
.end field

.field public c:Lcom/google/android/gms/common/internal/b;

.field public d:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Lcom/google/android/gms/common/api/Scope;",
            ">;"
        }
    .end annotation
.end field

.field public e:Z

.field public final synthetic f:Lcom/daaw/z70;


# direct methods
.method public constructor <init>(Lcom/daaw/z70;Lcom/daaw/k3$f;Lcom/daaw/o3;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/k3$f;",
            "Lcom/daaw/o3<",
            "*>;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/daaw/m02;->f:Lcom/daaw/z70;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p1, 0x0

    iput-object p1, p0, Lcom/daaw/m02;->c:Lcom/google/android/gms/common/internal/b;

    iput-object p1, p0, Lcom/daaw/m02;->d:Ljava/util/Set;

    const/4 p1, 0x0

    iput-boolean p1, p0, Lcom/daaw/m02;->e:Z

    iput-object p2, p0, Lcom/daaw/m02;->a:Lcom/daaw/k3$f;

    iput-object p3, p0, Lcom/daaw/m02;->b:Lcom/daaw/o3;

    return-void
.end method

.method public static bridge synthetic d(Lcom/daaw/m02;)Lcom/daaw/k3$f;
    .locals 0

    iget-object p0, p0, Lcom/daaw/m02;->a:Lcom/daaw/k3$f;

    return-object p0
.end method

.method public static bridge synthetic e(Lcom/daaw/m02;)Lcom/daaw/o3;
    .locals 0

    iget-object p0, p0, Lcom/daaw/m02;->b:Lcom/daaw/o3;

    return-object p0
.end method

.method public static bridge synthetic f(Lcom/daaw/m02;Z)V
    .locals 0

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/daaw/m02;->e:Z

    return-void
.end method

.method public static bridge synthetic g(Lcom/daaw/m02;)V
    .locals 0

    invoke-virtual {p0}, Lcom/daaw/m02;->h()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/google/android/gms/common/ConnectionResult;)V
    .locals 2

    iget-object v0, p0, Lcom/daaw/m02;->f:Lcom/daaw/z70;

    invoke-static {v0}, Lcom/daaw/z70;->r(Lcom/daaw/z70;)Landroid/os/Handler;

    move-result-object v0

    new-instance v1, Lcom/daaw/l02;

    invoke-direct {v1, p0, p1}, Lcom/daaw/l02;-><init>(Lcom/daaw/m02;Lcom/google/android/gms/common/ConnectionResult;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public final b(Lcom/google/android/gms/common/ConnectionResult;)V
    .locals 2

    iget-object v0, p0, Lcom/daaw/m02;->f:Lcom/daaw/z70;

    invoke-static {v0}, Lcom/daaw/z70;->A(Lcom/daaw/z70;)Ljava/util/Map;

    move-result-object v0

    iget-object v1, p0, Lcom/daaw/m02;->b:Lcom/daaw/o3;

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/i02;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lcom/daaw/i02;->G(Lcom/google/android/gms/common/ConnectionResult;)V

    :cond_0
    return-void
.end method

.method public final c(Lcom/google/android/gms/common/internal/b;Ljava/util/Set;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/internal/b;",
            "Ljava/util/Set<",
            "Lcom/google/android/gms/common/api/Scope;",
            ">;)V"
        }
    .end annotation

    if-eqz p1, :cond_1

    if-nez p2, :cond_0

    goto :goto_0

    :cond_0
    iput-object p1, p0, Lcom/daaw/m02;->c:Lcom/google/android/gms/common/internal/b;

    iput-object p2, p0, Lcom/daaw/m02;->d:Ljava/util/Set;

    invoke-virtual {p0}, Lcom/daaw/m02;->h()V

    return-void

    :cond_1
    :goto_0
    new-instance p1, Ljava/lang/Exception;

    invoke-direct {p1}, Ljava/lang/Exception;-><init>()V

    const-string p2, "GoogleApiManager"

    const-string v0, "Received null response from onSignInSuccess"

    invoke-static {p2, v0, p1}, Landroid/util/Log;->wtf(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    new-instance p1, Lcom/google/android/gms/common/ConnectionResult;

    const/4 p2, 0x4

    invoke-direct {p1, p2}, Lcom/google/android/gms/common/ConnectionResult;-><init>(I)V

    invoke-virtual {p0, p1}, Lcom/daaw/m02;->b(Lcom/google/android/gms/common/ConnectionResult;)V

    return-void
.end method

.method public final h()V
    .locals 3

    iget-boolean v0, p0, Lcom/daaw/m02;->e:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/daaw/m02;->c:Lcom/google/android/gms/common/internal/b;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/daaw/m02;->a:Lcom/daaw/k3$f;

    iget-object v2, p0, Lcom/daaw/m02;->d:Ljava/util/Set;

    invoke-interface {v1, v0, v2}, Lcom/daaw/k3$f;->getRemoteService(Lcom/google/android/gms/common/internal/b;Ljava/util/Set;)V

    :cond_0
    return-void
.end method
