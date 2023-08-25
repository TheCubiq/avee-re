.class public final Lcom/daaw/zg4;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public a:Z

.field public b:Z

.field public final c:Z

.field public d:J

.field public e:Ljava/lang/String;

.field public f:Lcom/daaw/p03;


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/daaw/zg4;->a:Z

    iput-boolean v0, p0, Lcom/daaw/zg4;->b:Z

    iput-boolean v0, p0, Lcom/daaw/zg4;->c:Z

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/daaw/zg4;->d:J

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/daaw/zg4;->f:Lcom/daaw/p03;

    return-void
.end method
