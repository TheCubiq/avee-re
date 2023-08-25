.class public final Lcom/daaw/y45;
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

    iput-object p1, p0, Lcom/daaw/y45;->a:Lcom/daaw/m08;

    iput-object p2, p0, Lcom/daaw/y45;->b:Lcom/daaw/m08;

    iput-object p3, p0, Lcom/daaw/y45;->c:Lcom/daaw/m08;

    iput-object p4, p0, Lcom/daaw/y45;->d:Lcom/daaw/m08;

    return-void
.end method


# virtual methods
.method public final bridge synthetic zzb()Ljava/lang/Object;
    .locals 5

    iget-object v0, p0, Lcom/daaw/y45;->a:Lcom/daaw/m08;

    invoke-interface {v0}, Lcom/daaw/m08;->zzb()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/ia5;

    iget-object v1, p0, Lcom/daaw/y45;->b:Lcom/daaw/m08;

    check-cast v1, Lcom/daaw/m25;

    invoke-virtual {v1}, Lcom/daaw/m25;->a()Lcom/daaw/u85;

    move-result-object v1

    iget-object v2, p0, Lcom/daaw/y45;->c:Lcom/daaw/m08;

    invoke-interface {v2}, Lcom/daaw/m08;->zzb()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/daaw/nh4;

    iget-object v3, p0, Lcom/daaw/y45;->d:Lcom/daaw/m08;

    check-cast v3, Lcom/daaw/l25;

    invoke-virtual {v3}, Lcom/daaw/l25;->a()Lcom/daaw/r35;

    move-result-object v3

    new-instance v4, Lcom/daaw/x45;

    invoke-direct {v4, v0, v1, v2, v3}, Lcom/daaw/x45;-><init>(Lcom/daaw/ia5;Lcom/daaw/u85;Lcom/daaw/nh4;Lcom/daaw/r35;)V

    return-object v4
.end method
