.class public final synthetic Lcom/daaw/tl5;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/ey6;


# instance fields
.field public final synthetic a:Lcom/daaw/ul5;

.field public final synthetic b:Lcom/google/android/gms/internal/ads/zzccb;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/ul5;Lcom/google/android/gms/internal/ads/zzccb;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/tl5;->a:Lcom/daaw/ul5;

    iput-object p2, p0, Lcom/daaw/tl5;->b:Lcom/google/android/gms/internal/ads/zzccb;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lcom/daaw/tl5;->b:Lcom/google/android/gms/internal/ads/zzccb;

    check-cast p1, Lorg/json/JSONObject;

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/zzccb;->p:Landroid/os/Bundle;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    :try_start_0
    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzay;->zzb()Lcom/daaw/d04;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/daaw/d04;->n(Landroid/os/Bundle;)Lorg/json/JSONObject;

    move-result-object v0
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_1

    :try_start_1
    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzay;->zzb()Lcom/daaw/d04;

    move-result-object v1

    invoke-virtual {v1, v0, p1}, Lcom/daaw/d04;->q(Lorg/json/JSONObject;Lorg/json/JSONObject;)V
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_0

    :catch_0
    move-object p1, v0

    :catch_1
    :goto_0
    return-object p1
.end method
