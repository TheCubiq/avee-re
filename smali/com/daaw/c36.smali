.class public final Lcom/daaw/c36;
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

    iput-object p1, p0, Lcom/daaw/c36;->a:Lcom/daaw/m08;

    iput-object p2, p0, Lcom/daaw/c36;->b:Lcom/daaw/m08;

    iput-object p3, p0, Lcom/daaw/c36;->c:Lcom/daaw/m08;

    iput-object p4, p0, Lcom/daaw/c36;->d:Lcom/daaw/m08;

    return-void
.end method


# virtual methods
.method public final bridge synthetic zzb()Ljava/lang/Object;
    .locals 5

    sget-object v0, Lcom/daaw/z04;->a:Lcom/daaw/g77;

    invoke-static {v0}, Lcom/daaw/e08;->b(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v1, p0, Lcom/daaw/c36;->b:Lcom/daaw/m08;

    invoke-interface {v1}, Lcom/daaw/m08;->zzb()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/daaw/db5;

    iget-object v2, p0, Lcom/daaw/c36;->c:Lcom/daaw/m08;

    check-cast v2, Lcom/daaw/cq4;

    invoke-virtual {v2}, Lcom/daaw/cq4;->a()Lcom/daaw/ri6;

    move-result-object v2

    iget-object v3, p0, Lcom/daaw/c36;->d:Lcom/daaw/m08;

    invoke-interface {v3}, Lcom/daaw/m08;->zzb()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    new-instance v4, Lcom/daaw/a36;

    invoke-direct {v4, v0, v1, v2, v3}, Lcom/daaw/a36;-><init>(Lcom/daaw/g77;Lcom/daaw/db5;Lcom/daaw/ri6;Ljava/lang/String;)V

    return-object v4
.end method
