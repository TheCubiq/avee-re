.class public final Lcom/daaw/ix5;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/android/gms/ads/internal/zzf;


# instance fields
.field public final synthetic a:Lcom/daaw/pz4;


# direct methods
.method public constructor <init>(Lcom/daaw/jx5;Lcom/daaw/pz4;)V
    .locals 0

    iput-object p2, p0, Lcom/daaw/ix5;->a:Lcom/daaw/pz4;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final zza(Landroid/view/View;)V
    .locals 0

    return-void
.end method

.method public final zzb()V
    .locals 1

    iget-object v0, p0, Lcom/daaw/ix5;->a:Lcom/daaw/pz4;

    invoke-virtual {v0}, Lcom/daaw/am4;->a()Lcom/daaw/jq4;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/jq4;->onAdClicked()V

    return-void
.end method

.method public final zzc()V
    .locals 1

    iget-object v0, p0, Lcom/daaw/ix5;->a:Lcom/daaw/pz4;

    invoke-virtual {v0}, Lcom/daaw/pz4;->b()Lcom/daaw/gr4;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/gr4;->zza()V

    iget-object v0, p0, Lcom/daaw/ix5;->a:Lcom/daaw/pz4;

    invoke-virtual {v0}, Lcom/daaw/am4;->e()Lcom/daaw/xy4;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/xy4;->zza()V

    return-void
.end method
