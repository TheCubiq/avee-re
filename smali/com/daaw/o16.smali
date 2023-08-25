.class public final Lcom/daaw/o16;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/i76;


# instance fields
.field public final a:Lcom/daaw/g77;

.field public final b:Lcom/daaw/ri6;

.field public final c:Lcom/google/android/gms/internal/ads/zzchu;

.field public final d:Lcom/daaw/xz3;


# direct methods
.method public constructor <init>(Lcom/daaw/g77;Lcom/daaw/ri6;Lcom/google/android/gms/internal/ads/zzchu;Lcom/daaw/xz3;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/o16;->a:Lcom/daaw/g77;

    iput-object p2, p0, Lcom/daaw/o16;->b:Lcom/daaw/ri6;

    iput-object p3, p0, Lcom/daaw/o16;->c:Lcom/google/android/gms/internal/ads/zzchu;

    iput-object p4, p0, Lcom/daaw/o16;->d:Lcom/daaw/xz3;

    return-void
.end method


# virtual methods
.method public final synthetic a()Lcom/daaw/p16;
    .locals 4

    new-instance v0, Lcom/daaw/p16;

    iget-object v1, p0, Lcom/daaw/o16;->b:Lcom/daaw/ri6;

    iget-object v1, v1, Lcom/daaw/ri6;->j:Lcom/google/android/gms/ads/internal/client/zzw;

    iget-object v2, p0, Lcom/daaw/o16;->c:Lcom/google/android/gms/internal/ads/zzchu;

    iget-object v3, p0, Lcom/daaw/o16;->d:Lcom/daaw/xz3;

    invoke-virtual {v3}, Lcom/daaw/xz3;->i()Z

    move-result v3

    invoke-direct {v0, v1, v2, v3}, Lcom/daaw/p16;-><init>(Lcom/google/android/gms/ads/internal/client/zzw;Lcom/google/android/gms/internal/ads/zzchu;Z)V

    return-object v0
.end method

.method public final zza()I
    .locals 1

    const/16 v0, 0x9

    return v0
.end method

.method public final zzb()Lcom/daaw/f77;
    .locals 2

    iget-object v0, p0, Lcom/daaw/o16;->a:Lcom/daaw/g77;

    new-instance v1, Lcom/daaw/n16;

    invoke-direct {v1, p0}, Lcom/daaw/n16;-><init>(Lcom/daaw/o16;)V

    invoke-interface {v0, v1}, Lcom/daaw/g77;->M(Ljava/util/concurrent/Callable;)Lcom/daaw/f77;

    move-result-object v0

    return-object v0
.end method
