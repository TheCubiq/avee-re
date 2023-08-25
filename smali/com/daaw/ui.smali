.class public Lcom/daaw/ui;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static b:Lcom/daaw/t91;


# instance fields
.field public a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/daaw/t91;

    invoke-direct {v0}, Lcom/daaw/t91;-><init>()V

    sput-object v0, Lcom/daaw/ui;->b:Lcom/daaw/t91;

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    iput-object v0, p0, Lcom/daaw/ui;->a:Ljava/util/List;

    sget-object v0, Lcom/daaw/s70;->c:Lcom/daaw/tw1;

    new-instance v1, Lcom/daaw/ui$b;

    invoke-direct {v1, p0}, Lcom/daaw/ui$b;-><init>(Lcom/daaw/ui;)V

    iget-object v2, p0, Lcom/daaw/ui;->a:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/tw1;->b(Lcom/daaw/tw1$a;Ljava/util/List;)V

    sget-object v0, Lcom/daaw/avee/MainActivity;->v0:Lcom/daaw/rw1;

    new-instance v1, Lcom/daaw/ui$c;

    invoke-direct {v1, p0}, Lcom/daaw/ui$c;-><init>(Lcom/daaw/ui;)V

    iget-object v2, p0, Lcom/daaw/ui;->a:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/rw1;->b(Lcom/daaw/rw1$a;Ljava/util/List;)V

    sget-object v0, Lcom/daaw/t91;->c:Lcom/daaw/rw1;

    new-instance v1, Lcom/daaw/ui$d;

    invoke-direct {v1, p0}, Lcom/daaw/ui$d;-><init>(Lcom/daaw/ui;)V

    iget-object v2, p0, Lcom/daaw/ui;->a:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/rw1;->b(Lcom/daaw/rw1$a;Ljava/util/List;)V

    sget-object v0, Lcom/daaw/avee/MainActivity;->w0:Lcom/daaw/qw1;

    new-instance v1, Lcom/daaw/ui$e;

    invoke-direct {v1, p0}, Lcom/daaw/ui$e;-><init>(Lcom/daaw/ui;)V

    iget-object v2, p0, Lcom/daaw/ui;->a:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/qw1;->b(Lcom/daaw/qw1$a;Ljava/util/List;)V

    sget-object v0, Lcom/daaw/avee/MainActivity;->x0:Lcom/daaw/qw1;

    new-instance v1, Lcom/daaw/ui$f;

    invoke-direct {v1, p0}, Lcom/daaw/ui$f;-><init>(Lcom/daaw/ui;)V

    iget-object v2, p0, Lcom/daaw/ui;->a:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/qw1;->b(Lcom/daaw/qw1$a;Ljava/util/List;)V

    sget-object v0, Lcom/daaw/avee/MainActivity;->y0:Lcom/daaw/vw1;

    new-instance v1, Lcom/daaw/ui$g;

    invoke-direct {v1, p0}, Lcom/daaw/ui$g;-><init>(Lcom/daaw/ui;)V

    iget-object v2, p0, Lcom/daaw/ui;->a:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/vw1;->b(Lcom/daaw/vw1$a;Ljava/util/List;)V

    sget-object v0, Lcom/daaw/dj0;->Y:Lcom/daaw/xw1;

    new-instance v1, Lcom/daaw/ui$h;

    invoke-direct {v1, p0}, Lcom/daaw/ui$h;-><init>(Lcom/daaw/ui;)V

    iget-object v2, p0, Lcom/daaw/ui;->a:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/xw1;->b(Lcom/daaw/xw1$a;Ljava/util/List;)V

    sget-object v0, Lcom/daaw/dj0;->r:Lcom/daaw/tw1;

    new-instance v1, Lcom/daaw/ui$i;

    invoke-direct {v1, p0}, Lcom/daaw/ui$i;-><init>(Lcom/daaw/ui;)V

    iget-object v2, p0, Lcom/daaw/ui;->a:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/tw1;->b(Lcom/daaw/tw1$a;Ljava/util/List;)V

    sget-object v0, Lcom/daaw/dj0;->h0:Lcom/daaw/xw1;

    new-instance v1, Lcom/daaw/ui$j;

    invoke-direct {v1, p0}, Lcom/daaw/ui$j;-><init>(Lcom/daaw/ui;)V

    iget-object v2, p0, Lcom/daaw/ui;->a:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/xw1;->b(Lcom/daaw/xw1$a;Ljava/util/List;)V

    sget-object v0, Lcom/daaw/dj0;->i0:Lcom/daaw/sw1;

    new-instance v1, Lcom/daaw/ui$a;

    invoke-direct {v1, p0}, Lcom/daaw/ui$a;-><init>(Lcom/daaw/ui;)V

    iget-object v2, p0, Lcom/daaw/ui;->a:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/sw1;->b(Lcom/daaw/sw1$a;Ljava/util/List;)V

    return-void
.end method

.method public static synthetic a()Lcom/daaw/t91;
    .locals 1

    sget-object v0, Lcom/daaw/ui;->b:Lcom/daaw/t91;

    return-object v0
.end method
