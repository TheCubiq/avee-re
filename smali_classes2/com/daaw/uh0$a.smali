.class public final Lcom/daaw/uh0$a;
.super Lcom/daaw/th0;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/uh0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field public final t:Lcom/daaw/uh0;

.field public final u:Lcom/daaw/uh0$b;

.field public final v:Lcom/daaw/af;

.field public final w:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lcom/daaw/uh0;Lcom/daaw/uh0$b;Lcom/daaw/af;Ljava/lang/Object;)V
    .locals 0

    invoke-direct {p0}, Lcom/daaw/th0;-><init>()V

    iput-object p1, p0, Lcom/daaw/uh0$a;->t:Lcom/daaw/uh0;

    iput-object p2, p0, Lcom/daaw/uh0$a;->u:Lcom/daaw/uh0$b;

    iput-object p3, p0, Lcom/daaw/uh0$a;->v:Lcom/daaw/af;

    iput-object p4, p0, Lcom/daaw/uh0$a;->w:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public bridge synthetic b(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {p0, p1}, Lcom/daaw/uh0$a;->s(Ljava/lang/Throwable;)V

    sget-object p1, Lcom/daaw/lp1;->a:Lcom/daaw/lp1;

    return-object p1
.end method

.method public s(Ljava/lang/Throwable;)V
    .locals 3

    iget-object p1, p0, Lcom/daaw/uh0$a;->t:Lcom/daaw/uh0;

    iget-object v0, p0, Lcom/daaw/uh0$a;->u:Lcom/daaw/uh0$b;

    iget-object v1, p0, Lcom/daaw/uh0$a;->v:Lcom/daaw/af;

    iget-object v2, p0, Lcom/daaw/uh0$a;->w:Ljava/lang/Object;

    invoke-static {p1, v0, v1, v2}, Lcom/daaw/uh0;->e(Lcom/daaw/uh0;Lcom/daaw/uh0$b;Lcom/daaw/af;Ljava/lang/Object;)V

    return-void
.end method
