.class public final Lcom/daaw/q92;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final a:I

.field public final b:J

.field public final c:I


# direct methods
.method public constructor <init>(IJI)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/daaw/q92;->a:I

    iput-wide p2, p0, Lcom/daaw/q92;->b:J

    iput p4, p0, Lcom/daaw/q92;->c:I

    return-void
.end method

.method public static bridge synthetic a(Lcom/daaw/q92;)I
    .locals 0

    iget p0, p0, Lcom/daaw/q92;->a:I

    return p0
.end method

.method public static bridge synthetic b(Lcom/daaw/q92;)I
    .locals 0

    iget p0, p0, Lcom/daaw/q92;->c:I

    return p0
.end method

.method public static bridge synthetic c(Lcom/daaw/q92;)J
    .locals 2

    iget-wide v0, p0, Lcom/daaw/q92;->b:J

    return-wide v0
.end method
