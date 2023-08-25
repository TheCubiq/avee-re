.class public final Lcom/daaw/uj4;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/wz7;


# instance fields
.field public final a:Lcom/daaw/gj4;

.field public final b:Lcom/daaw/m08;

.field public final c:Lcom/daaw/m08;


# direct methods
.method public constructor <init>(Lcom/daaw/gj4;Lcom/daaw/m08;Lcom/daaw/m08;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/uj4;->a:Lcom/daaw/gj4;

    iput-object p2, p0, Lcom/daaw/uj4;->b:Lcom/daaw/m08;

    iput-object p3, p0, Lcom/daaw/uj4;->c:Lcom/daaw/m08;

    return-void
.end method


# virtual methods
.method public final a()Lcom/daaw/sx3;
    .locals 3

    iget-object v0, p0, Lcom/daaw/uj4;->b:Lcom/daaw/m08;

    check-cast v0, Lcom/daaw/h94;

    invoke-virtual {v0}, Lcom/daaw/h94;->a()Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lcom/daaw/uj4;->c:Lcom/daaw/m08;

    check-cast v1, Lcom/daaw/cq4;

    invoke-virtual {v1}, Lcom/daaw/cq4;->a()Lcom/daaw/ri6;

    move-result-object v1

    new-instance v2, Lcom/daaw/sx3;

    iget-object v1, v1, Lcom/daaw/ri6;->f:Ljava/lang/String;

    invoke-direct {v2, v0, v1}, Lcom/daaw/sx3;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    return-object v2
.end method

.method public final bridge synthetic zzb()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/uj4;->a()Lcom/daaw/sx3;

    move-result-object v0

    return-object v0
.end method
