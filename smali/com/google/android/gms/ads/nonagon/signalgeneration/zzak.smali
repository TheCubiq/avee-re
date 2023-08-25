.class public final Lcom/google/android/gms/ads/nonagon/signalgeneration/zzak;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/wz7;


# instance fields
.field public final a:Lcom/daaw/m08;

.field public final b:Lcom/daaw/m08;

.field public final c:Lcom/daaw/m08;


# direct methods
.method public constructor <init>(Lcom/daaw/m08;Lcom/daaw/m08;Lcom/daaw/m08;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/ads/nonagon/signalgeneration/zzak;->a:Lcom/daaw/m08;

    iput-object p2, p0, Lcom/google/android/gms/ads/nonagon/signalgeneration/zzak;->b:Lcom/daaw/m08;

    iput-object p3, p0, Lcom/google/android/gms/ads/nonagon/signalgeneration/zzak;->c:Lcom/daaw/m08;

    return-void
.end method


# virtual methods
.method public final bridge synthetic zzb()Ljava/lang/Object;
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/ads/nonagon/signalgeneration/zzak;->a:Lcom/daaw/m08;

    invoke-interface {v0}, Lcom/daaw/m08;->zzb()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/en6;

    iget-object v1, p0, Lcom/google/android/gms/ads/nonagon/signalgeneration/zzak;->b:Lcom/daaw/m08;

    check-cast v1, Lcom/google/android/gms/ads/nonagon/signalgeneration/zzan;

    invoke-virtual {v1}, Lcom/google/android/gms/ads/nonagon/signalgeneration/zzan;->zza()Lcom/google/android/gms/ads/nonagon/signalgeneration/zzam;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/ads/nonagon/signalgeneration/zzak;->c:Lcom/daaw/m08;

    check-cast v2, Lcom/daaw/pp4;

    invoke-virtual {v2}, Lcom/daaw/pp4;->a()Lcom/daaw/op4;

    move-result-object v2

    sget-object v3, Lcom/daaw/ym6;->L:Lcom/daaw/ym6;

    invoke-virtual {v2}, Lcom/daaw/op4;->c()Lcom/daaw/f77;

    move-result-object v2

    invoke-virtual {v0, v3, v2}, Lcom/daaw/wm6;->b(Ljava/lang/Object;Lcom/daaw/f77;)Lcom/daaw/vm6;

    move-result-object v0

    invoke-virtual {v0, v1}, Lcom/daaw/vm6;->f(Lcom/daaw/w57;)Lcom/daaw/vm6;

    move-result-object v0

    sget-object v1, Lcom/daaw/g93;->W4:Lcom/daaw/y83;

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/daaw/e93;

    move-result-object v2

    invoke-virtual {v2, v1}, Lcom/daaw/e93;->b(Lcom/daaw/y83;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    int-to-long v1, v1

    sget-object v3, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v0, v1, v2, v3}, Lcom/daaw/vm6;->i(JLjava/util/concurrent/TimeUnit;)Lcom/daaw/vm6;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/vm6;->a()Lcom/daaw/gm6;

    move-result-object v0

    return-object v0
.end method
