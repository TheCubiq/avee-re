.class public final Lcom/daaw/ql5;
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

    iput-object p1, p0, Lcom/daaw/ql5;->a:Lcom/daaw/m08;

    iput-object p2, p0, Lcom/daaw/ql5;->b:Lcom/daaw/m08;

    iput-object p3, p0, Lcom/daaw/ql5;->c:Lcom/daaw/m08;

    return-void
.end method


# virtual methods
.method public final a()Lcom/daaw/pl5;
    .locals 4

    sget-object v0, Lcom/daaw/z04;->b:Lcom/daaw/g77;

    invoke-static {v0}, Lcom/daaw/e08;->b(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v1, Lcom/daaw/z04;->a:Lcom/daaw/g77;

    invoke-static {v1}, Lcom/daaw/e08;->b(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v2, p0, Lcom/daaw/ql5;->c:Lcom/daaw/m08;

    check-cast v2, Lcom/daaw/hm5;

    invoke-virtual {v2}, Lcom/daaw/hm5;->a()Lcom/daaw/gm5;

    move-result-object v2

    new-instance v3, Lcom/daaw/pl5;

    invoke-direct {v3, v0, v1, v2}, Lcom/daaw/pl5;-><init>(Lcom/daaw/g77;Lcom/daaw/g77;Lcom/daaw/gm5;)V

    return-object v3
.end method

.method public final bridge synthetic zzb()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/ql5;->a()Lcom/daaw/pl5;

    move-result-object v0

    return-object v0
.end method
