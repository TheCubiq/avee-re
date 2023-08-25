.class public final Lcom/daaw/rq3;
.super Lcom/daaw/be3;
.source ""


# instance fields
.field public final synthetic p:Lcom/daaw/uq3;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/uq3;Lcom/daaw/nq3;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/rq3;->p:Lcom/daaw/uq3;

    invoke-direct {p0}, Lcom/daaw/be3;-><init>()V

    return-void
.end method


# virtual methods
.method public final u0(Lcom/daaw/sd3;Ljava/lang/String;)V
    .locals 2

    iget-object v0, p0, Lcom/daaw/rq3;->p:Lcom/daaw/uq3;

    invoke-static {v0}, Lcom/daaw/uq3;->c(Lcom/daaw/uq3;)Lcom/google/android/gms/ads/nativead/NativeCustomFormatAd$OnCustomClickListener;

    move-result-object v1

    if-nez v1, :cond_0

    return-void

    :cond_0
    invoke-static {v0}, Lcom/daaw/uq3;->c(Lcom/daaw/uq3;)Lcom/google/android/gms/ads/nativead/NativeCustomFormatAd$OnCustomClickListener;

    move-result-object v1

    invoke-static {v0, p1}, Lcom/daaw/uq3;->e(Lcom/daaw/uq3;Lcom/daaw/sd3;)Lcom/google/android/gms/ads/nativead/NativeCustomFormatAd;

    move-result-object p1

    invoke-interface {v1, p1, p2}, Lcom/google/android/gms/ads/nativead/NativeCustomFormatAd$OnCustomClickListener;->onCustomClick(Lcom/google/android/gms/ads/nativead/NativeCustomFormatAd;Ljava/lang/String;)V

    return-void
.end method
