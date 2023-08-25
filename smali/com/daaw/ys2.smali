.class public final Lcom/daaw/ys2;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final a:I

.field public final b:J


# direct methods
.method public synthetic constructor <init>(IJLcom/daaw/xs2;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/daaw/ys2;->a:I

    iput-wide p2, p0, Lcom/daaw/ys2;->b:J

    return-void
.end method

.method public static bridge synthetic a(Lcom/daaw/ys2;)I
    .locals 0

    iget p0, p0, Lcom/daaw/ys2;->a:I

    return p0
.end method

.method public static bridge synthetic b(Lcom/daaw/ys2;)J
    .locals 2

    iget-wide v0, p0, Lcom/daaw/ys2;->b:J

    return-wide v0
.end method
