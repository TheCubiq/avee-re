.class public Lcom/daaw/ru0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/qu0;


# instance fields
.field public final c:Lcom/daaw/kr0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/kr0<",
            "Lcom/daaw/qu0$b;",
            ">;"
        }
    .end annotation
.end field

.field public final d:Lcom/daaw/sb1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/sb1<",
            "Lcom/daaw/qu0$b$c;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/daaw/kr0;

    invoke-direct {v0}, Lcom/daaw/kr0;-><init>()V

    iput-object v0, p0, Lcom/daaw/ru0;->c:Lcom/daaw/kr0;

    invoke-static {}, Lcom/daaw/sb1;->u()Lcom/daaw/sb1;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/ru0;->d:Lcom/daaw/sb1;

    sget-object v0, Lcom/daaw/qu0;->b:Lcom/daaw/qu0$b$b;

    invoke-virtual {p0, v0}, Lcom/daaw/ru0;->a(Lcom/daaw/qu0$b;)V

    return-void
.end method


# virtual methods
.method public a(Lcom/daaw/qu0$b;)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/ru0;->c:Lcom/daaw/kr0;

    invoke-virtual {v0, p1}, Lcom/daaw/kr0;->h(Ljava/lang/Object;)V

    instance-of v0, p1, Lcom/daaw/qu0$b$c;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/daaw/ru0;->d:Lcom/daaw/sb1;

    check-cast p1, Lcom/daaw/qu0$b$c;

    invoke-virtual {v0, p1}, Lcom/daaw/sb1;->q(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    instance-of v0, p1, Lcom/daaw/qu0$b$a;

    if-eqz v0, :cond_1

    check-cast p1, Lcom/daaw/qu0$b$a;

    iget-object v0, p0, Lcom/daaw/ru0;->d:Lcom/daaw/sb1;

    invoke-virtual {p1}, Lcom/daaw/qu0$b$a;->a()Ljava/lang/Throwable;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/daaw/sb1;->r(Ljava/lang/Throwable;)Z

    :cond_1
    :goto_0
    return-void
.end method
