.class public final Lcom/daaw/bo5;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/wz7;


# instance fields
.field public final a:Lcom/daaw/m08;

.field public final b:Lcom/daaw/m08;

.field public final c:Lcom/daaw/m08;

.field public final d:Lcom/daaw/m08;

.field public final e:Lcom/daaw/m08;

.field public final f:Lcom/daaw/m08;

.field public final g:Lcom/daaw/m08;


# direct methods
.method public constructor <init>(Lcom/daaw/m08;Lcom/daaw/m08;Lcom/daaw/m08;Lcom/daaw/m08;Lcom/daaw/m08;Lcom/daaw/m08;Lcom/daaw/m08;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/bo5;->a:Lcom/daaw/m08;

    iput-object p2, p0, Lcom/daaw/bo5;->b:Lcom/daaw/m08;

    iput-object p3, p0, Lcom/daaw/bo5;->c:Lcom/daaw/m08;

    iput-object p4, p0, Lcom/daaw/bo5;->d:Lcom/daaw/m08;

    iput-object p5, p0, Lcom/daaw/bo5;->e:Lcom/daaw/m08;

    iput-object p6, p0, Lcom/daaw/bo5;->f:Lcom/daaw/m08;

    iput-object p7, p0, Lcom/daaw/bo5;->g:Lcom/daaw/m08;

    return-void
.end method


# virtual methods
.method public final bridge synthetic zzb()Ljava/lang/Object;
    .locals 9

    iget-object v0, p0, Lcom/daaw/bo5;->a:Lcom/daaw/m08;

    check-cast v0, Lcom/daaw/h94;

    invoke-virtual {v0}, Lcom/daaw/h94;->a()Landroid/content/Context;

    move-result-object v2

    iget-object v0, p0, Lcom/daaw/bo5;->b:Lcom/daaw/m08;

    invoke-interface {v0}, Lcom/daaw/m08;->zzb()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lcom/daaw/gj6;

    iget-object v0, p0, Lcom/daaw/bo5;->c:Lcom/daaw/m08;

    check-cast v0, Lcom/daaw/vm4;

    invoke-virtual {v0}, Lcom/daaw/vm4;->a()Lcom/daaw/fi6;

    move-result-object v4

    iget-object v0, p0, Lcom/daaw/bo5;->d:Lcom/daaw/m08;

    check-cast v0, Lcom/daaw/sm4;

    invoke-virtual {v0}, Lcom/daaw/sm4;->a()Lcom/daaw/th6;

    move-result-object v5

    iget-object v0, p0, Lcom/daaw/bo5;->e:Lcom/daaw/m08;

    invoke-interface {v0}, Lcom/daaw/m08;->zzb()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcom/daaw/cq5;

    iget-object v0, p0, Lcom/daaw/bo5;->f:Lcom/daaw/m08;

    invoke-interface {v0}, Lcom/daaw/m08;->zzb()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lcom/daaw/on6;

    iget-object v0, p0, Lcom/daaw/bo5;->g:Lcom/daaw/m08;

    invoke-interface {v0}, Lcom/daaw/m08;->zzb()Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Ljava/lang/String;

    new-instance v0, Lcom/daaw/ao5;

    move-object v1, v0

    invoke-direct/range {v1 .. v8}, Lcom/daaw/ao5;-><init>(Landroid/content/Context;Lcom/daaw/gj6;Lcom/daaw/fi6;Lcom/daaw/th6;Lcom/daaw/cq5;Lcom/daaw/on6;Ljava/lang/String;)V

    return-object v0
.end method
