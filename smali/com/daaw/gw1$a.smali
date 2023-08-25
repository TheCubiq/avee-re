.class public final Lcom/daaw/gw1$a;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/gw1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field public final a:I

.field public final b:J


# direct methods
.method public constructor <init>(IJ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/daaw/gw1$a;->a:I

    iput-wide p2, p0, Lcom/daaw/gw1$a;->b:J

    return-void
.end method

.method public static a(Lcom/daaw/a00;Lcom/daaw/rv0;)Lcom/daaw/gw1$a;
    .locals 3

    iget-object v0, p1, Lcom/daaw/rv0;->a:[B

    const/4 v1, 0x0

    const/16 v2, 0x8

    invoke-interface {p0, v0, v1, v2}, Lcom/daaw/a00;->k([BII)V

    invoke-virtual {p1, v1}, Lcom/daaw/rv0;->J(I)V

    invoke-virtual {p1}, Lcom/daaw/rv0;->i()I

    move-result p0

    invoke-virtual {p1}, Lcom/daaw/rv0;->n()J

    move-result-wide v0

    new-instance p1, Lcom/daaw/gw1$a;

    invoke-direct {p1, p0, v0, v1}, Lcom/daaw/gw1$a;-><init>(IJ)V

    return-object p1
.end method
