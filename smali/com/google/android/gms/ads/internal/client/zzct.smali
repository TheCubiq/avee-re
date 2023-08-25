.class public final Lcom/google/android/gms/ads/internal/client/zzct;
.super Lcom/google/android/gms/ads/internal/client/zzcr;
.source ""


# instance fields
.field public final p:Lcom/google/android/gms/ads/MuteThisAdListener;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/ads/MuteThisAdListener;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/ads/internal/client/zzcr;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/ads/internal/client/zzct;->p:Lcom/google/android/gms/ads/MuteThisAdListener;

    return-void
.end method


# virtual methods
.method public final zze()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/client/zzct;->p:Lcom/google/android/gms/ads/MuteThisAdListener;

    invoke-interface {v0}, Lcom/google/android/gms/ads/MuteThisAdListener;->onAdMuted()V

    return-void
.end method
