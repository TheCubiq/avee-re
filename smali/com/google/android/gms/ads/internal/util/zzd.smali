.class public final Lcom/google/android/gms/ads/internal/util/zzd;
.super Ljava/lang/Object;
.source ""


# direct methods
.method public static zza(Landroid/content/Context;)V
    .locals 1

    invoke-static {p0}, Lcom/daaw/j04;->k(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-static {}, Lcom/daaw/j04;->m()Z

    move-result v0

    if-nez v0, :cond_1

    new-instance v0, Lcom/daaw/as3;

    invoke-direct {v0, p0}, Lcom/daaw/as3;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0}, Lcom/google/android/gms/ads/internal/util/zzb;->zzb()Lcom/daaw/f77;

    move-result-object p0

    const-string v0, "Updating ad debug logging enablement."

    invoke-static {v0}, Lcom/daaw/k04;->zzi(Ljava/lang/String;)V

    const-string v0, "AdDebugLogUpdater.updateEnablement"

    invoke-static {p0, v0}, Lcom/daaw/c14;->a(Lcom/daaw/f77;Ljava/lang/String;)V

    :cond_1
    return-void
.end method
