.class public final synthetic Lcom/daaw/u61;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/r71$b;


# instance fields
.field public final synthetic a:Lcom/daaw/r71;

.field public final synthetic b:Ljava/util/Map;

.field public final synthetic c:Lcom/daaw/wf$a;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/r71;Ljava/util/Map;Lcom/daaw/wf$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/u61;->a:Lcom/daaw/r71;

    iput-object p2, p0, Lcom/daaw/u61;->b:Ljava/util/Map;

    iput-object p3, p0, Lcom/daaw/u61;->c:Lcom/daaw/wf$a;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lcom/daaw/u61;->a:Lcom/daaw/r71;

    iget-object v1, p0, Lcom/daaw/u61;->b:Ljava/util/Map;

    iget-object v2, p0, Lcom/daaw/u61;->c:Lcom/daaw/wf$a;

    check-cast p1, Landroid/database/Cursor;

    invoke-static {v0, v1, v2, p1}, Lcom/daaw/r71;->f0(Lcom/daaw/r71;Ljava/util/Map;Lcom/daaw/wf$a;Landroid/database/Cursor;)Lcom/daaw/wf;

    move-result-object p1

    return-object p1
.end method
