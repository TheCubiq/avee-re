.class public final Lcom/daaw/mx4;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/wz7;


# instance fields
.field public final a:Lcom/daaw/pw4;

.field public final b:Lcom/daaw/m08;

.field public final c:Lcom/daaw/m08;

.field public final d:Lcom/daaw/m08;

.field public final e:Lcom/daaw/m08;


# direct methods
.method public constructor <init>(Lcom/daaw/pw4;Lcom/daaw/m08;Lcom/daaw/m08;Lcom/daaw/m08;Lcom/daaw/m08;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/mx4;->a:Lcom/daaw/pw4;

    iput-object p2, p0, Lcom/daaw/mx4;->b:Lcom/daaw/m08;

    iput-object p3, p0, Lcom/daaw/mx4;->c:Lcom/daaw/m08;

    iput-object p4, p0, Lcom/daaw/mx4;->d:Lcom/daaw/m08;

    iput-object p5, p0, Lcom/daaw/mx4;->e:Lcom/daaw/m08;

    return-void
.end method


# virtual methods
.method public final bridge synthetic zzb()Ljava/lang/Object;
    .locals 5

    iget-object v0, p0, Lcom/daaw/mx4;->a:Lcom/daaw/pw4;

    iget-object v1, p0, Lcom/daaw/mx4;->b:Lcom/daaw/m08;

    invoke-interface {v1}, Lcom/daaw/m08;->zzb()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/daaw/ag;

    iget-object v2, p0, Lcom/daaw/mx4;->c:Lcom/daaw/m08;

    check-cast v2, Lcom/daaw/xu5;

    invoke-virtual {v2}, Lcom/daaw/xu5;->a()Lcom/daaw/wu5;

    move-result-object v2

    iget-object v3, p0, Lcom/daaw/mx4;->d:Lcom/daaw/m08;

    invoke-interface {v3}, Lcom/daaw/m08;->zzb()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/daaw/vq5;

    iget-object v4, p0, Lcom/daaw/mx4;->e:Lcom/daaw/m08;

    invoke-interface {v4}, Lcom/daaw/m08;->zzb()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/daaw/op6;

    invoke-virtual {v0, v1, v2, v3, v4}, Lcom/daaw/pw4;->b(Lcom/daaw/ag;Lcom/daaw/wu5;Lcom/daaw/vq5;Lcom/daaw/op6;)Lcom/daaw/vu5;

    move-result-object v0

    invoke-static {v0}, Lcom/daaw/e08;->b(Ljava/lang/Object;)Ljava/lang/Object;

    return-object v0
.end method
