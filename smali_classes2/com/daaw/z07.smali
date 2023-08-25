.class public final Lcom/daaw/z07;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final a:Lcom/daaw/p2$b;

.field public final b:Lcom/daaw/g5;

.field public final c:Lcom/daaw/e86;


# direct methods
.method public constructor <init>(Lcom/daaw/g5;Lcom/daaw/p2$b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/daaw/z07;->a:Lcom/daaw/p2$b;

    iput-object p1, p0, Lcom/daaw/z07;->b:Lcom/daaw/g5;

    new-instance p2, Lcom/daaw/e86;

    invoke-direct {p2, p0}, Lcom/daaw/e86;-><init>(Lcom/daaw/z07;)V

    iput-object p2, p0, Lcom/daaw/z07;->c:Lcom/daaw/e86;

    invoke-virtual {p1, p2}, Lcom/daaw/g5;->q(Lcom/daaw/g5$a;)V

    return-void
.end method

.method public static bridge synthetic a(Lcom/daaw/z07;)Lcom/daaw/p2$b;
    .locals 0

    iget-object p0, p0, Lcom/daaw/z07;->a:Lcom/daaw/p2$b;

    return-object p0
.end method
