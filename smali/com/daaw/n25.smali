.class public final Lcom/daaw/n25;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/wz7;


# instance fields
.field public final a:Lcom/daaw/m08;

.field public final b:Lcom/daaw/m08;


# direct methods
.method public constructor <init>(Lcom/daaw/m08;Lcom/daaw/m08;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/n25;->a:Lcom/daaw/m08;

    iput-object p2, p0, Lcom/daaw/n25;->b:Lcom/daaw/m08;

    return-void
.end method


# virtual methods
.method public final bridge synthetic zzb()Ljava/lang/Object;
    .locals 4

    iget-object v0, p0, Lcom/daaw/n25;->a:Lcom/daaw/m08;

    invoke-interface {v0}, Lcom/daaw/m08;->zzb()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    iget-object v1, p0, Lcom/daaw/n25;->b:Lcom/daaw/m08;

    check-cast v1, Lcom/daaw/sm4;

    invoke-virtual {v1}, Lcom/daaw/sm4;->a()Lcom/daaw/th6;

    move-result-object v1

    new-instance v2, Lcom/daaw/ny4;

    new-instance v3, Ljava/util/HashSet;

    invoke-direct {v3}, Ljava/util/HashSet;-><init>()V

    invoke-direct {v2, v0, v3, v1}, Lcom/daaw/ny4;-><init>(Landroid/content/Context;Ljava/util/Set;Lcom/daaw/th6;)V

    return-object v2
.end method
