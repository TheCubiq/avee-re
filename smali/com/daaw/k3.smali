.class public final Lcom/daaw/k3;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/k3$f;,
        Lcom/daaw/k3$b;,
        Lcom/daaw/k3$g;,
        Lcom/daaw/k3$c;,
        Lcom/daaw/k3$d;,
        Lcom/daaw/k3$a;,
        Lcom/daaw/k3$e;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<O::",
        "Lcom/daaw/k3$d;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field public final a:Lcom/daaw/k3$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/k3$a<",
            "*TO;>;"
        }
    .end annotation
.end field

.field public final b:Lcom/daaw/k3$g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/k3$g<",
            "*>;"
        }
    .end annotation
.end field

.field public final c:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lcom/daaw/k3$a;Lcom/daaw/k3$g;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<C::",
            "Lcom/daaw/k3$f;",
            ">(",
            "Ljava/lang/String;",
            "Lcom/daaw/k3$a<",
            "TC;TO;>;",
            "Lcom/daaw/k3$g<",
            "TC;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "Cannot construct an Api with a null ClientBuilder"

    invoke-static {p2, v0}, Lcom/daaw/ry0;->k(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "Cannot construct an Api with a null ClientKey"

    invoke-static {p3, v0}, Lcom/daaw/ry0;->k(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lcom/daaw/k3;->c:Ljava/lang/String;

    iput-object p2, p0, Lcom/daaw/k3;->a:Lcom/daaw/k3$a;

    iput-object p3, p0, Lcom/daaw/k3;->b:Lcom/daaw/k3$g;

    return-void
.end method


# virtual methods
.method public final a()Lcom/daaw/k3$a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/daaw/k3$a<",
            "*TO;>;"
        }
    .end annotation

    iget-object v0, p0, Lcom/daaw/k3;->a:Lcom/daaw/k3$a;

    return-object v0
.end method

.method public final b()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/daaw/k3;->c:Ljava/lang/String;

    return-object v0
.end method
