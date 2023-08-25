.class public final Lcom/daaw/d26;
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

    iput-object p1, p0, Lcom/daaw/d26;->a:Lcom/daaw/m08;

    iput-object p2, p0, Lcom/daaw/d26;->b:Lcom/daaw/m08;

    iput-object p3, p0, Lcom/daaw/d26;->c:Lcom/daaw/m08;

    iput-object p4, p0, Lcom/daaw/d26;->d:Lcom/daaw/m08;

    iput-object p5, p0, Lcom/daaw/d26;->e:Lcom/daaw/m08;

    iput-object p6, p0, Lcom/daaw/d26;->f:Lcom/daaw/m08;

    return-void
.end method


# virtual methods
.method public final bridge synthetic zzb()Ljava/lang/Object;
    .locals 8

    iget-object v0, p0, Lcom/daaw/d26;->a:Lcom/daaw/m08;

    check-cast v0, Lcom/daaw/aq4;

    invoke-virtual {v0}, Lcom/daaw/aq4;->a()Ljava/lang/String;

    move-result-object v2

    iget-object v0, p0, Lcom/daaw/d26;->b:Lcom/daaw/m08;

    invoke-interface {v0}, Lcom/daaw/m08;->zzb()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Ljava/lang/String;

    iget-object v0, p0, Lcom/daaw/d26;->c:Lcom/daaw/m08;

    invoke-interface {v0}, Lcom/daaw/m08;->zzb()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/daaw/wn4;

    iget-object v0, p0, Lcom/daaw/d26;->d:Lcom/daaw/m08;

    invoke-interface {v0}, Lcom/daaw/m08;->zzb()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/daaw/zj6;

    iget-object v0, p0, Lcom/daaw/d26;->e:Lcom/daaw/m08;

    check-cast v0, Lcom/daaw/cq4;

    invoke-virtual {v0}, Lcom/daaw/cq4;->a()Lcom/daaw/ri6;

    move-result-object v6

    iget-object v0, p0, Lcom/daaw/d26;->f:Lcom/daaw/m08;

    invoke-interface {v0}, Lcom/daaw/m08;->zzb()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lcom/daaw/fd5;

    new-instance v0, Lcom/daaw/c26;

    move-object v1, v0

    invoke-direct/range {v1 .. v7}, Lcom/daaw/c26;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/daaw/wn4;Lcom/daaw/zj6;Lcom/daaw/ri6;Lcom/daaw/fd5;)V

    return-object v0
.end method
