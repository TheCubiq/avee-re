.class public final Lcom/daaw/nk0$b$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/jt1$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/nk0$b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = null
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Class;)Lcom/daaw/ht1;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Lcom/daaw/ht1;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;)TT;"
        }
    .end annotation

    new-instance p1, Lcom/daaw/nk0$b;

    invoke-direct {p1}, Lcom/daaw/nk0$b;-><init>()V

    return-object p1
.end method

.method public synthetic b(Ljava/lang/Class;Lcom/daaw/hn;)Lcom/daaw/ht1;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/daaw/kt1;->b(Lcom/daaw/jt1$b;Ljava/lang/Class;Lcom/daaw/hn;)Lcom/daaw/ht1;

    move-result-object p1

    return-object p1
.end method
