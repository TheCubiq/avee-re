.class public final Lcom/daaw/tq3;
.super Lcom/daaw/ee3;
.source ""


# instance fields
.field public final synthetic p:Lcom/daaw/uq3;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/uq3;Lcom/daaw/sq3;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/tq3;->p:Lcom/daaw/uq3;

    invoke-direct {p0}, Lcom/daaw/ee3;-><init>()V

    return-void
.end method


# virtual methods
.method public final e2(Lcom/daaw/sd3;)V
    .locals 2

    iget-object v0, p0, Lcom/daaw/tq3;->p:Lcom/daaw/uq3;

    invoke-static {v0}, Lcom/daaw/uq3;->d(Lcom/daaw/uq3;)Lcom/google/android/gms/ads/nativead/NativeCustomFormatAd$OnCustomFormatAdLoadedListener;

    move-result-object v1

    invoke-static {v0, p1}, Lcom/daaw/uq3;->e(Lcom/daaw/uq3;Lcom/daaw/sd3;)Lcom/google/android/gms/ads/nativead/NativeCustomFormatAd;

    move-result-object p1

    invoke-interface {v1, p1}, Lcom/google/android/gms/ads/nativead/NativeCustomFormatAd$OnCustomFormatAdLoadedListener;->onCustomFormatAdLoaded(Lcom/google/android/gms/ads/nativead/NativeCustomFormatAd;)V

    return-void
.end method
