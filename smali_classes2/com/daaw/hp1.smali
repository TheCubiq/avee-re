.class public final Lcom/daaw/hp1;
.super Lcom/daaw/pl;
.source ""


# static fields
.field public static final q:Lcom/daaw/hp1;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/daaw/hp1;

    invoke-direct {v0}, Lcom/daaw/hp1;-><init>()V

    sput-object v0, Lcom/daaw/hp1;->q:Lcom/daaw/hp1;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/daaw/pl;-><init>()V

    return-void
.end method


# virtual methods
.method public T(Lcom/daaw/nl;Ljava/lang/Runnable;)V
    .locals 0

    sget-object p2, Lcom/daaw/jz1;->q:Lcom/daaw/jz1$a;

    invoke-interface {p1, p2}, Lcom/daaw/nl;->get(Lcom/daaw/nl$c;)Lcom/daaw/nl$b;

    move-result-object p1

    check-cast p1, Lcom/daaw/jz1;

    if-eqz p1, :cond_0

    const/4 p2, 0x1

    iput-boolean p2, p1, Lcom/daaw/jz1;->p:Z

    return-void

    :cond_0
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string p2, "Dispatchers.Unconfined.dispatch function can only be used by the yield function. If you wrap Unconfined dispatcher in your code, make sure you properly delegate isDispatchNeeded and dispatch calls."

    invoke-direct {p1, p2}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public U(Lcom/daaw/nl;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    const-string v0, "Dispatchers.Unconfined"

    return-object v0
.end method
