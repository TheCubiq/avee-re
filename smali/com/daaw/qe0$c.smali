.class public final Lcom/daaw/qe0$c;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/qe0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation


# instance fields
.field public final a:I

.field public final b:Z

.field public final c:I


# direct methods
.method public constructor <init>(IZI)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/daaw/qe0$c;->a:I

    iput-boolean p2, p0, Lcom/daaw/qe0$c;->b:Z

    iput p3, p0, Lcom/daaw/qe0$c;->c:I

    return-void
.end method

.method public static synthetic a(Lcom/daaw/qe0$c;)I
    .locals 0

    iget p0, p0, Lcom/daaw/qe0$c;->a:I

    return p0
.end method

.method public static synthetic b(Lcom/daaw/qe0$c;)I
    .locals 0

    iget p0, p0, Lcom/daaw/qe0$c;->c:I

    return p0
.end method

.method public static synthetic c(Lcom/daaw/qe0$c;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/daaw/qe0$c;->b:Z

    return p0
.end method
