.class final Lcom/google/android/gms/internal/ads/zzws;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzaom;


# instance fields
.field private final synthetic zzbrl:Lcom/google/android/gms/internal/ads/zzvs;

.field private final synthetic zzbrn:Lcom/google/android/gms/internal/ads/zzaoj;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/zzwq;Lcom/google/android/gms/internal/ads/zzaoj;Lcom/google/android/gms/internal/ads/zzvs;)V
    .locals 0

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzws;->zzbrn:Lcom/google/android/gms/internal/ads/zzaoj;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/zzws;->zzbrl:Lcom/google/android/gms/internal/ads/zzvs;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzws;->zzbrn:Lcom/google/android/gms/internal/ads/zzaoj;

    new-instance v1, Lcom/google/android/gms/internal/ads/zzwe;

    const-string v2, "Unable to obtain a JavascriptEngine."

    invoke-direct {v1, v2}, Lcom/google/android/gms/internal/ads/zzwe;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/zzaoj;->setException(Ljava/lang/Throwable;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzws;->zzbrl:Lcom/google/android/gms/internal/ads/zzvs;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzvs;->release()V

    return-void
.end method
