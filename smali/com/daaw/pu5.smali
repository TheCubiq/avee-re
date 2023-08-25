.class public final Lcom/daaw/pu5;
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

    iput-object p1, p0, Lcom/daaw/pu5;->a:Lcom/daaw/m08;

    iput-object p2, p0, Lcom/daaw/pu5;->b:Lcom/daaw/m08;

    iput-object p3, p0, Lcom/daaw/pu5;->c:Lcom/daaw/m08;

    iput-object p4, p0, Lcom/daaw/pu5;->d:Lcom/daaw/m08;

    iput-object p5, p0, Lcom/daaw/pu5;->e:Lcom/daaw/m08;

    iput-object p6, p0, Lcom/daaw/pu5;->f:Lcom/daaw/m08;

    iput-object p7, p0, Lcom/daaw/pu5;->g:Lcom/daaw/m08;

    iput-object p8, p0, Lcom/daaw/pu5;->h:Lcom/daaw/m08;

    return-void
.end method


# virtual methods
.method public final a()Lcom/daaw/ou5;
    .locals 10

    iget-object v0, p0, Lcom/daaw/pu5;->a:Lcom/daaw/m08;

    invoke-interface {v0}, Lcom/daaw/m08;->zzb()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/daaw/b94;

    iget-object v0, p0, Lcom/daaw/pu5;->b:Lcom/daaw/m08;

    check-cast v0, Lcom/daaw/dq4;

    invoke-virtual {v0}, Lcom/daaw/dq4;->a()Lcom/daaw/sp4;

    move-result-object v3

    iget-object v0, p0, Lcom/daaw/pu5;->c:Lcom/daaw/m08;

    check-cast v0, Lcom/daaw/ex5;

    invoke-virtual {v0}, Lcom/daaw/ex5;->a()Lcom/daaw/cx5;

    move-result-object v4

    iget-object v0, p0, Lcom/daaw/pu5;->d:Lcom/daaw/m08;

    check-cast v0, Lcom/daaw/ix4;

    invoke-virtual {v0}, Lcom/daaw/ix4;->a()Lcom/daaw/pw4;

    move-result-object v5

    iget-object v0, p0, Lcom/daaw/pu5;->e:Lcom/daaw/m08;

    check-cast v0, Lcom/daaw/n15;

    invoke-virtual {v0}, Lcom/daaw/n15;->a()Lcom/daaw/l15;

    move-result-object v6

    iget-object v0, p0, Lcom/daaw/pu5;->f:Lcom/daaw/m08;

    check-cast v0, Lcom/daaw/ul4;

    invoke-virtual {v0}, Lcom/daaw/ul4;->a()Lcom/daaw/jt4;

    move-result-object v7

    iget-object v0, p0, Lcom/daaw/pu5;->g:Lcom/daaw/m08;

    check-cast v0, Lcom/daaw/xi4;

    invoke-virtual {v0}, Lcom/daaw/xi4;->a()Landroid/view/ViewGroup;

    move-result-object v8

    iget-object v0, p0, Lcom/daaw/pu5;->h:Lcom/daaw/m08;

    invoke-interface {v0}, Lcom/daaw/m08;->zzb()Ljava/lang/Object;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Lcom/daaw/wv4;

    new-instance v0, Lcom/daaw/ou5;

    move-object v1, v0

    invoke-direct/range {v1 .. v9}, Lcom/daaw/ou5;-><init>(Lcom/daaw/b94;Lcom/daaw/sp4;Lcom/daaw/cx5;Lcom/daaw/pw4;Lcom/daaw/l15;Lcom/daaw/jt4;Landroid/view/ViewGroup;Lcom/daaw/wv4;)V

    return-object v0
.end method

.method public final bridge synthetic zzb()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/pu5;->a()Lcom/daaw/ou5;

    move-result-object v0

    return-object v0
.end method
