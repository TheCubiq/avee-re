.class public final Lcom/daaw/xp3;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field public final synthetic p:Lcom/daaw/zp3;


# direct methods
.method public constructor <init>(Lcom/daaw/zp3;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/xp3;->p:Lcom/daaw/zp3;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 0

    iget-object p1, p0, Lcom/daaw/xp3;->p:Lcom/daaw/zp3;

    invoke-virtual {p1}, Lcom/daaw/zp3;->i()Landroid/content/Intent;

    move-result-object p1

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzt;->zzp()Lcom/google/android/gms/ads/internal/util/zzs;

    iget-object p2, p0, Lcom/daaw/xp3;->p:Lcom/daaw/zp3;

    invoke-static {p2}, Lcom/daaw/zp3;->h(Lcom/daaw/zp3;)Landroid/content/Context;

    move-result-object p2

    invoke-static {p2, p1}, Lcom/google/android/gms/ads/internal/util/zzs;->zzQ(Landroid/content/Context;Landroid/content/Intent;)V

    return-void
.end method
