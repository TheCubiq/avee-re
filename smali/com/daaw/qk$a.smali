.class public Lcom/daaw/qk$a;
.super Lcom/daaw/fh0$a$a;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/qk;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Lcom/daaw/qk;


# direct methods
.method public constructor <init>(Lcom/daaw/qk;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/qk$a;->b:Lcom/daaw/qk;

    invoke-direct {p0}, Lcom/daaw/fh0$a$a;-><init>()V

    return-void
.end method


# virtual methods
.method public c(Landroid/content/Context;Ljava/lang/Object;)Lcom/daaw/vd0;
    .locals 0

    check-cast p2, Lcom/daaw/qk$s;

    iget-object p1, p2, Lcom/daaw/qk$s;->c:Lcom/daaw/vd0;

    if-nez p1, :cond_0

    const-string p1, "ThisItemIdentifier is null, in Queue"

    invoke-static {p1}, Lcom/daaw/lz1;->c(Ljava/lang/String;)V

    :cond_0
    iget-object p1, p2, Lcom/daaw/qk$s;->c:Lcom/daaw/vd0;

    return-object p1
.end method
