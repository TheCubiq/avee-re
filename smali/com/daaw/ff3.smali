.class public final Lcom/daaw/ff3;
.super Lcom/daaw/ee3;
.source ""


# instance fields
.field public final synthetic p:Lcom/daaw/gf3;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/gf3;Lcom/daaw/ef3;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/ff3;->p:Lcom/daaw/gf3;

    invoke-direct {p0}, Lcom/daaw/ee3;-><init>()V

    return-void
.end method


# virtual methods
.method public final e2(Lcom/daaw/sd3;)V
    .locals 2

    iget-object v0, p0, Lcom/daaw/ff3;->p:Lcom/daaw/gf3;

    invoke-static {v0}, Lcom/daaw/gf3;->b(Lcom/daaw/gf3;)Lcom/google/android/gms/ads/formats/NativeCustomTemplateAd$OnCustomTemplateAdLoadedListener;

    move-result-object v1

    invoke-static {v0, p1}, Lcom/daaw/gf3;->c(Lcom/daaw/gf3;Lcom/daaw/sd3;)Lcom/google/android/gms/ads/formats/NativeCustomTemplateAd;

    move-result-object p1

    invoke-interface {v1, p1}, Lcom/google/android/gms/ads/formats/NativeCustomTemplateAd$OnCustomTemplateAdLoadedListener;->onCustomTemplateAdLoaded(Lcom/google/android/gms/ads/formats/NativeCustomTemplateAd;)V

    return-void
.end method
