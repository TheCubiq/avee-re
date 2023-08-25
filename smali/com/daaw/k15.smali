.class public final Lcom/daaw/k15;
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

    iput-object p1, p0, Lcom/daaw/k15;->a:Lcom/daaw/m08;

    iput-object p2, p0, Lcom/daaw/k15;->b:Lcom/daaw/m08;

    iput-object p3, p0, Lcom/daaw/k15;->c:Lcom/daaw/m08;

    iput-object p4, p0, Lcom/daaw/k15;->d:Lcom/daaw/m08;

    iput-object p5, p0, Lcom/daaw/k15;->e:Lcom/daaw/m08;

    return-void
.end method


# virtual methods
.method public final bridge synthetic zzb()Ljava/lang/Object;
    .locals 7

    iget-object v0, p0, Lcom/daaw/k15;->a:Lcom/daaw/m08;

    check-cast v0, Lcom/daaw/a08;

    invoke-virtual {v0}, Lcom/daaw/a08;->c()Ljava/util/Map;

    move-result-object v2

    iget-object v0, p0, Lcom/daaw/k15;->b:Lcom/daaw/m08;

    check-cast v0, Lcom/daaw/a08;

    invoke-virtual {v0}, Lcom/daaw/a08;->c()Ljava/util/Map;

    move-result-object v3

    iget-object v0, p0, Lcom/daaw/k15;->c:Lcom/daaw/m08;

    check-cast v0, Lcom/daaw/a08;

    invoke-virtual {v0}, Lcom/daaw/a08;->c()Ljava/util/Map;

    move-result-object v4

    iget-object v5, p0, Lcom/daaw/k15;->d:Lcom/daaw/m08;

    iget-object v0, p0, Lcom/daaw/k15;->e:Lcom/daaw/m08;

    check-cast v0, Lcom/daaw/o15;

    invoke-virtual {v0}, Lcom/daaw/o15;->a()Lcom/daaw/u35;

    move-result-object v6

    new-instance v0, Lcom/daaw/j15;

    move-object v1, v0

    invoke-direct/range {v1 .. v6}, Lcom/daaw/j15;-><init>(Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Lcom/daaw/m08;Lcom/daaw/u35;)V

    return-object v0
.end method
