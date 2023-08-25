.class public final Lcom/daaw/ah0;
.super Lcom/daaw/oh0;
.source ""


# static fields
.field public static final synthetic u:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;


# instance fields
.field private volatile synthetic _invoked:I

.field public final t:Lcom/daaw/z40;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/z40<",
            "Ljava/lang/Throwable;",
            "Lcom/daaw/lp1;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    const-class v0, Lcom/daaw/ah0;

    const-string v1, "_invoked"

    invoke-static {v0, v1}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    move-result-object v0

    sput-object v0, Lcom/daaw/ah0;->u:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    return-void
.end method

.method public constructor <init>(Lcom/daaw/z40;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/z40<",
            "-",
            "Ljava/lang/Throwable;",
            "Lcom/daaw/lp1;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Lcom/daaw/oh0;-><init>()V

    iput-object p1, p0, Lcom/daaw/ah0;->t:Lcom/daaw/z40;

    const/4 p1, 0x0

    iput p1, p0, Lcom/daaw/ah0;->_invoked:I

    return-void
.end method


# virtual methods
.method public bridge synthetic b(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {p0, p1}, Lcom/daaw/ah0;->s(Ljava/lang/Throwable;)V

    sget-object p1, Lcom/daaw/lp1;->a:Lcom/daaw/lp1;

    return-object p1
.end method

.method public s(Ljava/lang/Throwable;)V
    .locals 3

    sget-object v0, Lcom/daaw/ah0;->u:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-virtual {v0, p0, v1, v2}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->compareAndSet(Ljava/lang/Object;II)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/daaw/ah0;->t:Lcom/daaw/z40;

    invoke-interface {v0, p1}, Lcom/daaw/z40;->b(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-void
.end method
