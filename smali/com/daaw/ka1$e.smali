.class public Lcom/daaw/ka1$e;
.super Lcom/daaw/ka1;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/ka1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "e"
.end annotation


# instance fields
.field public final d:J

.field public final e:J


# direct methods
.method public constructor <init>()V
    .locals 10

    const/4 v1, 0x0

    const-wide/16 v2, 0x1

    const-wide/16 v4, 0x0

    const-wide/16 v6, 0x0

    const-wide/16 v8, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v9}, Lcom/daaw/ka1$e;-><init>(Lcom/daaw/d31;JJJJ)V

    return-void
.end method

.method public constructor <init>(Lcom/daaw/d31;JJJJ)V
    .locals 0

    invoke-direct/range {p0 .. p5}, Lcom/daaw/ka1;-><init>(Lcom/daaw/d31;JJ)V

    iput-wide p6, p0, Lcom/daaw/ka1$e;->d:J

    iput-wide p8, p0, Lcom/daaw/ka1$e;->e:J

    return-void
.end method


# virtual methods
.method public c()Lcom/daaw/d31;
    .locals 7

    iget-wide v4, p0, Lcom/daaw/ka1$e;->e:J

    const-wide/16 v0, 0x0

    cmp-long v2, v4, v0

    if-gtz v2, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    new-instance v6, Lcom/daaw/d31;

    const/4 v1, 0x0

    iget-wide v2, p0, Lcom/daaw/ka1$e;->d:J

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, Lcom/daaw/d31;-><init>(Ljava/lang/String;JJ)V

    :goto_0
    return-object v0
.end method
