.class public final Lcom/daaw/a85;
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

    iput-object p1, p0, Lcom/daaw/a85;->a:Lcom/daaw/m08;

    iput-object p2, p0, Lcom/daaw/a85;->b:Lcom/daaw/m08;

    iput-object p3, p0, Lcom/daaw/a85;->c:Lcom/daaw/m08;

    iput-object p4, p0, Lcom/daaw/a85;->d:Lcom/daaw/m08;

    return-void
.end method


# virtual methods
.method public final bridge synthetic zzb()Ljava/lang/Object;
    .locals 5

    iget-object v0, p0, Lcom/daaw/a85;->a:Lcom/daaw/m08;

    check-cast v0, Lcom/daaw/h94;

    invoke-virtual {v0}, Lcom/daaw/h94;->a()Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lcom/daaw/a85;->b:Lcom/daaw/m08;

    check-cast v1, Lcom/daaw/c45;

    invoke-virtual {v1}, Lcom/daaw/c45;->a()Lcom/daaw/j35;

    move-result-object v1

    iget-object v2, p0, Lcom/daaw/a85;->c:Lcom/daaw/m08;

    check-cast v2, Lcom/daaw/m45;

    invoke-virtual {v2}, Lcom/daaw/m45;->a()Lcom/daaw/l45;

    move-result-object v2

    iget-object v3, p0, Lcom/daaw/a85;->d:Lcom/daaw/m08;

    invoke-interface {v3}, Lcom/daaw/m08;->zzb()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/daaw/e35;

    new-instance v4, Lcom/daaw/z75;

    invoke-direct {v4, v0, v1, v2, v3}, Lcom/daaw/z75;-><init>(Landroid/content/Context;Lcom/daaw/j35;Lcom/daaw/l45;Lcom/daaw/e35;)V

    return-object v4
.end method
