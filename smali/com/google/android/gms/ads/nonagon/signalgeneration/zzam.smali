.class public final Lcom/google/android/gms/ads/nonagon/signalgeneration/zzam;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/w57;


# instance fields
.field public final a:Ljava/util/concurrent/Executor;

.field public final b:Lcom/daaw/ij5;


# direct methods
.method public constructor <init>(Ljava/util/concurrent/Executor;Lcom/daaw/ij5;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/ads/nonagon/signalgeneration/zzam;->a:Ljava/util/concurrent/Executor;

    iput-object p2, p0, Lcom/google/android/gms/ads/nonagon/signalgeneration/zzam;->b:Lcom/daaw/ij5;

    return-void
.end method


# virtual methods
.method public final bridge synthetic zza(Ljava/lang/Object;)Lcom/daaw/f77;
    .locals 2

    check-cast p1, Lcom/google/android/gms/internal/ads/zzccb;

    iget-object v0, p0, Lcom/google/android/gms/ads/nonagon/signalgeneration/zzam;->b:Lcom/daaw/ij5;

    invoke-virtual {v0, p1}, Lcom/daaw/ij5;->b(Lcom/google/android/gms/internal/ads/zzccb;)Lcom/daaw/f77;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/ads/nonagon/signalgeneration/zzal;

    invoke-direct {v1, p1}, Lcom/google/android/gms/ads/nonagon/signalgeneration/zzal;-><init>(Lcom/google/android/gms/internal/ads/zzccb;)V

    iget-object p1, p0, Lcom/google/android/gms/ads/nonagon/signalgeneration/zzam;->a:Ljava/util/concurrent/Executor;

    invoke-static {v0, v1, p1}, Lcom/daaw/s67;->n(Lcom/daaw/f77;Lcom/daaw/w57;Ljava/util/concurrent/Executor;)Lcom/daaw/f77;

    move-result-object p1

    return-object p1
.end method
