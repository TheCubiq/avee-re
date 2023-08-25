.class public final Lcom/daaw/ym5;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/o67;


# instance fields
.field public final synthetic a:Lcom/daaw/hu3;


# direct methods
.method public constructor <init>(Lcom/daaw/cn5;Lcom/daaw/hu3;)V
    .locals 0

    iput-object p2, p0, Lcom/daaw/ym5;->a:Lcom/daaw/hu3;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final bridge synthetic a(Ljava/lang/Object;)V
    .locals 1

    check-cast p1, Landroid/os/ParcelFileDescriptor;

    :try_start_0
    iget-object v0, p0, Lcom/daaw/ym5;->a:Lcom/daaw/hu3;

    invoke-interface {v0, p1}, Lcom/daaw/hu3;->y(Landroid/os/ParcelFileDescriptor;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    const-string v0, "Service can\'t call client"

    invoke-static {v0, p1}, Lcom/google/android/gms/ads/internal/util/zze;->zzb(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public final b(Ljava/lang/Throwable;)V
    .locals 1

    :try_start_0
    iget-object v0, p0, Lcom/daaw/ym5;->a:Lcom/daaw/hu3;

    invoke-static {p1}, Lcom/google/android/gms/ads/internal/util/zzaz;->zzb(Ljava/lang/Throwable;)Lcom/google/android/gms/ads/internal/util/zzaz;

    move-result-object p1

    invoke-interface {v0, p1}, Lcom/daaw/hu3;->K(Lcom/google/android/gms/ads/internal/util/zzaz;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    const-string v0, "Service can\'t call client"

    invoke-static {v0, p1}, Lcom/google/android/gms/ads/internal/util/zze;->zzb(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method
