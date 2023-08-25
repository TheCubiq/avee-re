.class public final synthetic Lcom/daaw/hi5;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic a:Lcom/daaw/ki5;

.field public final synthetic b:Lcom/google/android/gms/internal/ads/zzccb;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/ki5;Lcom/google/android/gms/internal/ads/zzccb;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/hi5;->a:Lcom/daaw/ki5;

    iput-object p2, p0, Lcom/daaw/hi5;->b:Lcom/google/android/gms/internal/ads/zzccb;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lcom/daaw/hi5;->a:Lcom/daaw/ki5;

    iget-object v1, p0, Lcom/daaw/hi5;->b:Lcom/google/android/gms/internal/ads/zzccb;

    invoke-virtual {v0, v1}, Lcom/daaw/ki5;->c(Lcom/google/android/gms/internal/ads/zzccb;)Ljava/io/InputStream;

    move-result-object v0

    return-object v0
.end method
