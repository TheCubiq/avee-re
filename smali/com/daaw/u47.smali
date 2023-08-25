.class public final Lcom/daaw/u47;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final d:Lcom/daaw/u47;


# instance fields
.field public final a:Ljava/lang/Runnable;
    .annotation runtime Ljavax/annotation/CheckForNull;
    .end annotation
.end field

.field public final b:Ljava/util/concurrent/Executor;
    .annotation runtime Ljavax/annotation/CheckForNull;
    .end annotation
.end field

.field public c:Lcom/daaw/u47;
    .annotation runtime Ljavax/annotation/CheckForNull;
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/daaw/u47;

    invoke-direct {v0}, Lcom/daaw/u47;-><init>()V

    sput-object v0, Lcom/daaw/u47;->d:Lcom/daaw/u47;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/daaw/u47;->a:Ljava/lang/Runnable;

    iput-object v0, p0, Lcom/daaw/u47;->b:Ljava/util/concurrent/Executor;

    return-void
.end method

.method public constructor <init>(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/u47;->a:Ljava/lang/Runnable;

    iput-object p2, p0, Lcom/daaw/u47;->b:Ljava/util/concurrent/Executor;

    return-void
.end method
