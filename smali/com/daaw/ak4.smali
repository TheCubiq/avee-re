.class public final Lcom/daaw/ak4;
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

    iput-object p1, p0, Lcom/daaw/ak4;->a:Lcom/daaw/m08;

    iput-object p2, p0, Lcom/daaw/ak4;->b:Lcom/daaw/m08;

    iput-object p3, p0, Lcom/daaw/ak4;->c:Lcom/daaw/m08;

    return-void
.end method


# virtual methods
.method public final synthetic zzb()Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lcom/daaw/ak4;->a:Lcom/daaw/m08;

    check-cast v0, Lcom/daaw/cq4;

    invoke-virtual {v0}, Lcom/daaw/cq4;->a()Lcom/daaw/ri6;

    move-result-object v0

    iget-object v1, p0, Lcom/daaw/ak4;->b:Lcom/daaw/m08;

    check-cast v1, Lcom/daaw/xs5;

    invoke-virtual {v1}, Lcom/daaw/xs5;->a()Lcom/daaw/ws5;

    move-result-object v1

    iget-object v2, p0, Lcom/daaw/ak4;->c:Lcom/daaw/m08;

    check-cast v2, Lcom/daaw/bs5;

    invoke-virtual {v2}, Lcom/daaw/bs5;->a()Lcom/daaw/as5;

    move-result-object v2

    invoke-virtual {v0}, Lcom/daaw/ri6;->a()Lcom/daaw/se3;

    move-result-object v0

    if-nez v0, :cond_0

    return-object v2

    :cond_0
    return-object v1
.end method
