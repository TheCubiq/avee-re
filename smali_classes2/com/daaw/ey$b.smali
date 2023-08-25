.class public final Lcom/daaw/ey$b;
.super Lcom/daaw/dl1;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/ey;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/daaw/dl1<",
        "Lcom/daaw/ey$a;",
        ">;"
    }
.end annotation


# instance fields
.field public b:J


# direct methods
.method public constructor <init>(J)V
    .locals 0

    invoke-direct {p0}, Lcom/daaw/dl1;-><init>()V

    iput-wide p1, p0, Lcom/daaw/ey$b;->b:J

    return-void
.end method
