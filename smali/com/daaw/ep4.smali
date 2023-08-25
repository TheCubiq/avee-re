.class public final synthetic Lcom/daaw/ep4;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/ey6;


# instance fields
.field public final synthetic a:Landroid/content/Context;

.field public final synthetic b:Lcom/google/android/gms/internal/ads/zzchu;

.field public final synthetic c:Lcom/daaw/ri6;


# direct methods
.method public synthetic constructor <init>(Landroid/content/Context;Lcom/google/android/gms/internal/ads/zzchu;Lcom/daaw/ri6;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/ep4;->a:Landroid/content/Context;

    iput-object p2, p0, Lcom/daaw/ep4;->b:Lcom/google/android/gms/internal/ads/zzchu;

    iput-object p3, p0, Lcom/daaw/ep4;->c:Lcom/daaw/ri6;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    iget-object v0, p0, Lcom/daaw/ep4;->a:Landroid/content/Context;

    iget-object v1, p0, Lcom/daaw/ep4;->b:Lcom/google/android/gms/internal/ads/zzchu;

    iget-object v2, p0, Lcom/daaw/ep4;->c:Lcom/daaw/ri6;

    check-cast p1, Lcom/daaw/th6;

    new-instance v3, Lcom/google/android/gms/ads/internal/util/zzas;

    invoke-direct {v3, v0}, Lcom/google/android/gms/ads/internal/util/zzas;-><init>(Landroid/content/Context;)V

    iget-object v0, p1, Lcom/daaw/th6;->C:Ljava/lang/String;

    invoke-virtual {v3, v0}, Lcom/google/android/gms/ads/internal/util/zzas;->zzp(Ljava/lang/String;)V

    iget-object p1, p1, Lcom/daaw/th6;->D:Lorg/json/JSONObject;

    invoke-virtual {p1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v3, p1}, Lcom/google/android/gms/ads/internal/util/zzas;->zzq(Ljava/lang/String;)V

    iget-object p1, v1, Lcom/google/android/gms/internal/ads/zzchu;->p:Ljava/lang/String;

    invoke-virtual {v3, p1}, Lcom/google/android/gms/ads/internal/util/zzas;->zzo(Ljava/lang/String;)V

    iget-object p1, v2, Lcom/daaw/ri6;->f:Ljava/lang/String;

    invoke-virtual {v3, p1}, Lcom/google/android/gms/ads/internal/util/zzas;->zzn(Ljava/lang/String;)V

    return-object v3
.end method
