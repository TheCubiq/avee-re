.class public final synthetic Lcom/daaw/ls;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/vs$c;


# instance fields
.field public final synthetic a:Lcom/daaw/us;

.field public final synthetic b:Ljava/lang/Runnable;

.field public final synthetic c:J

.field public final synthetic d:J

.field public final synthetic e:Ljava/util/concurrent/TimeUnit;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/us;Ljava/lang/Runnable;JJLjava/util/concurrent/TimeUnit;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/ls;->a:Lcom/daaw/us;

    iput-object p2, p0, Lcom/daaw/ls;->b:Ljava/lang/Runnable;

    iput-wide p3, p0, Lcom/daaw/ls;->c:J

    iput-wide p5, p0, Lcom/daaw/ls;->d:J

    iput-object p7, p0, Lcom/daaw/ls;->e:Ljava/util/concurrent/TimeUnit;

    return-void
.end method


# virtual methods
.method public final a(Lcom/daaw/vs$b;)Ljava/util/concurrent/ScheduledFuture;
    .locals 8

    iget-object v0, p0, Lcom/daaw/ls;->a:Lcom/daaw/us;

    iget-object v1, p0, Lcom/daaw/ls;->b:Ljava/lang/Runnable;

    iget-wide v2, p0, Lcom/daaw/ls;->c:J

    iget-wide v4, p0, Lcom/daaw/ls;->d:J

    iget-object v6, p0, Lcom/daaw/ls;->e:Ljava/util/concurrent/TimeUnit;

    move-object v7, p1

    invoke-static/range {v0 .. v7}, Lcom/daaw/us;->i(Lcom/daaw/us;Ljava/lang/Runnable;JJLjava/util/concurrent/TimeUnit;Lcom/daaw/vs$b;)Ljava/util/concurrent/ScheduledFuture;

    move-result-object p1

    return-object p1
.end method
