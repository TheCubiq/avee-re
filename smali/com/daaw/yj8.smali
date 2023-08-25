.class public final Lcom/daaw/yj8;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic a:Lcom/google/android/gms/ads/internal/zzs;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/ads/internal/zzs;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/yj8;->a:Lcom/google/android/gms/ads/internal/zzs;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final bridge synthetic call()Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lcom/daaw/yj8;->a:Lcom/google/android/gms/ads/internal/zzs;

    invoke-static {v0}, Lcom/google/android/gms/ads/internal/zzs;->l3(Lcom/google/android/gms/ads/internal/zzs;)Lcom/google/android/gms/internal/ads/zzchu;

    move-result-object v1

    iget-object v1, v1, Lcom/google/android/gms/internal/ads/zzchu;->p:Ljava/lang/String;

    invoke-static {v0}, Lcom/google/android/gms/ads/internal/zzs;->h3(Lcom/google/android/gms/ads/internal/zzs;)Landroid/content/Context;

    move-result-object v0

    const/4 v2, 0x0

    invoke-static {v1, v0, v2}, Lcom/daaw/rl2;->p(Ljava/lang/String;Landroid/content/Context;Z)Lcom/daaw/rl2;

    move-result-object v0

    new-instance v1, Lcom/daaw/sl2;

    invoke-direct {v1, v0}, Lcom/daaw/sl2;-><init>(Lcom/daaw/ol2;)V

    return-object v1
.end method
