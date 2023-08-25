.class public final Lcom/daaw/zb6;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/pz5;


# instance fields
.field public final synthetic a:Lcom/daaw/ac6;


# direct methods
.method public constructor <init>(Lcom/daaw/ac6;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/zb6;->a:Lcom/daaw/ac6;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final bridge synthetic a(Ljava/lang/Object;)V
    .locals 5

    check-cast p1, Lcom/daaw/ei4;

    iget-object v0, p0, Lcom/daaw/zb6;->a:Lcom/daaw/ac6;

    iget-object v0, v0, Lcom/daaw/ac6;->z:Lcom/daaw/ei4;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/daaw/zl4;->a()V

    :cond_0
    iget-object v0, p0, Lcom/daaw/zb6;->a:Lcom/daaw/ac6;

    iput-object p1, v0, Lcom/daaw/ac6;->z:Lcom/daaw/ei4;

    invoke-static {v0}, Lcom/daaw/ac6;->g3(Lcom/daaw/ac6;)Landroid/view/ViewGroup;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/ViewGroup;->removeAllViews()V

    iget-object v0, p0, Lcom/daaw/zb6;->a:Lcom/daaw/ac6;

    invoke-static {v0}, Lcom/daaw/ac6;->g3(Lcom/daaw/ac6;)Landroid/view/ViewGroup;

    move-result-object v0

    invoke-virtual {p1}, Lcom/daaw/ei4;->i()Landroid/view/View;

    move-result-object v1

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzt;->zzp()Lcom/google/android/gms/ads/internal/util/zzs;

    invoke-static {}, Lcom/google/android/gms/ads/internal/util/zzs;->zzn()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    invoke-virtual {p1}, Lcom/daaw/ei4;->l()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/daaw/zb6;->a:Lcom/daaw/ac6;

    invoke-static {v0}, Lcom/daaw/ac6;->j3(Lcom/daaw/ac6;)Lcom/google/android/gms/internal/ads/zzchu;

    move-result-object v0

    iget v0, v0, Lcom/google/android/gms/internal/ads/zzchu;->r:I

    sget-object v1, Lcom/daaw/g93;->H4:Lcom/daaw/y83;

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/daaw/e93;

    move-result-object v2

    invoke-virtual {v2, v1}, Lcom/daaw/e93;->b(Lcom/daaw/y83;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    if-ge v0, v1, :cond_4

    :cond_1
    iget-object v0, p0, Lcom/daaw/zb6;->a:Lcom/daaw/ac6;

    invoke-static {v0, p1}, Lcom/daaw/ac6;->i3(Lcom/daaw/ac6;Lcom/daaw/ei4;)Lcom/google/android/gms/ads/internal/overlay/zzr;

    move-result-object v0

    new-instance v1, Landroid/widget/RelativeLayout$LayoutParams;

    const/4 v2, -0x2

    invoke-direct {v1, v2, v2}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    const/16 v2, 0xa

    invoke-virtual {v1, v2}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    invoke-virtual {p1}, Lcom/daaw/ei4;->o()Z

    move-result v2

    const/4 v3, 0x1

    if-eq v3, v2, :cond_2

    const/16 v2, 0x9

    goto :goto_0

    :cond_2
    const/16 v2, 0xb

    :goto_0
    invoke-virtual {v1, v2}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    invoke-virtual {p1}, Lcom/daaw/ei4;->n()Z

    move-result v2

    const/4 v4, 0x0

    if-eqz v2, :cond_3

    invoke-virtual {p1}, Lcom/daaw/ei4;->m()Z

    move-result v2

    if-nez v2, :cond_3

    goto :goto_1

    :cond_3
    const/4 v3, 0x0

    :goto_1
    invoke-virtual {v0, v3}, Lcom/google/android/gms/ads/internal/overlay/zzr;->zzb(Z)V

    iget-object v2, p0, Lcom/daaw/zb6;->a:Lcom/daaw/ac6;

    invoke-static {v2}, Lcom/daaw/ac6;->g3(Lcom/daaw/ac6;)Landroid/view/ViewGroup;

    move-result-object v2

    invoke-virtual {v2, v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    :cond_4
    iget-object v0, p0, Lcom/daaw/zb6;->a:Lcom/daaw/ac6;

    invoke-virtual {p1, v0}, Lcom/daaw/ei4;->k(Lcom/daaw/j23;)V

    iget-object v0, p0, Lcom/daaw/zb6;->a:Lcom/daaw/ac6;

    invoke-static {v0}, Lcom/daaw/ac6;->g3(Lcom/daaw/ac6;)Landroid/view/ViewGroup;

    move-result-object v1

    invoke-static {v0}, Lcom/daaw/ac6;->h3(Lcom/daaw/ac6;)Lcom/google/android/gms/ads/internal/client/zzq;

    move-result-object v0

    iget v0, v0, Lcom/google/android/gms/ads/internal/client/zzq;->zzc:I

    invoke-virtual {v1, v0}, Landroid/view/ViewGroup;->setMinimumHeight(I)V

    iget-object v0, p0, Lcom/daaw/zb6;->a:Lcom/daaw/ac6;

    invoke-static {v0}, Lcom/daaw/ac6;->g3(Lcom/daaw/ac6;)Landroid/view/ViewGroup;

    move-result-object v1

    invoke-static {v0}, Lcom/daaw/ac6;->h3(Lcom/daaw/ac6;)Lcom/google/android/gms/ads/internal/client/zzq;

    move-result-object v0

    iget v0, v0, Lcom/google/android/gms/ads/internal/client/zzq;->zzf:I

    invoke-virtual {v1, v0}, Landroid/view/ViewGroup;->setMinimumWidth(I)V

    iget-object v0, p0, Lcom/daaw/zb6;->a:Lcom/daaw/ac6;

    invoke-static {v0}, Lcom/daaw/ac6;->k3(Lcom/daaw/ac6;)Lcom/daaw/dd6;

    move-result-object v1

    new-instance v2, Lcom/daaw/vi4;

    invoke-direct {v2, p1, v0}, Lcom/daaw/vi4;-><init>(Lcom/daaw/ei4;Lcom/google/android/gms/ads/internal/client/zzbu;)V

    invoke-virtual {v1, v2}, Lcom/daaw/dd6;->k(Lcom/daaw/p23;)V

    invoke-virtual {p1}, Lcom/daaw/zl4;->b()V

    return-void
.end method

.method public final zza()V
    .locals 2

    iget-object v0, p0, Lcom/daaw/zb6;->a:Lcom/daaw/ac6;

    const/4 v1, 0x0

    iput-object v1, v0, Lcom/daaw/ac6;->z:Lcom/daaw/ei4;

    return-void
.end method
