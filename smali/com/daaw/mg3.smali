.class public final Lcom/daaw/mg3;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/o67;


# instance fields
.field public final synthetic a:Lcom/daaw/a74;


# direct methods
.method public constructor <init>(Lcom/daaw/a74;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/mg3;->a:Lcom/daaw/a74;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final bridge synthetic a(Ljava/lang/Object;)V
    .locals 3

    check-cast p1, Ljava/lang/String;

    new-instance v0, Lcom/google/android/gms/ads/internal/util/zzby;

    iget-object v1, p0, Lcom/daaw/mg3;->a:Lcom/daaw/a74;

    invoke-interface {v1}, Lcom/daaw/a74;->getContext()Landroid/content/Context;

    move-result-object v1

    iget-object v2, p0, Lcom/daaw/mg3;->a:Lcom/daaw/a74;

    invoke-interface {v2}, Lcom/daaw/a74;->zzp()Lcom/google/android/gms/internal/ads/zzchu;

    move-result-object v2

    iget-object v2, v2, Lcom/google/android/gms/internal/ads/zzchu;->p:Ljava/lang/String;

    invoke-direct {v0, v1, v2, p1}, Lcom/google/android/gms/ads/internal/util/zzby;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0}, Lcom/google/android/gms/ads/internal/util/zzb;->zzb()Lcom/daaw/f77;

    return-void
.end method

.method public final b(Ljava/lang/Throwable;)V
    .locals 0

    return-void
.end method
