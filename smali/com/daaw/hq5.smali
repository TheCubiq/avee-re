.class public final synthetic Lcom/daaw/hq5;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field public final synthetic p:Lcom/daaw/cq5;

.field public final synthetic q:Ljava/lang/String;

.field public final synthetic r:Lcom/daaw/kd5;

.field public final synthetic s:Landroid/app/Activity;

.field public final synthetic t:Lcom/daaw/on6;

.field public final synthetic u:Lcom/google/android/gms/ads/internal/overlay/zzl;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/cq5;Ljava/lang/String;Lcom/daaw/kd5;Landroid/app/Activity;Lcom/daaw/on6;Lcom/google/android/gms/ads/internal/overlay/zzl;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/hq5;->p:Lcom/daaw/cq5;

    iput-object p2, p0, Lcom/daaw/hq5;->q:Ljava/lang/String;

    iput-object p3, p0, Lcom/daaw/hq5;->r:Lcom/daaw/kd5;

    iput-object p4, p0, Lcom/daaw/hq5;->s:Landroid/app/Activity;

    iput-object p5, p0, Lcom/daaw/hq5;->t:Lcom/daaw/on6;

    iput-object p6, p0, Lcom/daaw/hq5;->u:Lcom/google/android/gms/ads/internal/overlay/zzl;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 7

    iget-object v3, p0, Lcom/daaw/hq5;->p:Lcom/daaw/cq5;

    iget-object v4, p0, Lcom/daaw/hq5;->q:Ljava/lang/String;

    iget-object v1, p0, Lcom/daaw/hq5;->r:Lcom/daaw/kd5;

    iget-object v0, p0, Lcom/daaw/hq5;->s:Landroid/app/Activity;

    iget-object v2, p0, Lcom/daaw/hq5;->t:Lcom/daaw/on6;

    iget-object p1, p0, Lcom/daaw/hq5;->u:Lcom/google/android/gms/ads/internal/overlay/zzl;

    invoke-virtual {v3, v4}, Lcom/daaw/cq5;->q(Ljava/lang/String;)V

    if-eqz v1, :cond_0

    new-instance v6, Ljava/util/HashMap;

    invoke-direct {v6}, Ljava/util/HashMap;-><init>()V

    const-string p2, "dialog_action"

    const-string v5, "dismiss"

    invoke-interface {v6, p2, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v5, "dialog_click"

    invoke-static/range {v0 .. v6}, Lcom/daaw/kq5;->i3(Landroid/content/Context;Lcom/daaw/kd5;Lcom/daaw/on6;Lcom/daaw/cq5;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V

    :cond_0
    if-eqz p1, :cond_1

    invoke-virtual {p1}, Lcom/google/android/gms/ads/internal/overlay/zzl;->zzb()V

    :cond_1
    return-void
.end method
