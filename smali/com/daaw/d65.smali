.class public final Lcom/daaw/d65;
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

    iput-object p1, p0, Lcom/daaw/d65;->a:Lcom/daaw/m08;

    iput-object p2, p0, Lcom/daaw/d65;->b:Lcom/daaw/m08;

    iput-object p3, p0, Lcom/daaw/d65;->c:Lcom/daaw/m08;

    return-void
.end method


# virtual methods
.method public final a()Lcom/daaw/c65;
    .locals 4

    sget-object v0, Lcom/daaw/z04;->a:Lcom/daaw/g77;

    invoke-static {v0}, Lcom/daaw/e08;->b(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v1, p0, Lcom/daaw/d65;->b:Lcom/daaw/m08;

    check-cast v1, Lcom/daaw/t65;

    invoke-virtual {v1}, Lcom/daaw/t65;->a()Lcom/daaw/s65;

    move-result-object v1

    iget-object v2, p0, Lcom/daaw/d65;->c:Lcom/daaw/m08;

    check-cast v2, Lcom/daaw/y65;

    invoke-virtual {v2}, Lcom/daaw/y65;->a()Lcom/daaw/x65;

    move-result-object v2

    new-instance v3, Lcom/daaw/c65;

    invoke-direct {v3, v0, v1, v2}, Lcom/daaw/c65;-><init>(Lcom/daaw/g77;Lcom/daaw/s65;Lcom/daaw/x65;)V

    return-object v3
.end method

.method public final bridge synthetic zzb()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/d65;->a()Lcom/daaw/c65;

    move-result-object v0

    return-object v0
.end method
