.class public final Lcom/daaw/vb8;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final a:Ljava/lang/String;

.field public b:J


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/yb8;Lcom/daaw/sb8;)V
    .locals 0

    invoke-virtual {p1}, Lcom/daaw/yb8;->h0()Lcom/daaw/dd8;

    move-result-object p2

    invoke-virtual {p2}, Lcom/daaw/dd8;->p()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p0, p1, p2}, Lcom/daaw/vb8;-><init>(Lcom/daaw/yb8;Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>(Lcom/daaw/yb8;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/daaw/vb8;->a:Ljava/lang/String;

    invoke-virtual {p1}, Lcom/daaw/yb8;->b()Lcom/daaw/ag;

    move-result-object p1

    invoke-interface {p1}, Lcom/daaw/ag;->b()J

    move-result-wide p1

    iput-wide p1, p0, Lcom/daaw/vb8;->b:J

    return-void
.end method

.method public synthetic constructor <init>(Lcom/daaw/yb8;Ljava/lang/String;Lcom/daaw/sb8;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/daaw/vb8;-><init>(Lcom/daaw/yb8;Ljava/lang/String;)V

    return-void
.end method
