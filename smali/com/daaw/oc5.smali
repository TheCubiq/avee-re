.class public final Lcom/daaw/oc5;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/wz7;


# instance fields
.field public final a:Lcom/daaw/m08;

.field public final b:Lcom/daaw/m08;


# direct methods
.method public constructor <init>(Lcom/daaw/m08;Lcom/daaw/m08;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/oc5;->a:Lcom/daaw/m08;

    iput-object p2, p0, Lcom/daaw/oc5;->b:Lcom/daaw/m08;

    return-void
.end method


# virtual methods
.method public final a()Lcom/daaw/nc5;
    .locals 3

    iget-object v0, p0, Lcom/daaw/oc5;->a:Lcom/daaw/m08;

    invoke-interface {v0}, Lcom/daaw/m08;->zzb()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/x33;

    iget-object v1, p0, Lcom/daaw/oc5;->b:Lcom/daaw/m08;

    check-cast v1, Lcom/daaw/a08;

    invoke-virtual {v1}, Lcom/daaw/a08;->c()Ljava/util/Map;

    move-result-object v1

    new-instance v2, Lcom/daaw/nc5;

    invoke-direct {v2, v0, v1}, Lcom/daaw/nc5;-><init>(Lcom/daaw/x33;Ljava/util/Map;)V

    return-object v2
.end method

.method public final bridge synthetic zzb()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/oc5;->a()Lcom/daaw/nc5;

    move-result-object v0

    return-object v0
.end method
