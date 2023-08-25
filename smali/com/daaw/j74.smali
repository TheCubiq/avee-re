.class public final synthetic Lcom/daaw/j74;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/v57;


# instance fields
.field public final synthetic a:Landroid/content/Context;

.field public final synthetic b:Lcom/daaw/sl2;

.field public final synthetic c:Lcom/google/android/gms/internal/ads/zzchu;

.field public final synthetic d:Lcom/google/android/gms/ads/internal/zza;

.field public final synthetic e:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Landroid/content/Context;Lcom/daaw/sl2;Lcom/google/android/gms/internal/ads/zzchu;Lcom/google/android/gms/ads/internal/zza;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/j74;->a:Landroid/content/Context;

    iput-object p2, p0, Lcom/daaw/j74;->b:Lcom/daaw/sl2;

    iput-object p3, p0, Lcom/daaw/j74;->c:Lcom/google/android/gms/internal/ads/zzchu;

    iput-object p4, p0, Lcom/daaw/j74;->d:Lcom/google/android/gms/ads/internal/zza;

    iput-object p5, p0, Lcom/daaw/j74;->e:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final zza()Lcom/daaw/f77;
    .locals 15

    iget-object v0, p0, Lcom/daaw/j74;->a:Landroid/content/Context;

    iget-object v5, p0, Lcom/daaw/j74;->b:Lcom/daaw/sl2;

    iget-object v7, p0, Lcom/daaw/j74;->c:Lcom/google/android/gms/internal/ads/zzchu;

    iget-object v10, p0, Lcom/daaw/j74;->d:Lcom/google/android/gms/ads/internal/zza;

    iget-object v14, p0, Lcom/daaw/j74;->e:Ljava/lang/String;

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzt;->zzz()Lcom/daaw/p74;

    invoke-static {}, Lcom/daaw/v84;->a()Lcom/daaw/v84;

    move-result-object v1

    invoke-static {}, Lcom/daaw/x33;->a()Lcom/daaw/x33;

    move-result-object v11

    const-string v2, ""

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v6, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    invoke-static/range {v0 .. v13}, Lcom/daaw/p74;->a(Landroid/content/Context;Lcom/daaw/v84;Ljava/lang/String;ZZLcom/daaw/sl2;Lcom/daaw/ja3;Lcom/google/android/gms/internal/ads/zzchu;Lcom/daaw/v93;Lcom/google/android/gms/ads/internal/zzl;Lcom/google/android/gms/ads/internal/zza;Lcom/daaw/x33;Lcom/daaw/th6;Lcom/daaw/wh6;)Lcom/daaw/a74;

    move-result-object v0

    invoke-static {v0}, Lcom/daaw/d14;->e(Ljava/lang/Object;)Lcom/daaw/d14;

    move-result-object v1

    invoke-interface {v0}, Lcom/daaw/a74;->zzP()Lcom/daaw/t84;

    move-result-object v2

    new-instance v3, Lcom/daaw/k74;

    invoke-direct {v3, v1}, Lcom/daaw/k74;-><init>(Lcom/daaw/d14;)V

    invoke-interface {v2, v3}, Lcom/daaw/t84;->E(Lcom/daaw/o84;)V

    invoke-interface {v0, v14}, Lcom/daaw/a74;->loadUrl(Ljava/lang/String;)V

    return-object v1
.end method
