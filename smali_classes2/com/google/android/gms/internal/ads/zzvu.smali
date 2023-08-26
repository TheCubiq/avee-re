.class final Lcom/google/android/gms/internal/ads/zzvu;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzaoo;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/android/gms/internal/ads/zzaoo<",
        "Lcom/google/android/gms/internal/ads/zzwb;",
        ">;"
    }
.end annotation


# instance fields
.field private final synthetic zzbqs:Lcom/google/android/gms/internal/ads/zzvs;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/zzvs;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzvu;->zzbqs:Lcom/google/android/gms/internal/ads/zzvs;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic zze(Ljava/lang/Object;)V
    .locals 0

    const-string p1, "Releasing engine reference."

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/zzakb;->v(Ljava/lang/String;)V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzvu;->zzbqs:Lcom/google/android/gms/internal/ads/zzvs;

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/zzvs;->zza(Lcom/google/android/gms/internal/ads/zzvs;)Lcom/google/android/gms/internal/ads/zzvw;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzvw;->zzma()V

    return-void
.end method
