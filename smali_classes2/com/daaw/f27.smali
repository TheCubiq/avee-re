.class public final Lcom/daaw/f27;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic p:Lcom/google/android/gms/measurement/internal/zzq;

.field public final synthetic q:Lcom/daaw/ob7;


# direct methods
.method public constructor <init>(Lcom/daaw/ob7;Lcom/google/android/gms/measurement/internal/zzq;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/f27;->q:Lcom/daaw/ob7;

    iput-object p2, p0, Lcom/daaw/f27;->p:Lcom/google/android/gms/measurement/internal/zzq;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 7

    iget-object v0, p0, Lcom/daaw/f27;->q:Lcom/daaw/ob7;

    invoke-static {v0}, Lcom/daaw/ob7;->g3(Lcom/daaw/ob7;)Lcom/daaw/yb8;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/yb8;->c()V

    iget-object v0, p0, Lcom/daaw/f27;->q:Lcom/daaw/ob7;

    invoke-static {v0}, Lcom/daaw/ob7;->g3(Lcom/daaw/ob7;)Lcom/daaw/yb8;

    move-result-object v0

    iget-object v1, p0, Lcom/daaw/f27;->p:Lcom/google/android/gms/measurement/internal/zzq;

    invoke-virtual {v0}, Lcom/daaw/yb8;->r()Lcom/daaw/vn6;

    move-result-object v2

    invoke-virtual {v2}, Lcom/daaw/rc7;->f()V

    invoke-virtual {v0}, Lcom/daaw/yb8;->e()V

    iget-object v2, v1, Lcom/google/android/gms/measurement/internal/zzq;->p:Ljava/lang/String;

    invoke-static {v2}, Lcom/daaw/ry0;->f(Ljava/lang/String;)Ljava/lang/String;

    iget-object v2, v1, Lcom/google/android/gms/measurement/internal/zzq;->K:Ljava/lang/String;

    invoke-static {v2}, Lcom/daaw/cd2;->b(Ljava/lang/String;)Lcom/daaw/cd2;

    move-result-object v2

    iget-object v3, v1, Lcom/google/android/gms/measurement/internal/zzq;->p:Ljava/lang/String;

    invoke-virtual {v0, v3}, Lcom/daaw/yb8;->V(Ljava/lang/String;)Lcom/daaw/cd2;

    move-result-object v3

    invoke-virtual {v0}, Lcom/daaw/yb8;->i()Lcom/daaw/om5;

    move-result-object v4

    invoke-virtual {v4}, Lcom/daaw/om5;->v()Lcom/daaw/hk5;

    move-result-object v4

    iget-object v5, v1, Lcom/google/android/gms/measurement/internal/zzq;->p:Ljava/lang/String;

    const-string v6, "Setting consent, package, consent"

    invoke-virtual {v4, v6, v5, v2}, Lcom/daaw/hk5;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    iget-object v4, v1, Lcom/google/android/gms/measurement/internal/zzq;->p:Ljava/lang/String;

    invoke-virtual {v0, v4, v2}, Lcom/daaw/yb8;->A(Ljava/lang/String;Lcom/daaw/cd2;)V

    invoke-virtual {v2, v3}, Lcom/daaw/cd2;->k(Lcom/daaw/cd2;)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {v0, v1}, Lcom/daaw/yb8;->v(Lcom/google/android/gms/measurement/internal/zzq;)V

    :cond_0
    return-void
.end method
