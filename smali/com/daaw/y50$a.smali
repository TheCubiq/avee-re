.class public final Lcom/daaw/y50$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/qe0$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/y50;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = null
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(IIIII)Z
    .locals 1

    const/16 v0, 0x43

    if-ne p2, v0, :cond_1

    const/16 p2, 0x4f

    if-ne p3, p2, :cond_1

    const/16 p2, 0x4d

    if-ne p4, p2, :cond_1

    if-eq p5, p2, :cond_0

    const/4 p2, 0x2

    if-ne p1, p2, :cond_1

    :cond_0
    const/4 p1, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    return p1
.end method
