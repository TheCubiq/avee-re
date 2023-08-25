.class public final synthetic Lcom/daaw/ej4;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/fs4;


# instance fields
.field public final synthetic p:Landroid/content/Context;

.field public final synthetic q:Lcom/google/android/gms/internal/ads/zzchu;

.field public final synthetic r:Lcom/daaw/th6;

.field public final synthetic s:Lcom/daaw/ri6;


# direct methods
.method public synthetic constructor <init>(Landroid/content/Context;Lcom/google/android/gms/internal/ads/zzchu;Lcom/daaw/th6;Lcom/daaw/ri6;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/ej4;->p:Landroid/content/Context;

    iput-object p2, p0, Lcom/daaw/ej4;->q:Lcom/google/android/gms/internal/ads/zzchu;

    iput-object p3, p0, Lcom/daaw/ej4;->r:Lcom/daaw/th6;

    iput-object p4, p0, Lcom/daaw/ej4;->s:Lcom/daaw/ri6;

    return-void
.end method


# virtual methods
.method public final zzn()V
    .locals 5

    iget-object v0, p0, Lcom/daaw/ej4;->p:Landroid/content/Context;

    iget-object v1, p0, Lcom/daaw/ej4;->q:Lcom/google/android/gms/internal/ads/zzchu;

    iget-object v2, p0, Lcom/daaw/ej4;->r:Lcom/daaw/th6;

    iget-object v3, p0, Lcom/daaw/ej4;->s:Lcom/daaw/ri6;

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzt;->zzs()Lcom/google/android/gms/ads/internal/util/zzaw;

    move-result-object v4

    iget-object v1, v1, Lcom/google/android/gms/internal/ads/zzchu;->p:Ljava/lang/String;

    iget-object v2, v2, Lcom/daaw/th6;->D:Lorg/json/JSONObject;

    invoke-virtual {v2}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v2

    iget-object v3, v3, Lcom/daaw/ri6;->f:Ljava/lang/String;

    invoke-virtual {v4, v0, v1, v2, v3}, Lcom/google/android/gms/ads/internal/util/zzaw;->zzn(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z

    return-void
.end method
