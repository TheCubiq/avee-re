.class public final Lcom/daaw/nk5;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/wz7;


# instance fields
.field public final a:Lcom/daaw/m08;

.field public final b:Lcom/daaw/m08;

.field public final c:Lcom/daaw/m08;


# direct methods
.method public constructor <init>(Lcom/daaw/m08;Lcom/daaw/m08;Lcom/daaw/m08;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/nk5;->a:Lcom/daaw/m08;

    iput-object p2, p0, Lcom/daaw/nk5;->b:Lcom/daaw/m08;

    iput-object p3, p0, Lcom/daaw/nk5;->c:Lcom/daaw/m08;

    return-void
.end method


# virtual methods
.method public final a()Lcom/daaw/mk5;
    .locals 4

    iget-object v0, p0, Lcom/daaw/nk5;->a:Lcom/daaw/m08;

    check-cast v0, Lcom/daaw/d08;

    invoke-virtual {v0}, Lcom/daaw/d08;->c()Ljava/util/Map;

    move-result-object v0

    sget-object v1, Lcom/daaw/z04;->a:Lcom/daaw/g77;

    invoke-static {v1}, Lcom/daaw/e08;->b(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v2, p0, Lcom/daaw/nk5;->c:Lcom/daaw/m08;

    check-cast v2, Lcom/daaw/ot4;

    invoke-virtual {v2}, Lcom/daaw/ot4;->a()Lcom/daaw/nt4;

    move-result-object v2

    new-instance v3, Lcom/daaw/mk5;

    invoke-direct {v3, v0, v1, v2}, Lcom/daaw/mk5;-><init>(Ljava/util/Map;Lcom/daaw/g77;Lcom/daaw/nt4;)V

    return-object v3
.end method

.method public final bridge synthetic zzb()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/nk5;->a()Lcom/daaw/mk5;

    move-result-object v0

    return-object v0
.end method
