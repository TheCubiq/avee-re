.class public final Lcom/daaw/im;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/fm;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/im$b;
    }
.end annotation


# static fields
.field public static final c:Lcom/daaw/yr0;


# instance fields
.field public final a:Lcom/daaw/es;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/es<",
            "Lcom/daaw/fm;",
            ">;"
        }
    .end annotation
.end field

.field public final b:Ljava/util/concurrent/atomic/AtomicReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/atomic/AtomicReference<",
            "Lcom/daaw/fm;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/daaw/im$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/daaw/im$b;-><init>(Lcom/daaw/im$a;)V

    sput-object v0, Lcom/daaw/im;->c:Lcom/daaw/yr0;

    return-void
.end method

.method public constructor <init>(Lcom/daaw/es;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/es<",
            "Lcom/daaw/fm;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/daaw/im;->b:Ljava/util/concurrent/atomic/AtomicReference;

    iput-object p1, p0, Lcom/daaw/im;->a:Lcom/daaw/es;

    new-instance v0, Lcom/daaw/gm;

    invoke-direct {v0, p0}, Lcom/daaw/gm;-><init>(Lcom/daaw/im;)V

    invoke-interface {p1, v0}, Lcom/daaw/es;->a(Lcom/daaw/es$a;)V

    return-void
.end method

.method public static synthetic e(Lcom/daaw/im;Lcom/daaw/b01;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/daaw/im;->g(Lcom/daaw/b01;)V

    return-void
.end method

.method public static synthetic f(Ljava/lang/String;Ljava/lang/String;JLcom/daaw/of1;Lcom/daaw/b01;)V
    .locals 0

    invoke-static/range {p0 .. p5}, Lcom/daaw/im;->h(Ljava/lang/String;Ljava/lang/String;JLcom/daaw/of1;Lcom/daaw/b01;)V

    return-void
.end method

.method private synthetic g(Lcom/daaw/b01;)V
    .locals 2

    invoke-static {}, Lcom/daaw/ml0;->f()Lcom/daaw/ml0;

    move-result-object v0

    const-string v1, "Crashlytics native component now available."

    invoke-virtual {v0, v1}, Lcom/daaw/ml0;->b(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/daaw/im;->b:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-interface {p1}, Lcom/daaw/b01;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/daaw/fm;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic h(Ljava/lang/String;Ljava/lang/String;JLcom/daaw/of1;Lcom/daaw/b01;)V
    .locals 6

    invoke-interface {p5}, Lcom/daaw/b01;->get()Ljava/lang/Object;

    move-result-object p5

    move-object v0, p5

    check-cast v0, Lcom/daaw/fm;

    move-object v1, p0

    move-object v2, p1

    move-wide v3, p2

    move-object v5, p4

    invoke-interface/range {v0 .. v5}, Lcom/daaw/fm;->d(Ljava/lang/String;Ljava/lang/String;JLcom/daaw/of1;)V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;)Lcom/daaw/yr0;
    .locals 1

    iget-object v0, p0, Lcom/daaw/im;->b:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/fm;

    if-nez v0, :cond_0

    sget-object p1, Lcom/daaw/im;->c:Lcom/daaw/yr0;

    goto :goto_0

    :cond_0
    invoke-interface {v0, p1}, Lcom/daaw/fm;->a(Ljava/lang/String;)Lcom/daaw/yr0;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public b()Z
    .locals 1

    iget-object v0, p0, Lcom/daaw/im;->b:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/fm;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/daaw/fm;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public c(Ljava/lang/String;)Z
    .locals 1

    iget-object v0, p0, Lcom/daaw/im;->b:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/fm;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Lcom/daaw/fm;->c(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public d(Ljava/lang/String;Ljava/lang/String;JLcom/daaw/of1;)V
    .locals 8

    invoke-static {}, Lcom/daaw/ml0;->f()Lcom/daaw/ml0;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Deferring native open session: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/daaw/ml0;->i(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/daaw/im;->a:Lcom/daaw/es;

    new-instance v7, Lcom/daaw/hm;

    move-object v1, v7

    move-object v2, p1

    move-object v3, p2

    move-wide v4, p3

    move-object v6, p5

    invoke-direct/range {v1 .. v6}, Lcom/daaw/hm;-><init>(Ljava/lang/String;Ljava/lang/String;JLcom/daaw/of1;)V

    invoke-interface {v0, v7}, Lcom/daaw/es;->a(Lcom/daaw/es$a;)V

    return-void
.end method
