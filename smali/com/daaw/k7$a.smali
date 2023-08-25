.class public Lcom/daaw/k7$a;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/k7;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field public a:Lcom/daaw/nc1$a;

.field public b:I

.field public c:J


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/daaw/k7$a;->a:Lcom/daaw/nc1$a;

    const/4 v0, 0x0

    iput v0, p0, Lcom/daaw/k7$a;->b:I

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/daaw/k7$a;->c:J

    return-void
.end method
