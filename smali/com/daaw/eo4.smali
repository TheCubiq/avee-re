.class public final Lcom/daaw/eo4;
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

.field public final h:Lcom/daaw/m08;


# direct methods
.method public constructor <init>(Lcom/daaw/m08;Lcom/daaw/m08;Lcom/daaw/m08;Lcom/daaw/m08;Lcom/daaw/m08;Lcom/daaw/m08;Lcom/daaw/m08;Lcom/daaw/m08;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/eo4;->a:Lcom/daaw/m08;

    iput-object p2, p0, Lcom/daaw/eo4;->b:Lcom/daaw/m08;

    iput-object p3, p0, Lcom/daaw/eo4;->c:Lcom/daaw/m08;

    iput-object p4, p0, Lcom/daaw/eo4;->d:Lcom/daaw/m08;

    iput-object p5, p0, Lcom/daaw/eo4;->e:Lcom/daaw/m08;

    iput-object p6, p0, Lcom/daaw/eo4;->f:Lcom/daaw/m08;

    iput-object p7, p0, Lcom/daaw/eo4;->g:Lcom/daaw/m08;

    iput-object p8, p0, Lcom/daaw/eo4;->h:Lcom/daaw/m08;

    return-void
.end method


# virtual methods
.method public final a()Lcom/daaw/yl4;
    .locals 10

    iget-object v0, p0, Lcom/daaw/eo4;->a:Lcom/daaw/m08;

    check-cast v0, Lcom/daaw/vm4;

    invoke-virtual {v0}, Lcom/daaw/vm4;->a()Lcom/daaw/fi6;

    move-result-object v2

    iget-object v0, p0, Lcom/daaw/eo4;->b:Lcom/daaw/m08;

    check-cast v0, Lcom/daaw/sm4;

    invoke-virtual {v0}, Lcom/daaw/sm4;->a()Lcom/daaw/th6;

    move-result-object v3

    iget-object v0, p0, Lcom/daaw/eo4;->c:Lcom/daaw/m08;

    invoke-interface {v0}, Lcom/daaw/m08;->zzb()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/daaw/nr4;

    iget-object v0, p0, Lcom/daaw/eo4;->d:Lcom/daaw/m08;

    invoke-interface {v0}, Lcom/daaw/m08;->zzb()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/daaw/as4;

    iget-object v0, p0, Lcom/daaw/eo4;->e:Lcom/daaw/m08;

    check-cast v0, Lcom/daaw/lx4;

    invoke-virtual {v0}, Lcom/daaw/lx4;->a()Lcom/daaw/we6;

    move-result-object v6

    iget-object v0, p0, Lcom/daaw/eo4;->f:Lcom/daaw/m08;

    check-cast v0, Lcom/daaw/fq4;

    invoke-virtual {v0}, Lcom/daaw/fq4;->a()Lcom/daaw/eq4;

    move-result-object v7

    iget-object v0, p0, Lcom/daaw/eo4;->g:Lcom/daaw/m08;

    invoke-interface {v0}, Lcom/daaw/m08;->zzb()Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lcom/daaw/ev4;

    iget-object v0, p0, Lcom/daaw/eo4;->h:Lcom/daaw/m08;

    check-cast v0, Lcom/daaw/is4;

    invoke-virtual {v0}, Lcom/daaw/is4;->a()Lcom/daaw/hs4;

    move-result-object v9

    new-instance v0, Lcom/daaw/yl4;

    move-object v1, v0

    invoke-direct/range {v1 .. v9}, Lcom/daaw/yl4;-><init>(Lcom/daaw/fi6;Lcom/daaw/th6;Lcom/daaw/nr4;Lcom/daaw/as4;Lcom/daaw/we6;Lcom/daaw/eq4;Lcom/daaw/ev4;Lcom/daaw/hs4;)V

    return-object v0
.end method

.method public final bridge synthetic zzb()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/eo4;->a()Lcom/daaw/yl4;

    move-result-object v0

    return-object v0
.end method
