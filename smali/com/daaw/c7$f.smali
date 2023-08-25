.class public final Lcom/daaw/c7$f;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/c7;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "f"
.end annotation


# instance fields
.field public final a:I

.field public final b:J

.field public final c:I


# direct methods
.method public constructor <init>(IJI)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/daaw/c7$f;->a:I

    iput-wide p2, p0, Lcom/daaw/c7$f;->b:J

    iput p4, p0, Lcom/daaw/c7$f;->c:I

    return-void
.end method

.method public static synthetic a(Lcom/daaw/c7$f;)J
    .locals 2

    iget-wide v0, p0, Lcom/daaw/c7$f;->b:J

    return-wide v0
.end method

.method public static synthetic b(Lcom/daaw/c7$f;)I
    .locals 0

    iget p0, p0, Lcom/daaw/c7$f;->a:I

    return p0
.end method

.method public static synthetic c(Lcom/daaw/c7$f;)I
    .locals 0

    iget p0, p0, Lcom/daaw/c7$f;->c:I

    return p0
.end method
