.class public Lcom/daaw/lq0;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/lq0$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<A:",
        "Ljava/lang/Object;",
        "B:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field public final a:Lcom/daaw/vl0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/vl0<",
            "Lcom/daaw/lq0$b<",
            "TA;>;TB;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(I)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/daaw/lq0$a;

    invoke-direct {v0, p0, p1}, Lcom/daaw/lq0$a;-><init>(Lcom/daaw/lq0;I)V

    iput-object v0, p0, Lcom/daaw/lq0;->a:Lcom/daaw/vl0;

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Object;II)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TA;II)TB;"
        }
    .end annotation

    invoke-static {p1, p2, p3}, Lcom/daaw/lq0$b;->a(Ljava/lang/Object;II)Lcom/daaw/lq0$b;

    move-result-object p1

    iget-object p2, p0, Lcom/daaw/lq0;->a:Lcom/daaw/vl0;

    invoke-virtual {p2, p1}, Lcom/daaw/vl0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    invoke-virtual {p1}, Lcom/daaw/lq0$b;->c()V

    return-object p2
.end method

.method public b(Ljava/lang/Object;IILjava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TA;IITB;)V"
        }
    .end annotation

    invoke-static {p1, p2, p3}, Lcom/daaw/lq0$b;->a(Ljava/lang/Object;II)Lcom/daaw/lq0$b;

    move-result-object p1

    iget-object p2, p0, Lcom/daaw/lq0;->a:Lcom/daaw/vl0;

    invoke-virtual {p2, p1, p4}, Lcom/daaw/vl0;->k(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
