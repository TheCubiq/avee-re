.class public final Lcom/daaw/vn4;
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

    iput-object p1, p0, Lcom/daaw/vn4;->a:Lcom/daaw/m08;

    iput-object p2, p0, Lcom/daaw/vn4;->b:Lcom/daaw/m08;

    iput-object p3, p0, Lcom/daaw/vn4;->c:Lcom/daaw/m08;

    return-void
.end method


# virtual methods
.method public final bridge synthetic zzb()Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lcom/daaw/vn4;->a:Lcom/daaw/m08;

    invoke-interface {v0}, Lcom/daaw/m08;->zzb()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/ag;

    iget-object v1, p0, Lcom/daaw/vn4;->b:Lcom/daaw/m08;

    check-cast v1, Lcom/daaw/w94;

    invoke-virtual {v1}, Lcom/daaw/w94;->a()Lcom/daaw/xz3;

    move-result-object v1

    iget-object v2, p0, Lcom/daaw/vn4;->c:Lcom/daaw/m08;

    check-cast v2, Lcom/daaw/cq4;

    invoke-virtual {v2}, Lcom/daaw/cq4;->a()Lcom/daaw/ri6;

    move-result-object v2

    iget-object v2, v2, Lcom/daaw/ri6;->f:Ljava/lang/String;

    invoke-virtual {v1, v0, v2}, Lcom/daaw/xz3;->a(Lcom/daaw/ag;Ljava/lang/String;)Lcom/daaw/jz3;

    move-result-object v0

    return-object v0
.end method
