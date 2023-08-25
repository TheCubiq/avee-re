.class public final Lcom/daaw/g95;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/oh3;


# instance fields
.field public final p:Lcom/daaw/vr4;

.field public final q:Lcom/google/android/gms/internal/ads/zzcdd;

.field public final r:Ljava/lang/String;

.field public final s:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/daaw/vr4;Lcom/daaw/th6;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/g95;->p:Lcom/daaw/vr4;

    iget-object p1, p2, Lcom/daaw/th6;->m:Lcom/google/android/gms/internal/ads/zzcdd;

    iput-object p1, p0, Lcom/daaw/g95;->q:Lcom/google/android/gms/internal/ads/zzcdd;

    iget-object p1, p2, Lcom/daaw/th6;->k:Ljava/lang/String;

    iput-object p1, p0, Lcom/daaw/g95;->r:Ljava/lang/String;

    iget-object p1, p2, Lcom/daaw/th6;->l:Ljava/lang/String;

    iput-object p1, p0, Lcom/daaw/g95;->s:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final h0(Lcom/google/android/gms/internal/ads/zzcdd;)V
    .locals 3
    .annotation runtime Ljavax/annotation/ParametersAreNonnullByDefault;
    .end annotation

    iget-object v0, p0, Lcom/daaw/g95;->q:Lcom/google/android/gms/internal/ads/zzcdd;

    if-eqz v0, :cond_0

    move-object p1, v0

    :cond_0
    if-eqz p1, :cond_1

    iget-object v0, p1, Lcom/google/android/gms/internal/ads/zzcdd;->p:Ljava/lang/String;

    iget p1, p1, Lcom/google/android/gms/internal/ads/zzcdd;->q:I

    goto :goto_0

    :cond_1
    const/4 p1, 0x1

    const-string v0, ""

    :goto_0
    new-instance v1, Lcom/daaw/zu3;

    invoke-direct {v1, v0, p1}, Lcom/daaw/zu3;-><init>(Ljava/lang/String;I)V

    iget-object p1, p0, Lcom/daaw/g95;->p:Lcom/daaw/vr4;

    iget-object v0, p0, Lcom/daaw/g95;->r:Ljava/lang/String;

    iget-object v2, p0, Lcom/daaw/g95;->s:Ljava/lang/String;

    invoke-virtual {p1, v1, v0, v2}, Lcom/daaw/vr4;->C0(Lcom/daaw/cv3;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public final zzb()V
    .locals 1

    iget-object v0, p0, Lcom/daaw/g95;->p:Lcom/daaw/vr4;

    invoke-virtual {v0}, Lcom/daaw/vr4;->zze()V

    return-void
.end method

.method public final zzc()V
    .locals 1

    iget-object v0, p0, Lcom/daaw/g95;->p:Lcom/daaw/vr4;

    invoke-virtual {v0}, Lcom/daaw/vr4;->zzf()V

    return-void
.end method
