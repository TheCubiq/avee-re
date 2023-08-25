.class public final Lcom/daaw/bj6;
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

    iput-object p1, p0, Lcom/daaw/bj6;->a:Lcom/daaw/m08;

    iput-object p2, p0, Lcom/daaw/bj6;->b:Lcom/daaw/m08;

    iput-object p3, p0, Lcom/daaw/bj6;->c:Lcom/daaw/m08;

    iput-object p4, p0, Lcom/daaw/bj6;->d:Lcom/daaw/m08;

    iput-object p5, p0, Lcom/daaw/bj6;->e:Lcom/daaw/m08;

    return-void
.end method


# virtual methods
.method public final bridge synthetic zzb()Ljava/lang/Object;
    .locals 7

    iget-object v0, p0, Lcom/daaw/bj6;->a:Lcom/daaw/m08;

    invoke-interface {v0}, Lcom/daaw/m08;->zzb()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/daaw/cq5;

    iget-object v0, p0, Lcom/daaw/bj6;->b:Lcom/daaw/m08;

    invoke-interface {v0}, Lcom/daaw/m08;->zzb()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lcom/daaw/op6;

    iget-object v0, p0, Lcom/daaw/bj6;->c:Lcom/daaw/m08;

    check-cast v0, Lcom/daaw/sm4;

    invoke-virtual {v0}, Lcom/daaw/sm4;->a()Lcom/daaw/th6;

    move-result-object v4

    iget-object v0, p0, Lcom/daaw/bj6;->d:Lcom/daaw/m08;

    check-cast v0, Lcom/daaw/um4;

    invoke-virtual {v0}, Lcom/daaw/um4;->a()Lcom/daaw/wh6;

    move-result-object v5

    iget-object v0, p0, Lcom/daaw/bj6;->e:Lcom/daaw/m08;

    invoke-interface {v0}, Lcom/daaw/m08;->zzb()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcom/daaw/to6;

    new-instance v0, Lcom/daaw/aj6;

    move-object v1, v0

    invoke-direct/range {v1 .. v6}, Lcom/daaw/aj6;-><init>(Lcom/daaw/cq5;Lcom/daaw/op6;Lcom/daaw/th6;Lcom/daaw/wh6;Lcom/daaw/to6;)V

    return-object v0
.end method
