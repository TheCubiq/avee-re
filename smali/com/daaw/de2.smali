.class public final Lcom/daaw/de2;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final a:I

.field public final b:J


# direct methods
.method public constructor <init>(IJ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/daaw/de2;->a:I

    iput-wide p2, p0, Lcom/daaw/de2;->b:J

    return-void
.end method

.method public static a(Lcom/daaw/k09;Lcom/daaw/ik5;)Lcom/daaw/de2;
    .locals 3

    invoke-virtual {p1}, Lcom/daaw/ik5;->h()[B

    move-result-object v0

    check-cast p0, Lcom/daaw/rz8;

    const/4 v1, 0x0

    const/16 v2, 0x8

    invoke-virtual {p0, v0, v1, v2, v1}, Lcom/daaw/rz8;->h([BIIZ)Z

    invoke-virtual {p1, v1}, Lcom/daaw/ik5;->f(I)V

    invoke-virtual {p1}, Lcom/daaw/ik5;->m()I

    move-result p0

    invoke-virtual {p1}, Lcom/daaw/ik5;->y()J

    move-result-wide v0

    new-instance p1, Lcom/daaw/de2;

    invoke-direct {p1, p0, v0, v1}, Lcom/daaw/de2;-><init>(IJ)V

    return-object p1
.end method
