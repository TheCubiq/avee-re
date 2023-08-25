.class public final Lcom/daaw/h37;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic p:Lcom/google/android/gms/measurement/internal/zzaw;

.field public final synthetic q:Lcom/google/android/gms/measurement/internal/zzq;

.field public final synthetic r:Lcom/daaw/ob7;


# direct methods
.method public constructor <init>(Lcom/daaw/ob7;Lcom/google/android/gms/measurement/internal/zzaw;Lcom/google/android/gms/measurement/internal/zzq;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/h37;->r:Lcom/daaw/ob7;

    iput-object p2, p0, Lcom/daaw/h37;->p:Lcom/google/android/gms/measurement/internal/zzaw;

    iput-object p3, p0, Lcom/daaw/h37;->q:Lcom/google/android/gms/measurement/internal/zzq;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lcom/daaw/h37;->r:Lcom/daaw/ob7;

    iget-object v1, p0, Lcom/daaw/h37;->p:Lcom/google/android/gms/measurement/internal/zzaw;

    iget-object v2, p0, Lcom/daaw/h37;->q:Lcom/google/android/gms/measurement/internal/zzq;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/ob7;->M(Lcom/google/android/gms/measurement/internal/zzaw;Lcom/google/android/gms/measurement/internal/zzq;)Lcom/google/android/gms/measurement/internal/zzaw;

    move-result-object v0

    iget-object v1, p0, Lcom/daaw/h37;->r:Lcom/daaw/ob7;

    iget-object v2, p0, Lcom/daaw/h37;->q:Lcom/google/android/gms/measurement/internal/zzq;

    invoke-virtual {v1, v0, v2}, Lcom/daaw/ob7;->h3(Lcom/google/android/gms/measurement/internal/zzaw;Lcom/google/android/gms/measurement/internal/zzq;)V

    return-void
.end method
