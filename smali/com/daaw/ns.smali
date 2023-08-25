.class public final synthetic Lcom/daaw/ns;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/vs$c;


# instance fields
.field public final synthetic a:Lcom/daaw/us;

.field public final synthetic b:Ljava/util/concurrent/Callable;

.field public final synthetic c:J

.field public final synthetic d:Ljava/util/concurrent/TimeUnit;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/us;Ljava/util/concurrent/Callable;JLjava/util/concurrent/TimeUnit;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/ns;->a:Lcom/daaw/us;

    iput-object p2, p0, Lcom/daaw/ns;->b:Ljava/util/concurrent/Callable;

    iput-wide p3, p0, Lcom/daaw/ns;->c:J

    iput-object p5, p0, Lcom/daaw/ns;->d:Ljava/util/concurrent/TimeUnit;

    return-void
.end method


# virtual methods
.method public final a(Lcom/daaw/vs$b;)Ljava/util/concurrent/ScheduledFuture;
    .locals 6

    iget-object v0, p0, Lcom/daaw/ns;->a:Lcom/daaw/us;

    iget-object v1, p0, Lcom/daaw/ns;->b:Ljava/util/concurrent/Callable;

    iget-wide v2, p0, Lcom/daaw/ns;->c:J

    iget-object v4, p0, Lcom/daaw/ns;->d:Ljava/util/concurrent/TimeUnit;

    move-object v5, p1

    invoke-static/range {v0 .. v5}, Lcom/daaw/us;->g(Lcom/daaw/us;Ljava/util/concurrent/Callable;JLjava/util/concurrent/TimeUnit;Lcom/daaw/vs$b;)Ljava/util/concurrent/ScheduledFuture;

    move-result-object p1

    return-object p1
.end method
