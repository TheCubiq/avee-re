.class public final Lcom/daaw/up2;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final a:Lcom/daaw/mq2;

.field public final b:I

.field public final c:J


# direct methods
.method public constructor <init>(Lcom/daaw/mq2;IJ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/up2;->a:Lcom/daaw/mq2;

    const/4 p1, 0x0

    iput p1, p0, Lcom/daaw/up2;->b:I

    iput-wide p3, p0, Lcom/daaw/up2;->c:J

    return-void
.end method
