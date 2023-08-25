.class public final Lcom/daaw/ar8;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final d:Ljava/util/concurrent/atomic/AtomicLong;


# instance fields
.field public final a:Lcom/daaw/pa6;

.field public final b:Landroid/net/Uri;

.field public final c:Ljava/util/Map;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/util/concurrent/atomic/AtomicLong;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicLong;-><init>()V

    sput-object v0, Lcom/daaw/ar8;->d:Ljava/util/concurrent/atomic/AtomicLong;

    return-void
.end method

.method public constructor <init>(JLcom/daaw/pa6;Landroid/net/Uri;Ljava/util/Map;JJJ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p3, p0, Lcom/daaw/ar8;->a:Lcom/daaw/pa6;

    iput-object p4, p0, Lcom/daaw/ar8;->b:Landroid/net/Uri;

    iput-object p5, p0, Lcom/daaw/ar8;->c:Ljava/util/Map;

    return-void
.end method

.method public static a()J
    .locals 2

    sget-object v0, Lcom/daaw/ar8;->d:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicLong;->getAndIncrement()J

    move-result-wide v0

    return-wide v0
.end method
