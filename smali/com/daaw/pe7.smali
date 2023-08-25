.class public final Lcom/daaw/pe7;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final b:Lcom/daaw/pe7;

.field public static final c:Lcom/daaw/oe7;


# instance fields
.field public final a:Ljava/util/concurrent/atomic/AtomicReference;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/daaw/pe7;

    invoke-direct {v0}, Lcom/daaw/pe7;-><init>()V

    sput-object v0, Lcom/daaw/pe7;->b:Lcom/daaw/pe7;

    new-instance v0, Lcom/daaw/oe7;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/daaw/oe7;-><init>(Lcom/daaw/ne7;)V

    sput-object v0, Lcom/daaw/pe7;->c:Lcom/daaw/oe7;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    iput-object v0, p0, Lcom/daaw/pe7;->a:Ljava/util/concurrent/atomic/AtomicReference;

    return-void
.end method

.method public static a()Lcom/daaw/pe7;
    .locals 1

    sget-object v0, Lcom/daaw/pe7;->b:Lcom/daaw/pe7;

    return-object v0
.end method


# virtual methods
.method public final b()Lcom/daaw/qh7;
    .locals 1

    iget-object v0, p0, Lcom/daaw/pe7;->a:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/qh7;

    if-nez v0, :cond_0

    sget-object v0, Lcom/daaw/pe7;->c:Lcom/daaw/oe7;

    :cond_0
    return-object v0
.end method
