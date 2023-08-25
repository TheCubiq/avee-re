.class public final Lcom/daaw/uu5;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/o67;


# instance fields
.field public final synthetic a:J

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:Lcom/daaw/th6;

.field public final synthetic d:Lcom/daaw/wh6;

.field public final synthetic e:Lcom/daaw/kp6;

.field public final synthetic f:Lcom/daaw/fi6;

.field public final synthetic g:Lcom/daaw/vu5;


# direct methods
.method public constructor <init>(Lcom/daaw/vu5;JLjava/lang/String;Lcom/daaw/th6;Lcom/daaw/wh6;Lcom/daaw/kp6;Lcom/daaw/fi6;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/uu5;->g:Lcom/daaw/vu5;

    iput-wide p2, p0, Lcom/daaw/uu5;->a:J

    iput-object p4, p0, Lcom/daaw/uu5;->b:Ljava/lang/String;

    iput-object p5, p0, Lcom/daaw/uu5;->c:Lcom/daaw/th6;

    iput-object p6, p0, Lcom/daaw/uu5;->d:Lcom/daaw/wh6;

    iput-object p7, p0, Lcom/daaw/uu5;->e:Lcom/daaw/kp6;

    iput-object p8, p0, Lcom/daaw/uu5;->f:Lcom/daaw/fi6;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)V
    .locals 11

    iget-object p1, p0, Lcom/daaw/uu5;->g:Lcom/daaw/vu5;

    invoke-static {p1}, Lcom/daaw/vu5;->d(Lcom/daaw/vu5;)Lcom/daaw/ag;

    move-result-object p1

    invoke-interface {p1}, Lcom/daaw/ag;->b()J

    move-result-wide v0

    iget-wide v2, p0, Lcom/daaw/uu5;->a:J

    sub-long/2addr v0, v2

    iget-object v4, p0, Lcom/daaw/uu5;->g:Lcom/daaw/vu5;

    iget-object v5, p0, Lcom/daaw/uu5;->b:Ljava/lang/String;

    iget-object p1, p0, Lcom/daaw/uu5;->c:Lcom/daaw/th6;

    iget-object v9, p1, Lcom/daaw/th6;->h0:Ljava/lang/String;

    const/4 v6, 0x0

    const/4 v10, 0x0

    move-wide v7, v0

    invoke-static/range {v4 .. v10}, Lcom/daaw/vu5;->g(Lcom/daaw/vu5;Ljava/lang/String;IJLjava/lang/String;Ljava/lang/Integer;)V

    iget-object p1, p0, Lcom/daaw/uu5;->g:Lcom/daaw/vu5;

    invoke-static {p1}, Lcom/daaw/vu5;->h(Lcom/daaw/vu5;)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-static {p1}, Lcom/daaw/vu5;->b(Lcom/daaw/vu5;)Lcom/daaw/wu5;

    move-result-object v4

    iget-object v5, p0, Lcom/daaw/uu5;->d:Lcom/daaw/wh6;

    iget-object v6, p0, Lcom/daaw/uu5;->c:Lcom/daaw/th6;

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-wide v9, v0

    invoke-virtual/range {v4 .. v10}, Lcom/daaw/wu5;->a(Lcom/daaw/wh6;Lcom/daaw/th6;ILcom/daaw/uq5;J)V

    :cond_0
    iget-object p1, p0, Lcom/daaw/uu5;->g:Lcom/daaw/vu5;

    invoke-static {p1}, Lcom/daaw/vu5;->a(Lcom/daaw/vu5;)Lcom/daaw/vq5;

    move-result-object p1

    iget-object v2, p0, Lcom/daaw/uu5;->c:Lcom/daaw/th6;

    const/4 v3, 0x0

    invoke-virtual {p1, v2, v0, v1, v3}, Lcom/daaw/vq5;->f(Lcom/daaw/th6;JLcom/google/android/gms/ads/internal/client/zze;)V

    return-void
.end method

.method public final b(Ljava/lang/Throwable;)V
    .locals 13

    iget-object v0, p0, Lcom/daaw/uu5;->g:Lcom/daaw/vu5;

    invoke-static {v0}, Lcom/daaw/vu5;->d(Lcom/daaw/vu5;)Lcom/daaw/ag;

    move-result-object v0

    invoke-interface {v0}, Lcom/daaw/ag;->b()J

    move-result-wide v0

    iget-wide v2, p0, Lcom/daaw/uu5;->a:J

    sub-long/2addr v0, v2

    instance-of v2, p1, Ljava/util/concurrent/TimeoutException;

    const/4 v3, 0x6

    const/4 v11, 0x3

    const/4 v12, 0x0

    if-eqz v2, :cond_0

    const/4 v2, 0x2

    move-object v10, v12

    const/4 v3, 0x2

    goto :goto_0

    :cond_0
    instance-of v2, p1, Lcom/daaw/hu5;

    if-eqz v2, :cond_1

    move-object v10, v12

    const/4 v3, 0x3

    goto :goto_0

    :cond_1
    instance-of v2, p1, Ljava/util/concurrent/CancellationException;

    if-eqz v2, :cond_2

    const/4 v2, 0x4

    move-object v10, v12

    const/4 v3, 0x4

    goto :goto_0

    :cond_2
    instance-of v2, p1, Lcom/daaw/wi6;

    if-eqz v2, :cond_3

    const/4 v2, 0x5

    move-object v10, v12

    const/4 v3, 0x5

    goto :goto_0

    :cond_3
    instance-of v2, p1, Lcom/daaw/gi5;

    if-eqz v2, :cond_5

    invoke-static {p1}, Lcom/daaw/tj6;->a(Ljava/lang/Throwable;)Lcom/google/android/gms/ads/internal/client/zze;

    move-result-object v2

    iget v2, v2, Lcom/google/android/gms/ads/internal/client/zze;->zza:I

    if-ne v2, v11, :cond_4

    const/4 v3, 0x1

    :cond_4
    sget-object v2, Lcom/daaw/g93;->v1:Lcom/daaw/y83;

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/daaw/e93;

    move-result-object v4

    invoke-virtual {v4, v2}, Lcom/daaw/e93;->b(Lcom/daaw/y83;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    if-eqz v2, :cond_5

    instance-of v2, p1, Lcom/daaw/uq5;

    if-eqz v2, :cond_5

    move-object v2, p1

    check-cast v2, Lcom/daaw/uq5;

    invoke-virtual {v2}, Lcom/daaw/uq5;->b()Lcom/google/android/gms/ads/internal/client/zze;

    move-result-object v2

    if-eqz v2, :cond_5

    iget v2, v2, Lcom/google/android/gms/ads/internal/client/zze;->zza:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    move-object v10, v2

    goto :goto_0

    :cond_5
    move-object v10, v12

    :goto_0
    iget-object v4, p0, Lcom/daaw/uu5;->g:Lcom/daaw/vu5;

    iget-object v5, p0, Lcom/daaw/uu5;->b:Ljava/lang/String;

    iget-object v2, p0, Lcom/daaw/uu5;->c:Lcom/daaw/th6;

    iget-object v9, v2, Lcom/daaw/th6;->h0:Ljava/lang/String;

    move v6, v3

    move-wide v7, v0

    invoke-static/range {v4 .. v10}, Lcom/daaw/vu5;->g(Lcom/daaw/vu5;Ljava/lang/String;IJLjava/lang/String;Ljava/lang/Integer;)V

    iget-object v2, p0, Lcom/daaw/uu5;->g:Lcom/daaw/vu5;

    invoke-static {v2}, Lcom/daaw/vu5;->h(Lcom/daaw/vu5;)Z

    move-result v4

    if-eqz v4, :cond_7

    invoke-static {v2}, Lcom/daaw/vu5;->b(Lcom/daaw/vu5;)Lcom/daaw/wu5;

    move-result-object v4

    iget-object v5, p0, Lcom/daaw/uu5;->d:Lcom/daaw/wh6;

    iget-object v6, p0, Lcom/daaw/uu5;->c:Lcom/daaw/th6;

    instance-of v2, p1, Lcom/daaw/uq5;

    if-eqz v2, :cond_6

    move-object v2, p1

    check-cast v2, Lcom/daaw/uq5;

    move-object v8, v2

    goto :goto_1

    :cond_6
    move-object v8, v12

    :goto_1
    move v7, v3

    move-wide v9, v0

    invoke-virtual/range {v4 .. v10}, Lcom/daaw/wu5;->a(Lcom/daaw/wh6;Lcom/daaw/th6;ILcom/daaw/uq5;J)V

    :cond_7
    sget-object v2, Lcom/daaw/g93;->A7:Lcom/daaw/y83;

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/daaw/e93;

    move-result-object v3

    invoke-virtual {v3, v2}, Lcom/daaw/e93;->b(Lcom/daaw/y83;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    if-eqz v2, :cond_8

    iget-object v2, p0, Lcom/daaw/uu5;->g:Lcom/daaw/vu5;

    invoke-static {v2}, Lcom/daaw/vu5;->c(Lcom/daaw/vu5;)Lcom/daaw/op6;

    move-result-object v2

    iget-object v3, p0, Lcom/daaw/uu5;->e:Lcom/daaw/kp6;

    iget-object v4, p0, Lcom/daaw/uu5;->f:Lcom/daaw/fi6;

    iget-object v5, p0, Lcom/daaw/uu5;->c:Lcom/daaw/th6;

    iget-object v6, v5, Lcom/daaw/th6;->o:Ljava/util/List;

    invoke-virtual {v3, v4, v5, v6}, Lcom/daaw/kp6;->c(Lcom/daaw/fi6;Lcom/daaw/th6;Ljava/util/List;)Ljava/util/List;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/daaw/op6;->d(Ljava/util/List;)V

    :cond_8
    invoke-static {p1}, Lcom/daaw/tj6;->a(Ljava/lang/Throwable;)Lcom/google/android/gms/ads/internal/client/zze;

    move-result-object p1

    iget v2, p1, Lcom/google/android/gms/ads/internal/client/zze;->zza:I

    if-eq v2, v11, :cond_9

    if-nez v2, :cond_a

    :cond_9
    iget-object v2, p1, Lcom/google/android/gms/ads/internal/client/zze;->zzd:Lcom/google/android/gms/ads/internal/client/zze;

    if-eqz v2, :cond_a

    iget-object v2, v2, Lcom/google/android/gms/ads/internal/client/zze;->zzc:Ljava/lang/String;

    const-string v3, "com.google.android.gms.ads"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_a

    new-instance v2, Lcom/daaw/uq5;

    const/16 v3, 0xd

    iget-object p1, p1, Lcom/google/android/gms/ads/internal/client/zze;->zzd:Lcom/google/android/gms/ads/internal/client/zze;

    invoke-direct {v2, v3, p1}, Lcom/daaw/uq5;-><init>(ILcom/google/android/gms/ads/internal/client/zze;)V

    invoke-static {v2}, Lcom/daaw/tj6;->a(Ljava/lang/Throwable;)Lcom/google/android/gms/ads/internal/client/zze;

    move-result-object p1

    :cond_a
    iget-object v2, p0, Lcom/daaw/uu5;->g:Lcom/daaw/vu5;

    invoke-static {v2}, Lcom/daaw/vu5;->a(Lcom/daaw/vu5;)Lcom/daaw/vq5;

    move-result-object v2

    iget-object v3, p0, Lcom/daaw/uu5;->c:Lcom/daaw/th6;

    invoke-virtual {v2, v3, v0, v1, p1}, Lcom/daaw/vq5;->e(Lcom/daaw/th6;JLcom/google/android/gms/ads/internal/client/zze;)V

    return-void
.end method
