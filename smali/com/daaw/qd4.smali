.class public final Lcom/daaw/qd4;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/android/gms/ads/nonagon/signalgeneration/zzg;


# instance fields
.field public final a:Lcom/daaw/bb4;

.field public b:Lcom/daaw/up4;

.field public c:Lcom/google/android/gms/ads/nonagon/signalgeneration/zzag;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/bb4;Lcom/daaw/pd4;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/qd4;->a:Lcom/daaw/bb4;

    return-void
.end method


# virtual methods
.method public final synthetic zza(Lcom/daaw/up4;)Lcom/google/android/gms/ads/nonagon/signalgeneration/zzg;
    .locals 0

    iput-object p1, p0, Lcom/daaw/qd4;->b:Lcom/daaw/up4;

    return-object p0
.end method

.method public final synthetic zzb(Lcom/google/android/gms/ads/nonagon/signalgeneration/zzag;)Lcom/google/android/gms/ads/nonagon/signalgeneration/zzg;
    .locals 0

    iput-object p1, p0, Lcom/daaw/qd4;->c:Lcom/google/android/gms/ads/nonagon/signalgeneration/zzag;

    return-object p0
.end method

.method public final zzc()Lcom/google/android/gms/ads/nonagon/signalgeneration/zzh;
    .locals 11

    iget-object v0, p0, Lcom/daaw/qd4;->b:Lcom/daaw/up4;

    const-class v1, Lcom/daaw/up4;

    invoke-static {v0, v1}, Lcom/daaw/e08;->c(Ljava/lang/Object;Ljava/lang/Class;)V

    iget-object v0, p0, Lcom/daaw/qd4;->c:Lcom/google/android/gms/ads/nonagon/signalgeneration/zzag;

    const-class v1, Lcom/google/android/gms/ads/nonagon/signalgeneration/zzag;

    invoke-static {v0, v1}, Lcom/daaw/e08;->c(Ljava/lang/Object;Ljava/lang/Class;)V

    new-instance v0, Lcom/daaw/sd4;

    iget-object v3, p0, Lcom/daaw/qd4;->a:Lcom/daaw/bb4;

    iget-object v4, p0, Lcom/daaw/qd4;->c:Lcom/google/android/gms/ads/nonagon/signalgeneration/zzag;

    new-instance v5, Lcom/daaw/ln4;

    invoke-direct {v5}, Lcom/daaw/ln4;-><init>()V

    new-instance v6, Lcom/daaw/xd5;

    invoke-direct {v6}, Lcom/daaw/xd5;-><init>()V

    iget-object v7, p0, Lcom/daaw/qd4;->b:Lcom/daaw/up4;

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    move-object v2, v0

    invoke-direct/range {v2 .. v10}, Lcom/daaw/sd4;-><init>(Lcom/daaw/bb4;Lcom/google/android/gms/ads/nonagon/signalgeneration/zzag;Lcom/daaw/ln4;Lcom/daaw/xd5;Lcom/daaw/up4;Lcom/daaw/if6;Lcom/daaw/ge6;Lcom/daaw/rd4;)V

    return-object v0
.end method
