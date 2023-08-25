.class public final Lcom/daaw/rf6;
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


# direct methods
.method public constructor <init>(Lcom/daaw/m08;Lcom/daaw/m08;Lcom/daaw/m08;Lcom/daaw/m08;Lcom/daaw/m08;Lcom/daaw/m08;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/rf6;->a:Lcom/daaw/m08;

    iput-object p2, p0, Lcom/daaw/rf6;->b:Lcom/daaw/m08;

    iput-object p3, p0, Lcom/daaw/rf6;->c:Lcom/daaw/m08;

    iput-object p4, p0, Lcom/daaw/rf6;->d:Lcom/daaw/m08;

    iput-object p5, p0, Lcom/daaw/rf6;->e:Lcom/daaw/m08;

    iput-object p6, p0, Lcom/daaw/rf6;->f:Lcom/daaw/m08;

    return-void
.end method


# virtual methods
.method public final bridge synthetic zzb()Ljava/lang/Object;
    .locals 8

    iget-object v0, p0, Lcom/daaw/rf6;->a:Lcom/daaw/m08;

    invoke-interface {v0}, Lcom/daaw/m08;->zzb()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Landroid/content/Context;

    iget-object v0, p0, Lcom/daaw/rf6;->b:Lcom/daaw/m08;

    invoke-interface {v0}, Lcom/daaw/m08;->zzb()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Ljava/util/concurrent/Executor;

    iget-object v0, p0, Lcom/daaw/rf6;->c:Lcom/daaw/m08;

    invoke-interface {v0}, Lcom/daaw/m08;->zzb()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/daaw/b94;

    iget-object v0, p0, Lcom/daaw/rf6;->d:Lcom/daaw/m08;

    invoke-interface {v0}, Lcom/daaw/m08;->zzb()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/daaw/az5;

    iget-object v0, p0, Lcom/daaw/rf6;->e:Lcom/daaw/m08;

    invoke-interface {v0}, Lcom/daaw/m08;->zzb()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcom/daaw/tg6;

    new-instance v7, Lcom/daaw/pi6;

    invoke-direct {v7}, Lcom/daaw/pi6;-><init>()V

    new-instance v0, Lcom/daaw/qf6;

    move-object v1, v0

    invoke-direct/range {v1 .. v7}, Lcom/daaw/qf6;-><init>(Landroid/content/Context;Ljava/util/concurrent/Executor;Lcom/daaw/b94;Lcom/daaw/az5;Lcom/daaw/tg6;Lcom/daaw/pi6;)V

    return-object v0
.end method
