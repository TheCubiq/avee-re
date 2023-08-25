.class public final Lcom/daaw/k47;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic p:Lcom/google/android/gms/measurement/internal/zzaw;

.field public final synthetic q:Ljava/lang/String;

.field public final synthetic r:Lcom/daaw/ob7;


# direct methods
.method public constructor <init>(Lcom/daaw/ob7;Lcom/google/android/gms/measurement/internal/zzaw;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/k47;->r:Lcom/daaw/ob7;

    iput-object p2, p0, Lcom/daaw/k47;->p:Lcom/google/android/gms/measurement/internal/zzaw;

    iput-object p3, p0, Lcom/daaw/k47;->q:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lcom/daaw/k47;->r:Lcom/daaw/ob7;

    invoke-static {v0}, Lcom/daaw/ob7;->g3(Lcom/daaw/ob7;)Lcom/daaw/yb8;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/yb8;->c()V

    iget-object v0, p0, Lcom/daaw/k47;->r:Lcom/daaw/ob7;

    invoke-static {v0}, Lcom/daaw/ob7;->g3(Lcom/daaw/ob7;)Lcom/daaw/yb8;

    move-result-object v0

    iget-object v1, p0, Lcom/daaw/k47;->p:Lcom/google/android/gms/measurement/internal/zzaw;

    iget-object v2, p0, Lcom/daaw/k47;->q:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/yb8;->j(Lcom/google/android/gms/measurement/internal/zzaw;Ljava/lang/String;)V

    return-void
.end method
