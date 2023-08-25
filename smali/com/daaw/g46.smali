.class public final Lcom/daaw/g46;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/i76;


# instance fields
.field public final a:Lcom/daaw/g77;

.field public final b:Lcom/daaw/dh5;


# direct methods
.method public constructor <init>(Lcom/daaw/g77;Lcom/daaw/dh5;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/g46;->a:Lcom/daaw/g77;

    iput-object p2, p0, Lcom/daaw/g46;->b:Lcom/daaw/dh5;

    return-void
.end method


# virtual methods
.method public final synthetic a()Lcom/daaw/h46;
    .locals 4

    new-instance v0, Lcom/daaw/h46;

    iget-object v1, p0, Lcom/daaw/g46;->b:Lcom/daaw/dh5;

    invoke-virtual {v1}, Lcom/daaw/dh5;->c()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/daaw/g46;->b:Lcom/daaw/dh5;

    invoke-virtual {v2}, Lcom/daaw/dh5;->o()Z

    move-result v2

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzt;->zzs()Lcom/google/android/gms/ads/internal/util/zzaw;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/android/gms/ads/internal/util/zzaw;->zzl()Z

    move-result v3

    invoke-direct {v0, v1, v2, v3}, Lcom/daaw/h46;-><init>(Ljava/lang/String;ZZ)V

    return-object v0
.end method

.method public final zza()I
    .locals 1

    const/16 v0, 0x17

    return v0
.end method

.method public final zzb()Lcom/daaw/f77;
    .locals 2

    iget-object v0, p0, Lcom/daaw/g46;->a:Lcom/daaw/g77;

    new-instance v1, Lcom/daaw/f46;

    invoke-direct {v1, p0}, Lcom/daaw/f46;-><init>(Lcom/daaw/g46;)V

    invoke-interface {v0, v1}, Lcom/daaw/g77;->M(Ljava/util/concurrent/Callable;)Lcom/daaw/f77;

    move-result-object v0

    return-object v0
.end method
