.class public final Lcom/daaw/mp4;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/wz7;


# instance fields
.field public final a:Lcom/daaw/m08;

.field public final b:Lcom/daaw/m08;

.field public final c:Lcom/daaw/m08;


# direct methods
.method public constructor <init>(Lcom/daaw/m08;Lcom/daaw/m08;Lcom/daaw/m08;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/mp4;->a:Lcom/daaw/m08;

    iput-object p2, p0, Lcom/daaw/mp4;->b:Lcom/daaw/m08;

    iput-object p3, p0, Lcom/daaw/mp4;->c:Lcom/daaw/m08;

    return-void
.end method


# virtual methods
.method public final synthetic zzb()Ljava/lang/Object;
    .locals 5

    iget-object v0, p0, Lcom/daaw/mp4;->a:Lcom/daaw/m08;

    invoke-interface {v0}, Lcom/daaw/m08;->zzb()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    iget-object v1, p0, Lcom/daaw/mp4;->b:Lcom/daaw/m08;

    check-cast v1, Lcom/daaw/sm4;

    invoke-virtual {v1}, Lcom/daaw/sm4;->a()Lcom/daaw/th6;

    move-result-object v1

    new-instance v2, Lcom/daaw/mr3;

    invoke-direct {v2}, Lcom/daaw/mr3;-><init>()V

    new-instance v3, Lcom/daaw/lp4;

    const/4 v4, 0x0

    invoke-direct {v3, v0, v1, v2, v4}, Lcom/daaw/lp4;-><init>(Landroid/content/Context;Lcom/daaw/th6;Lcom/daaw/mr3;[B)V

    return-object v3
.end method
