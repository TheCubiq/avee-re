.class final Lcom/google/android/gms/internal/ads/zzvd;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/ads/internal/gmsg/zzv;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/android/gms/ads/internal/gmsg/zzv<",
        "Lcom/google/android/gms/internal/ads/zzaqw;",
        ">;"
    }
.end annotation


# instance fields
.field private final synthetic zzbpu:Lcom/google/android/gms/internal/ads/zzuw;

.field private final zzbpw:Lcom/google/android/gms/ads/internal/gmsg/zzv;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/ads/internal/gmsg/zzv<",
            "-",
            "Lcom/google/android/gms/internal/ads/zzwb;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/zzuw;Lcom/google/android/gms/ads/internal/gmsg/zzv;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/ads/internal/gmsg/zzv<",
            "-",
            "Lcom/google/android/gms/internal/ads/zzwb;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzvd;->zzbpu:Lcom/google/android/gms/internal/ads/zzuw;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzvd;->zzbpw:Lcom/google/android/gms/ads/internal/gmsg/zzv;

    return-void
.end method

.method static synthetic zza(Lcom/google/android/gms/internal/ads/zzvd;)Lcom/google/android/gms/ads/internal/gmsg/zzv;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/internal/ads/zzvd;->zzbpw:Lcom/google/android/gms/ads/internal/gmsg/zzv;

    return-object p0
.end method


# virtual methods
.method public final synthetic zza(Ljava/lang/Object;Ljava/util/Map;)V
    .locals 1

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzvd;->zzbpw:Lcom/google/android/gms/ads/internal/gmsg/zzv;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzvd;->zzbpu:Lcom/google/android/gms/internal/ads/zzuw;

    invoke-interface {p1, v0, p2}, Lcom/google/android/gms/ads/internal/gmsg/zzv;->zza(Ljava/lang/Object;Ljava/util/Map;)V

    return-void
.end method
