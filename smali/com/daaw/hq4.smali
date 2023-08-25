.class public final Lcom/daaw/hq4;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/wz7;


# instance fields
.field public final a:Lcom/daaw/gq4;

.field public final b:Lcom/daaw/m08;

.field public final c:Lcom/daaw/m08;

.field public final d:Lcom/daaw/m08;

.field public final e:Lcom/daaw/m08;


# direct methods
.method public constructor <init>(Lcom/daaw/gq4;Lcom/daaw/m08;Lcom/daaw/m08;Lcom/daaw/m08;Lcom/daaw/m08;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/hq4;->a:Lcom/daaw/gq4;

    iput-object p2, p0, Lcom/daaw/hq4;->b:Lcom/daaw/m08;

    iput-object p3, p0, Lcom/daaw/hq4;->c:Lcom/daaw/m08;

    iput-object p4, p0, Lcom/daaw/hq4;->d:Lcom/daaw/m08;

    iput-object p5, p0, Lcom/daaw/hq4;->e:Lcom/daaw/m08;

    return-void
.end method


# virtual methods
.method public final synthetic zzb()Ljava/lang/Object;
    .locals 9

    iget-object v0, p0, Lcom/daaw/hq4;->b:Lcom/daaw/m08;

    invoke-interface {v0}, Lcom/daaw/m08;->zzb()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Landroid/content/Context;

    iget-object v0, p0, Lcom/daaw/hq4;->c:Lcom/daaw/m08;

    check-cast v0, Lcom/daaw/u94;

    invoke-virtual {v0}, Lcom/daaw/u94;->a()Lcom/google/android/gms/internal/ads/zzchu;

    move-result-object v3

    iget-object v0, p0, Lcom/daaw/hq4;->d:Lcom/daaw/m08;

    check-cast v0, Lcom/daaw/sm4;

    invoke-virtual {v0}, Lcom/daaw/sm4;->a()Lcom/daaw/th6;

    move-result-object v0

    new-instance v6, Lcom/daaw/zw3;

    invoke-direct {v6}, Lcom/daaw/zw3;-><init>()V

    iget-object v1, v0, Lcom/daaw/th6;->B:Lcom/google/android/gms/internal/ads/zzcem;

    if-eqz v1, :cond_0

    new-instance v8, Lcom/daaw/yw3;

    iget-object v4, v0, Lcom/daaw/th6;->B:Lcom/google/android/gms/internal/ads/zzcem;

    iget-object v0, v0, Lcom/daaw/th6;->t:Lcom/daaw/yh6;

    iget-object v5, v0, Lcom/daaw/yh6;->b:Ljava/lang/String;

    const/4 v7, 0x0

    move-object v1, v8

    invoke-direct/range {v1 .. v7}, Lcom/daaw/yw3;-><init>(Landroid/content/Context;Lcom/google/android/gms/internal/ads/zzchu;Lcom/google/android/gms/internal/ads/zzcem;Ljava/lang/String;Lcom/daaw/zw3;[B)V

    return-object v8

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method
