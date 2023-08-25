.class public final Lcom/daaw/y06;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/wz7;


# instance fields
.field public final a:Lcom/daaw/m08;

.field public final b:Lcom/daaw/m08;

.field public final c:Lcom/daaw/m08;

.field public final d:Lcom/daaw/m08;


# direct methods
.method public constructor <init>(Lcom/daaw/m08;Lcom/daaw/m08;Lcom/daaw/m08;Lcom/daaw/m08;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/y06;->a:Lcom/daaw/m08;

    iput-object p2, p0, Lcom/daaw/y06;->b:Lcom/daaw/m08;

    iput-object p3, p0, Lcom/daaw/y06;->c:Lcom/daaw/m08;

    iput-object p4, p0, Lcom/daaw/y06;->d:Lcom/daaw/m08;

    return-void
.end method


# virtual methods
.method public final bridge synthetic zzb()Ljava/lang/Object;
    .locals 5

    iget-object v0, p0, Lcom/daaw/y06;->a:Lcom/daaw/m08;

    invoke-interface {v0}, Lcom/daaw/m08;->zzb()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/u26;

    iget-object v1, p0, Lcom/daaw/y06;->b:Lcom/daaw/m08;

    check-cast v1, Lcom/daaw/cq4;

    invoke-virtual {v1}, Lcom/daaw/cq4;->a()Lcom/daaw/ri6;

    move-result-object v1

    iget-object v2, p0, Lcom/daaw/y06;->c:Lcom/daaw/m08;

    check-cast v2, Lcom/daaw/h94;

    invoke-virtual {v2}, Lcom/daaw/h94;->a()Landroid/content/Context;

    move-result-object v2

    iget-object v3, p0, Lcom/daaw/y06;->d:Lcom/daaw/m08;

    invoke-interface {v3}, Lcom/daaw/m08;->zzb()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/daaw/qz3;

    new-instance v4, Lcom/daaw/w06;

    invoke-direct {v4, v0, v1, v2, v3}, Lcom/daaw/w06;-><init>(Lcom/daaw/u26;Lcom/daaw/ri6;Landroid/content/Context;Lcom/daaw/qz3;)V

    return-object v4
.end method
