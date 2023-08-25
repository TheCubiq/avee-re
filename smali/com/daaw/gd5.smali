.class public final Lcom/daaw/gd5;
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


# direct methods
.method public constructor <init>(Lcom/daaw/m08;Lcom/daaw/m08;Lcom/daaw/m08;Lcom/daaw/m08;Lcom/daaw/m08;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/gd5;->a:Lcom/daaw/m08;

    iput-object p2, p0, Lcom/daaw/gd5;->b:Lcom/daaw/m08;

    iput-object p3, p0, Lcom/daaw/gd5;->c:Lcom/daaw/m08;

    iput-object p4, p0, Lcom/daaw/gd5;->d:Lcom/daaw/m08;

    iput-object p5, p0, Lcom/daaw/gd5;->e:Lcom/daaw/m08;

    return-void
.end method


# virtual methods
.method public final bridge synthetic zzb()Ljava/lang/Object;
    .locals 7

    iget-object v0, p0, Lcom/daaw/gd5;->a:Lcom/daaw/m08;

    invoke-interface {v0}, Lcom/daaw/m08;->zzb()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/daaw/pd5;

    iget-object v0, p0, Lcom/daaw/gd5;->b:Lcom/daaw/m08;

    check-cast v0, Lcom/daaw/w94;

    invoke-virtual {v0}, Lcom/daaw/w94;->a()Lcom/daaw/xz3;

    move-result-object v3

    iget-object v0, p0, Lcom/daaw/gd5;->c:Lcom/daaw/m08;

    check-cast v0, Lcom/daaw/cq4;

    invoke-virtual {v0}, Lcom/daaw/cq4;->a()Lcom/daaw/ri6;

    move-result-object v4

    iget-object v0, p0, Lcom/daaw/gd5;->d:Lcom/daaw/m08;

    invoke-interface {v0}, Lcom/daaw/m08;->zzb()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Ljava/lang/String;

    iget-object v0, p0, Lcom/daaw/gd5;->e:Lcom/daaw/m08;

    invoke-interface {v0}, Lcom/daaw/m08;->zzb()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Ljava/lang/String;

    new-instance v0, Lcom/daaw/fd5;

    move-object v1, v0

    invoke-direct/range {v1 .. v6}, Lcom/daaw/fd5;-><init>(Lcom/daaw/pd5;Lcom/daaw/xz3;Lcom/daaw/ri6;Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method
