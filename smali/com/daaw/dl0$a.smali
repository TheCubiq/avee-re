.class public final Lcom/daaw/dl0$a;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/dl0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field public a:J

.field public b:Lcom/daaw/dl0$b;


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/daaw/dl0$a;->a:J

    sget-object v0, Lcom/daaw/dl0$b;->q:Lcom/daaw/dl0$b;

    iput-object v0, p0, Lcom/daaw/dl0$a;->b:Lcom/daaw/dl0$b;

    return-void
.end method


# virtual methods
.method public a()Lcom/daaw/dl0;
    .locals 4

    new-instance v0, Lcom/daaw/dl0;

    iget-wide v1, p0, Lcom/daaw/dl0$a;->a:J

    iget-object v3, p0, Lcom/daaw/dl0$a;->b:Lcom/daaw/dl0$b;

    invoke-direct {v0, v1, v2, v3}, Lcom/daaw/dl0;-><init>(JLcom/daaw/dl0$b;)V

    return-object v0
.end method

.method public b(J)Lcom/daaw/dl0$a;
    .locals 0

    iput-wide p1, p0, Lcom/daaw/dl0$a;->a:J

    return-object p0
.end method

.method public c(Lcom/daaw/dl0$b;)Lcom/daaw/dl0$a;
    .locals 0

    iput-object p1, p0, Lcom/daaw/dl0$a;->b:Lcom/daaw/dl0$b;

    return-object p0
.end method
