.class public final Lcom/daaw/x66;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/i76;


# instance fields
.field public final a:Lcom/daaw/g77;

.field public final b:Landroid/content/Context;

.field public final c:Lcom/google/android/gms/internal/ads/zzchu;


# direct methods
.method public constructor <init>(Lcom/daaw/g77;Landroid/content/Context;Lcom/google/android/gms/internal/ads/zzchu;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/x66;->a:Lcom/daaw/g77;

    iput-object p2, p0, Lcom/daaw/x66;->b:Landroid/content/Context;

    iput-object p3, p0, Lcom/daaw/x66;->c:Lcom/google/android/gms/internal/ads/zzchu;

    return-void
.end method


# virtual methods
.method public final synthetic a()Lcom/daaw/y66;
    .locals 10

    new-instance v8, Lcom/daaw/y66;

    iget-object v0, p0, Lcom/daaw/x66;->b:Landroid/content/Context;

    invoke-static {v0}, Lcom/daaw/ez1;->a(Landroid/content/Context;)Lcom/daaw/iv0;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/iv0;->g()Z

    move-result v1

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzt;->zzp()Lcom/google/android/gms/ads/internal/util/zzs;

    iget-object v0, p0, Lcom/daaw/x66;->b:Landroid/content/Context;

    invoke-static {v0}, Lcom/google/android/gms/ads/internal/util/zzs;->zzA(Landroid/content/Context;)Z

    move-result v2

    iget-object v0, p0, Lcom/daaw/x66;->c:Lcom/google/android/gms/internal/ads/zzchu;

    iget-object v3, v0, Lcom/google/android/gms/internal/ads/zzchu;->p:Ljava/lang/String;

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzt;->zzp()Lcom/google/android/gms/ads/internal/util/zzs;

    invoke-static {}, Lcom/google/android/gms/ads/internal/util/zzs;->zzB()Z

    move-result v4

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzt;->zzp()Lcom/google/android/gms/ads/internal/util/zzs;

    iget-object v0, p0, Lcom/daaw/x66;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    const/4 v5, 0x0

    goto :goto_0

    :cond_0
    iget v0, v0, Landroid/content/pm/ApplicationInfo;->targetSdkVersion:I

    move v5, v0

    :goto_0
    iget-object v0, p0, Lcom/daaw/x66;->b:Landroid/content/Context;

    const-string v6, "com.google.android.gms.ads.dynamite"

    invoke-static {v0, v6}, Lcom/google/android/gms/dynamite/DynamiteModule;->c(Landroid/content/Context;Ljava/lang/String;)I

    move-result v7

    iget-object v0, p0, Lcom/daaw/x66;->b:Landroid/content/Context;

    invoke-static {v0, v6}, Lcom/google/android/gms/dynamite/DynamiteModule;->a(Landroid/content/Context;Ljava/lang/String;)I

    move-result v9

    move-object v0, v8

    move v6, v7

    move v7, v9

    invoke-direct/range {v0 .. v7}, Lcom/daaw/y66;-><init>(ZZLjava/lang/String;ZIII)V

    return-object v8
.end method

.method public final zza()I
    .locals 1

    const/16 v0, 0x23

    return v0
.end method

.method public final zzb()Lcom/daaw/f77;
    .locals 2

    iget-object v0, p0, Lcom/daaw/x66;->a:Lcom/daaw/g77;

    new-instance v1, Lcom/daaw/w66;

    invoke-direct {v1, p0}, Lcom/daaw/w66;-><init>(Lcom/daaw/x66;)V

    invoke-interface {v0, v1}, Lcom/daaw/g77;->M(Ljava/util/concurrent/Callable;)Lcom/daaw/f77;

    move-result-object v0

    return-object v0
.end method
