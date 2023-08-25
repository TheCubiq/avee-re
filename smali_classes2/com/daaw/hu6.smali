.class public final Lcom/daaw/hu6;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic p:Lcom/google/android/gms/measurement/internal/zzac;

.field public final synthetic q:Lcom/daaw/ob7;


# direct methods
.method public constructor <init>(Lcom/daaw/ob7;Lcom/google/android/gms/measurement/internal/zzac;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/hu6;->q:Lcom/daaw/ob7;

    iput-object p2, p0, Lcom/daaw/hu6;->p:Lcom/google/android/gms/measurement/internal/zzac;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcom/daaw/hu6;->q:Lcom/daaw/ob7;

    invoke-static {v0}, Lcom/daaw/ob7;->g3(Lcom/daaw/ob7;)Lcom/daaw/yb8;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/yb8;->c()V

    iget-object v0, p0, Lcom/daaw/hu6;->p:Lcom/google/android/gms/measurement/internal/zzac;

    iget-object v0, v0, Lcom/google/android/gms/measurement/internal/zzac;->r:Lcom/google/android/gms/measurement/internal/zzkw;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzkw;->h()Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/daaw/hu6;->q:Lcom/daaw/ob7;

    invoke-static {v0}, Lcom/daaw/ob7;->g3(Lcom/daaw/ob7;)Lcom/daaw/yb8;

    move-result-object v0

    iget-object v1, p0, Lcom/daaw/hu6;->p:Lcom/google/android/gms/measurement/internal/zzac;

    invoke-virtual {v0, v1}, Lcom/daaw/yb8;->s(Lcom/google/android/gms/measurement/internal/zzac;)V

    return-void

    :cond_0
    iget-object v0, p0, Lcom/daaw/hu6;->q:Lcom/daaw/ob7;

    invoke-static {v0}, Lcom/daaw/ob7;->g3(Lcom/daaw/ob7;)Lcom/daaw/yb8;

    move-result-object v0

    iget-object v1, p0, Lcom/daaw/hu6;->p:Lcom/google/android/gms/measurement/internal/zzac;

    invoke-virtual {v0, v1}, Lcom/daaw/yb8;->y(Lcom/google/android/gms/measurement/internal/zzac;)V

    return-void
.end method
