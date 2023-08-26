.class final synthetic Lcom/google/android/gms/internal/ads/zzvg;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final zzbqc:Lcom/google/android/gms/internal/ads/zzvf;

.field private final zzbqd:Lcom/google/android/gms/internal/ads/zzci;

.field private final zzbqe:Lcom/google/android/gms/internal/ads/zzvw;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/zzvf;Lcom/google/android/gms/internal/ads/zzci;Lcom/google/android/gms/internal/ads/zzvw;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzvg;->zzbqc:Lcom/google/android/gms/internal/ads/zzvf;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzvg;->zzbqd:Lcom/google/android/gms/internal/ads/zzci;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/zzvg;->zzbqe:Lcom/google/android/gms/internal/ads/zzvw;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzvg;->zzbqc:Lcom/google/android/gms/internal/ads/zzvf;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzvg;->zzbqd:Lcom/google/android/gms/internal/ads/zzci;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzvg;->zzbqe:Lcom/google/android/gms/internal/ads/zzvw;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/ads/zzvf;->zza(Lcom/google/android/gms/internal/ads/zzci;Lcom/google/android/gms/internal/ads/zzvw;)V

    return-void
.end method
