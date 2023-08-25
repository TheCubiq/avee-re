.class public Lcom/google/android/gms/ads/internal/ClientApi;
.super Lcom/google/android/gms/ads/internal/client/zzcd;
.source ""


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/ads/internal/client/zzcd;-><init>()V

    return-void
.end method


# virtual methods
.method public final zzb(Lcom/daaw/yd0;Ljava/lang/String;Lcom/daaw/an3;I)Lcom/google/android/gms/ads/internal/client/zzbq;
    .locals 0

    invoke-static {p1}, Lcom/daaw/nt0;->M(Lcom/daaw/yd0;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/content/Context;

    invoke-static {p1, p3, p4}, Lcom/daaw/b94;->f(Landroid/content/Context;Lcom/daaw/an3;I)Lcom/daaw/b94;

    move-result-object p3

    new-instance p4, Lcom/daaw/ay5;

    invoke-direct {p4, p3, p1, p2}, Lcom/daaw/ay5;-><init>(Lcom/daaw/b94;Landroid/content/Context;Ljava/lang/String;)V

    return-object p4
.end method

.method public final zzc(Lcom/daaw/yd0;Lcom/google/android/gms/ads/internal/client/zzq;Ljava/lang/String;Lcom/daaw/an3;I)Lcom/google/android/gms/ads/internal/client/zzbu;
    .locals 0

    invoke-static {p1}, Lcom/daaw/nt0;->M(Lcom/daaw/yd0;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/content/Context;

    invoke-static {p1, p4, p5}, Lcom/daaw/b94;->f(Landroid/content/Context;Lcom/daaw/an3;I)Lcom/daaw/b94;

    move-result-object p2

    invoke-virtual {p2}, Lcom/daaw/b94;->w()Lcom/daaw/cc6;

    move-result-object p2

    invoke-interface {p2, p3}, Lcom/daaw/cc6;->zza(Ljava/lang/String;)Lcom/daaw/cc6;

    invoke-interface {p2, p1}, Lcom/daaw/cc6;->a(Landroid/content/Context;)Lcom/daaw/cc6;

    invoke-interface {p2}, Lcom/daaw/cc6;->zzc()Lcom/daaw/dc6;

    move-result-object p1

    sget-object p2, Lcom/daaw/g93;->I4:Lcom/daaw/y83;

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/daaw/e93;

    move-result-object p3

    invoke-virtual {p3, p2}, Lcom/daaw/e93;->b(Lcom/daaw/y83;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    if-lt p5, p2, :cond_0

    invoke-interface {p1}, Lcom/daaw/dc6;->zzb()Lcom/daaw/ld6;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-interface {p1}, Lcom/daaw/dc6;->zza()Lcom/daaw/ac6;

    move-result-object p1

    return-object p1
.end method

.method public final zzd(Lcom/daaw/yd0;Lcom/google/android/gms/ads/internal/client/zzq;Ljava/lang/String;Lcom/daaw/an3;I)Lcom/google/android/gms/ads/internal/client/zzbu;
    .locals 0

    invoke-static {p1}, Lcom/daaw/nt0;->M(Lcom/daaw/yd0;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/content/Context;

    invoke-static {p1, p4, p5}, Lcom/daaw/b94;->f(Landroid/content/Context;Lcom/daaw/an3;I)Lcom/daaw/b94;

    move-result-object p4

    invoke-virtual {p4}, Lcom/daaw/b94;->x()Lcom/daaw/td6;

    move-result-object p4

    invoke-interface {p4, p1}, Lcom/daaw/td6;->b(Landroid/content/Context;)Lcom/daaw/td6;

    invoke-interface {p4, p2}, Lcom/daaw/td6;->a(Lcom/google/android/gms/ads/internal/client/zzq;)Lcom/daaw/td6;

    invoke-interface {p4, p3}, Lcom/daaw/td6;->zzb(Ljava/lang/String;)Lcom/daaw/td6;

    invoke-interface {p4}, Lcom/daaw/td6;->zzd()Lcom/daaw/ud6;

    move-result-object p1

    invoke-interface {p1}, Lcom/daaw/ud6;->zza()Lcom/daaw/dy5;

    move-result-object p1

    return-object p1
.end method

.method public final zze(Lcom/daaw/yd0;Lcom/google/android/gms/ads/internal/client/zzq;Ljava/lang/String;Lcom/daaw/an3;I)Lcom/google/android/gms/ads/internal/client/zzbu;
    .locals 0

    invoke-static {p1}, Lcom/daaw/nt0;->M(Lcom/daaw/yd0;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/content/Context;

    invoke-static {p1, p4, p5}, Lcom/daaw/b94;->f(Landroid/content/Context;Lcom/daaw/an3;I)Lcom/daaw/b94;

    move-result-object p4

    invoke-virtual {p4}, Lcom/daaw/b94;->y()Lcom/daaw/sf6;

    move-result-object p4

    invoke-interface {p4, p1}, Lcom/daaw/sf6;->b(Landroid/content/Context;)Lcom/daaw/sf6;

    invoke-interface {p4, p2}, Lcom/daaw/sf6;->a(Lcom/google/android/gms/ads/internal/client/zzq;)Lcom/daaw/sf6;

    invoke-interface {p4, p3}, Lcom/daaw/sf6;->zzb(Ljava/lang/String;)Lcom/daaw/sf6;

    invoke-interface {p4}, Lcom/daaw/sf6;->zzd()Lcom/daaw/tf6;

    move-result-object p1

    invoke-interface {p1}, Lcom/daaw/tf6;->zza()Lcom/daaw/iz5;

    move-result-object p1

    return-object p1
.end method

.method public final zzf(Lcom/daaw/yd0;Lcom/google/android/gms/ads/internal/client/zzq;Ljava/lang/String;I)Lcom/google/android/gms/ads/internal/client/zzbu;
    .locals 4

    invoke-static {p1}, Lcom/daaw/nt0;->M(Lcom/daaw/yd0;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/content/Context;

    new-instance v0, Lcom/google/android/gms/internal/ads/zzchu;

    const v1, 0xd601280

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-direct {v0, v1, p4, v2, v3}, Lcom/google/android/gms/internal/ads/zzchu;-><init>(IIZZ)V

    new-instance p4, Lcom/google/android/gms/ads/internal/zzs;

    invoke-direct {p4, p1, p2, p3, v0}, Lcom/google/android/gms/ads/internal/zzs;-><init>(Landroid/content/Context;Lcom/google/android/gms/ads/internal/client/zzq;Ljava/lang/String;Lcom/google/android/gms/internal/ads/zzchu;)V

    return-object p4
.end method

.method public final zzg(Lcom/daaw/yd0;I)Lcom/google/android/gms/ads/internal/client/zzco;
    .locals 1

    invoke-static {p1}, Lcom/daaw/nt0;->M(Lcom/daaw/yd0;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/content/Context;

    const/4 v0, 0x0

    invoke-static {p1, v0, p2}, Lcom/daaw/b94;->f(Landroid/content/Context;Lcom/daaw/an3;I)Lcom/daaw/b94;

    move-result-object p1

    invoke-virtual {p1}, Lcom/daaw/b94;->g()Lcom/daaw/ie4;

    move-result-object p1

    return-object p1
.end method

.method public final zzh(Lcom/daaw/yd0;Lcom/daaw/an3;I)Lcom/google/android/gms/ads/internal/client/zzdj;
    .locals 0

    invoke-static {p1}, Lcom/daaw/nt0;->M(Lcom/daaw/yd0;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/content/Context;

    invoke-static {p1, p2, p3}, Lcom/daaw/b94;->f(Landroid/content/Context;Lcom/daaw/an3;I)Lcom/daaw/b94;

    move-result-object p1

    invoke-virtual {p1}, Lcom/daaw/b94;->q()Lcom/daaw/xh5;

    move-result-object p1

    return-object p1
.end method

.method public final zzi(Lcom/daaw/yd0;Lcom/daaw/yd0;)Lcom/daaw/zc3;
    .locals 2

    invoke-static {p1}, Lcom/daaw/nt0;->M(Lcom/daaw/yd0;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/widget/FrameLayout;

    invoke-static {p2}, Lcom/daaw/nt0;->M(Lcom/daaw/yd0;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroid/widget/FrameLayout;

    new-instance v0, Lcom/daaw/h45;

    const v1, 0xd601280

    invoke-direct {v0, p1, p2, v1}, Lcom/daaw/h45;-><init>(Landroid/widget/FrameLayout;Landroid/widget/FrameLayout;I)V

    return-object v0
.end method

.method public final zzj(Lcom/daaw/yd0;Lcom/daaw/yd0;Lcom/daaw/yd0;)Lcom/daaw/fd3;
    .locals 1

    invoke-static {p1}, Lcom/daaw/nt0;->M(Lcom/daaw/yd0;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/view/View;

    invoke-static {p2}, Lcom/daaw/nt0;->M(Lcom/daaw/yd0;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/HashMap;

    invoke-static {p3}, Lcom/daaw/nt0;->M(Lcom/daaw/yd0;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/util/HashMap;

    new-instance v0, Lcom/daaw/f45;

    invoke-direct {v0, p1, p2, p3}, Lcom/daaw/f45;-><init>(Landroid/view/View;Ljava/util/HashMap;Ljava/util/HashMap;)V

    return-object v0
.end method

.method public final zzk(Lcom/daaw/yd0;Lcom/daaw/an3;ILcom/daaw/zh3;)Lcom/daaw/ci3;
    .locals 0

    invoke-static {p1}, Lcom/daaw/nt0;->M(Lcom/daaw/yd0;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/content/Context;

    invoke-static {p1, p2, p3}, Lcom/daaw/b94;->f(Landroid/content/Context;Lcom/daaw/an3;I)Lcom/daaw/b94;

    move-result-object p2

    invoke-virtual {p2}, Lcom/daaw/b94;->o()Lcom/daaw/if5;

    move-result-object p2

    invoke-interface {p2, p1}, Lcom/daaw/if5;->a(Landroid/content/Context;)Lcom/daaw/if5;

    invoke-interface {p2, p4}, Lcom/daaw/if5;->b(Lcom/daaw/zh3;)Lcom/daaw/if5;

    invoke-interface {p2}, Lcom/daaw/if5;->zzc()Lcom/daaw/jf5;

    move-result-object p1

    invoke-interface {p1}, Lcom/daaw/jf5;->zzd()Lcom/daaw/gf5;

    move-result-object p1

    return-object p1
.end method

.method public final zzl(Lcom/daaw/yd0;Lcom/daaw/an3;I)Lcom/daaw/ar3;
    .locals 0

    invoke-static {p1}, Lcom/daaw/nt0;->M(Lcom/daaw/yd0;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/content/Context;

    invoke-static {p1, p2, p3}, Lcom/daaw/b94;->f(Landroid/content/Context;Lcom/daaw/an3;I)Lcom/daaw/b94;

    move-result-object p1

    invoke-virtual {p1}, Lcom/daaw/b94;->r()Lcom/daaw/kq5;

    move-result-object p1

    return-object p1
.end method

.method public final zzm(Lcom/daaw/yd0;)Lcom/daaw/hr3;
    .locals 3

    invoke-static {p1}, Lcom/daaw/nt0;->M(Lcom/daaw/yd0;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/app/Activity;

    invoke-virtual {p1}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;->zza(Landroid/content/Intent;)Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;

    move-result-object v0

    if-nez v0, :cond_0

    new-instance v0, Lcom/google/android/gms/ads/internal/overlay/zzt;

    invoke-direct {v0, p1}, Lcom/google/android/gms/ads/internal/overlay/zzt;-><init>(Landroid/app/Activity;)V

    goto :goto_0

    :cond_0
    iget v1, v0, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;->zzk:I

    const/4 v2, 0x1

    if-eq v1, v2, :cond_5

    const/4 v2, 0x2

    if-eq v1, v2, :cond_4

    const/4 v2, 0x3

    if-eq v1, v2, :cond_3

    const/4 v2, 0x4

    if-eq v1, v2, :cond_2

    const/4 v0, 0x5

    if-eq v1, v0, :cond_1

    new-instance v0, Lcom/google/android/gms/ads/internal/overlay/zzt;

    invoke-direct {v0, p1}, Lcom/google/android/gms/ads/internal/overlay/zzt;-><init>(Landroid/app/Activity;)V

    goto :goto_0

    :cond_1
    new-instance v0, Lcom/google/android/gms/ads/internal/overlay/zzac;

    invoke-direct {v0, p1}, Lcom/google/android/gms/ads/internal/overlay/zzac;-><init>(Landroid/app/Activity;)V

    goto :goto_0

    :cond_2
    new-instance v1, Lcom/google/android/gms/ads/internal/overlay/zzy;

    invoke-direct {v1, p1, v0}, Lcom/google/android/gms/ads/internal/overlay/zzy;-><init>(Landroid/app/Activity;Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;)V

    move-object v0, v1

    goto :goto_0

    :cond_3
    new-instance v0, Lcom/google/android/gms/ads/internal/overlay/zzaf;

    invoke-direct {v0, p1}, Lcom/google/android/gms/ads/internal/overlay/zzaf;-><init>(Landroid/app/Activity;)V

    goto :goto_0

    :cond_4
    new-instance v0, Lcom/google/android/gms/ads/internal/overlay/zzae;

    invoke-direct {v0, p1}, Lcom/google/android/gms/ads/internal/overlay/zzae;-><init>(Landroid/app/Activity;)V

    goto :goto_0

    :cond_5
    new-instance v0, Lcom/google/android/gms/ads/internal/overlay/zzs;

    invoke-direct {v0, p1}, Lcom/google/android/gms/ads/internal/overlay/zzs;-><init>(Landroid/app/Activity;)V

    :goto_0
    return-object v0
.end method

.method public final zzn(Lcom/daaw/yd0;Lcom/daaw/an3;I)Lcom/daaw/fv3;
    .locals 0

    invoke-static {p1}, Lcom/daaw/nt0;->M(Lcom/daaw/yd0;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/content/Context;

    invoke-static {p1, p2, p3}, Lcom/daaw/b94;->f(Landroid/content/Context;Lcom/daaw/an3;I)Lcom/daaw/b94;

    move-result-object p2

    invoke-virtual {p2}, Lcom/daaw/b94;->z()Lcom/daaw/mh6;

    move-result-object p2

    invoke-interface {p2, p1}, Lcom/daaw/mh6;->a(Landroid/content/Context;)Lcom/daaw/mh6;

    invoke-interface {p2}, Lcom/daaw/mh6;->zzc()Lcom/daaw/nh6;

    move-result-object p1

    invoke-interface {p1}, Lcom/daaw/nh6;->zzb()Lcom/daaw/qh6;

    move-result-object p1

    return-object p1
.end method

.method public final zzo(Lcom/daaw/yd0;Ljava/lang/String;Lcom/daaw/an3;I)Lcom/daaw/wv3;
    .locals 0

    invoke-static {p1}, Lcom/daaw/nt0;->M(Lcom/daaw/yd0;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/content/Context;

    invoke-static {p1, p3, p4}, Lcom/daaw/b94;->f(Landroid/content/Context;Lcom/daaw/an3;I)Lcom/daaw/b94;

    move-result-object p3

    invoke-virtual {p3}, Lcom/daaw/b94;->z()Lcom/daaw/mh6;

    move-result-object p3

    invoke-interface {p3, p1}, Lcom/daaw/mh6;->a(Landroid/content/Context;)Lcom/daaw/mh6;

    invoke-interface {p3, p2}, Lcom/daaw/mh6;->zza(Ljava/lang/String;)Lcom/daaw/mh6;

    invoke-interface {p3}, Lcom/daaw/mh6;->zzc()Lcom/daaw/nh6;

    move-result-object p1

    invoke-interface {p1}, Lcom/daaw/nh6;->zza()Lcom/daaw/kh6;

    move-result-object p1

    return-object p1
.end method

.method public final zzp(Lcom/daaw/yd0;Lcom/daaw/an3;I)Lcom/daaw/zy3;
    .locals 0

    invoke-static {p1}, Lcom/daaw/nt0;->M(Lcom/daaw/yd0;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/content/Context;

    invoke-static {p1, p2, p3}, Lcom/daaw/b94;->f(Landroid/content/Context;Lcom/daaw/an3;I)Lcom/daaw/b94;

    move-result-object p1

    invoke-virtual {p1}, Lcom/daaw/b94;->u()Lcom/google/android/gms/ads/nonagon/signalgeneration/zzac;

    move-result-object p1

    return-object p1
.end method
