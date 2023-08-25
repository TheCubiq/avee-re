.class public final Lcom/daaw/vn1;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/qn1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lcom/daaw/qn1<",
        "TT;>;"
    }
.end annotation


# instance fields
.field public final a:Lcom/daaw/sn1;

.field public final b:Ljava/lang/String;

.field public final c:Lcom/daaw/bx;

.field public final d:Lcom/daaw/hn1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/hn1<",
            "TT;[B>;"
        }
    .end annotation
.end field

.field public final e:Lcom/daaw/wn1;


# direct methods
.method public constructor <init>(Lcom/daaw/sn1;Ljava/lang/String;Lcom/daaw/bx;Lcom/daaw/hn1;Lcom/daaw/wn1;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/sn1;",
            "Ljava/lang/String;",
            "Lcom/daaw/bx;",
            "Lcom/daaw/hn1<",
            "TT;[B>;",
            "Lcom/daaw/wn1;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/vn1;->a:Lcom/daaw/sn1;

    iput-object p2, p0, Lcom/daaw/vn1;->b:Ljava/lang/String;

    iput-object p3, p0, Lcom/daaw/vn1;->c:Lcom/daaw/bx;

    iput-object p4, p0, Lcom/daaw/vn1;->d:Lcom/daaw/hn1;

    iput-object p5, p0, Lcom/daaw/vn1;->e:Lcom/daaw/wn1;

    return-void
.end method


# virtual methods
.method public a(Lcom/daaw/xx;Lcom/daaw/ao1;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/xx<",
            "TT;>;",
            "Lcom/daaw/ao1;",
            ")V"
        }
    .end annotation

    iget-object v0, p0, Lcom/daaw/vn1;->e:Lcom/daaw/wn1;

    invoke-static {}, Lcom/daaw/db1;->a()Lcom/daaw/db1$a;

    move-result-object v1

    iget-object v2, p0, Lcom/daaw/vn1;->a:Lcom/daaw/sn1;

    invoke-virtual {v1, v2}, Lcom/daaw/db1$a;->e(Lcom/daaw/sn1;)Lcom/daaw/db1$a;

    move-result-object v1

    invoke-virtual {v1, p1}, Lcom/daaw/db1$a;->c(Lcom/daaw/xx;)Lcom/daaw/db1$a;

    move-result-object p1

    iget-object v1, p0, Lcom/daaw/vn1;->b:Ljava/lang/String;

    invoke-virtual {p1, v1}, Lcom/daaw/db1$a;->f(Ljava/lang/String;)Lcom/daaw/db1$a;

    move-result-object p1

    iget-object v1, p0, Lcom/daaw/vn1;->d:Lcom/daaw/hn1;

    invoke-virtual {p1, v1}, Lcom/daaw/db1$a;->d(Lcom/daaw/hn1;)Lcom/daaw/db1$a;

    move-result-object p1

    iget-object v1, p0, Lcom/daaw/vn1;->c:Lcom/daaw/bx;

    invoke-virtual {p1, v1}, Lcom/daaw/db1$a;->b(Lcom/daaw/bx;)Lcom/daaw/db1$a;

    move-result-object p1

    invoke-virtual {p1}, Lcom/daaw/db1$a;->a()Lcom/daaw/db1;

    move-result-object p1

    invoke-interface {v0, p1, p2}, Lcom/daaw/wn1;->a(Lcom/daaw/db1;Lcom/daaw/ao1;)V

    return-void
.end method

.method public b()Lcom/daaw/sn1;
    .locals 1

    iget-object v0, p0, Lcom/daaw/vn1;->a:Lcom/daaw/sn1;

    return-object v0
.end method
