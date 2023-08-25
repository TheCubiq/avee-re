.class public final Lcom/daaw/n56;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/i76;


# instance fields
.field public final a:Lcom/daaw/g77;

.field public final b:Landroid/os/Bundle;


# direct methods
.method public constructor <init>(Lcom/daaw/g77;Landroid/os/Bundle;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/n56;->a:Lcom/daaw/g77;

    iput-object p2, p0, Lcom/daaw/n56;->b:Landroid/os/Bundle;

    return-void
.end method


# virtual methods
.method public final synthetic a()Lcom/daaw/o56;
    .locals 2

    new-instance v0, Lcom/daaw/o56;

    iget-object v1, p0, Lcom/daaw/n56;->b:Landroid/os/Bundle;

    invoke-direct {v0, v1}, Lcom/daaw/o56;-><init>(Landroid/os/Bundle;)V

    return-object v0
.end method

.method public final zza()I
    .locals 1

    const/16 v0, 0x1e

    return v0
.end method

.method public final zzb()Lcom/daaw/f77;
    .locals 2

    iget-object v0, p0, Lcom/daaw/n56;->a:Lcom/daaw/g77;

    new-instance v1, Lcom/daaw/m56;

    invoke-direct {v1, p0}, Lcom/daaw/m56;-><init>(Lcom/daaw/n56;)V

    invoke-interface {v0, v1}, Lcom/daaw/g77;->M(Ljava/util/concurrent/Callable;)Lcom/daaw/f77;

    move-result-object v0

    return-object v0
.end method
