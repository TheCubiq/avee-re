.class public final Lcom/daaw/q82;
.super Lcom/daaw/qz8;
.source ""

# interfaces
.implements Lcom/daaw/x82;


# direct methods
.method public constructor <init>(JJLcom/daaw/y32;Z)V
    .locals 8

    iget v5, p5, Lcom/daaw/y32;->f:I

    iget v6, p5, Lcom/daaw/y32;->c:I

    const/4 v7, 0x0

    move-object v0, p0

    move-wide v1, p1

    move-wide v3, p3

    invoke-direct/range {v0 .. v7}, Lcom/daaw/qz8;-><init>(JJIIZ)V

    return-void
.end method


# virtual methods
.method public final e(J)J
    .locals 0

    invoke-virtual {p0, p1, p2}, Lcom/daaw/qz8;->a(J)J

    move-result-wide p1

    return-wide p1
.end method

.method public final zzb()J
    .locals 2

    const-wide/16 v0, -0x1

    return-wide v0
.end method
