.class public final synthetic Lcom/daaw/ks5;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/xl4;


# instance fields
.field public final synthetic a:Lcom/daaw/tq5;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/tq5;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/ks5;->a:Lcom/daaw/tq5;

    return-void
.end method


# virtual methods
.method public final zza()Lcom/google/android/gms/ads/internal/client/zzdq;
    .locals 2

    iget-object v0, p0, Lcom/daaw/ks5;->a:Lcom/daaw/tq5;

    :try_start_0
    iget-object v0, v0, Lcom/daaw/tq5;->b:Ljava/lang/Object;

    check-cast v0, Lcom/daaw/dp3;

    invoke-interface {v0}, Lcom/daaw/dp3;->zze()Lcom/google/android/gms/ads/internal/client/zzdq;

    move-result-object v0
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    new-instance v1, Lcom/daaw/wi6;

    invoke-direct {v1, v0}, Lcom/daaw/wi6;-><init>(Ljava/lang/Throwable;)V

    throw v1
.end method
