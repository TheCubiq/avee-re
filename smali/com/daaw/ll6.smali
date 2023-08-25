.class public final Lcom/daaw/ll6;
.super Ljava/lang/Object;
.source ""


# direct methods
.method public static a()Lcom/daaw/g77;
    .locals 2

    sget-object v0, Lcom/daaw/g93;->e5:Lcom/daaw/y83;

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/daaw/e93;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/daaw/e93;->b(Lcom/daaw/y83;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Lcom/daaw/z04;->c:Lcom/daaw/g77;

    return-object v0

    :cond_0
    sget-object v0, Lcom/daaw/g93;->d5:Lcom/daaw/y83;

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/daaw/e93;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/daaw/e93;->b(Lcom/daaw/y83;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object v0, Lcom/daaw/z04;->a:Lcom/daaw/g77;

    return-object v0

    :cond_1
    sget-object v0, Lcom/daaw/z04;->e:Lcom/daaw/g77;

    return-object v0
.end method
