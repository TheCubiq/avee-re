.class public Lcom/daaw/mq;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/ag;


# static fields
.field public static final a:Lcom/daaw/mq;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/daaw/mq;

    invoke-direct {v0}, Lcom/daaw/mq;-><init>()V

    sput-object v0, Lcom/daaw/mq;->a:Lcom/daaw/mq;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static d()Lcom/daaw/ag;
    .locals 1

    sget-object v0, Lcom/daaw/mq;->a:Lcom/daaw/mq;

    return-object v0
.end method


# virtual methods
.method public final a()J
    .locals 2

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    return-wide v0
.end method

.method public final b()J
    .locals 2

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    return-wide v0
.end method

.method public final c()J
    .locals 2

    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v0

    return-wide v0
.end method
