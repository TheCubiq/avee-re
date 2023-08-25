.class public final Lcom/daaw/au5;
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

    iput-object p1, p0, Lcom/daaw/au5;->a:Lcom/daaw/m08;

    iput-object p2, p0, Lcom/daaw/au5;->b:Lcom/daaw/m08;

    iput-object p3, p0, Lcom/daaw/au5;->c:Lcom/daaw/m08;

    iput-object p4, p0, Lcom/daaw/au5;->d:Lcom/daaw/m08;

    iput-object p5, p0, Lcom/daaw/au5;->e:Lcom/daaw/m08;

    return-void
.end method


# virtual methods
.method public final bridge synthetic zzb()Ljava/lang/Object;
    .locals 7

    iget-object v0, p0, Lcom/daaw/au5;->a:Lcom/daaw/m08;

    invoke-interface {v0}, Lcom/daaw/m08;->zzb()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/daaw/q15;

    sget-object v3, Lcom/daaw/z04;->a:Lcom/daaw/g77;

    invoke-static {v3}, Lcom/daaw/e08;->b(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/daaw/au5;->c:Lcom/daaw/m08;

    check-cast v0, Lcom/daaw/d65;

    invoke-virtual {v0}, Lcom/daaw/d65;->a()Lcom/daaw/c65;

    move-result-object v4

    iget-object v0, p0, Lcom/daaw/au5;->d:Lcom/daaw/m08;

    invoke-interface {v0}, Lcom/daaw/m08;->zzb()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/daaw/pj6;

    iget-object v0, p0, Lcom/daaw/au5;->e:Lcom/daaw/m08;

    invoke-interface {v0}, Lcom/daaw/m08;->zzb()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcom/daaw/a95;

    new-instance v0, Lcom/daaw/zt5;

    move-object v1, v0

    invoke-direct/range {v1 .. v6}, Lcom/daaw/zt5;-><init>(Lcom/daaw/q15;Lcom/daaw/g77;Lcom/daaw/c65;Lcom/daaw/pj6;Lcom/daaw/a95;)V

    return-object v0
.end method
