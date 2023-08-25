.class public Lcom/daaw/fn;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Lcom/daaw/cg;

.field public final c:Lcom/daaw/cg;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/daaw/cg;Lcom/daaw/cg;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/fn;->a:Landroid/content/Context;

    iput-object p2, p0, Lcom/daaw/fn;->b:Lcom/daaw/cg;

    iput-object p3, p0, Lcom/daaw/fn;->c:Lcom/daaw/cg;

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;)Lcom/daaw/en;
    .locals 3

    iget-object v0, p0, Lcom/daaw/fn;->a:Landroid/content/Context;

    iget-object v1, p0, Lcom/daaw/fn;->b:Lcom/daaw/cg;

    iget-object v2, p0, Lcom/daaw/fn;->c:Lcom/daaw/cg;

    invoke-static {v0, v1, v2, p1}, Lcom/daaw/en;->a(Landroid/content/Context;Lcom/daaw/cg;Lcom/daaw/cg;Ljava/lang/String;)Lcom/daaw/en;

    move-result-object p1

    return-object p1
.end method
