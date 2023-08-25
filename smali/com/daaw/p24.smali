.class public abstract Lcom/daaw/p24;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final p:Ljava/util/concurrent/atomic/AtomicInteger;

.field public static final q:Ljava/util/concurrent/atomic/AtomicInteger;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    sput-object v0, Lcom/daaw/p24;->p:Ljava/util/concurrent/atomic/AtomicInteger;

    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    sput-object v0, Lcom/daaw/p24;->q:Ljava/util/concurrent/atomic/AtomicInteger;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static X()I
    .locals 1

    sget-object v0, Lcom/daaw/p24;->p:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v0

    return v0
.end method

.method public static Z()I
    .locals 1

    sget-object v0, Lcom/daaw/p24;->q:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v0

    return v0
.end method


# virtual methods
.method public abstract E()J
.end method

.method public abstract F()J
.end method

.method public abstract G([Landroid/net/Uri;Ljava/lang/String;)V
.end method

.method public abstract H([Landroid/net/Uri;Ljava/lang/String;Ljava/nio/ByteBuffer;Z)V
.end method

.method public abstract I()V
.end method

.method public abstract J(J)V
.end method

.method public abstract K(I)V
.end method

.method public abstract L(I)V
.end method

.method public abstract M(Lcom/daaw/o24;)V
.end method

.method public abstract N(I)V
.end method

.method public abstract O(I)V
.end method

.method public abstract P(Z)V
.end method

.method public abstract Q(Z)V
.end method

.method public abstract R(I)V
.end method

.method public abstract S(Landroid/view/Surface;Z)V
.end method

.method public abstract T(FZ)V
.end method

.method public abstract U()V
.end method

.method public abstract V()Z
.end method

.method public abstract W()I
.end method

.method public abstract Y()I
.end method

.method public abstract a0()J
.end method

.method public abstract b0()J
.end method

.method public abstract c0()J
.end method

.method public abstract d0()J
.end method

.method public abstract e0()J
.end method
