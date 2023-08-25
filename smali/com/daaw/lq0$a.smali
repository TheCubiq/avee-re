.class public Lcom/daaw/lq0$a;
.super Lcom/daaw/vl0;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/lq0;-><init>(I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/daaw/vl0<",
        "Lcom/daaw/lq0$b<",
        "TA;>;TB;>;"
    }
.end annotation


# instance fields
.field public final synthetic e:Lcom/daaw/lq0;


# direct methods
.method public constructor <init>(Lcom/daaw/lq0;I)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/lq0$a;->e:Lcom/daaw/lq0;

    invoke-direct {p0, p2}, Lcom/daaw/vl0;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic j(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lcom/daaw/lq0$b;

    invoke-virtual {p0, p1, p2}, Lcom/daaw/lq0$a;->n(Lcom/daaw/lq0$b;Ljava/lang/Object;)V

    return-void
.end method

.method public n(Lcom/daaw/lq0$b;Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/lq0$b<",
            "TA;>;TB;)V"
        }
    .end annotation

    invoke-virtual {p1}, Lcom/daaw/lq0$b;->c()V

    return-void
.end method
