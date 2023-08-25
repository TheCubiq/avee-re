.class public final Lcom/daaw/xu5;
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

    iput-object p1, p0, Lcom/daaw/xu5;->a:Lcom/daaw/m08;

    iput-object p2, p0, Lcom/daaw/xu5;->b:Lcom/daaw/m08;

    iput-object p3, p0, Lcom/daaw/xu5;->c:Lcom/daaw/m08;

    iput-object p4, p0, Lcom/daaw/xu5;->d:Lcom/daaw/m08;

    return-void
.end method


# virtual methods
.method public final a()Lcom/daaw/wu5;
    .locals 5

    iget-object v0, p0, Lcom/daaw/xu5;->a:Lcom/daaw/m08;

    invoke-interface {v0}, Lcom/daaw/m08;->zzb()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/gj6;

    iget-object v1, p0, Lcom/daaw/xu5;->b:Lcom/daaw/m08;

    invoke-interface {v1}, Lcom/daaw/m08;->zzb()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/daaw/sa5;

    iget-object v2, p0, Lcom/daaw/xu5;->c:Lcom/daaw/m08;

    invoke-interface {v2}, Lcom/daaw/m08;->zzb()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/daaw/kd5;

    iget-object v3, p0, Lcom/daaw/xu5;->d:Lcom/daaw/m08;

    invoke-interface {v3}, Lcom/daaw/m08;->zzb()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/daaw/on6;

    new-instance v4, Lcom/daaw/wu5;

    invoke-direct {v4, v0, v1, v2, v3}, Lcom/daaw/wu5;-><init>(Lcom/daaw/gj6;Lcom/daaw/sa5;Lcom/daaw/kd5;Lcom/daaw/on6;)V

    return-object v4
.end method

.method public final bridge synthetic zzb()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/xu5;->a()Lcom/daaw/wu5;

    move-result-object v0

    return-object v0
.end method
