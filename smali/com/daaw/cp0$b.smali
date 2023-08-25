.class public final Lcom/daaw/cp0$b;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/cp0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field public final a:Lcom/daaw/pp;

.field public final b:J

.field public final c:J

.field public final d:J


# direct methods
.method public constructor <init>(Lcom/daaw/pp;JJJ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/cp0$b;->a:Lcom/daaw/pp;

    iput-wide p2, p0, Lcom/daaw/cp0$b;->b:J

    iput-wide p4, p0, Lcom/daaw/cp0$b;->c:J

    iput-wide p6, p0, Lcom/daaw/cp0$b;->d:J

    return-void
.end method
