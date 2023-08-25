.class public final Lcom/daaw/su7;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/nt6;


# instance fields
.field public final synthetic a:Lcom/google/android/gms/ads/internal/zzi;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/ads/internal/zzi;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/su7;->a:Lcom/google/android/gms/ads/internal/zzi;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(IJLjava/lang/String;)V
    .locals 3

    iget-object v0, p0, Lcom/daaw/su7;->a:Lcom/google/android/gms/ads/internal/zzi;

    invoke-static {v0}, Lcom/google/android/gms/ads/internal/zzi;->a(Lcom/google/android/gms/ads/internal/zzi;)Lcom/daaw/es6;

    move-result-object v0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    sub-long/2addr v1, p2

    invoke-virtual {v0, p1, v1, v2, p4}, Lcom/daaw/es6;->e(IJLjava/lang/String;)Lcom/daaw/rj1;

    return-void
.end method

.method public final b(IJ)V
    .locals 3

    iget-object v0, p0, Lcom/daaw/su7;->a:Lcom/google/android/gms/ads/internal/zzi;

    invoke-static {v0}, Lcom/google/android/gms/ads/internal/zzi;->a(Lcom/google/android/gms/ads/internal/zzi;)Lcom/daaw/es6;

    move-result-object v0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    sub-long/2addr v1, p2

    invoke-virtual {v0, p1, v1, v2}, Lcom/daaw/es6;->d(IJ)Lcom/daaw/rj1;

    return-void
.end method
